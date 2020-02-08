package pl.sda.gporlowski.characters;

import pl.sda.gporlowski.AbleToAttack;

public abstract class Monster extends Creature implements AbleToAttack {

    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }
}