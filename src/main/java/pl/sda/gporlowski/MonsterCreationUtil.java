package pl.sda.gporlowski;

import pl.sda.gporlowski.characters.Ghul;
import pl.sda.gporlowski.characters.Goblin;
import pl.sda.gporlowski.characters.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterCreationUtil {
    public static List<Monster> createMonsters() {
        int howManyMonsters = new Random().nextInt(4);
        List<Monster> monsters = new ArrayList<>();
        for (int i = 0; i < howManyMonsters; i++) {
            int monsterType = new Random().nextInt(2);
            if (monsterType == 0) {
                monsters.add(new Goblin());
            } else {
                monsters.add(new Ghul());
            }
        }
        return monsters;
    }
}
