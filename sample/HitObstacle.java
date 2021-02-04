package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HitObstacle extends GamePage{
    Scene scene1;

    Image image7 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\stickhello.png"));
    Image image8 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\CW.gif"));
   Image image9 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\load.gif"));
    Image image10 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\healthy.png"));
    Image image11 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\save.png"));
    Image image12 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\restart.png"));
    Image image13 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\exit.png"));

    Text t1 = new Text();{
        t1.setText("Your Score is : \n0");
        t1.setFont(Font.font("Verdana",20));
        t1.setStrokeWidth(10);
        t1.setX(390);
        t1.setY(185);
        t1.setFill(Color.LIGHTGREY);
    }
    Text t2 = new Text();{
        t2.setText("Better Luck \nNext Time!!");
        t2.setFont(Font.font("Times New Roman",25));
        t2.setStrokeWidth(10);
        t2.setX(240);
        t2.setY(590);
        t2.setFill(Color.LIGHTGREY);
    }
    Group vbox = new Group();
    private void addButtonEffect(Button btn, String enter, String exit){
        btn.setStyle(enter);
        btn.setOnMouseEntered(e -> btn.setStyle(exit));
        btn.setOnMouseExited(e -> btn.setStyle(enter));
    }

    public HitObstacle() throws FileNotFoundException {
        scene1=new Scene(vbox, 600 ,800,Color.BLACK);
        ImageView imageView7 = new ImageView(image7);
        imageView7.setX(200);
        imageView7.setY(20);
        imageView7.setFitHeight(300);
        imageView7.setFitWidth(500);
        imageView7.setPreserveRatio(true);
        //
        ImageView imageView8 = new ImageView(image8);
        imageView8.setX(15);
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
        Button restart = new Button("Restart",imageView12);
        restart.setFont(Font.font("Verdana",15));
        restart.setLayoutX(10);
        restart.setLayoutY(300);
        restart.wrapTextProperty();
        restart.setMaxSize(200,200);
        restart.setTextFill(Color.LIGHTGREY);
        restart.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(restart,"-fx-background-color: transparent","-fx-background-color: DarkViolet");
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
        Button Continue = new Button("Continue \n(Use-Stars)",imageView10);
        Continue.setLayoutX(420);
        Continue.setFont(Font.font("Verdana",15));
        Continue.setLayoutY(300);
        Continue.setTextFill(Color.LIGHTGREY);
        Continue.setMaxSize(200,200);
        Continue.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(Continue,"-fx-background-color: transparent","-fx-background-color: MediumSeaGreen");
        //
        Button exit = new Button("Exit",imageView13);
        exit.setLayoutX(10);
        exit.setFont(Font.font("Verdana",15));
        exit.setLayoutY(10);
        exit.setTextFill(Color.LIGHTGREY);
        exit.setMaxSize(200,200);
        exit.setStyle("-fx-background-color: #000000 ");
        addButtonEffect(exit,"-fx-background-color: transparent","-fx-background-color: Brown");
        //
        vbox.getChildren().addAll(imageView7,imageView8, imageView9);
        vbox.getChildren().addAll(restart,SaveGame,Continue,exit);
        vbox.getChildren().addAll(t1,t2);
    }
}
