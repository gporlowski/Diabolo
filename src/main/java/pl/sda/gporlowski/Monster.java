package pl.sda.gporlowski;

public abstract class Monster extends Creature implements AbleToAttack {

    @Override
    public int attack() {
        return 0;
    }
}