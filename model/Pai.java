package model;

import java.lang.Thread;
import controller.TelaPrincipalController;

public class Pai extends Thread{  //classe Pai que extende da classe Thread
  Filho1 filho1 = new Filho1();  //instanciando filho1
  Filho2 filho2 = new Filho2();  //instanciando filho2
  Filho3 filho3 = new Filho3();  //instanciando filho3
  TelaPrincipalController tpc;  //declarando variavel do tipo TelaPrincipalController - controlador do tela principal 
  
  /* ***************************************************************
  * Metodo: setJanela
  * Funcao: atribui a classe controladora a variavel que sera usada
  *   pela classe
  * Parametros: janela eh o controlador da tela que a classe ira 
  *   usar
  * Retorno: *sem retorno*
  *************************************************************** */
  public void setJanela(TelaPrincipalController janela){
    tpc = janela;  //variavel tpc recebe a classe controladora da janela/tela principal
    filho1.setJanela(janela);  //passando o controlador da tela principal para o filho1
    filho2.setJanela(janela);  //passando o controlador da tela principal para o filho2
    filho3.setJanela(janela);  //passando o controlador da tela principal para o filho3
  }  //fim do metodo setJanela

  /* ***************************************************************
  * Metodo: run
  * Funcao: metodo inicial da classe Thread
  * Parametros: *sem parametros*
  * Retorno: *sem retorno*
  *************************************************************** */
  public void run(){
    tpc.pai(1);  //chama a funcao que muda a imagem do 'pai' - aparencia 1
    System.out.println("Pai nasceu");  //imprimir uma mensagem no terminal
    try{  //tenta executar o metodo sleep
      for(int idade = 0; idade <= 90; idade++){  //for com variavel 'idade' que termina quando chega a 90 - idade de morte do pai
        if(idade == 15){  //quando pai tiver 15 anos muda a aparencia dele
          tpc.pai(2);  //chama a funcao que muda a imagem do 'pai' - aparencia 2
        }  //fim do if
        if(idade == 21){  //quando pai tiver 21 anos muda a aparencia dele
          tpc.pai(3);  //chama a funcao que muda a imagem do 'pai' - aparencia 3
        }  //fim do if
        if(idade == 22){  //quando pai tiver 22 anos nasce o primeiro filho
          filho1.start();  //inicia a thread filho1
        }  //fim do if
        if(idade == 25){  //quando pai tiver 25 anos nasce o segundo filho
          filho2.start();  //inicia a thread filho2
        }  //fim do if
        if(idade == 32){  //quando pai tiver 32 anos nasce o terceiro filho
          filho3.start();  //inicia a thread filho3
        }  //fim do if
        if(idade == 50){  //quando pai tiver 50 anos muda a aparencia dele
          tpc.pai(4);  //chama a funcao que muda a imagem do 'pai' - aparencia 4
        }  //fim do if
        sleep(1000);  //hiberna a thread por 1000 milissegundos
      }  //fim do for
      tpc.pai(5);  //chama a funcao que muda a imagem do 'pai' - ultima aparencia
      System.out.println("O pai morre aos 90 anos");  //imprime uma mensagem no terminal
    }catch(InterruptedException e){  //pegando o erro do tipo InterruptedException - se der esse erro
      e.printStackTrace();  //imprime o erro no terminal
    }  //fim do try - catch
  }  //fim do metodo run
}  //fim da classe Pai