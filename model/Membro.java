package model;

import controller.TelaPrincipalController;

import java.util.ArrayList;

public class Membro extends Thread {
  private TelaPrincipalController telaPrincipalController;
  private int idadeAtual = 0;
  private int idadeMorte;
  private String nome;
  private ArrayList<Nascimento> filhos;

  public Membro(
      String nome,
      int idadeMorte,
      ArrayList<Nascimento> filhos,
      TelaPrincipalController telaPrincipalController) {
    this.nome = nome;
    this.idadeMorte = idadeMorte;
    this.telaPrincipalController = telaPrincipalController;
    if (filhos != null)
      this.filhos = filhos;
    else
      this.filhos = new ArrayList<>();
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
        gerarFilho();
        mudaAparencia();
        atualizaIdadeMembro();
        sleep(200);
        idadeAtual++;
      }
      System.out.println("O " + nome + " morre aos " + idadeMorte + " anos");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void gerarFilho() {
    for (Nascimento nascimento : filhos) {
      if (nascimento.getIdadePai() == idadeAtual)
        nascimento.getFilho().start();
    }
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

  private void atualizaIdadeMembro() {
    telaPrincipalController.atualizaIdadeMembro(idadeAtual, nome);
  }

  public TelaPrincipalController getTelaPrincipalController() {
    return telaPrincipalController;
  }

  public void setTelaPrincipalController(TelaPrincipalController telaPrincipalController) {
    this.telaPrincipalController = telaPrincipalController;
  }

  public int getIdadeAtual() {
    return idadeAtual;
  }

  public void setIdadeAtual(int idadeAtual) {
    this.idadeAtual = idadeAtual;
  }

  public int getIdadeMorte() {
    return idadeMorte;
  }

  public void setIdadeMorte(int idadeMorte) {
    this.idadeMorte = idadeMorte;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Nascimento> getFilhos() {
    return filhos;
  }

  public void setFilhos(ArrayList<Nascimento> filhos) {
    this.filhos = filhos;
  }

}
