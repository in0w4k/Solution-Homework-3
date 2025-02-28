package Assignment_2;

public class NPC implements CloneableGameEntity {
    private final String name;
    private final String description;
    private final int health;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.health);
    }

    public void display() {
        System.out.println("NPC: " + name + " - " + description + " (Health: " + health + ")");
    }
}
