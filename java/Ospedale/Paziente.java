package Ospedale;

public class Paziente extends Persona{
  private int id;

  public Paziente(String nome, int id) {
    super();
    this.id = id;
  }

  public int getId() {
    return id;
  }


}
