package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class LevelCController {
    static private double mark = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton buttonT1A1;

    @FXML
    private RadioButton buttonT1A2;

    @FXML
    private RadioButton buttonT1A3;

    @FXML
    private RadioButton buttonT1A4;

    @FXML
    private Button buttonNextLevel;

    @FXML
    private RadioButton buttonT2A1;

    @FXML
    private RadioButton buttonT2A2;

    @FXML
    private RadioButton buttonT2A3;

    @FXML
    private RadioButton buttonT2A4;

    @FXML
    private RadioButton buttonT3A1;

    @FXML
    private RadioButton buttonT3A2;

    @FXML
    private RadioButton buttonT3A3;

    @FXML
    private RadioButton buttonT3A4;

    @FXML
    private RadioButton buttonT4A1;

    @FXML
    private RadioButton buttonT4A2;

    @FXML
    private RadioButton buttonT4A3;

    @FXML
    private RadioButton buttonT4A4;

    @FXML
    private RadioButton buttonT1A11;

    @FXML
    private RadioButton buttonT1A21;

    @FXML
    private RadioButton buttonT1A31;

    @FXML
    private RadioButton buttonT1A41;

    @FXML
    private RadioButton buttonT2A11;

    @FXML
    private RadioButton buttonT2A21;

    @FXML
    private RadioButton buttonT2A31;

    @FXML
    private RadioButton buttonT2A41;

    @FXML
    private RadioButton buttonT3A11;

    @FXML
    private RadioButton buttonT3A21;

    @FXML
    private RadioButton buttonT3A31;

    @FXML
    private RadioButton buttonT3A41;

    @FXML
    private RadioButton buttonT4A11;

    @FXML
    private RadioButton buttonT4A21;

    @FXML
    private RadioButton buttonT4A31;

    @FXML
    private RadioButton buttonT4A41;

    public double getMark(){
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

        ToggleGroup groupT11 = new ToggleGroup();
        buttonT1A11.setToggleGroup(groupT11);
        buttonT1A21.setToggleGroup(groupT11);
        buttonT1A31.setToggleGroup(groupT11);
        buttonT1A41.setToggleGroup(groupT11);

        ToggleGroup groupT21 = new ToggleGroup();
        buttonT2A11.setToggleGroup(groupT21);
        buttonT2A21.setToggleGroup(groupT21);
        buttonT2A31.setToggleGroup(groupT21);
        buttonT2A41.setToggleGroup(groupT21);

        ToggleGroup groupT31 = new ToggleGroup();
        buttonT3A11.setToggleGroup(groupT31);
        buttonT3A21.setToggleGroup(groupT31);
        buttonT3A31.setToggleGroup(groupT31);
        buttonT3A41.setToggleGroup(groupT31);

        ToggleGroup groupT41 = new ToggleGroup();
        buttonT4A11.setToggleGroup(groupT41);
        buttonT4A21.setToggleGroup(groupT41);
        buttonT4A31.setToggleGroup(groupT41);
        buttonT4A41.setToggleGroup(groupT41);

        buttonNextLevel.setOnAction(event -> {
            RadioButton buttonT1 = (RadioButton) groupT1.getSelectedToggle();
            if (buttonT1.getId() == buttonT1A3.getId()) {
                mark++;
            }
            RadioButton buttonT2 = (RadioButton) groupT2.getSelectedToggle();
            if (buttonT2.getId() == buttonT2A2.getId()) {
                mark++;
            }
            RadioButton buttonT3 = (RadioButton) groupT3.getSelectedToggle();
            if (buttonT3.getId() == buttonT3A1.getId()) {
                mark++;
            }
            RadioButton buttonT4 = (RadioButton) groupT4.getSelectedToggle();
            if (buttonT4.getId() == buttonT4A4.getId()) {
                mark++;
            }
            RadioButton buttonT11 = (RadioButton) groupT11.getSelectedToggle();
            if (buttonT11.getId() == buttonT1A41.getId()) {
                mark++;
            }
            RadioButton buttonT21 = (RadioButton) groupT21.getSelectedToggle();
            if (buttonT21.getId() == buttonT2A31.getId()) {
                mark++;
            }
            RadioButton buttonT31 = (RadioButton) groupT31.getSelectedToggle();
            if (buttonT31.getId() == buttonT3A21.getId()) {
                mark++;
            }
            RadioButton buttonT41 = (RadioButton) groupT41.getSelectedToggle();
            if (buttonT41.getId() == buttonT4A11.getId()) {
                mark++;
            }
            System.out.println("LevelC: " + mark);
            System.out.println(":toTotalMarkScene");
            buttonNextLevel.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/totalMark.fxml"));
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
}

