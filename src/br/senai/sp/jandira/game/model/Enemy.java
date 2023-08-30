package br.senai.sp.jandira.game.model;

public class Enemy {
    public String nome;
    public String skin;

    private int life;
    public Enemy(){
        life = 100;
    }
    public int getLife(){
        return life;
    }

    public void SubtrairVida(int danoPlayer){

        life -= danoPlayer;

        if (life < 0){
            life = 0;
        }

    }
}
