package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Menu {
    public void Menu(){

        Scanner teclado = new Scanner(System.in);

        Register register = new Register();
        Battle battle = new Battle();


        boolean continuar = true;
        while (continuar){

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("---------------- Bem Vindo ----------------");
            System.out.println("******* Escolha uma das opções: ***********");
            System.out.println("****************************** 1 - Registro");
            System.out.println("****************************** 2 - Batalha");
            System.out.println("****************************** 3 - Sair");
            System.out.println("-------------------------------------------");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int userOption = teclado.nextInt();

            switch (userOption){

                case 1 :
                    register.Decision();

                    break;

                case 2:
                    battle.ChoiceScenary();
                    battle.Battle(register.player, register.enemy);
                    System.out.println("*-*-* Em desenvolvimento! *-*-*");
                    break;

                case 3:
                    continuar = false;
                    break;

            }
        }
    }
}
