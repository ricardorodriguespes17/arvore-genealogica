package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Neto2 extends Thread{  //classe Neto2 extende da classe Thread
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
    tpc.neto2(1);  //chama a funcao que muda a imagem do 'neto2' - aparencia 1
    System.out.println("O pai eh avo (segundo filho) aos 45 anos");  //imprime mensagem no terminal
    try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <= 33; idade++){  //for com variavel 'idade' que termina quando chega a 33 - idade de morte do neto 2
        if(idade == 15){  //quando neto 2 tiver 15 anos, muda a aparencia dele
          tpc.neto2(2);  //chama a funcao que muda a imagem do 'neto2' - aparencia 2
        }  //fim do if
        if(idade == 20){  //quando neto 2 tiver 20 anos, muda a aparencia dele
          tpc.neto2(3);  //chama a funcao que muda a imagem do 'neto2' - aparencia 3
        }  //fim do if
        sleep(1000);  //hiberna a thread por 1000 milissegundos
      }  //fim do for
      tpc.neto2(4);  //chama a funcao que muda a imagem do 'neto2' - ultima aparencia
      System.out.println("O segundo neto morre aos 33 anos");  //imprime mensagem no terminal
    }catch(InterruptedException e){  //pegando o erro do tipo InterruptedException - se der esse erro
      e.printStackTrace();  //imprime o erro no terminal
    }  //fim do try - catch
  }  //fim do run
}  //fim da classe Neto2