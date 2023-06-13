package Healing;

public class Herb implements IHeal {

    private int heal;

    public Herb() {
        this.heal = 10;
    }

    @Override
    public int heal() {
        return heal;
    }
}
