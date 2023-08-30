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

        while(true) {

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy == 0) {
                System.out.println("-> O PLAYER " + player.nome + " É O VENCEDOR <-");

                break;
            } else if (lifePlayer == 0) {
                System.out.println("-> O PLAYER " + enemy.nome + " É O VENCEDOR <-");

                break;
            }

            System.out.println("--------------------- Battle ---------------------");
            System.out.println("Ataque Player { C }" + player.nome + " life: " + lifePlayer);
            System.out.println("Ataque enemy { X }" + enemy.nome + " life: " + lifeEnemy);

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("c")) {

                System.out.println("----------------------------------------------");
                System.out.println("->           -> Player atacou <-            <-");
                System.out.println("----------------------------------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;

                enemy.SubtrairVida(danoPlayer);

                System.out.println("----------------------------------------------");
                System.out.println(" O ataque foi de: ->" + danoPlayer + "<-");

            } else if (attack.equalsIgnoreCase("x")) {
                System.out.println("----------------------------------------------");
                System.out.println("->            -> Enemy atacou <-            <-");
                System.out.println("----------------------------------------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;

                player.SubtrairVida(danoEnemy);

                System.out.println("----------------------------------------------");
                System.out.println(" O ataque foi de: ->" + danoEnemy + "<-");

                System.out.println();

            } else {
                System.out.println("Tecla Invalida");
            }
        }
    }
}
