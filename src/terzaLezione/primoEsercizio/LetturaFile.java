package terzaLezione.primoEsercizio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetturaFile {
    public static void main(String[] args) throws FileNotFoundException {
        File usFile = new File("/Users/grandemassone/Desktop/Davide/Università/POO/Teoria tutorato POO/src/terzaLezione/primoEsercizio/file.txt");
        Scanner sf = new Scanner(usFile);

        while (sf.hasNextLine()) {
            String nome = sf.nextLine();   // Read the name

            // Check if the next token is a double
            if (sf.hasNextDouble()) {
                double importo = sf.nextDouble();  // Read the double

                // Check if the next token is an integer
                if (sf.hasNextInt()) {
                    int quantita = sf.nextInt();// Read the integer
                    char operazione = sf.next().charAt(0);  // Read the char

                    // Output the values to check
                    System.out.println("Nome: " + nome);
                    System.out.println("Importo: " + importo);
                    System.out.println("Quantità: " + quantita);
                    System.out.println("Operazione: " + operazione);
                }
            }
            // Move to the next line after reading all values
            if (sf.hasNextLine()) {
                sf.nextLine(); // Consume the newline after char
            }
        }
        sf.close();
    }
}
