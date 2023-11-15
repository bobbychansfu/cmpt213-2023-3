package ca.sfu.cmpt213.d;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class CSSDemo1 extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Label l = new Label("Hello World");
        l.getStyleClass().add("labels");

        VBox vbox = new VBox(l);
        vbox.setAlignment(Pos.CENTER);
        vbox.setId("customvb");
        Scene scene = new Scene(vbox,640,480);

        scene.getStylesheets().add("file:css/demo1.css");
        primaryStage.setScene(scene);

        primaryStage.show();

    }

}