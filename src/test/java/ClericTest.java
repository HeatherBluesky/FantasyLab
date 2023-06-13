import Healing.Potion;
import People.Cleric.Cleric;
import People.Mage.Wizard;
import Spells.Fireball;
import Summons.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    Wizard wizard;
    Fireball fireball;
    Ogre ogre;

    @Before
    public void before(){
        potion = new Potion();
        fireball = new Fireball();
        ogre = new Ogre();
        wizard = new Wizard("Elfdior", 20, fireball, ogre);
        cleric = new Cleric("Dave the Druid",10, potion );
    }

    @Test
    public void clericCanHealSelf(){
        cleric.heal(cleric);
        assertEquals(50, cleric.getHealthPoints());
    }

    @Test
    public void clericCanHealOther(){
        cleric.heal(wizard);
        assertEquals(60, wizard.getHealthPoints());
    }


}
