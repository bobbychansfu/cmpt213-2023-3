package ca.sfu.cmpt213.c;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class ShapeDemo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Line l1 = new Line(160,20,310,220);
        Line l2 = new Line(160,20,20,220);
        Line l3 = new Line(20,220,310,220);

        l1.setStroke(Color.RED);
        l2.setStroke(Color.BLUE);

        l1.setStrokeWidth(5);
        l3.setStrokeWidth(10);

    
        Rectangle r = new Rectangle();
        r.setWidth(250);
        r.setHeight(90);
        r.setX(40);
        r.setY(90);
        r.setFill(Color.BROWN);

        r.setRotate(45);

        Pane p = new Pane(l1,l2,l3, r);
        
        Scene scene = new Scene(p,640,480);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}