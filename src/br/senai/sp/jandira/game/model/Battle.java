package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {

    /* Instancia Scanner*/
    Scanner teclado = new Scanner(System.in);

    /* Instancia Scenario*/
    Scenary scenary = new Scenary();
    public void ChoiceScenary(){
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("*****************************************************");
        System.out.print("Antes de dar inico à batalha, \n selecione o cenário: ");
        System.out.println("[ 1 ] Torre Eifell \n [ 2 ] Arabia {Extra Neymar} \n [ 3 ] Turquia");
        System.out.println("*****************************************************");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        int choiceScenario = teclado.nextInt();
    }

}
