package model;

import controller.TelaPrincipalController;

public class Filho1 extends Membro {
  Neto1 neto1;

  public Filho1(TelaPrincipalController telaPrincipalController) {
    super("filho1", 61, telaPrincipalController);
    neto1 = new Neto1(telaPrincipalController);
  }

  @Override
  public void gerarFilho() {
    if (idadeAtual == 16)
      neto1.start();
  }
}