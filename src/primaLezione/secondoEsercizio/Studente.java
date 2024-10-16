package primaLezione.secondoEsercizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Studente {
    private final String nome;
    private int punteggio;
    private int num;


    public Studente(String nome) {
        this.nome = nome;
        this.punteggio = 0;
        this.num = 0;
    }

    public String getNome() {
        return nome;
    }

    public void addQuiz(int score){
        if(score > 33 || score < 18){
            System.out.println("NON SI PUO!");
            return;
        }

        this.punteggio += score;
        num++;
    }

    public int getTotalScore(){
        return punteggio;
    }

    public int getAverageScore(){
        if(num == 0) {
            System.out.println("Non si può calcolare la media perché non hai fatto alcun esame!");
            return 0;
        }

        return punteggio / num;
    }
}
