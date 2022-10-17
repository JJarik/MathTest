package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LevelAController {
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
    ToggleGroup groupT1 = new ToggleGroup();
    buttonT1A1.setToggleGroup(groupT1);
    buttonT1A2.setToggleGroup(groupT1);
    buttonT1A3.setToggleGroup(groupT1);
    buttonT1A4.setToggleGroup(groupT1);

    ToggleGroup groupT2 = new ToggleGroup();
    buttonT2A1.setToggleGroup(groupT2);
    buttonT2A2.setToggleGroup(groupT2);
    buttonT2A3.setToggleGroup(groupT2);
    buttonT2A4.setToggleGroup(groupT2);

    ToggleGroup groupT3 = new ToggleGroup();
    buttonT3A1.setToggleGroup(groupT3);
    buttonT3A2.setToggleGroup(groupT3);
    buttonT3A3.setToggleGroup(groupT3);
    buttonT3A4.setToggleGroup(groupT3);

    ToggleGroup groupT4 = new ToggleGroup();
    buttonT4A1.setToggleGroup(groupT4);
    buttonT4A2.setToggleGroup(groupT4);
    buttonT4A3.setToggleGroup(groupT4);
    buttonT4A4.setToggleGroup(groupT4);

    buttonNextLevel.setOnAction(
        event -> {
          toggleGroupCheck(groupT1, groupT2, buttonT1A3, buttonT2A1);
          toggleGroupCheck(groupT3, groupT4, buttonT3A1, buttonT4A4);
          System.out.println("LevelA: " + mark);
          System.out.println(":toLevelB");
          buttonNextLevel.getScene().getWindow().hide();
          FXMLLoader loader = new FXMLLoader();
          loader.setLocation(getClass().getResource("/resources/levelB.fxml"));
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

  private void toggleGroupCheck(ToggleGroup groupT3, ToggleGroup groupT4, RadioButton buttonT3A1, RadioButton buttonT4A4) {
    RadioButton buttonT3 = (RadioButton) groupT3.getSelectedToggle();
    if (Objects.equals(buttonT3.getId(), buttonT3A1.getId())) {
      mark++;
    }
    RadioButton buttonT4 = (RadioButton) groupT4.getSelectedToggle();
    if (Objects.equals(buttonT4.getId(), buttonT4A4.getId())) {
      mark++;
    }
  }
}
