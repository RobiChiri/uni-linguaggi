package classiAstratte;

public class CompraNArticoliPrendiUnoGratis extends politicaSconto {
  private int n;

  public CompraNArticoliPrendiUnoGratis(int n) {
    super();
    this.n = n;
  }

  public double calcolaSconto(int numerAarticoli, int prezzoArticolo) {
    double sconto = 0;
    if (n <= numerAarticoli) {
      sconto = prezzoArticolo;
    }
    return sconto;
  }
}
