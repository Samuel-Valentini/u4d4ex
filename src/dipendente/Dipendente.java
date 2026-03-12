package dipendente;

import interfacce.Check;
import interfacce.OrarioInizio;

public abstract class Dipendente implements Check {
    private final String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double calculateSalary() {
        return getStipendio() * 12;
    }

    @Override
    public void checkIn(OrarioInizio orarioInizio) {
        System.out.println(this.matricola + " dipartimento: " + this.dipartimento + " - Turno di inizio: " + orarioInizio);
    }
}
