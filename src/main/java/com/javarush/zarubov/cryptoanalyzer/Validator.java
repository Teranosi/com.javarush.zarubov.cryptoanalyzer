package com.javarush.zarubov.cryptoanalyzer;

import java.util.StringTokenizer;

public class Validator {
    public static boolean isValidKey(String key, char[] alphabet) {
        try {
            if (alphabet.length == Integer.parseInt(key) || Integer.parseInt(key) == 0 || key.isBlank()) {
                return false;
            }
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }
    public static boolean isFileExists() {
        if (FileManager.getFile() == null) {
            return false;
        }
        return true;
    }
}