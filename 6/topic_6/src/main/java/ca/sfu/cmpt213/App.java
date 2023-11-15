package ca.sfu.cmpt213;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        VBox vbox = new VBox();

        Scene scene = new Scene(vbox,640,480);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}