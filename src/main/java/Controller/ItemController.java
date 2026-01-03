package Controller;

import Model.Fruit;
import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemController {

    @FXML
    private ImageView image;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    private Fruit fruit;

    public static final String CURRENCY ="$";

    public void setData(Fruit fruit){

        this.fruit=fruit;
        nameLabel.setText(fruit.getName());
        priceLabel.setText(CURRENCY+fruit.getPrice());
        Image fruitImage=new Image(fruit.getImgsrc());
        image.setImage(fruitImage);

    }

}
