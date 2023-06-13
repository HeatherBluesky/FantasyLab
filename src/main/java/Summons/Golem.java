package Summons;

public class Golem implements IDefend{
    private int damage;

    public Golem() {
        this.damage = 50;
    }

    @Override
    public int defend() {
        return damage;
    }
}
