package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {

    /* Declarar Variaveis */
    String scenarioBattle;

    /* Instancia Scanner*/
    Scanner teclado = new Scanner(System.in);

    /* Instancia Scenario*/
    Scenary scenary = new Scenary();

    Player player = new Player();
    Enemy enemy = new Enemy();
    public void ChoiceScenary(){
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("*****************************************************");
        System.out.println("Antes de dar inico à batalha, \nselecione o cenário: ");
        System.out.println("[ 1 ] Torre Eifell \n [ 2 ] Arabia {Extra Neymar} \n [ 3 ] Turquia");
        System.out.println("*****************************************************");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        int choiceScenario = teclado.nextInt();

        scenarioBattle = scenary.Scenario(choiceScenario);

        System.out.println(scenarioBattle);
    }

    public void Battle(Player player, Enemy enemy){
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("*****************************************************");
        System.out.println("Vamos iniciar!!");
        System.out.println("Os personagens são: \nPlayer: " + player + "\nEnemy: " + enemy);
        System.out.println("O mapa escolhido foi: " + scenarioBattle);
    }
}
