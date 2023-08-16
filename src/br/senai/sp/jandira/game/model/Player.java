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
}
