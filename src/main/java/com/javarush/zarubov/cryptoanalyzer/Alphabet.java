package com.javarush.zarubov.cryptoanalyzer;

public class Alphabet {
    private static final char[] ALPHABET = {'а', 'б', 'в', 'й', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    public static char[] getAlphabet() {
        return ALPHABET;
    }
}
