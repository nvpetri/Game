package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.model.Output;
import br.senai.sp.jandira.game.model.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String resposta1, resposta2;

        System.out.println("--------Cadastro dos Players----------");
        System.out.println("Deseja cadastrar ambos os players? (s/n)");
        resposta1 = teclado.next();

        if (resposta1.equals("s")){
            Register bothRegister = new Register();

            bothRegister.BothRegister();
        }else {
            System.out.println("Deseja cadastrar quem? (player/enemy) ");
            resposta2 = teclado.next();

            if (resposta2.equalsIgnoreCase("enemy")){
                Register enemyR = new Register();

                enemyR.EnemyRegister();
            }else if (resposta2.equalsIgnoreCase("player")){
                Register playerR = new Register();

                playerR.PlayerRegister();
            }
        }

    }
}
