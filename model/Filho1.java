package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Filho1 extends Thread{  //classe Filho1 extende da classe Thread
  Neto1 neto1 = new Neto1();  //instanciando neto1
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
    neto1.setJanela(janela);  //passando o controlador da tela principal para o neto1
  }  //fim do setJanela

  /* ***************************************************************
  * Metodo: run
  * Funcao: metodo inicial da classe Thread
  * Parametros: *sem parametros*
  * Retorno: *sem retorno*
  *************************************************************** */
  public void run(){
    tpc.filho1(1);  //chama a funcao que muda a imagem do 'filho1' - aparencia 1
    System.out.println("O pai tem o primeiro filho aos 22 anos");  //imprime mensagem no terminal
    try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <= 61; idade++){  //for com variavel 'idade' que termina quando chega a 61 - idade de morte do filho 1
        if(idade == 15){  //quando filho 1 tiver 15 anos, muda a aparencia dele
          tpc.filho1(2);  //chama a funcao que muda a imagem do 'filho1' - aparencia 2
        }  //fim do if
        if(idade == 16){  //quando filho 1 tiver 16 anos, nasce o primeiro neto - filho dele
          neto1.start();  //inicia a thread neto1
        }  //fim do if
        if(idade == 18){  //quando filho 1 tiver 18 anos, muda a aparencia dele
          tpc.filho1(3);  //chama a funcao que muda a imagem do 'filho1' - aparencia 3
        }  //fim do if
        if(idade == 50){  //quando filho 1 tiver 50 anos, muda a aparencia dele
          tpc.filho1(4);  //chama a funcao que muda a imagem do 'filho1' - aparencia 4
        }  //fim do if
        sleep(1000);  //hiberna a thread por 1000 milissegundos
      }  //fim do for
      tpc.filho1(5);  //chama a funcao que muda a imagem do 'filho1' - ultima aparencia
      System.out.println("O primeiro filho morre aos 61 anos");  //imprime mensagem no terminal
    }catch(InterruptedException e){  //pegando o erro do tipo InterruptedException - se der esse erro
      e.printStackTrace();  //imprime o erro no terminal
    }  //fim do try - catch
  }  //fim do run
}  //fim da classe Filho1