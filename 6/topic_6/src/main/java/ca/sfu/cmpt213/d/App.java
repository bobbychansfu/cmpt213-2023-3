package ca.sfu.cmpt213.d;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        final double WIDTH = 640;
        final double HEIGHT = 480;

        MenuBar menubar = new MenuBar();

        Menu fileMenu = new Menu("file");

        MenuItem openItem = new MenuItem("Open");

        fileMenu.getItems().add(openItem);

        openItem.setOnAction(event ->
        {
            FileChooser fc = new FileChooser();
            File selectedFile = fc.showOpenDialog(primaryStage);
            String file = selectedFile.getName();
            System.out.println(file);
        });

        MenuItem closeItem = new MenuItem("Close");

        closeItem.setOnAction(event -> {
            primaryStage.close();
        });

        fileMenu.getItems().add(closeItem);

        SeparatorMenuItem s = new SeparatorMenuItem();

        RadioMenuItem radioMenuItem1 = new RadioMenuItem("radio1");
        RadioMenuItem radioMenuItem2 = new RadioMenuItem("radio2");

        ToggleGroup tg = new ToggleGroup();
        radioMenuItem1.setToggleGroup(tg);
        radioMenuItem1.setSelected(true);
        radioMenuItem2.setToggleGroup(tg);  

        fileMenu.getItems().addAll(openItem,closeItem,s,radioMenuItem1,radioMenuItem2);
        
        menubar.getMenus().addAll(fileMenu);

        BorderPane bp = new BorderPane();
        bp.setTop(menubar);

        Scene scene = new Scene(bp,WIDTH,HEIGHT);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}