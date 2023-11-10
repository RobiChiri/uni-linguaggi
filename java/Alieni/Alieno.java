package Alieni;
// public class Alieno {

//   public static final int ALIENO_SERPENTE = 0;
//   public static final int ALIENO_ORCO = 1;
//   public static final int ALIENO_UOMO_MARSHMALLOW = 2;
//   public int tipo; // Memorizza uno dei tre tipi sopra indicati
//   public int salute; // 0=morto, 100=forza piena
//   public String nome;

//   public Alieno(int tipo, int salute, String nome) {
//     this.tipo = tipo;
//     this.salute = salute;
//     this.nome = nome;
//   }
// }

public class Alieno {
  protected int salute, danno;
  protected String nome;

  public Alieno(int salute, String nome) {
    this.salute = salute;
    this.nome = nome;
  }

  public int getDanno() {
    return danno;
  }

}

class AlienoSerpente extends Alieno {
  public AlienoSerpente(int salute, String nome) {
    super(salute, nome);
    danno = 10;
  }
}

class AlienoOrco extends Alieno {
  public AlienoOrco(int salute, String nome) {
    super(salute, nome);
    danno = 6;
  }
}

class AlienoUomoMarshmallow extends Alieno {
  public AlienoUomoMarshmallow(int salute, String nome) {
    super(salute, nome);
    danno = 1;
  }
}