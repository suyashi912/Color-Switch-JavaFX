package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileNotFoundException;

public class ControllerNew {

    @FXML
    private ImageView back2;

    @FXML
    private Circle playButton;

    @FXML
    void playGame(MouseEvent event) throws FileNotFoundException {
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        GamePage gamePage = new GamePage(primaryStage);
        primaryStage.setScene(gamePage.scene);
        primaryStage.show();

    }

}
