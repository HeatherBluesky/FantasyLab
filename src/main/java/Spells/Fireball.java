package Spells;

public class Fireball implements ICast {
    private int damage;

    public Fireball() {
        this.damage = 25;
    }

    @Override
    public int cast() {
        return damage;
    }
}
