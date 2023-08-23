package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia Player
     */
    Player player = new Player();

    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    /**
     *  Instancia Output
     */
    Output output = new Output();

    public void BothRegister() {
        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.printPlayer(player);
        output.printEnemy(enemy);

    }

    public void PlayerRegister() {

        /** Coleta dados do Player-1 */
        System.out.println("---------------- Cadastro Player ----------------");
        System.out.print("Qual é o seu nome: ");
        player.nome = teclado.next();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.next();
        System.out.println("--------- Player Cadastrado com Sucesso ---------");

        if(validaPrint != 1) {
            /** Printa as Informações Cadastradas */
            output.printPlayer(player);
        }

    }

    public void EnemyRegister() {

        /** Coleta dados do Enemy-1 */
        System.out.println("---------------- Cadastro Enemy ----------------");
        System.out.print("Qual é o seu nome: ");
        enemy.nome = teclado.next();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.next();
        System.out.println("--------- Enemy Cadastrado com Sucesso ---------");

        if (validaPrint != 1) {
            output.printEnemy(enemy);
        }

    }

    public void Decision() {

        String decision;

        System.out.println("Seja Bem Vindo !!!");
        System.out.println("Deseja Cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.next();

        switch (decision.toLowerCase()) {

            case "player":
                PlayerRegister();
                break;

            case "enemy":
                EnemyRegister();
                break;

            case "ambos":
                BothRegister();
        }

        System.out.println("Deseja Retornar ao Cadastro [1- Sim  2- Não]: ");
        int continuar = teclado.nextInt();

        if(continuar==1){
            Decision();
        }

    }

}