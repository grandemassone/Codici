package primaLezione.secondoEsercizio;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class StudenteTest {
    public static void main(String[] args) {
        Studente s1 = new Studente("Davide");
        Studente s2 = new Studente("Totore");

        //Primo studente
        s1.addQuiz(34);
        s1.addQuiz(35);
        s1.addQuiz(18);
        s1.addQuiz(75);
        s1.addQuiz(264);

        //Secondo studente
        s2.addQuiz(2342);
        s2.addQuiz(3142);
        s2.addQuiz(1);
        s2.addQuiz(2121);

        System.out.println("\n" + "Lo studente '" + s1.getNome() + "' ha una media di: " + s1.getAverageScore());
        System.out.println("Lo studente '" + s2.getNome() + "' ha una media di: " + s2.getAverageScore());
        System.out.println("Lo studente '" + s1.getNome() + "' ha una somma di voti pari a : " + s1.getTotalScore());
        System.out.println("Lo studente '" + s2.getNome() + "' ha una somma di voti pari a : " + s2.getTotalScore());
    }
}
