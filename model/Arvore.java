package model;

import java.util.ArrayList;
import controller.TelaPrincipalController;

public class Arvore {
  private Membro pai;
  private TelaPrincipalController contexto;

  public Arvore(TelaPrincipalController contexto) {
    this.contexto = contexto;
    criarMembros();
  }

  public void iniciarArvore() {
    pai.start();
  }

  public void criarMembros() {
    ArrayList<Nascimento> filhos = new ArrayList<>();
    ArrayList<Nascimento> netosFilho1 = new ArrayList<>();
    ArrayList<Nascimento> netosFilho2 = new ArrayList<>();
    ArrayList<Nascimento> bisnetos = new ArrayList<>();

    Membro bisneto = new Membro("bisneto", 12, null, contexto);
    bisnetos.add(new Nascimento(30, bisneto));

    Membro neto1 = new Membro("neto1", 35, bisnetos, contexto);
    Membro neto2 = new Membro("neto2", 33, null, contexto);
    netosFilho1.add(new Nascimento(16, neto1));
    netosFilho1.add(new Nascimento(20, neto2));

    Membro filho1 = new Membro("filho1", 61, netosFilho1, contexto);
    Membro filho2 = new Membro("filho2", 55, netosFilho2, contexto);
    Membro filho3 = new Membro("filho3", 55, null, contexto);
    filhos.add(new Nascimento(22, filho1));
    filhos.add(new Nascimento(25, filho2));
    filhos.add(new Nascimento(32, filho3));

    pai = new Membro("pai", 90, filhos, contexto);
  }

  public Membro getPai() {
    return pai;
  }

  public void setPai(Membro pai) {
    this.pai = pai;
  }

  public TelaPrincipalController getContexto() {
    return contexto;
  }

  public void setContexto(TelaPrincipalController contexto) {
    this.contexto = contexto;
  }
}