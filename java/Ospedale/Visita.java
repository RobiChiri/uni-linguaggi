package Ospedale;

public class Visita {
  public static void main(String[] args) {
    Paziente p1 = new Paziente("Robi", 001);
    Paziente p2 = new Paziente("Albi", 002);

    Dottore d1 = new Dottore("Mario", "chirurgo", 300.00);
    Dottore d2 = new Dottore("Pino", "pediatra", 50.00);

    Fattura f1 = new Fattura(d1, p1);
    Fattura f2 = new Fattura(d2, p2);

    System.err.println("Totale fatture: "+ f1.importo() + f2.importo());
  }
}
