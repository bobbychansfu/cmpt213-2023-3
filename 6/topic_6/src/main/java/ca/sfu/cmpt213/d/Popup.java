package ca.sfu.cmpt213.d;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Popup extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Button submit = new Button("Open new Window");
        VBox vbox = new VBox(submit);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage subStage = new Stage();
                subStage.setTitle("New Popup");

                // associate parent with subStage
                subStage.initModality(Modality.WINDOW_MODAL);
                subStage.initOwner(primaryStage);

                Label message = new Label("Hello World");
                HBox hbox = new HBox(message);
                Scene subScene = new Scene(hbox, 300, 100);

                subStage.setScene(subScene);
                subStage.show();
            }
        
        });

        Scene scene = new Scene(vbox,640,480);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}