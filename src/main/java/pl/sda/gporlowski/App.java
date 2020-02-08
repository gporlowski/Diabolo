package pl.sda.gporlowski;

import pl.sda.gporlowski.characters.Player;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player player = PlayerCreator.createPLayer();
        System.out.println(player);
    }
}
