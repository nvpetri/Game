package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /* Instancia Scanner*/
    Scanner teclado = new Scanner(System.in);

    /*Instancia player */
    Player player = new Player();

    /*Instancia enemy */
    Enemy enemy = new Enemy();
    /*
     * Instancia Output
     */
    Output print = new Output();

    public void BothRegister() {
        validaPrint = 1;

        PlayerRegister();

        EnemyRegister();
        print.printPlayer(player);
        print.printEnemy(enemy);
    }
        public void PlayerRegister () {
            System.out.println("-------------Cadastro Player---------------");
            System.out.print("Qual o seu nome: ");
            player.nome = teclado.nextLine();
            System.out.print("Escolha sua skin (red - green - blue): ");
            player.skin = teclado.nextLine();
            System.out.println("----------Cadastro Realizado---------------");

            if (validaPrint == 0) {
                print.printPlayer(player);
            }
        }
        public void EnemyRegister () {
            System.out.println("-------------Cadastro Enemy---------------");
            System.out.print("Qual o seu nome: ");
            enemy.nome = teclado.nextLine();
            System.out.print("Escolha sua skin (red - green - blue): ");
            enemy.skin = teclado.nextLine();
            System.out.println("----------Cadastro Realizado---------------");

            if (validaPrint == 0) {
                print.printEnemy(enemy);
            }
        }
    }