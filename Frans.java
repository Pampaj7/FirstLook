public class Frans {
    private Cliente[] elencoClienti; //AGGREGAZIONE
    private int totClienti = 0;
    private static final int DEFAULT_MAX_TOT_CLIENTI = 9;

    public Banca() {
        elencoClienti = new Cliente[DEFAULT_MAX_TOT_CLIENTI];

    }
