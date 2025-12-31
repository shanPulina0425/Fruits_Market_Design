import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

    public static void main(String[] args){

        launch(args);





    }


    @Override
    public void start(Stage stage) throws Exception {
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/FruitsMarketDesign.fxml"))));
        Parent root=FXMLLoader.load(getClass().getResource("/View/FruitsMarketDesign.fxml"));
        Scene scene=new Scene(root);

        scene.getStylesheets().add(getClass().getResource("/Styles/style.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Fruits Market");
        stage.show();
    }
}
