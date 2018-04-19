package Characters;

import Behaviours.IActionable;
import Behaviours.IWeaponable;

public class Fighter extends Player implements IActionable{
    private IWeaponable weapon;

    public Fighter(String name, int healthPoints, IWeaponable weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeaponable getWeapon() {
        return weapon;
    }

    public void changeWeapon(IWeaponable newWeapon){
        weapon = newWeapon;
    }

    public int action(){
        return (-weapon.wield());
    }

}