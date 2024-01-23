//************************************************************************************
// Sheep.java       Author: Hall/Sherica
//
// Demonstrates the translation of a set of shapes.
//************************************************************************************
//JavaFX used to create the design of the application

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

// class used to create objects

public class Sheep extends Application
{
    //
    // Presents a Sheep scene.
    //
    public void start (Stage primaryStage)
    {
     //Shep Fur - Body
     Circle Coat0 = new Circle ( 80, 20,40, Color.WHITE);
     Circle Coat1 = new Circle (120, 20, 40, Color.WHITE);
     Group Coat = new Group (Coat0, Coat1);

     // Sheep Body

     Ellipse Body = new Ellipse( 90, 50, 80, 60);
     Body.setFill (Color.WHITE);

     //Sheeps Fur on Head

     Circle Fur0 = new Circle (20, 5, 10, Color.WHITE);
     Circle Fur1 = new Circle (5, 5, 10, Color.WHITE);

     Group Fur = new Group( Fur0, Fur1);

     //Sheeps Head

     Circle Head = new Circle (10,40, 30);
     Head.setFill (Color.SANDYBROWN);

     //Sheeps Mouth

     Line Mouth = new Line(-20,50,2,50);
     Mouth.setStrokeWidth(5);
     Mouth.setFill(Color.BLACK);

     //Sheeps Eye

     Circle Eye = new Circle (20, 30, 5);
     Eye.setFill( Color.BLACK);

     //Sheeps Ear

     Ellipse Ear = new Ellipse(45, 20, 15, 10);
     Ear.setFill (Color.CHOCOLATE);

     //Sheep Tail

     Ellipse Tail = new Ellipse( 175,50, 10, 5);
     Tail.setFill (Color.WHITE);

     //Sheep Legs

     Line Foot1 = new Line( 60,100, 60, 140);
     Foot1.setStrokeWidth(7);
     Line Foot2 = new Line ( 70, 100, 70, 140);
     Foot2.setStrokeWidth(7);
     Line Foot3 = new Line ( 110, 100, 110, 140);
     Foot3.setStrokeWidth(7);
     Line Foot4 = new Line (120, 100, 120, 140);
     Foot4.setStrokeWidth(7);

     //Entire Sheep Body

     Group Sheep = new Group ( Coat, Body, Fur, Head, Ear, Tail, Eye, Mouth, Foot1, Foot2, Foot3, Foot4);
     Sheep.setTranslateX(90);
     Sheep.setTranslateY(130);

     //Sun

     Circle S0 = new Circle(400,50,33);
     Rectangle S1 = new Rectangle(380, 20, 40, 60);
     Rectangle S2 = new Rectangle ( 370, 30, 60, 40);
     S0.setFill (Color.GOLD);
     S1.setFill (Color.GOLD);
     S2.setFill (Color.GOLD);
     Group Sun = new Group (S2, S1, S0);

     //Tree Trunk and Leaf

     Rectangle Tree = new Rectangle(350,150, 20,100);
     Tree.setFill(Color.BROWN);

     Circle Leaf = new Circle(355, 150,45, Color.FORESTGREEN);

     //Ground

     Rectangle Ground = new Rectangle (0, 250, 500, 100);
     Ground.setFill(Color.GREEN);

     Group Root = new Group (Ground, Sun, Sheep, Tree, Leaf);
     Scene scene = new Scene (Root,500, 350, Color.LIGHTBLUE);

     primaryStage.setTitle("Sheep");
     primaryStage.setScene(scene);
     primaryStage.show();
    }
}
//Inspiration for the type of scene, was the snowman's basic parts from class.
//Java methods was used to make the project easier. That way when running the code parts
//that were pre-programmed made the steps of inputting faster. So, the codes used to
//expose object behavior.