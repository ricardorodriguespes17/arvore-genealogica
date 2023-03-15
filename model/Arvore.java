package model;

import java.util.ArrayList;

import controller.TelaPrincipalController;

public class Arvore {
  ArrayList<Nascimento> filhos = new ArrayList<>();
  ArrayList<Nascimento> netosFilho1 = new ArrayList<>();
  ArrayList<Nascimento> netosFilho2 = new ArrayList<>();
  ArrayList<Nascimento> bisnetos = new ArrayList<>();

  public Arvore(TelaPrincipalController telaPrincipalController) {
    Membro bisneto = new Membro("bisneto", 12, null, telaPrincipalController);
    bisnetos.add(new Nascimento(30, bisneto));

    Membro neto1 = new Membro("neto1", 35, bisnetos, telaPrincipalController);
    Membro neto2 = new Membro("neto2", 33, null, telaPrincipalController);
    netosFilho1.add(new Nascimento(16, neto1));
    netosFilho1.add(new Nascimento(20, neto2));

    Membro filho1 = new Membro("filho1", 61, netosFilho1, telaPrincipalController);
    Membro filho2 = new Membro("filho2", 55, netosFilho2, telaPrincipalController);
    Membro filho3 = new Membro("filho3", 55, null, telaPrincipalController);
    filhos.add(new Nascimento(22, filho1));
    filhos.add(new Nascimento(25, filho2));
    filhos.add(new Nascimento(32, filho3));

    Membro pai = new Membro("pai", 90, filhos, telaPrincipalController);
    pai.start();
  }
}