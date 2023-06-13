import People.Enemy.Troll;
import People.Mage.Warlock;
import People.Mage.Wizard;
import Spells.Fireball;
import Spells.PsionicBlast;
import Summons.Dragon;
import Summons.Golem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MageTest {

    Warlock warlock;
    Wizard wizard;
    Fireball fireball;
    Troll troll;
    Golem golem;
    PsionicBlast blast;
    Dragon dragon;

    @Before
    public void before() {
        golem = new Golem();
        fireball = new Fireball();
        blast = new PsionicBlast();
        dragon = new Dragon();
        warlock = new Warlock("Grognar the Adept", 20, fireball, golem);
        troll = new Troll("Grokk", 10);
    }

    @Test
    public void canCastSpell() {
        warlock.cast(troll);
        assertEquals(0, troll.getHealthPoints());
    }

    @Test
    public void canDefend() {
        warlock.defend(troll);
        assertEquals(0, troll.getHealthPoints());
    }

    @Test
    public void canChangeSpell() {
        warlock.changeSpell(blast);
        assertTrue(warlock.getSpell() instanceof PsionicBlast);
    }

    @Test
    public void canChangeDefender() {
        warlock.changeDefender(dragon);
        assertTrue(warlock.getDefender() instanceof Dragon);
    }
}
