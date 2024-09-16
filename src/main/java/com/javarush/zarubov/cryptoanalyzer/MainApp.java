package com.javarush.zarubov.cryptoanalyzer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class MainApp extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        MainApp.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Crypto analyzer");
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getStage() {
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}