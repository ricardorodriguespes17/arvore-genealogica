package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import model.Pai;
import javafx.scene.image.Image;

public class TelaPrincipalController implements Initializable {

  @FXML
  private ImageView imagemPai = new ImageView();
  @FXML
  private ImageView imagemFilho1 = new ImageView();
  @FXML
  private ImageView imagemFilho2 = new ImageView();
  @FXML
  private ImageView imagemFilho3 = new ImageView();
  @FXML
  private ImageView imagemNeto1 = new ImageView();
  @FXML
  private ImageView imagemNeto2 = new ImageView();
  @FXML
  private ImageView imagemBisneto = new ImageView();

  private ArrayList<String> estagios = new ArrayList<>(Arrays.asList("Crianca", "Jovem", "Adulto", "Idoso", ""));

  /*
   * ***************************************************************
   * Metodo: pai
   * Funcao: carrega imagens diferentes no visualizador de imagens ao
   * longo do tempo de vida do pai
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void mudaImagem(int estagio, String membro) {
    Image imagem = null;

    if (estagio < 5)
      imagem = new Image("/view/imagens/" + membro + estagios.get(estagio - 1) + ".png");
    else
      imagem = new Image("/view/imagens/morte.png");

    switch (membro) {
      case "pai":
        imagemPai.setImage(imagem);
        break;
      case "filho1":
        imagemFilho1.setImage(imagem);
        break;
      case "filho2":
        imagemFilho2.setImage(imagem);
        break;
      case "filho3":
        imagemFilho3.setImage(imagem);
        break;
      case "neto1":
        imagemNeto1.setImage(imagem);
        break;
      case "neto2":
        imagemNeto2.setImage(imagem);
        break;
      default:
        imagemBisneto.setImage(imagem);
        break;
    }
  }

  /*
   * ***************************************************************
   * Metodo: initialize
   * Funcao: metodo inicial da classe Initializable
   * Parametros: URL, ResourceBundle
   * Retorno: *sem retorno*
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    imagemPai.setImage(new Image("/view/imagens/morte.png"));
    Pai pai = new Pai(this);
    pai.start();
  }
}