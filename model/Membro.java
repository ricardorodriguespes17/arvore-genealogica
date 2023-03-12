package model;

import controller.TelaPrincipalController;
import javafx.scene.image.ImageView;

public class Membro extends Thread {
  TelaPrincipalController telaPrincipalController;
  public int idadeMorte;
  public int idadeAtual = 0;
  public String nome;
  public ImageView imageView;

  public Membro(String nome, int idadeMorte, TelaPrincipalController telaPrincipalController) {
    this.nome = nome;
    this.idadeMorte = idadeMorte;
    this.telaPrincipalController = telaPrincipalController;
  }

  /*
   * ***************************************************************
   * Metodo: run
   * Funcao: metodo inicial da classe Thread
   * Parametros: *sem parametros*
   * Retorno: *sem retorno*
   */
  public void run() {
    System.out.println("O " + nome + " nasceu");
    try {
      while (idadeAtual <= idadeMorte) {
        mudaAparencia();
        gerarFilho();
        sleep(1000);
        idadeAtual++;
      }
      System.out.println("O " + nome + " morre aos " + idadeMorte + " anos");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void gerarFilho() {

  }

  public void mudaAparencia() {
    if (idadeAtual == 0)
      telaPrincipalController.mudaImagem(1, nome);
    else if (idadeAtual == 15)
      telaPrincipalController.mudaImagem(2, nome);
    else if (idadeAtual == 21)
      telaPrincipalController.mudaImagem(3, nome);
    else if (idadeAtual == 50)
      telaPrincipalController.mudaImagem(4, nome);

    if (idadeAtual == idadeMorte)
      telaPrincipalController.mudaImagem(5, nome);
  }

}
