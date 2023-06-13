import People.Fighter.Knight;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

public class FighterTest {

    Knight knight;
    Troll troll;
    Sword sword;

    @Before
    public void before(){
        knight = new Knight("Geoffrey", 30);
        troll = new Troll("Grokk", 10);
        sword = new Sword(10);

    }

    @Test
    public void canAttack(){
        knight.attack(troll);
    }


}
