package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Filho2 extends Thread{  //classe Filho2 extende da classe Thread
  Neto2 neto2 = new Neto2();  //instanciando neto2
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
    neto2.setJanela(janela);  //passando o controlador da tela principal para o neto2
  }  //fim do setJanela

  /* ***************************************************************
  * Metodo: run
  * Funcao: metodo inicial da classe Thread
  * Parametros: *sem parametros*
  * Retorno: *sem retorno*
  *************************************************************** */
  public void run(){
    tpc.filho2(1);  //chama a funcao que muda a imagem do 'filho2' - aparencia 1
  	System.out.println("O pai tem o segundo filho aos 25 anos");  //imprime mensagem no terminal
  	try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <= 55; idade++){  //for com variavel 'idade' que termina quando chega a 55 - idade de morte do filho 2
        if(idade == 15){  //quando filho 2 tiver 15 anos, muda a aparencia dele
          tpc.filho2(2);  //chama a funcao que muda a imagem do 'filho2' - aparencia 2
        }  //fim do if
        if(idade == 20){  //quando filho 2 tiver 20 anos, muda a aparencia dele e nasce o segundo neto - filho dele
          tpc.filho2(3);  //chama a funcao que muda a imagem do 'filho2' - aparencia 3
          neto2.start();  //inicia a thread neto2
        }  //fim do if
        if(idade == 50){  //quando filho 2 tiver 50 anos, muda a aparencia dele
          tpc.filho2(4);  //chama a funcao que muda a imagem do 'filho2' - aparencia 4
        }  //fim do if
        sleep(1000);  //hiberna a thread por 1000 milissegundos
      }  //fim do for
      tpc.filho2(5);  //chama a funcao que muda a imagem do 'filho2' - ultima aparencia
      System.out.println("O segundo filho morre aos 55 anos");  //imprime mensagem no terminal
  	}catch(InterruptedException e){  //pegando o erro do tipo InterruptedException - se der esse erro
      e.printStackTrace();  //imprime o erro no terminal
  	}  //fim do try - catch
  }  //fim do run
}  //fim da classe Filho2