package Healing;

public class Bandaid implements IHeal{

    private int heal;

    public Bandaid() {
        this.heal = 100;
    }

    @Override
    public int heal() {
        return heal;
    }
}
