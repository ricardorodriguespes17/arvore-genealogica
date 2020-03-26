package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Bisneto extends Thread{  //classe Bisneto extende da classe Thread
  TelaPrincipalController tpc;  //declarando variavel do tipo TelaPrincipalController - controlador do tela principal
  
  /* ***************************************************************
  * Metodo: setJanela
  * Funcao: atribui a classe controladora a variavel que sera usada
  *   pela classe
  * Parametros: janela eh o controlador da tela que a classe ira 
  *   usar
  * Retorno: *sem retorno*
  *************************************************************** */
  public void setJanela(TelaPrincipalController janela) {
    tpc = janela;  //variavel tpc recebe a classe controladora da janela/tela principal
  }  //fim do setJanela

  /* ***************************************************************
  * Metodo: run
  * Funcao: metodo inicial da classe Thread
  * Parametros: *sem parametros*
  * Retorno: *sem retorno*
  *************************************************************** */
  public void run(){
    tpc.bisneto(1);  //chama a funcao que muda a imagem do 'bisneto' - aparencia 1
    System.out.println("O pai eh bisavo (primeiro filho) aos 68 anos");  //imprime mensagem no terminal
    try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <= 12; idade++){  //for com variavel 'idade' que termina quando chega a 12 - idade de morte do bisneto
        sleep(1000);  //hiberna a thread por 1000 milisegundos
      }  //fim do for
      tpc.bisneto(2);  //chama a funcao que muda a imagem do 'bisneto' - ultima aparencia
      System.out.println("O bisneto morre aos 12 anos");  //imprimir mensagem no terminal
    }catch(InterruptedException e){  //pega e inicia o tratamento do erro
      e.printStackTrace();  //imprime o erro no terminal
    }  //fim do try - catch
  }  //fim do run
}  //fim da classe Bisneto