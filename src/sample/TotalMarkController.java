package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TotalMarkController {
    private double markA, markB, markC, total;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lvlAMark;

    @FXML
    private Label lvlBMark;

    @FXML
    private Label lvlCMark;

    @FXML
    private Label totalMark;

    @FXML
    void initialize() {
        LevelAController levelA = new LevelAController();
        LevelBController levelB = new LevelBController();
        LevelCController levelC = new LevelCController();
        markA = levelA.getMark();
        markB = levelB.getMark();
        markC = levelC.getMark();
        lvlAMark.setText("Рівень А: " + markA);
        lvlBMark.setText("Рівень B: " + markB);
        lvlCMark.setText("Рівень C: " + markC);
        total = markA + markB + markC;
        totalMark.setText("Загальна оцінка: " + total);
    }

}

