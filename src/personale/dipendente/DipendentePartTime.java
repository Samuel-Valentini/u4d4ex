package personale.dipendente;


public class DipendentePartTime extends Dipendente {

    private double oreSettimanali;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, double oreSettimanali) {
        super(matricola, stipendio, dipartimento);
        this.oreSettimanali = oreSettimanali;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * oreSettimanali * 52;
    }
}
