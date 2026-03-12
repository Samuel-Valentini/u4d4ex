package personale.volontario;

import personale.dipendente.Dipartimento;
import personale.interfacce.Check;
import personale.interfacce.OrarioInizio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Volontario implements Check {
    private String nome;
    private int eta;
    private String CV;
    private Dipartimento dipartimento;

    public Volontario(String nome, LocalDate dataDiNascita, String CV, Dipartimento dipartimento) {
        this.nome = nome;
        this.eta = (int) ChronoUnit.YEARS.between(dataDiNascita, LocalDate.now());
        this.CV = CV;
        this.dipartimento = dipartimento;
    }

    @Override
    public void checkIn(OrarioInizio orarioInizio) {
        System.out.println(nome + " di anni: " + eta + " - Turno di inizio: " + orarioInizio);
    }
}
