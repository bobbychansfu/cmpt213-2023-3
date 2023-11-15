package ca.sfu.cmpt213.b;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class BorderPaneDemo1 extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Button center = new Button("This is Center");
        Button top = new Button("This is Top");
        Button bottom = new Button("This is Bottom");
        Button right = new Button("This is right");
        Button left = new Button("This is left");

        HBox centerBox = new HBox(center);
        centerBox.setPrefSize(300,400);
        
        BorderPane bp = new BorderPane(centerBox,top,right,bottom,left);

        Scene scene = new Scene(bp,640,480);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}