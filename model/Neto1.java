package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Neto1 extends Thread{  //classe Neto1 extende da classe Thread
  Bisneto bisneto = new Bisneto();  //instanciando bisneto
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
    bisneto.setJanela(janela);
  }  //fim do setJanela

  /* ***************************************************************
  * Metodo: run
  * Funcao: metodo inicial da classe Thread
  * Parametros: *sem parametros*
  * Retorno: *sem retorno*
  *************************************************************** */
  public void run(){
    tpc.neto1(1);  //chama a funcao que muda a imagem do 'neto1' - aparencia 1
    System.out.println("O pai eh avo (primeiro filho) aos 38 anos");  //imprime mensagem no terminal
    try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <= 35; idade++){  //for com variavel 'idade' que termina quando chega a 35 - idade de morte do neto 1
        if(idade == 15){  //quando neto 1 tiver 15 anos, muda a aparencia dele
          tpc.neto1(2);  //chama a funcao que muda a imagem do 'neto1' - aparencia 2
        }  //fim do if
        if(idade == 20){  //quando neto 1 tiver 20 anos, muda a aparencia dele
          tpc.neto1(3);  //chama a funcao que muda a imagem do 'neto1' - aparencia 3
        }  //fim do if
        if(idade == 30){  //quando neto 1 tiver 30 anos, nasce o bisneto
          bisneto.start();
        }  //fim do if
        sleep(1000);  //hiberna a thread por 1000 milissegundos
      }  //fim do for
      tpc.neto1(4);  //chama a funcao que muda a imagem do 'neto1' - ultima aparencia
      System.out.println("O primeiro neto morre aos 35 anos");
    }catch(InterruptedException e){  //pegando o erro do tipo InterruptedException - se der esse erro
      e.printStackTrace();  //imprime o erro no terminal
    }  //fim do try - catch
  }  //fim do run
}  //fim da classe Neto1