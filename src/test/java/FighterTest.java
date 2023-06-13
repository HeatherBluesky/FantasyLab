import People.Enemy.Troll;
import People.Fighter.Knight;
import Weapon.Axe;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FighterTest {

    Knight knight;
    Troll troll;
    Sword sword;
    Axe axe;

    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        knight = new Knight("Geoffrey", 30, sword);
        troll = new Troll("Grokk", 10);


    }

    @Test
    public void canAttack(){
        knight.attack(troll);
        assertEquals(0, troll.getHealthPoints());
    }

    @Test
    public void canChangeWeapon() {
        knight.changeWeapon(axe);
        assertTrue(knight.getWeapon() instanceof Axe);
    }
}
