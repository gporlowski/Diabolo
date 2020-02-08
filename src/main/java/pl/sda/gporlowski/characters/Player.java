package pl.sda.gporlowski.characters;

import pl.sda.gporlowski.AbleToAttack;
import pl.sda.gporlowski.WeaponType;

public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType weapon) {
        hp = 100;
        strength = 15;
        weaponType = weapon;
        alive = true;
    }

    @Override
    public int attack() {
        if (weaponType.equals(WeaponType.MACE)) {
            hp += 5;
        }
        return strength + weaponType.getDamage() + 1;
    }
}
