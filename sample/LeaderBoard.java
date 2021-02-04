
    package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.CheckedOutputStream;

    public class LeaderBoard {
        private TableView table = new TableView();
        Stage window;
        Scene menu, playGame;
        Group vbox = new Group();

        {
        }

        public LeaderBoard(Stage primaryStage) throws FileNotFoundException {

            window = primaryStage;
            menu = new Scene(vbox, 500, 600, Color.BLACK);
            window.setScene(menu);
            window.setTitle("Leaderboard Helper");
            //
            table.setEditable(true);
            table.setBackground(new Background(new BackgroundFill(Color.DARKTURQUOISE, null, null)));
            table.setMaxSize(300, 400);
            TableColumn firstNameCol = new TableColumn("Rank");
            TableColumn lastNameCol = new TableColumn("Player\nUsername");
            TableColumn emailCol = new TableColumn("High Score");
            firstNameCol.setMaxWidth(70);
            lastNameCol.setMaxWidth(400);
            emailCol.setMaxWidth(200);
//
            table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
            table.setLayoutX(50);
            table.setLayoutY(50);



            Image imagenew = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\trophy1.png"));
            ImageView imageViewnew = new ImageView(imagenew);
            imageViewnew.setFitHeight(50);
            imageViewnew.setFitWidth(50);
            imageViewnew.setX(400);
            imageViewnew.setY(80);
            imageViewnew.setPreserveRatio(false);

            Image imagenew1 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\load.gif"));
            ImageView imageViewnew1 = new ImageView(imagenew1);
            imageViewnew1.setFitHeight(75);
            imageViewnew1.setFitWidth(75);
            imageViewnew1.setX(0);
            imageViewnew1.setY(70);
            imageViewnew1.setPreserveRatio(false);

            Text t1 = new Text("LEADERBOARD");
            t1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 40));
            t1.setStrokeWidth(100);
            t1.setFill(Color.DARKGRAY);
            t1.setX(80);
            t1.setY(120);


            final VBox vbox = new VBox();
            vbox.setSpacing(3);
            vbox.setPadding(new Insets(130, 130, 130, 130));
            vbox.getChildren().addAll(table);

            ((Group) menu.getRoot()).getChildren().addAll(vbox,  imageViewnew, t1, imageViewnew1);

            window.show();

        }
    }

