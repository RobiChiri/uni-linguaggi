package Orologi;

public class Orologio {
  private Counter[] a;

  public Orologio() {
    a = new Counter[2];
    a[0] = new Counter(); //ore
    a[1] = new Counter(); //minuti
  }

  public void reset() {
    a[0].reset();
    a[1].reset();
  }

  public void tic() {
    a[1].inc();
    if (a[1].getValue() == 60) {
      a[1].reset();
      a[0].inc();
    }
    if (a[0].getValue() == 24)
      a[0].reset();
  }

  public int getOre() {
    return a[0].getValue();
  }

  public int getMinuti() {
    return a[1].getValue();
  }
}
