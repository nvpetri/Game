package br.senai.sp.jandira.game.model;

public class Scenary {

    public String Scenario(int optionScenario){

        String cenario = "Senai Jandira";

        switch (optionScenario){
            case 1:
                cenario = "Torre Eiffel";
                break;
            case 2:
                cenario = "Arabia - [Extra Menino Ney]";
                break;
            case 3:
                cenario = "Turquia";
                break;
        }
        return cenario;
    }
}
