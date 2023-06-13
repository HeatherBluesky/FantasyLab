package Spells;

public class LightningStorm implements ICast{
    private int damage;

    public LightningStorm() {
        this.damage = 15;
    }


    @Override
    public int cast() {
        return damage;
    }
}
