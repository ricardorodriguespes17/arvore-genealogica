/* ***************************************************************
* Autor: Ricardo Rodrigues Neto
* Matricula: 201710560
* Inicio: 23/07/2018
* Ultima alteracao: 28/07/2018
* Nome: Arvore genealogica com Threads
* Funcao: Exibe uma arvore genealogica utilizando threads
*************************************************************** */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// import controller.TelaPrincipalController; --remover descomentar se for rodar com javac
import model.Arvore;

public class Principal extends Application {

  /*****************************************************************
   * Metodo: start
   * Funcao: metodo inicial da classe Application
   * Parametros: palco principal que será mostrada na tela
   * Retorno: *sem retorno*
   */
  @Override
  public void start(Stage palco) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/view/TelaPrincipal.fxml"));
    Scene cena = new Scene(root);
    palco.setScene(cena);
    palco.show();
  }

  /****************************************************************
   * Metodo: main
   * Funcao: metodo inicial da classe principal do projeto
   * Parametros: String[] args
   * Retorno: *sem retorno*
   */
  public static void main(String[] args) {
    launch(args);
  }
}