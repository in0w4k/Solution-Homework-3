package Assignment_1;

public class MUDBuilderDemo {
    public static void main(String[] args) {

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Start Dungeon")
                .addRoom(new Room("Room 1"))
                .addRoom(new Room("Room 2"))
                .addNPC(new NPC("First Boss"))
                .build();
        dungeon.print();
    }
}
