package People.Mage;

import People.Enemy.Enemy;
import People.Player;
import Spells.ICast;
import Summons.IDefend;

public abstract class Mage extends Player {

    private ICast spell;
    private IDefend defender;

    public Mage(String name, int healthPoints, ICast spell, IDefend defender) {
        super(name, healthPoints);
        this.spell = spell;
        this.defender = defender;
    }

    public void changeSpell(ICast newSpell){
        this.spell = newSpell;
    }

    public void changeDefender(IDefend newDefender) {
        this.defender = newDefender;
    }

    public ICast getSpell() {
        return spell;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage((defender.defend()));
    }
    public void cast(Enemy enemy){
        enemy.takeDamage(spell.cast());
    }
}
