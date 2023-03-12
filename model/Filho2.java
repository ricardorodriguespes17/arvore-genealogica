package model;

import controller.TelaPrincipalController;

public class Filho2 extends Membro {
  Neto2 neto2;

  public Filho2(TelaPrincipalController telaPrincipalController) {
    super("filho2", 55, telaPrincipalController);
    neto2 = new Neto2(telaPrincipalController);
  }

  @Override
  public void gerarFilho() {

    if (this.idadeAtual == 20)
      neto2.start();
  }
}