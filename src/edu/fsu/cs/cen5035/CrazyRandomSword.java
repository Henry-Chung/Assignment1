package edu.fsu.cs.cen5035;
/**
 *
 * @author Javier
 */
public class CrazyRandomSword extends BasicWeapon implements Weapon {

    public CrazyRandomSword() {
        super((int)Math.floor(Math.random() * 97 + 4));
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (int)(Math.floor(Math.random() * (armor/3 - 3) + 3));
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
