package com.empresa.bitwise_trabajo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/empresa/bitwise_trabajo/hello-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 900, 750);
            scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("OPERADORES BITWISE!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}