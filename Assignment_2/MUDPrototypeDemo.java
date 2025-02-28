package Assignment_2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("First Room", "Just first room.");
        NPC prototypeNPC = new NPC("Boss", "Easy first boss", 30);

        Room clonedRoom1 = prototypeRoom.cloneEntity();

        NPC clonedNPC1 = prototypeNPC.cloneEntity();

        System.out.println("Original room and npc:");
        prototypeRoom.display();
        prototypeNPC.display();

        System.out.println("\nCloned room and npc:");
        clonedRoom1.display();
        clonedNPC1.display();
    }
}

