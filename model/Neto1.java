package model;

import controller.TelaPrincipalController;

public class Neto1 extends Membro {
  Bisneto bisneto;

  public Neto1(TelaPrincipalController telaPrincipalController) {
    super("neto1", 35, telaPrincipalController);
    bisneto = new Bisneto(telaPrincipalController);
  }

  @Override
  public void gerarFilho() {

    if (idadeAtual == 30)
      bisneto.start();
  }
}