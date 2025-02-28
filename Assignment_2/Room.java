package Assignment_2;

public class Room implements CloneableGameEntity {
    private final String name;
    private final String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    public void display() {
        System.out.println("Room: " + name + " - " + description);
    }
}
