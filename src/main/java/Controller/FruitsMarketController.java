package Controller;

import Model.Fruit;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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



    private ArrayList<String> nameArray=new ArrayList<>(Arrays.asList("Kiwi","Coconut","Peach","Grapes","Watermelon","Orange","StrawBerry","Mango","Cherry","Banana"));
    private ArrayList<Double> priceArray=new ArrayList<Double>(Arrays.asList(2.99,3.99,1.50,0.99,4.99,2.99,0.99,0.99,0.99,1.99));
    private ArrayList<String> imagePath=new ArrayList<>(Arrays.asList("/img/kiwi.png","/img/coconut.png","/img/peach.png","/img/grapes.png","/img/watermelon.png","/img/orange.png","/img/strawberry.png","/img/mango.png","/img/cherry.png","/img/banana.png"));
    private ArrayList<String> color=new ArrayList<>(Arrays.asList("6A7324","A7745B","F16C31","291D36","22371D","FB5D03","80080C","FFB605","5F060E","E7C00F"));



    private ArrayList<Fruit> fruits =new ArrayList<>();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int column =0;
        int row=0;

        getData();

        grid.getChildren().clear();

        grid.setMinWidth(Region.USE_COMPUTED_SIZE);
        grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
        //grid.setMaxWidth(Region.USE_PREF_SIZE);

        grid.setMinHeight(Region.USE_COMPUTED_SIZE);
        grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
        grid.setMaxHeight(Region.USE_PREF_SIZE);


        for(int i=0;i<fruits.size();i++){

            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/View/items.fxml"));
            try {
                AnchorPane anchorPane= fxmlLoader.load();

                ItemController itemController=fxmlLoader.getController();
                itemController.setData(fruits.get(i));

                if(column==3){
                    column=0;
                    row++;

                }

                grid.add(anchorPane,column++,row);




                GridPane.setMargin(anchorPane,new Insets(10));





            } catch (IOException e) {
                e.printStackTrace();
                //throw new RuntimeException(e);
            }



        }


    }


    private ArrayList<Fruit> getData(){

        for(int i=0;i<10;i++){

            Fruit fruit =new Fruit();
            fruit.setName(nameArray.get(i));
            fruit.setPrice(priceArray.get(i));
            fruit.setImgsrc(imagePath.get(i));
            fruit.setColor(color.get(i));
            fruits.add(fruit);


        }

        return fruits;


    }



}
