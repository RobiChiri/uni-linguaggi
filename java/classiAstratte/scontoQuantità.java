package classiAstratte;

public class scontoQuantità extends politicaSconto {
  private int minimo;
  private int percentuale;

  public scontoQuantità(int minimo, int percentuale) {
    super();
    this.minimo = minimo;
    this.percentuale = percentuale;
  }

  public double calcolaSconto(int numerAarticoli, int prezzoArticolo) {
    double sconto=0;
    if (numerAarticoli >= minimo) {
      sconto = numerAarticoli * prezzoArticolo * percentuale;
    }
    
    return sconto;
  }
}
