package pl.sda.gporlowski;

public enum WeaponType {
    SWORD(30), MACE(10), UNARMED(5);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}