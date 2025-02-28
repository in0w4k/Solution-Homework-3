package Assignment_3;

public class NPC implements CloneableGameEntity {
    public String name;

    public NPC(String name) {
        this.name = name;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name + " (Clone)");
    }
}
