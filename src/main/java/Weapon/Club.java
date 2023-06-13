package Weapon;

public class Club implements IAttack{
    private int damage;

    public Club() {
        this.damage = 10;
    }

    @Override
    public int attack() {
        return damage;
    }
}
