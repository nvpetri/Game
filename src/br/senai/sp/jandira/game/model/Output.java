package br.senai.sp.jandira.game.model;

import br.senai.sp.jandira.game.model.Enemy;

import br.senai.sp.jandira.game.model.Player;

public class Output {
    public static void printPlayer(Player player) {
        System.out.println("----- Dados do Player -----");
        System.out.println("Nome: " + player.nome);
        System.out.println("Skin: " + player.skin);
        System.out.println("---------------------------");
    }

    public static void printEnemy(Enemy enemy) {
        System.out.println("----- Dados do Enemy -----");
        System.out.println("Nome: " + enemy.nome);
        System.out.println("Skin: " + enemy.skin);
        System.out.println("--------------------------");
    }
}