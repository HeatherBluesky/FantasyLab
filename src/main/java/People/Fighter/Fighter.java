package People.Fighter;

import People.Enemy.Enemy;
import People.Player;
import Weapon.IAttack;

public abstract class Fighter extends Player {
    private IAttack weapon;

    public Fighter(String name, int healthPoints, IAttack weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void changeWeapon(IAttack newWeapon){
        this.weapon = newWeapon;
    }

    public IAttack getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy){
       enemy.takeDamage(weapon.attack());
    }
}
