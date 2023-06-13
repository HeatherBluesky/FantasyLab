package People.Mage;

import Spells.ICast;
import Summons.IDefend;

public class Warlock extends Mage{
    public Warlock(String name, int healthPoints, ICast spell, IDefend defender) {
        super(name, healthPoints, spell, defender);
    }
}
