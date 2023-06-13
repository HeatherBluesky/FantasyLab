package People.Mage;

import Spells.ICast;
import Summons.IDefend;

public class Wizard extends Mage{
    public Wizard(String name, int healthPoints, ICast spell, IDefend defender) {
        super(name, healthPoints, spell, defender);
    }
}
