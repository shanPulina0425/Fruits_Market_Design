package Controller;

import Model.Fruit;
import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



public class ItemController {

    @FXML
    private AnchorPane fruitItemFrame;

    @FXML
    private ImageView image;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    private Fruit fruit;

    private FruitsMarketController marketController ;

    public static final String CURRENCY ="$";

    public void setMarketController(FruitsMarketController marketController){

        this.marketController=marketController;

    }

    public void setData(Fruit fruit){

        this.fruit=fruit;
        nameLabel.setText(fruit.getName());
        priceLabel.setText(CURRENCY+fruit.getPrice());
        Image fruitImage=new Image(fruit.getImgsrc());
        image.setImage(fruitImage);

    }

    @FXML
    void onFruitClicked(MouseEvent event) {

        if (marketController != null && fruit != null) {
            marketController.setChoosenFruit(fruit);
        }


    }

}
