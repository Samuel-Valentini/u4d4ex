import personale.dipendente.*;
import personale.interfacce.Check;
import personale.interfacce.OrarioInizio;
import personale.volontario.Volontario;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Main {
    static void main(String[] args) {


        DipendenteFullTime gino = new DipendenteFullTime("000001", 3500.00, Dipartimento.AMMINISTRAZIONE);
        DipendentePartTime pino = new DipendentePartTime("000002", 25.00, Dipartimento.PRODUZIONE, 26);
        Dirigente ciro = new Dirigente("000003", 100000, Dipartimento.VENDITE);
        Volontario mario = new Volontario("Mario Rossi", LocalDate.of(1980, 1, 1), "martellatore", Dipartimento.PRODUZIONE);
        Volontario aldo = new Volontario("Aldo Bianchi", LocalDate.of(1987, 4, 1), "marketing expert", Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = {gino, pino, ciro};

        for (Dipendente dipendente : dipendenti) {
            System.out.println("La matricola è " + dipendente.getMatricola() + " il salario annuale è " + String.format(Locale.ITALY, "%,.2f", dipendente.calculateSalary()) + " €");
        }

        Check[] checked = {gino, pino, ciro, mario, aldo};

        Random random = new Random();

        for (Check check : checked) {

            int chooser = random.nextInt(4);

            switch (chooser) {

                case 0:
                    check.checkIn(OrarioInizio.MATTINA);
                    break;
                case 1:
                    check.checkIn(OrarioInizio.POMERIGGIO);
                    break;
                case 2:
                    check.checkIn(OrarioInizio.SERA);
                    break;
                case 3:
                    check.checkIn(OrarioInizio.NOTTE);
                    break;
            }
        }
    }
}
