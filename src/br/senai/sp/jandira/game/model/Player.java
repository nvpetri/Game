package br.senai.sp.jandira.game.model;

public class Player {
    public String nome;
    public String skin;

    public int life;
    public Player(){
        life = 100;
    }
    public int getLife(){
        return life;
    }
    public void SubtrairVida(int danoEnemy){

        life =- danoEnemy;

        if (life < 0){
            life = 0;
        }

    }
}
