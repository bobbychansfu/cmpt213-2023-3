package ca.sfu.cmpt213.d;

import javafx.application.Application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a ListView of Strings.
      ListView<String> listView = new ListView<>();
      listView.setPrefSize(120, 100);
      listView.getItems().addAll("Tommy", "Kimberly", "Trini", "Zack", "Jason");
      listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

      // Create a Label to display the selection.
      Label selectedNameLabel = new Label("Select a Name");
      
      // Create an event handler for the ListView control.
      listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         @Override
         public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
            String selected = listView.getSelectionModel().getSelectedItem();
            selectedNameLabel.setText(selected);
            
         }
      });
      // Add the controls to a VBox.
      VBox vbox = new VBox(10, listView, selectedNameLabel);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox,300,200);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}