package ca.sfu.cmpt213.b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

/**
 * JavaFX App
 */
public class ObservableDemo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Label l1 = new Label("Label 1");
        Label l2 = new Label("Label 2");
        Label l3 = new Label("Label 3");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(l1,l2,l3);

        Button b = new Button("remove");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evt){
                vbox.getChildren().remove(0);
            }
        });

        Button b2 = new Button("add");
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evt){
                // random number
                Random r = new Random();
                int n = r.nextInt(100);
                vbox.getChildren().add(0,new Label("Label" + n));
            }
        });

        HBox hb = new HBox(b,vbox);

        Scene scene = new Scene(hb,640,480);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}