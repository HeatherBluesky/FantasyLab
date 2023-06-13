package People.Cleric;

import Healing.IHeal;
import People.Player;


public class Cleric extends Player {

    private IHeal heal;

    public Cleric(String name, int healthPoints, IHeal heal) {
        super(name, healthPoints);
        this.heal = heal;
    }
    public void heal(Player player){
        player.setHealthPoints(player.getHealthPoints() + this.heal.heal());
    }

}
