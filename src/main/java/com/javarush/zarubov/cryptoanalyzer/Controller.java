package com.javarush.zarubov.cryptoanalyzer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private TextField encrypterKey;

    @FXML
    private TextField decrypterKey;

    @FXML
    private Label decryptedProblem;

    @FXML
    private Label encryptedProblem;

    @FXML
    protected void selectFileOnClick() {
        decryptedProblem.setText("");
        encryptedProblem.setText("");
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(MainApp.getStage());
        FileManager.setFile(file);
    }

    @FXML
    protected void encryptOnClick() {
        encryptedProblem.setText("");
        String key = encrypterKey.getText();
        encrypterKey.setText("");
        if (!Validator.isFileExists()) {
            encryptedProblem.setText("Choose File!");
            return;
        } else if (!Validator.isValidKey(key, Alphabet.getAlphabet())) {
            encryptedProblem.setText("Write another key!");
            return;
        }
        FileManager fileManager = new FileManager();
        String path = FileManager.getFile().toString();
        Cipher encrypter = new Cipher(Alphabet.getAlphabet());
        String text = fileManager.readFile(path);
        String encrypted = encrypter.encrypt(text, Integer.parseInt(key));
        fileManager.writeFile(encrypted, path.replace(FileManager.getFile().getName(), "Encrypted.txt"));
        FileManager.setFile(null);
    }

    @FXML
    protected void decryptOnClick() {
        decryptedProblem.setText("");
        String key = decrypterKey.getText();
        decrypterKey.setText("");
        if (!Validator.isFileExists()) {
            decryptedProblem.setText("Choose File!");
            return;
        } else if (!Validator.isValidKey(key, Alphabet.getAlphabet())) {
            decryptedProblem.setText("Write another key!");
            return;
        }
        FileManager fileManager = new FileManager();
        String path = FileManager.getFile().toString();
        Cipher decrypter = new Cipher(Alphabet.getAlphabet());
        String text = fileManager.readFile(path);
        String decrypted = decrypter.decrypt(text, Integer.parseInt(key));
        fileManager.writeFile(decrypted, path);
        FileManager.setFile(null);
    }
}