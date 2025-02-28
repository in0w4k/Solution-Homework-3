package Assignment_3;

import java.util.List;
import java.util.ArrayList;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private final List<Room> rooms = new ArrayList<>();
    private final List<NPC> npcs = new ArrayList<>();

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }
}