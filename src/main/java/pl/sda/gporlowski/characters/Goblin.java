package pl.sda.gporlowski.characters;

import pl.sda.gporlowski.WeaponType;

public class Goblin extends Monster {
    public Goblin() {
        hp = 25;
        strength = 3;
        weaponType = WeaponType.MACE;
        alive = true;
    }
}