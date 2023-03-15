package model;

public class Nascimento {
  private int idadePai;
  private Membro filho;

  public Nascimento(int idadePai, Membro filho) {
    this.idadePai = idadePai;
    this.filho = filho;
  }

  public int getIdadePai() {
    return idadePai;
  }

  public void setIdadePai(int idadePai) {
    this.idadePai = idadePai;
  }

  public Membro getFilho() {
    return filho;
  }

  public void setFilho(Membro filho) {
    this.filho = filho;
  }

}
