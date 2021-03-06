package pl.sda.gporlowski;

import pl.sda.gporlowski.characters.Monster;
import pl.sda.gporlowski.characters.Player;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Player player = PlayerCreator.createPLayer();
        List<Monster> monsters = MonsterCreationUtil.createMonsters();


        while (player.isAlive() && monsters.stream().anyMatch(m -> m.isAlive())) {
            monsters.stream()
                    .filter(m -> m.isAlive())
                    .findFirst()
                    .get()
                    .receiveDamage(player.attack());

            monsters.stream().filter(m -> m.isAlive())
                    .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
            System.out.println(monsters);
        }
    }
}