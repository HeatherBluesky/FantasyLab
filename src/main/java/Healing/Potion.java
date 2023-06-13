package Healing;

public class Potion implements IHeal{

    private int heal;

    public Potion() {
        this.heal = 40;
    }

    @Override
    public int heal() {
        return heal;
    }
}
