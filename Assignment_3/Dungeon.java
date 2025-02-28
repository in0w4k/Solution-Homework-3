package Assignment_3;

import java.util.List;
import java.util.ArrayList;

public class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = new ArrayList<>(rooms);
        this.npcs = new ArrayList<>(npcs);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    public void print() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: ");
        for (Room room : rooms) {
            System.out.println(" - " + room.name);
        }
        System.out.println("NPCs: ");
        for (NPC npc : npcs) {
            System.out.println(" - " + npc.name);
        }
    }
}