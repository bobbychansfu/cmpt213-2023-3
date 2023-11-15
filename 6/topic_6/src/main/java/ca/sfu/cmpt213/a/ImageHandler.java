package ca.sfu.cmpt213.a;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *  A demonstration of nested layouts
 */

public class ImageHandler extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create Image objects.
       Image finlandImage = new Image("file:img/Finland.png");
       Image germanyImage = new Image("file:img/Germany.png");

       // Create the ImageView objects.
       ImageView finlandIView = new ImageView(finlandImage);
       ImageView germanyIView = new ImageView(germanyImage);

       finlandIView.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler());

       // Create a Label control.
       Label messageLabel = new Label("Flags of Finland and Germany");

       VBox vbox1 = new VBox(messageLabel);
       vbox1.setAlignment(Pos.CENTER);
       //vbox1.setPadding(new Insets(300,0,300,0));

       // Create a VBox layout container for the images.
       VBox vbox = new VBox(10, finlandIView, germanyIView);

       // Create a GridPane layout container.
       GridPane gridpane = new GridPane();

       // Add the Label and the VBox to the GridPane.
       gridpane.add(messageLabel, 0, 0);    // Column 0, Row 0
       gridpane.add(vbox, 1, 0);            // Column 1, Row 0

      // Set the gap size between the Gridpane's columns.
      gridpane.setHgap(45);

      // Set the GridPane's padding.
      gridpane.setPadding(new Insets(10,20,30,40));

       // Create a Scene with the GridPane as its root node.
       Scene scene = new Scene(gridpane);

       // Add the Scene to the Stage.
       primaryStage.setScene(scene);

       // Show the window.
       primaryStage.show();
   }

   class ImageClickHandler implements EventHandler<MouseEvent> {
      @Override
      public void handle(MouseEvent evt) {
         System.out.println(evt.getSource());
         ((ImageView)evt.getSource()).setImage(new Image("file:img/Germany.png"));
      }
   }

}