package Orologi;

public class Counter {
  private int val;

  public Counter() {
    val = 0;
  }

  public Counter(int n) {
    val = n;
  }

  public void reset() {
    val = 0;
  }

  public void inc() {
    val++;
  }

  public void inc(int k) {
    val = val + k;
  }

  public int getValue() {
    return val;
  }

  public String toString() {
    return "Counter di valore " + val;
  }
}
