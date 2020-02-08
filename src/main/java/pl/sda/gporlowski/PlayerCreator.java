package pl.sda.gporlowski;

import pl.sda.gporlowski.characters.Player;

import java.util.Scanner;

public class PlayerCreator {
    public static Player createPLayer(){
        System.out.print("Choose 1, 2 or 3: ");
        Scanner scan = new Scanner(System.in);
        int chosenOption = scan.nextInt();
        WeaponType weaponType;
        if (chosenOption == 1) {
            weaponType = WeaponType.SWORD;
        } else if (chosenOption == 2) {
            weaponType = WeaponType.MACE;
        } else {
            weaponType = WeaponType.UNARMED;
        }
        return new Player(weaponType);
    }
}
