package Spells;

public class PsionicBlast implements ICast{
    private int damage;

    public PsionicBlast() {
        this.damage = 60;
    }


    @Override
    public int cast() {
        return damage;
    }
}
