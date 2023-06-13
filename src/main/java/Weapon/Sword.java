package Weapon;

public class Sword implements IAttack {
    private int damage;

    public Sword() {
        this.damage = 30;
    }


    @Override
    public int attack() {
        return damage;
    }
}
