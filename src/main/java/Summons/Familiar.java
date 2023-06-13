package Summons;

public class Familiar implements IDefend{
    private int damage;

    public Familiar() {
        this.damage = 10;
    }

    @Override
    public int defend() {
        return damage;
    }
}
