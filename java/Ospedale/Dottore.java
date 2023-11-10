package Ospedale;

public class Dottore extends Persona {
  private String specializzazione;
  private double parcella;

  public Dottore(String nome, String specializzazione, double parcella) {
    super();

    this.specializzazione = specializzazione;
    this.parcella = parcella;
  }

  public String getSpecializzazione() {
    return specializzazione;
  }

  public double getParcella() {
    return parcella;
  }
}
