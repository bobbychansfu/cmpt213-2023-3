package ca.cmpt213.client;

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

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label nameLabel = new Label("Name: ");
        Label ageLabel = new Label("Age: ");
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        Button submit = new Button("POST Req");
        Button submit2 = new Button("GET Req");

        Label outputLabel = new Label();

        Image img = new Image("http://localhost:8081/icon.png");
        ImageView imageView = new ImageView(img);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        submit2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    URI uri = new URI("http://localhost:8081/person");
                    URL url = uri.toURL();
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    
                    
                    
                    
                    // with basic authentification
                    // String userCredentials
                    String user = "user";
                    String password = "password";
                    String auth = user + ":" + password;
                    byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
                    String authHeaderValue = "Basic " + new String(encodedAuth);
                    connection.setRequestProperty("Authorization", authHeaderValue);





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
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameField.getText();
                String age = ageField.getText();
                try {
                    URI uri = new URI("http://localhost:8081/person");
                    URL url = uri.toURL();
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setDoOutput(true);
                    connection.setRequestProperty("Content-Type", "application/json");

                    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
                    System.out.println("{\"name\":\"" + name + "\",\"age\":" + age + "}");
                    wr.write("{\"name\":\"" + name + "\",\"age\":" + age + "}");
                    wr.flush();
                    wr.close();
                    connection.connect();
                    System.out.println(connection.getResponseCode());
                    connection.disconnect();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        GridPane gridpane = new GridPane();
        gridpane.add(nameLabel, 0, 0);
        gridpane.add(ageLabel, 0, 1);
        gridpane.add(nameField, 1, 0);
        gridpane.add(ageField, 1, 1);
        gridpane.add(submit, 1, 2);
        gridpane.add(submit2, 1, 3);




        VBox vb = new VBox(20, gridpane, outputLabel, imageView);

        Scene scene = new Scene(vb, 500, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}