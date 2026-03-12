import Dipendente.Dipartimento;
import Dipendente.Dipendente;

public class Main {
    static void main(String[] args) {


        Dipendente gino = new Dipendente("000001", 2500.00, Dipartimento.AMMINISTRAZIONE);
        Dipendente pino = new Dipendente("000002", 2250.00, Dipartimento.PRODUZIONE);
        Dipendente ciro = new Dipendente("000003", 2700.00, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {gino, pino, ciro};

        for (Dipendente dipendente : dipendenti) {
            System.out.println("La matricola è " + dipendente.getMatricola());
        }
    }
}
