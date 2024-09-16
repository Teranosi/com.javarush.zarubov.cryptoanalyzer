package com.javarush.zarubov.cryptoanalyzer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    private static File file;
    public String readFile(String filePath) {
        try {
            return Files.readString(Path.of(filePath));
        } catch (IOException exception) {
            System.out.println("You have " + exception.getLocalizedMessage());
        }
        return null;
    }
    public void writeFile(String content, String filePath) {
        try {
            Files.writeString(Path.of(filePath), content);
        } catch (IOException exception) {
            System.out.println("You have " + exception.getLocalizedMessage());
        }
    }

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        FileManager.file = file;
    }
}
