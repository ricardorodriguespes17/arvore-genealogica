package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Filho3 extends Thread{  //classe Filho3 extende da classe Thread
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
    tpc.filho3(1);  //chama a funcao que muda a imagem do 'filho3' - aparencia 1
  	System.out.println("O pai tem o terceiro filho aos 32 anos");  //imprime mensagem no terminal
    try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <=55; idade++){  //for com variavel 'idade' que termina quando chega a 55 - idade de morte do filho 3
        if(idade == 15){  //quando filho 3 tiver 15 anos, muda a aparencia dele
          tpc.filho3(2);  //chama a funcao que muda a imagem do 'filho3' - aparencia 2
        }  //fim do if
        if(idade == 20){  //quando filho 3 tiver 20 anos, muda a aparencia dele
          tpc.filho3(3);  //chama a funcao que muda a imagem do 'filho3' - aparencia 3
        }  //fim do if
        if(idade == 50){  //quando filho 3 tiver 50 anos, muda a aparencia dele
          tpc.filho3(4);  //chama a funcao que muda a imagem do 'filho3' - aparencia 4
        }  //fim do if
        sleep(1000);  //hiberna a thread por 1000 milissegundos
      }  //fim do for
      tpc.filho3(5);  //chama a funcao que muda a imagem do 'filho3' - ultima aparencia
      System.out.println("O terceiro filho morre aos 55 anos");  //imprime mensagem no terminal
    }catch(InterruptedException e){  //pegando o erro do tipo InterruptedException - se der esse erro
      e.printStackTrace();  //imprime o erro no terminal
    }  //fim do try - catch
  }  //fim do run
}  //fim da classe Filho3