package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
//        loader.setLocation(
//                getClass().getResource("sample.fxml"));

        AnchorPane root = (AnchorPane)loader.load();

        Controller controller = loader.getController();
        controller.start(primaryStage);


        primaryStage.setTitle("Hello World Testing");


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
