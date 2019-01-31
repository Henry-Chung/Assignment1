package edu.fsu.cs.cen5035;

/**
 * @author Javier
 */
public class Torch extends BasicWeapon implements Weapon {

    public Torch() {
        super(30);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        //ignore the armor
        int damage = DAMAGE;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}