package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class pause extends GamePage {
    Scene scene1;

    Image image7 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\hello8.jpg"));
    Image image8 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\CW.gif"));
    Image image9 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\hello11.gif"));
    Image image10 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\CROP2.png"));
    Image image11 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\save.png"));
    Image image12 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\exit.png"));
    Image image13 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\back.png"));

    Group vbox = new Group();{
    }

    public pause() throws FileNotFoundException {
    }

    private void addButtonEffect(Button btn, String enter, String exit){
        btn.setStyle(enter);
        btn.setOnMouseEntered(e -> btn.setStyle(exit));
        btn.setOnMouseExited(e -> btn.setStyle(enter));
    }
    public void PauseGame() throws FileNotFoundException {
        scene1=new Scene(vbox, 600 ,800, Color.BLACK);
        ImageView imageView7 = new ImageView(image7);
        imageView7.setX(30);
        imageView7.setY(50);
        imageView7.setFitHeight(300);
        imageView7.setFitWidth(600);
        imageView7.setPreserveRatio(false);
        //
        ImageView imageView8 = new ImageView(image8);
        imageView8.setX(35);
        imageView8.setY(140);
        imageView8.setFitHeight(200);
        imageView8.setFitWidth(200);
        imageView8.setPreserveRatio(true);
        //
        ImageView imageView9 = new ImageView(image9);
        imageView9.setX(100);
        imageView9.setY(400);
        imageView9.setFitHeight(200);
        imageView9.setFitWidth(200);
        imageView9.setPreserveRatio(true);
        //
        //
        ImageView imageView10 = new ImageView(image10);
        imageView10.setFitHeight(50);
        imageView10.setFitWidth(50);
        imageView10.setPreserveRatio(true);
        //
        ImageView imageView11 = new ImageView(image11);
        imageView11.setFitHeight(50);
        imageView11.setFitWidth(50);
        imageView11.setPreserveRatio(true);
        //
        ImageView imageView12 = new ImageView(image12);
        imageView12.setFitHeight(50);
        imageView12.setFitWidth(50);
        imageView12.setPreserveRatio(true);
        //
        ImageView imageView13 = new ImageView(image13);
        imageView13.setFitHeight(50);
        imageView13.setFitWidth(50);
        imageView13.setPreserveRatio(true);
        //
        Button back = new Button("",imageView13);
        back.setLayoutX(10);
        back.setFont(Font.font("Verdana",15));
        back.setLayoutY(10);
        back.setTextFill(Color.LIGHTGREY);
        back.setMaxSize(200,200);
        back.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(back,"-fx-background-color: transparent","-fx-background-color: Brown");
        //
        Button exit = new Button("Exit to \nMainMenu",imageView12);
        exit.setFont(Font.font("Verdana",15));
        exit.setLayoutX(10);
        exit.setLayoutY(300);
        exit.wrapTextProperty();
        exit.setMaxSize(200,200);
        exit.setTextFill(Color.LIGHTGREY);
        exit.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(exit,"-fx-background-color: transparent","-fx-background-color: DarkViolet");
        //
        Button SaveGame = new Button("Save Game",imageView11);
        SaveGame.setLayoutX(200);
        SaveGame.setFont(Font.font("Verdana",15));
        SaveGame.setLayoutY(300);
        SaveGame.setTextFill(Color.LIGHTGREY);
        SaveGame.setMaxSize(200,200);
        SaveGame.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(SaveGame,"-fx-background-color: transparent","-fx-background-color: DeepSkyBlue");

        //
        Button Settings = new Button("Settings",imageView10);
        Settings.setLayoutX(450);
        Settings.setFont(Font.font("Verdana",15));
        Settings.setLayoutY(300);
        Settings.setTextFill(Color.LIGHTGREY);
        Settings.setMaxSize(200,200);
        Settings.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(Settings,"-fx-background-color: transparent","-fx-background-color: MediumSeaGreen");
        //
        vbox.getChildren().addAll(imageView7,imageView8,imageView9);
        vbox.getChildren().addAll(exit,SaveGame,Settings,back);
    }
}
