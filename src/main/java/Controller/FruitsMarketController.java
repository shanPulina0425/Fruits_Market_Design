package Controller;

import Model.Fruit;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FruitsMarketController implements Initializable {

    @FXML
    private VBox choosenFruitCard;

    @FXML
    private ImageView fruitImage;

    @FXML
    private Label fruitNameLabel;

    @FXML
    private Label fruitPriceLabel;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;

    @FXML
    private TextField searchBar;

    @FXML
    private Button searchButton;

    private ArrayList<Fruit> fruits =new ArrayList<>();





    private ArrayList<Fruit> getData(){



        for(int i=0;i<20;i++){
            Fruit fruit=new Fruit();

            fruit.setName("Kiwi");
            fruit.setPrice(2.99);
            fruit.setImgsrc("/img/kiwi.png");
            fruit.setColor("6A7324");

            fruits.add(fruit);




        }
        return fruits;


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
