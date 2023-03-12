package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import model.Pai;
import javafx.scene.image.Image;

public class TelaPrincipalController implements Initializable { // classe controladora do tela fxml

  @FXML
  private ImageView pai = new ImageView(); // declarando e instanciando visualizador de imagens do pai
  @FXML
  private ImageView filho1 = new ImageView(); // declarando e instanciando visualizador de imagens do filho1
  @FXML
  private ImageView filho2 = new ImageView(); // declarando e instanciando visualizador de imagens do filho2
  @FXML
  private ImageView filho3 = new ImageView(); // declarando e instanciando visualizador de imagens do filho3
  @FXML
  private ImageView neto1 = new ImageView(); // declarando e instanciando visualizador de imagens do neto1
  @FXML
  private ImageView neto2 = new ImageView(); // declarando e instanciando visualizador de imagens do neto2
  @FXML
  private ImageView bisneto = new ImageView(); // declarando e instanciando visualizador de imagens do bisneto

  /*
   * ***************************************************************
   * Metodo: pai
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do pai
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void pai(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo baseado no inteiro f
      case 1: // caso f seja 1
        imagem = new Image("/view/imagens/paiCrianca.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 2: // caso f seja 2
        imagem = new Image("/view/imagens/paiJovem.png"); // carregando o caminho da imagem de 'jovem'
        break;
      case 3: // caso f seja 3
        imagem = new Image("/view/imagens/paiAdulto.png"); // carregando o caminho da imagem de 'adulto'
        break;
      case 4: // caso f seja 4
        imagem = new Image("/view/imagens/paiIdoso.png"); // carregando o caminho da imagem de 'idoso'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'morte'
        break;
    } // fim do switch case
    pai.setImage(imagem); // mudando a imagem do ImageView do pai
  } // fim do metodo pai

  /*
   * ***************************************************************
   * Metodo: filho1
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do filho1
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void filho1(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo baseado no inteiro f
      case 1: // caso f seja 1
        imagem = new Image("/view/imagens/filho1Crianca.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 2: // caso f seja 1
        imagem = new Image("/view/imagens/filho1Jovem.png"); // carregando o caminho da imagem de 'jovem'
        break;
      case 3: // caso f seja 1
        imagem = new Image("/view/imagens/filho1Adulto.png"); // carregando o caminho da imagem de 'adulto'
        break;
      case 4: // caso f seja 1
        imagem = new Image("/view/imagens/filho1Idoso.png"); // carregando o caminho da imagem de 'idoso'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'morte'
        break;
    } // fim do switch case
    filho1.setImage(imagem); // mudando a imagem do ImageView do filho1
  } // fim do metodo filho1

  /*
   * ***************************************************************
   * Metodo: filho2
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do filho2
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void filho2(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo casos baseado no inteiro f
      case 1: // caso f seja 1
        imagem = new Image("/view/imagens/filho2Crianca.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 2: // caso f seja 2
        imagem = new Image("/view/imagens/filho2Jovem.png"); // carregando o caminho da imagem de 'jovem'
        break;
      case 3: // caso f seja 3
        imagem = new Image("/view/imagens/filho2Adulto.png"); // carregando o caminho da imagem de 'adulto'
        break;
      case 4: // caso f seja 4
        imagem = new Image("/view/imagens/filho2Idoso.png"); // carregando o caminho da imagem de 'idoso'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'morte'
        break;
    } // fim do switch case
    filho2.setImage(imagem); // mudando a imagem do ImageView do filho2
  } // fim do metodo filho2

  /*
   * ***************************************************************
   * Metodo: filho3
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do filho3
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void filho3(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo casos baseado no inteiro f
      case 1: // caso f seja 1
        imagem = new Image("/view/imagens/filho3Crianca.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 2: // caso f seja 2
        imagem = new Image("/view/imagens/filho3Jovem.png"); // carregando o caminho da imagem de 'jovem'
        break;
      case 3: // caso f seja 3
        imagem = new Image("/view/imagens/filho3Adulto.png"); // carregando o caminho da imagem de 'adulto'
        break;
      case 4: // caso f seja 4
        imagem = new Image("/view/imagens/filho3Idoso.png"); // carregando o caminho da imagem de 'idoso'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'morte'
        break;
    } // fim do switch case
    filho3.setImage(imagem); // mudando a imagem do ImageView do filho3
  } // fim do metodo filho3

  /*
   * ***************************************************************
   * Metodo: neto1
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do neto1
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void neto1(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo casos baseado no inteiro f
      case 1: // caso f seja 1
        imagem = new Image("/view/imagens/neto1Crianca.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 2: // caso f seja 1
        imagem = new Image("/view/imagens/neto1Jovem.png"); // carregando o caminho da imagem de 'jovem'
        break;
      case 3: // caso f seja 1
        imagem = new Image("/view/imagens/neto1Adulto.png"); // carregando o caminho da imagem de 'adulto'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'morte'
        break;
    } // fim do switch case
    neto1.setImage(imagem); // mudando a imagem do ImageView do neto1
  } // fim do metodo neto1

  /*
   * ***************************************************************
   * Metodo: neto2
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do neto2
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void neto2(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo casos baseado no inteiro f
      case 1: // caso f seja 1
        imagem = new Image("/view/imagens/neto2Crianca.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 2: // caso f seja 2
        imagem = new Image("/view/imagens/neto2Jovem.png"); // carregando o caminho da imagem de 'crianca'
        break;
      case 3: // caso f seja 3
        imagem = new Image("/view/imagens/neto2Adulto.png"); // carregando o caminho da imagem de 'crianca'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'crianca'
        break;
    } // fim do switch case
    neto2.setImage(imagem); // mudando a imagem do ImageView do neto2
  } // fim do metodo neto2

  /*
   * ***************************************************************
   * Metodo: bisneto
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do bisneto
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void bisneto(int f) {
    Image imagem = null; // declarando a imagem
    switch (f) { // escolhendo casos baseado no inteiro f
      case 1: // caso f seja 3
        imagem = new Image("/view/imagens/bisneto.png"); // carregando o caminho da imagem de 'crianca'
        break;
      default: // nenhum dos casos
        imagem = new Image("/view/imagens/morte.png"); // carregando o caminho da imagem de 'crianca'
        break;
    } // fim do switch case
    bisneto.setImage(imagem); // mudando a imagem do ImageView do bisneto
  } // fim do metodo bisneto

  /*
   * ***************************************************************
   * Metodo: initialize
   * Funcao: metodo inicial da classe Initializable
   * Parametros: URL, ResourceBundle
   * Retorno: *sem retorno*
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) { // metodo inicializador do controlador
    Pai pai = new Pai(); // declarando e instanciando a variavel tipo Pai
    pai.setJanela(this); // passando a classe TelaPrincipalController para a classe Pai
    pai.start(); // iniciando a variavel pai
  } // fim do initialize
} // fim da classe TelaPrincipalController