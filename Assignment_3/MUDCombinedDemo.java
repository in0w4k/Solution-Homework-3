package Assignment_3;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Start Dungeon")
                .addRoom(new Room("Room 1"))
                .addRoom(new Room("Room 2"))
                .addNPC(new NPC("First Boss"))
                .build();

        System.out.println("Initial Dungeon:");
        dungeon.print();

        Room originalRoom = new Room("Room 3");
        NPC originalNPC = new NPC("Second Boss");
        Room clonedRoom1 = originalRoom.cloneEntity();
        NPC clonedNPC1 = originalNPC.cloneEntity();

        dungeon.addRoom(originalRoom);
        dungeon.addNPC(originalNPC);
        dungeon.addRoom(clonedRoom1);
        dungeon.addNPC(clonedNPC1);

        System.out.println("\nDungeon after adding cloned rooms:");
        dungeon.print();
    }
}