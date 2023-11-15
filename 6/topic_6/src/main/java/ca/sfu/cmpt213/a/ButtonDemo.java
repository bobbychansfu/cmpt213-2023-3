package ca.sfu.cmpt213.a;

import javafx.application.Application;
import javafx.geometry.Pos;
// import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class ButtonDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // scene = new Scene(loadFXML("primary"), 640, 480);
        Label label = new Label("Click below");
        Button button = new Button("Click ME");

        VBox vbox = new VBox(10,label,button);

        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox,300,300);

        primaryStage.setScene(scene);

        primaryStage.show();

    }



    public static void main(String[] args) {
        launch();
    }

}