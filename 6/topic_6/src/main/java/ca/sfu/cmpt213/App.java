package ca.sfu.cmpt213;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *  A Client Demo
 */

public class Client extends Application
{
    public static void main(String[] args)
    {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Label component.
        Label nameLabel = new Label("Name: ");
        nameLabel.setPrefWidth(100);
        nameLabel.setPadding(new Insets(0, 0, 0, 30));
        Label ageLabel = new Label("Age: ");
        ageLabel.setPadding(new Insets(0, 0, 0, 30));
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        Button submit = new Button("POST Req");
        Button submit2 = new Button("GET Req");

        Label outputLabel = new Label();

        GridPane gridpane = new GridPane();
        gridpane.add(nameLabel, 0, 0);
        gridpane.add(ageLabel, 0, 1);
        gridpane.add(nameField, 1, 0);
        gridpane.add(ageField, 1, 1);
        gridpane.add(submit, 1, 2);
        gridpane.add(submit2, 1, 3);

        VBox vb = new VBox(20, gridpane, outputLabel);

        submit2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    URL url = new URL("http://localhost:8081/person");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");

                    connection.getInputStream();
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
                    String output = br.readLine();
                    System.out.println(output);
                    System.out.println(connection.getResponseCode());

                    outputLabel.setText(output);

                    connection.disconnect();
                }
                catch (IOException e){
                    e.printStackTrace();
                }


            }
        });

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String newName = nameField.getText();
                String newAge = ageField.getText();
                try{
                    URL url = new URL("http://localhost:8081/person");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setDoOutput(true);
                    connection.setRequestProperty("Content-Type", "application/json");

                    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
                    wr.write("{\"name\":\""+newName+"\",\"age\":"+ newAge +"}");
                    wr.flush();
                    wr.close();

                    connection.connect();
                    System.out.println(connection.getResponseCode());
                    connection.disconnect();
                }
                catch (IOException e){
                    e.printStackTrace();
                }


            }
        });

        Scene scene = new Scene(vb, 500, 300); // (parent, hor, vert)

        primaryStage.setScene(scene);
        primaryStage.setTitle("New Person");
        primaryStage.show();
    }
}