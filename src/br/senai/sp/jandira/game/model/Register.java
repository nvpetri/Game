package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;
    Scanner teclado = new Scanner(System.in);
    Player player = new Player();
    Enemy enemy = new Enemy();
    Output print = new Output();

    public void BothRegister() {
        do {
            validaPrint = 1;
            PlayerRegister();
            EnemyRegister();
            print.printPlayer(player);
            print.printEnemy(enemy);
        } while (askForMore());
    }

    public void PlayerRegister() {
        do {

            System.out.println("-------------Cadastro Player---------------");
            System.out.print("Qual o seu nome: ");
            player.nome = teclado.nextLine();
            System.out.print("Escolha sua skin (red - green - blue): ");
            player.skin = teclado.nextLine();
            System.out.println("----------Cadastro Realizado---------------");

            if (validaPrint == 0) {
                print.printPlayer(player);
            }
        }while (askForMore());
    }

    public void EnemyRegister() {
        do {
            System.out.println("-------------Cadastro Enemy---------------");
            System.out.print("Qual o seu nome: ");
            enemy.nome = teclado.nextLine();
            System.out.print("Escolha sua skin (red - green - blue): ");
            enemy.skin = teclado.nextLine();
            System.out.println("----------Cadastro Realizado---------------");

            if (validaPrint == 0) {
                print.printEnemy(enemy);
            }
        }while (askForMore());
    }

    public boolean askForMore() {
        System.out.print("Deseja cadastrar mais personagens? (S/N): ");
        String resposta = teclado.nextLine().trim().toLowerCase();
        return resposta.equals("s");
    }
}
