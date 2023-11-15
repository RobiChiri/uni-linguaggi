package Alieni;

// public class GruppoAlieni {
// private Alieno[] alieno;

// public GruppoAlieni

// (int alieniNum) {
// alieno = new Alieno[alieniNum];
// }

// public void aggiungiAlieno(Alieno nuovoAlieno, int indice) {
// alieno[indice] = nuovoAlieno;
// }

// public Alieno[] getAlieni() {
// return alieno;
// }

// public int calcolaDanno() {
// int danno = 0;
// for (int i = 0; i < alieno.length; i++) {
// if (alieno[i].tipo == Alieno.ALIENO_SERPENTE) {
// danno += 10; // Il serpente procura un danno 10
// } else if (alieno[i].tipo == Alieno.ALIENO_ORCO) {
// danno += 6; // L’orco procura un danno 6
// } else if (alieno[i].tipo == Alieno.ALIENO_UOMO_MARSHMALLOW) {
// danno += 1; // L’Uomo Marshmallow procura un danno 1
// }
// }
// return danno;
// }
// }
public class GruppoAlieni {
  private Alieno[] alieno;

  public GruppoAlieni(int alieniNum) {
    alieno = new Alieno[alieniNum];
  }

  public void aggiungiAlieno(Alieno nuovAlieno, int indice) {
    alieno[indice] = nuovAlieno;
  }

  public Alieno[] getAlieni() {
    return alieno;
  }

  public int calcolaDanno() {
    int danno = 0;
    for (int i = 0; i < alieno.length; i++)
      danno += alieno[i].getDanno();

    return danno;
  }
}