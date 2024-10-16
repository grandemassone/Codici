package secondaLezione.secondoEsercizio;

public class Prodotto {
    private String nome;
    private int prezzo;
    private int codice;

    ///Metodi getter
    public String getNome() { return nome; }
    public int getPrezzo() { return prezzo; }
    public int getCodice() { return codice; }
    ///Fine metodi getter

    ///Metodo costruttore
    public Prodotto(String nome, int prezzo, int codice) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.codice = codice;
    }
}
