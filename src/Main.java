import Dipendente.*;

import java.util.Locale;

public class Main {
    static void main(String[] args) {


        DipendenteFullTime gino = new DipendenteFullTime("000001", 3500.00, Dipartimento.AMMINISTRAZIONE);
        DipendentePartTime pino = new DipendentePartTime("000002", 25.00, Dipartimento.PRODUZIONE, 26);
        Dirigente ciro = new Dirigente("000003", 100000, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {gino, pino, ciro};

        for (Dipendente dipendente : dipendenti) {
            System.out.println("La matricola è " + dipendente.getMatricola() + " il salario annuale è " + String.format(Locale.ITALY, "%,.2f", dipendente.calculateSalary()) + " €");
        }
    }
}
