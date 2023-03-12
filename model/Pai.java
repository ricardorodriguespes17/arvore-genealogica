package model;

import controller.TelaPrincipalController;

public class Pai extends Membro {
  Filho1 filho1;
  Filho2 filho2;
  Filho3 filho3;

  public Pai(TelaPrincipalController telaPrincipalController) {
    super("pai", 90, telaPrincipalController);
    filho1 = new Filho1(telaPrincipalController);
    filho2 = new Filho2(telaPrincipalController);
    filho3 = new Filho3(telaPrincipalController);
  }

  @Override
  public void gerarFilho() {
    // System.out.println("Pai: " + idadeAtual + " anos");

    if (idadeAtual == 22)
      filho1.start();
    else if (idadeAtual == 25)
      filho2.start();
    else if (idadeAtual == 32)
      filho3.start();
  }

}