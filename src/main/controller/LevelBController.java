package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class LevelBController {
  private static double mark = 0;

  @FXML private RadioButton buttonT1A1;

  @FXML private RadioButton buttonT1A2;

  @FXML private RadioButton buttonT1A3;

  @FXML private RadioButton buttonT1A4;

  @FXML private RadioButton buttonT2A1;

  @FXML private RadioButton buttonT2A2;

  @FXML private RadioButton buttonT2A3;

  @FXML private RadioButton buttonT2A4;

  @FXML private RadioButton buttonT3A1;

  @FXML private RadioButton buttonT3A2;

  @FXML private RadioButton buttonT3A3;

  @FXML private RadioButton buttonT3A4;

  @FXML private RadioButton buttonT4A1;

  @FXML private RadioButton buttonT4A2;

  @FXML private RadioButton buttonT4A3;

  @FXML private RadioButton buttonT4A4;

  @FXML private Button buttonNextLevel;

  public double getMark() {
    return mark;
  }

  @FXML
  void initialize() {
    buttonNextLevel.setOnAction(
        event -> {
          buttonT1A3.isPressed();
          checkMark(buttonT1A1, buttonT1A3, buttonT1A2, buttonT1A4, buttonT2A1, buttonT2A3, buttonT2A2, buttonT2A4);
          checkMark(buttonT3A3, buttonT3A4, buttonT3A1, buttonT3A2, buttonT4A1, buttonT4A3, buttonT4A2, buttonT4A4);
          System.out.println("LevelB: " + mark);
          System.out.println(":toLevelC");
          buttonNextLevel.getScene().getWindow().hide();
          FXMLLoader loader = new FXMLLoader();
          loader.setLocation(getClass().getResource("/resources/levelC.fxml"));
          try {
            loader.load();
          } catch (IOException e) {
            e.printStackTrace();
          }
          Parent root = loader.getRoot();
          Stage stage = new Stage();
          stage.setScene(new Scene(root));
          stage.showAndWait();
        });
  }

  private void checkMark(RadioButton buttonT3A3, RadioButton buttonT3A4, RadioButton buttonT3A1, RadioButton buttonT3A2, RadioButton buttonT4A1, RadioButton buttonT4A3, RadioButton buttonT4A2, RadioButton buttonT4A4) {
    if (buttonT3A3.isSelected()
        & buttonT3A4.isSelected()
        & (!buttonT3A1.isSelected())
        & (!buttonT3A2.isSelected())) {
      mark = mark + 2;
    }
    if (buttonT4A1.isSelected()
        & buttonT4A3.isSelected()
        & (!buttonT4A2.isSelected())
        & (!buttonT4A4.isSelected())) {
      mark = mark + 2;
    }
  }
}
