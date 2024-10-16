package secondaLezione.secondoEsercizio;

import java.util.Scanner;

public class Negozio {
    public static void main(String[] args) {
        // Creo un'istanza di RegistratoreCassa
        RegistratoreCassa registratore = new RegistratoreCassa();

        // Aggiungo alcuni prodotti al listino
        registratore.getListino().add(new Prodotto("Pane", 5, 104));
        registratore.getListino().add(new Prodotto("Latte", 3, 102));
        registratore.getListino().add(new Prodotto("Uova", 6, 103));

        // Scanner per input utente
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;
        while(continua) {
            System.out.println("1. Stampa il listino");
            System.out.println("2. Paga un prodotto");
            System.out.println("3. Mostra fondo cassa");
            System.out.println("4. Esci");
            System.out.print("Seleziona un'opzione: ");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    registratore.printListino();
                    break;
                case 2:
                    System.out.print("Inserisci il codice del prodotto: ");
                    int codice = scanner.nextInt();
                    System.out.print("Inserisci l'importo della banconota: ");
                    int banconota = scanner.nextInt();
                    double resto = registratore.pagaProdotto(banconota, codice);
                    if (resto != 1 && resto != 0) {
                        System.out.println("Resto: " + resto);
                    }
                    break;
                case 3:
                    System.out.println("Fondo cassa attuale: " + registratore.getFondoCassa());
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Opzione non valida!");
            }
        }

        scanner.close();
    }
}