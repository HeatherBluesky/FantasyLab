package Summons;

public class Ogre implements IDefend{
    private int damage;

    public Ogre() {
        this.damage = 40;
    }

    @Override
    public int defend() {
        return damage;
    }
}
