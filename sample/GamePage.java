package sample;


import javafx.animation.*;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.geometry.Point3D;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.effect.Effect;
import javafx.scene.input.KeyCode;
import javafx.scene.transform.Translate;
import javafx.scene.shape.ArcType;
import javafx.animation.*;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GamePage {
    Stage stage;
    private void rotateNode(int rotationTime, Node node){
        RotateTransition rtl1 = new RotateTransition(Duration.millis(rotationTime),node);
        {
            rtl1.setByAngle(360);
            rtl1.setCycleCount(Timeline.INDEFINITE);
            rtl1.setInterpolator(Interpolator.LINEAR);
            rtl1.setAutoReverse(false);
            rtl1.setNode(node);
            rtl1.play();
        }
    }


    Arc  arc1= new Arc();
    {
        arc1.setCenterX(300.0f);arc1.setCenterY(500.0f);
        arc1.setRadiusX(80.0f);arc1.setRadiusY(80.0f);
        arc1.setStartAngle(45.0f);
        arc1.setLength(90.0f);
        arc1.setStroke(Color.DEEPPINK);arc1.setStrokeWidth(12);arc1.setFill(Color.TRANSPARENT);
        arc1.setStrokeType(StrokeType.CENTERED);
        arc1.setType(ArcType.OPEN);
        movePivot(arc1, 0, 67);
    }
    Arc  arc2= new Arc();
    {
        arc2.setCenterX(300.0f);arc2.setCenterY(500.0f);
        arc2.setRadiusX(80.0f);arc2.setRadiusY(80.0f);
        arc2.setStartAngle(135.0f);
        arc2.setLength(90.0f);
        arc2.setStroke(Color.YELLOW);arc2.setStrokeWidth(12);arc2.setFill(Color.TRANSPARENT);
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeType(StrokeType.CENTERED);
        movePivot(arc2, 67, 0);
    }
    Arc  arc3= new Arc();
    {
        arc3.setCenterX(300.0f); arc3.setCenterY(500.0f);
        arc3.setRadiusX(80.0f); arc3.setRadiusY(80.0f);
        arc3.setStartAngle(225.0f);
        arc3.setLength(90.0f);
        arc3.setStroke(Color.DARKVIOLET); arc3.setStrokeWidth(12); arc3.setFill(Color.TRANSPARENT);
        arc3.setType(ArcType.OPEN);
        arc3.setStrokeType(StrokeType.CENTERED);
        movePivot(arc3, 0, -67);
    }
    Arc  arc4= new Arc();
    {
        arc4.setCenterX(300.0f); arc4.setCenterY(500.0f);
        arc4.setRadiusX(80.0f); arc4.setRadiusY(80.0f);
        arc4.setStartAngle(315.0f);
        arc4.setLength(90.0f);
        arc4.setStroke(Color.DEEPSKYBLUE); arc4.setStrokeWidth(12); arc4.setFill(Color.TRANSPARENT);
        arc4.setType(ArcType.OPEN);
        arc4.setStrokeType(StrokeType.CENTERED);
        movePivot(arc4, -67, 0);
    }

    Circle ball = new Circle(300,690,10);{
        ball.setFill(Color.DEEPSKYBLUE);
        ball.setStroke(Color.TRANSPARENT);
    }


    public GamePage() {
    }

    private void movePivot(Node node, double x, double y){
        node.getTransforms().add(new Translate(-x,-y));
        node.setTranslateX(x); node.setTranslateY(y);
    }
    Line l1 = new Line(250,330,250,282);{
        l1.setStroke(Color.DEEPSKYBLUE);
        l1.setStrokeWidth(12);
        movePivot(l1, 0, -36);
    }
    Line l3 = new Line(250,258,250,210);{
        l3.setStroke(Color.DARKVIOLET);
        l3.setStrokeWidth(12);
        movePivot(l3, 0, +36);
    }
    Line l2 = new Line(190,270,238,270);{
        l2.setStroke(Color.YELLOW);
        l2.setStrokeWidth(12);
        movePivot(l2, 36, 0);
    }
    Line l4 = new Line(262,270,310,270);{
        l4.setStroke(Color.DEEPPINK);
        l4.setStrokeWidth(12);
        movePivot(l4, -36, 0);
    }
    //
    Line pl1 = new Line(0,130,70,130);{
        pl1.setStroke(Color.DEEPPINK);
        pl1.setStrokeWidth(12);
    }
    Line pl2 = new Line(80,110,150,110);{
        pl2.setStroke(Color.DEEPPINK);
        pl2.setStrokeWidth(12);
    }
    Line pl3 = new Line(160,130,230,130);{
        pl3.setStroke(Color.YELLOW);
        pl3.setStrokeWidth(12);
    }
    Line pl4 = new Line(240,110,310,110);{
        pl4.setStroke(Color.YELLOW);
        pl4.setStrokeWidth(12);
    }
    Line pl5 = new Line(320,130,390,130);{
        pl5.setStroke(Color.DEEPSKYBLUE);
        pl5.setStrokeWidth(12);
    }
    Line pl6 = new Line(400,110,470,110);{
        pl6.setStroke(Color.DEEPSKYBLUE);
        pl6.setStrokeWidth(12);
    }
    Line pl7 = new Line(480,130,550,130);{
        pl7.setStroke(Color.DARKVIOLET);
        pl7.setStrokeWidth(12);
    }
    Line pl8 = new Line(560,110,630,110);{
        pl8.setStroke(Color.DARKVIOLET);
        pl8.setStrokeWidth(12);
    }
    //
    Line pl01 = new Line(-80,110,10,110);{
        pl01.setStroke(Color.DARKVIOLET);
        pl01.setStrokeWidth(12);
    }
    Line pl02 = new Line(-160,130,-230,130);{
        pl02.setStroke(Color.DARKVIOLET);
        pl02.setStrokeWidth(12);
    }
    Line pl03 = new Line(-240,110,-310,110);{
        pl03.setStroke(Color.DEEPSKYBLUE);
        pl03.setStrokeWidth(12);
    }
    Line pl04 = new Line(-320,130,-390,130);{
        pl04.setStroke(Color.DEEPSKYBLUE);
        pl04.setStrokeWidth(12);
    }
    Line pl05 = new Line(-400,110,-470,110);{
        pl05.setStroke(Color.YELLOW);
        pl05.setStrokeWidth(12);
    }
    Line pl06 = new Line(-480,130,-550,130);{
        pl06.setStroke(Color.YELLOW);
        pl06.setStrokeWidth(12);
    }
    Line pl07 = new Line(-560,110,-630,110);{
        pl07.setStroke(Color.DEEPPINK);
        pl07.setStrokeWidth(12);
    }
    Line pl08 = new Line(-640,130,-710,130);{
        pl08.setStroke(Color.DEEPPINK);
        pl08.setStrokeWidth(12);
    }
    //

    Polygon triangle = new Polygon();  {
        triangle.getPoints().addAll(new Double[]{
                380.0, 300.0,
                520.0, 300.0,
                450.0, 178.76 });
    }

    Polygon triangle3 = new Polygon();  {
        triangle3.getPoints().addAll(new Double[]{450.0, 178.76,380.0, 300.0,520.0, 300.0
        });
    }
    Polygon triangle2 = new Polygon();  {
        triangle2.getPoints().addAll(new Double[]{520.0, 300.0,
                450.0, 178.76, 380.0, 300.0 });
    }
    Line tr1 = new Line(380,300,520,300);{
        tr1.setStroke(Color.DEEPSKYBLUE);
        // movePivot(tr1,35,0);
        tr1.setStrokeWidth(12);
    }
    Line tr2 = new Line(380,300,450,178.76);{
        tr2.setStroke(Color.DARKVIOLET);
        // movePivot(tr2,35,60);
        tr2.setStrokeWidth(12);
    }
    Line tr3 = new Line(520,300,450,178.76);{
        tr3.setStroke(Color.YELLOW);
        //  movePivot(tr3,35,60);

        tr3.setStrokeWidth(12);
    }



    private void jump(){
        TranslateTransition translate = new TranslateTransition();
        {
            translate.setDuration(Duration.millis(200));
            translate.setCycleCount(2);
            translate.setAutoReverse(true);
            translate.setNode(ball);
        }
        translate.setByY(-40);
        translate.play();
    }

    public Scene scene;

    Group vbox = new Group();
    public GamePage(Stage PrimaryStage) throws FileNotFoundException {
        stage=PrimaryStage;
        scene=new Scene(vbox, 600 ,800, Color.BLACK);
        scene.setOnKeyPressed(f -> {
            switch (f.getCode()) {
                case UP:
                    jump();
                    break;
            }
        });

        //
        rotateNode(6000,l1); rotateNode(6000,l2);
        rotateNode(6000,l3); rotateNode(6000,l4);
        rotateNode(3000,arc1);rotateNode(3000,arc2);
        rotateNode(3000,arc3);rotateNode(3000,arc4);
//
        Image image = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\giphy.gif"));
        Line path1 = new Line(0,130,700,130);
        Line path2 = new Line(80,110,780,110);
        Line path3 = new Line(160,130,860,130);
        Line path4 = new Line(240,110,940,110);
        Line path5 = new Line(320,130,1020,130);
        Line path6 = new Line(400,110,1100,110);
        Line path7 = new Line(480,130,1180,130);
        Line path8 = new Line(560,110,1260,110);
        //
        Line path11 = new Line(-80,110,620,110);
        Line path12 = new Line(-160,130,540,130);
        Line path13 = new Line(-240,110,460,110);
        Line path14 = new Line(-320,130,380,130);
        Line path15 = new Line(-400,110,300,110);
        Line path16 = new Line(-480,130,220,130);
        Line path17 = new Line(-560,110,140,110);
        Line path18 = new Line(-640,130,60,130);
        //
        vbox.getChildren().add(arc1);
        vbox.getChildren().add(arc2);
        vbox.getChildren().add(arc3);
        vbox.getChildren().add(arc4);
        vbox.getChildren().add(ball);
        vbox.getChildren().add(l1);
        vbox.getChildren().add(l2);
        vbox.getChildren().add(l3);
        vbox.getChildren().add(l4);
        vbox.getChildren().addAll(pl1,pl2,pl3,pl4,pl5,pl6,pl7,pl8,pl01,pl02,pl03,pl04,pl05,pl06,pl07,pl08);
        vbox.getChildren().addAll(tr1,tr2,tr3);

        PathTransition p1 = new PathTransition();
        PathTransition p2 = new PathTransition();
        p1.setNode(pl1); p2.setNode(pl2);
        p1.setInterpolator(Interpolator.LINEAR);  p2.setInterpolator(Interpolator.LINEAR);
        p1.setPath(path1); p2.setPath(path2);
        p1.setDuration(Duration.millis(3000));  p2.setDuration(Duration.millis(3000));
        p1.setAutoReverse(true); p2.setAutoReverse(true);
        p1.setCycleCount(PathTransition.INDEFINITE);  p2.setCycleCount(PathTransition.INDEFINITE);
        p1.play();  p2.play();
        //
        PathTransition p3 = new PathTransition();
        PathTransition p4 = new PathTransition();
        p3.setNode(pl3); p4.setNode(pl4);
        p3.setInterpolator(Interpolator.LINEAR);  p4.setInterpolator(Interpolator.LINEAR);
        p3.setPath(path3); p4.setPath(path4);
        p3.setDuration(Duration.millis(3000));  p4.setDuration(Duration.millis(3000));
        p3.setAutoReverse(true); p4.setAutoReverse(true);
        p3.setCycleCount(PathTransition.INDEFINITE);  p4.setCycleCount(PathTransition.INDEFINITE);
        p3.play();  p4.play();
        //
        PathTransition p5 = new PathTransition();
        PathTransition p6 = new PathTransition();
        p5.setNode(pl5); p6.setNode(pl6);
        p5.setInterpolator(Interpolator.LINEAR);  p6.setInterpolator(Interpolator.LINEAR);
        p5.setPath(path5); p6.setPath(path6);
        p5.setAutoReverse(true); p6.setAutoReverse(true);
        p5.setDuration(Duration.millis(3000));  p6.setDuration(Duration.millis(3000));
        p5.setCycleCount(PathTransition.INDEFINITE);  p6.setCycleCount(PathTransition.INDEFINITE);
        p5.play();  p6.play();
        //
        PathTransition p7 = new PathTransition();
        PathTransition p8 = new PathTransition();
        p7.setNode(pl7); p8.setNode(pl8);
        p7.setInterpolator(Interpolator.LINEAR);  p8.setInterpolator(Interpolator.LINEAR);
        p7.setPath(path7); p8.setPath(path8);
        p7.setAutoReverse(true); p8.setAutoReverse(true);
        p7.setDuration(Duration.millis(3000));  p8.setDuration(Duration.millis(3000));
        p7.setCycleCount(PathTransition.INDEFINITE);  p8.setCycleCount(PathTransition.INDEFINITE);
        p7.play();  p8.play();
        //
        PathTransition p11 = new PathTransition();
        PathTransition p12 = new PathTransition();
        p11.setNode(pl01); p12.setNode(pl02);
        p11.setInterpolator(Interpolator.LINEAR);  p12.setInterpolator(Interpolator.LINEAR);
        p11.setPath(path11); p12.setPath(path12);
        p11.setAutoReverse(true); p12.setAutoReverse(true);
        p11.setDuration(Duration.millis(3000));  p12.setDuration(Duration.millis(3000));
        p11.setCycleCount(PathTransition.INDEFINITE);  p12.setCycleCount(PathTransition.INDEFINITE);
        p11.play();  p12.play();
        //
        PathTransition p13 = new PathTransition();
        PathTransition p14 = new PathTransition();
        p13.setNode(pl03); p14.setNode(pl04);
        p13.setInterpolator(Interpolator.LINEAR);  p14.setInterpolator(Interpolator.LINEAR);
        p13.setAutoReverse(true); p14.setAutoReverse(true);
        p13.setPath(path13); p14.setPath(path14);
        p13.setDuration(Duration.millis(3000));  p14.setDuration(Duration.millis(3000));
        p13.setCycleCount(PathTransition.INDEFINITE);  p14.setCycleCount(PathTransition.INDEFINITE);
        p13.play();  p14.play();
        //
        PathTransition p15 = new PathTransition();
        PathTransition p16 = new PathTransition();
        p15.setNode(pl05); p16.setNode(pl06);
        p15.setInterpolator(Interpolator.LINEAR);  p16.setInterpolator(Interpolator.LINEAR);
        p15.setPath(path15); p16.setPath(path16);
        p15.setAutoReverse(true); p16.setAutoReverse(true);
        p15.setDuration(Duration.millis(3000));  p16.setDuration(Duration.millis(3000));
        p15.setCycleCount(PathTransition.INDEFINITE);  p16.setCycleCount(PathTransition.INDEFINITE);
        p15.play();  p16.play();
        //
        PathTransition p17 = new PathTransition();
        PathTransition p18 = new PathTransition();
        p17.setNode(pl07); p18.setNode(pl08);
        p17.setInterpolator(Interpolator.LINEAR);  p18.setInterpolator(Interpolator.LINEAR);
        p17.setAutoReverse(true); p18.setAutoReverse(true);
        p17.setPath(path17); p18.setPath(path18);
        p17.setDuration(Duration.millis(3000));  p18.setDuration(Duration.millis(3000));
        p17.setCycleCount(PathTransition.INDEFINITE);  p18.setCycleCount(PathTransition.INDEFINITE);
        p17.play();  p18.play();

        ImageView imageView = new ImageView(image);
        imageView.setX(260);
        imageView.setY(710);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        Image image2 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\hello7.gif"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setX(0);
        imageView2.setY(690);
        imageView2.setFitHeight(150);
        imageView2.setFitWidth(150);
        imageView2.setPreserveRatio(true);

        Image image3 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\hello2.gif"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setX(490);
        imageView3.setY(710);
        imageView3.setFitHeight(80);
        imageView3.setFitWidth(80);
        imageView3.setPreserveRatio(true);

        Image image4 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\silver.gif"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setX(250);
        imageView4.setY(465);
        imageView4.setFitHeight(100);
        imageView4.setFitWidth(100);
        imageView4.setPreserveRatio(true);


        Image image5 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\hello9.gif"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setX(0);
        imageView5.setY(0);
        imageView5.setFitHeight(20);
        imageView5.setFitWidth(600);
        imageView5.setPreserveRatio(false);

        Image image6 = new Image(new FileInputStream("C:\\Users\\User\\IdeaProjects\\ColorSwitch\\src\\sample\\hello9.gif"));
        ImageView imageView6 = new ImageView(image6);
        imageView6.setX(0);
        imageView6.setY(790);
        imageView6.setFitHeight(20);
        imageView6.setFitWidth(600);
        imageView6.setPreserveRatio(false);

        Text t1 = new Text();
        t1.setText("0");
        t1.setFont(Font.font("Verdana",40));
        t1.setStrokeWidth(10);
        t1.setX(520);
        t1.setY(700);
        t1.setFill(Color.LIGHTGREY);

        Button pause = new Button("pause",imageView2);
        pause.setLayoutX(0);
        pause.setLayoutY(690);
        pause.setMaxSize(100,100);
        pause.setStyle("-fx-background-color: #000000 ");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                 pause pause = null;
                //HitObstacle hitObstacle = null;
                try {
                    pause = new pause();
                   // hitObstacle=new HitObstacle();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                changeScene(pause.scene1);
            }
        };
        pause.setOnAction(event);


        vbox.getChildren().add(imageView);
        vbox.getChildren().add(pause);
        vbox.getChildren().add(imageView3);
        vbox.getChildren().add(t1);
        vbox.getChildren().add(imageView4);
        vbox.getChildren().add(imageView5);
        vbox.getChildren().add(imageView6);
        stage.setScene(this.scene);
        stage.show();
    }
    public  void changeScene(Scene scene)
    {
        stage.setScene(scene);
        stage.show();
    }
    private void jump(Circle c1){
        c1.setCenterX(c1.getCenterX()+2);
        c1.setCenterY(c1.getCenterY()+2);

    }



}