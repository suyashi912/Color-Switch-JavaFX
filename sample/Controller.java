package sample;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Point3D;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Controller()
    {

    }
    @FXML
    private AnchorPane root;
    @FXML
    private ImageView innerCircle;
    @FXML
    private AnchorPane pane1;

    @FXML
    private ImageView playSymbol;

    @FXML
    private ImageView middleCircle;

    @FXML
    private ImageView outerCircle;

    @FXML
    private ImageView helpButton;

    @FXML
    private ImageView settings;

    @FXML
    private ImageView lowerTitle;

    @FXML
    private ImageView upperTitle;

    @FXML
    private ImageView titleCirle1;

    @FXML
    private ImageView titleCircle2;

    @FXML
    private Button newGameButton;

    @FXML
    private ImageView star1;

    @FXML
    private ImageView star2;

    @FXML
    private Button resumeButton;

    @FXML
    private ImageView highScore;

    @FXML
    private Button EXIT;

    @FXML
    private ImageView social;
    private URL url;
    private ResourceBundle resourceBundle;

    @FXML
    public AnchorPane getRoot() {
        return root;
    }

    @FXML
    private AnchorPane paneRulels;

    @FXML
    private ImageView back;

    @FXML
    private AnchorPane paneSet;

    @FXML
    private AnchorPane paneSave;

    @FXML
    private ImageView back3;

    @FXML
    private ImageView back2;

    @FXML
    private Circle playButton;



    @FXML
    private void play1()
    {

    rotateImg(innerCircle, 10, 360 , 0,3, true, new Point3D(0, 279 ,307));
    rotateImg(middleCircle, 10, 360, 0,3, true, new Point3D(279, 0 ,307));
    rotateImg(outerCircle,10 , 360 ,0,3, true, new Point3D(0,  279 ,307));
    rotateImg(titleCirle1, 10, 360, 0,3, true, Rotate.Z_AXIS);
    rotateImg(titleCircle2, 10, 360,0, 3, true, Rotate.Z_AXIS);
    rotateImg(social, 10, 360, 0, 3, false, Rotate.Z_AXIS);
    rotateImg(highScore, 10, 360, 0, 3, false, Rotate.Z_AXIS);
    }

    @FXML
    private void rotateImg(ImageView img, double time, double angStart,double angEnd,  int rate, boolean reverse, Point3D point)
    {
        RotateTransition rotate = new RotateTransition(Duration.INDEFINITE, img);
        rotate.setRate(rate);
       rotate.setDuration(Duration.seconds(time));
        rotate.setDelay(Duration.seconds(0));
        rotate.setAutoReverse(reverse);
        rotate.setFromAngle(angStart);
        rotate.setToAngle(angEnd);
        rotate.setCycleCount(100);
        rotate.setAxis(point);
        rotate.play();

    }
    @FXML
    void saveButton(ActionEvent event) throws IOException {
        FXMLLoader l = new FXMLLoader();
        AnchorPane save =  l.load(getClass().getResource("save.fxml"));
        root.getChildren().setAll(save);
    }

    @FXML
    void newButton(ActionEvent event) throws IOException {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("hello.fxml"));
        root.getChildren().setAll(new1);
    }


    @FXML
    private void exitButton(ActionEvent event)
    {
        System.exit(0);
    }

    @FXML
     void settings(MouseEvent event) throws IOException
    {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("sett.fxml"));
        root.getChildren().setAll(new1);
    }

    @FXML
    void help(MouseEvent event) throws IOException
    {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("rules.fxml"));
        root.getChildren().setAll(new1);
    }


@FXML
    void playGame(MouseEvent event) throws FileNotFoundException, Exception  {
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        GamePage gamePage = new GamePage(primaryStage);
        primaryStage.setScene(gamePage.scene);
        primaryStage.show();
    }
    @FXML
    void goBack(MouseEvent event ) throws IOException
    {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("sample.fxml"));
        pane1.getChildren().setAll(new1);
    }
    @FXML
    void displayLeader(MouseEvent event ) throws IOException
    {
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        LeaderBoard gamePage = new LeaderBoard(primaryStage);
    }

    @FXML
    void goBack1(MouseEvent event) throws IOException {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("sample.fxml"));
        paneRulels.getChildren().setAll(new1);
    }
    @FXML
    void goBack2(MouseEvent event) throws IOException {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("sample.fxml"));
        paneSave.getChildren().setAll(new1);
    }

    @FXML
    void goBack3(MouseEvent event) throws IOException {
        FXMLLoader l = new FXMLLoader();
        AnchorPane new1 =  l.load(getClass().getResource("sample.fxml"));
       paneSet.getChildren().setAll(new1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        play1();

    }

}

