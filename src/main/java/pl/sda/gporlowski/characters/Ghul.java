package pl.sda.gporlowski.characters;

import pl.sda.gporlowski.WeaponType;

public class Ghul extends Monster {
    public Ghul() {
        hp = 50;
        strength = 8;
        weaponType = WeaponType.UNARMED;
        alive = true;
    }
}
