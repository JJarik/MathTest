package main.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TotalMarkController {
  @FXML private Label lvlAMark;

  @FXML private Label lvlBMark;

  @FXML private Label lvlCMark;

  @FXML private Label totalMark;

  @FXML
  void initialize() {
    LevelAController levelA = new LevelAController();
    LevelBController levelB = new LevelBController();
    LevelCController levelC = new LevelCController();
    double markA = levelA.getMark();
    double markB = levelB.getMark();
    double markC = levelC.getMark();
    lvlAMark.setText("Рівень А: " + markA);
    lvlBMark.setText("Рівень B: " + markB);
    lvlCMark.setText("Рівень C: " + markC);
    double total = markA + markB + markC;
    totalMark.setText("Загальна оцінка: " + total);
  }
}
