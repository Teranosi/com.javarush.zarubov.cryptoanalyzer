module com.javarush.zarubov.cryptoanalyzer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.javarush.zarubov.cryptoanalyzer to javafx.fxml;
    exports com.javarush.zarubov.cryptoanalyzer;
}