package ca.sfu.cmpt213.b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

/**
 *  Kilometer Converter application
 */

public class KiloConverter extends Application
{
   // Fields
   private TextField kiloTextField;
   private Label resultLabel;
   
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label to display a prompt.
      Label promptLabel = new Label("Enter a distance in kilometers:");
      
      // Create a TextField for input.
      kiloTextField = new TextField();
      
      // Create a Button to perform the conversion.
      Button calcButton = new Button("Convert");
      
      // Register the event handler.
      calcButton.setOnAction(new CalcButtonHandler());
      
      // Create an empty Label to display the result.
      resultLabel = new Label();
      
      // Put the promptLabel and the kiloTextField in an HBox.
      HBox hbox = new HBox(10, promptLabel, kiloTextField);
      
      // Put the HBox, calcButton, and resultLabel in a VBox.
      VBox vbox = new VBox(10,hbox, calcButton, resultLabel);
      
      // Set the VBox's alignment to center.
      vbox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      vbox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(vbox);

      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Kilometer Converter");
      
      // Show the window.
      primaryStage.show();   
   }
   
   /*
    * Event handler class for calcButton
    */
    
    class CalcButtonHandler implements EventHandler<ActionEvent> {
      @Override
      public void handle(ActionEvent evt) {
         Double km = Double.parseDouble(kiloTextField.getText());
         Double miles = km * 0.6;
         resultLabel.setText(String.format("%,.2f", miles));
      }
    }
   
}