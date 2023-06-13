package Weapon;

public class Axe implements IAttack{
    private int damage;

    public Axe() {
        this.damage = 50;
    }

    @Override
    public int attack() {
        return damage;
    }
}
