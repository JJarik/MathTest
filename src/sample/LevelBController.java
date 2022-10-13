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
import javafx.stage.Stage;

public class LevelBController {
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
    private Button buttonNextLevel;

    public double getMark(){
        return mark;
    }

    @FXML
    void initialize() {
        buttonNextLevel.setOnAction(event -> {
            buttonT1A3.isPressed();
            if (buttonT1A1.isSelected() & buttonT1A3.isSelected() & (buttonT1A2.isSelected() == false) & (buttonT1A4.isSelected() == false)) {
                mark = mark + 2;
            }
            if (buttonT2A1.isSelected() & buttonT2A3.isSelected() & (buttonT2A2.isSelected() == false) & (buttonT2A4.isSelected() == false)) {
                mark = mark + 2;
            }
            if (buttonT3A3.isSelected() & buttonT3A4.isSelected() & (buttonT3A1.isSelected() == false) & (buttonT3A2.isSelected() == false)) {
                mark = mark + 2;
            }
            if (buttonT4A1.isSelected() & buttonT4A3.isSelected() & (buttonT4A2.isSelected() == false) & (buttonT4A4.isSelected() == false)) {
                mark = mark + 2;
            }
            System.out.println("LevelB: " + mark);
            System.out.println(":toLevelC");
            buttonNextLevel.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/levelC.fxml"));
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
