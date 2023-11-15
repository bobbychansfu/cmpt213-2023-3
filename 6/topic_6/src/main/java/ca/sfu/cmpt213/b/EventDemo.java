package ca.sfu.cmpt213.b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *  An Event Demo
 */

public class EventDemo extends Application
{
   // Field for the Label control
   private Label myLabel;
   
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      myLabel = new Label("Click the button to see a message.");
      Button myButton = new Button("Click me");
      // myButton.setOnAction(new ButtonClickHandler());

      myButton.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent evt){

         }
      });

      VBox vbox = new VBox(10, myLabel, myButton);

      

      Scene scene = new Scene(vbox, 300, 300);
      
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Button Demo");
      
      // Show the window.
      primaryStage.show();
   }
   
   /*
    * Event handler class for myButton
    */
   
   class ButtonClickHandler implements EventHandler<ActionEvent> {
      @Override
      public void handle(ActionEvent evt) {
         myLabel.setText("Thank you for clicking!");
      }
   }
   
}