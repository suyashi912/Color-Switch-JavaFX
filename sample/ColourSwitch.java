package sample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.*;

public class ColourSwitch extends Application {

    private MainPageMenu main_menu;
    public ColourSwitch()
    {
        main_menu = new MainPageMenu();
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader l = new FXMLLoader();
        Parent root = l.load(getClass().getResource("sample.fxml"));
        //GamePage gamePage = new GamePage(primaryStage);
        primaryStage.setTitle("COLOR SWITCH");
        Scene s = new Scene(root, 550, 700);
        primaryStage.setScene(s);
        primaryStage.show();

        //RotateTransition rotate = new RotateTransition(Duration.INDEFINITE, innerCircle);

    }

    public static void main(String[] args) {
        launch(args);
        ColourSwitch c = new ColourSwitch();

    }
}
