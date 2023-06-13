package Summons;

public class Dragon implements IDefend{
    private int damage;

    public Dragon() {
        this.damage = 80;
    }

    @Override
    public int defend() {
        return damage;
    }
}
