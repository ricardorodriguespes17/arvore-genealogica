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
import model.Pai;
import controller.TelaPrincipalController;

public class Principal extends Application { // classe principal

  /*****************************************************************
   * Metodo: start
   * Funcao: metodo inicial da classe Application
   * Parametros: palco principal que será mostrada na tela
   * Retorno: *sem retorno*
   */
  @Override
  public void start(Stage palco) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/view/TelaPrincipal.fxml")); // carregando a tela fxml pelo
                                                                                       // seu caminho
    Scene cena = new Scene(root); // carregando a cena com a tela fxml
    palco.setScene(cena); // carregando o palco com a cena
    palco.show(); // mostrando o palco
  } // fim do metodo start

  /****************************************************************
   * Metodo: main
   * Funcao: metodo inicial da classe principal do projeto
   * Parametros: String[] args
   * Retorno: *sem retorno*
   */
  public static void main(String[] args) { // metodo main da classe principal
    launch(args); // iniciando o aplicativo
  } // fim do metodo main
} // fim da classe Principal