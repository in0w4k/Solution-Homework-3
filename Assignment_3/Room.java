package Assignment_3;

public class Room implements CloneableGameEntity {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name + " (Clone)");
    }
}