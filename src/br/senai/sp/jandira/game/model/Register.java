package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {
    public void register(){
        /* Instancia Scanner*/
        Scanner teclado = new Scanner(System.in);

        /*Instancia player */
        Player player = new Player();

        /*Instancia enemy */
        Enemy enemy = new Enemy();

        /* Coleta dados do Player1 */
        System.out.println("-------------Cadastro Player---------------");
        System.out.print("Qual o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        player.skin = teclado.nextLine();
        System.out.println("----------Cadastro Realizado---------------");

        /* Coleta dados do Enemy1 */
        System.out.println("-------------Cadastro Enemy---------------");
        System.out.print("Qual o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        enemy.skin = teclado.nextLine();
        System.out.println("----------Cadastro Realizado---------------");
    }
}
