package terzaLezione.primoEsercizio;

public class Record {
    private final String nome;
    private final double importo;
    private final int quantita;
    private final char operazione;

    public Record(String nome, double importo, int quantita, char operazione) {
        this.nome = nome;
        this.importo = importo;
        this.quantita = quantita;
        this.operazione = operazione;
    }

    public String toString() {
        return "Nome: " + nome + ", Importo: " + importo + ", Quantità: " + quantita + ", Operazione: " + operazione;
    }

    // Start Getter methods
    public String getNome() {
        return nome;
    }
    public double getImporto() {
        return importo;
    }
    public int getQuantita() {
        return quantita;
    }
    public char getOperazione() {
        return operazione;
    }
    // End getter methods

    public int getTotaleAzioni() {
        

        return 1;
    }
}
