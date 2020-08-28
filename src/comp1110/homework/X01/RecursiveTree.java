package comp1110.homework.X01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * A JavaFX application which draws a recursive tree.
 *
 * Some JavaFX classes that may be useful:
 * - javafx.geometry.Point2D: used to store a 2D coordinate
 * - javafx.scene.shape.Line: creates a line segment for display,
 * key attributes are startX/Y and endX/Y (each with getters and setters
 * e.g. getStartX(), setStartX())
 * - javafx.scene.transform.Rotate: used to create a rotation transformation
 * which can be applied to objects or points
 */
public class RecursiveTree extends Application {
    private final Group root = new Group();
    public double degree = 40*3.14155926/180;
    public double rate = 0.85;  // change the rate of reducing the length of branches;
    public double rate1 = 0.09;  // make the length of 2 branches of a certain node different
    public double toRadians = 40*3.141592653589793846/180;

    public void recursive (double x1, double y1, double x2, double y2){
        double len = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        if ( len > 9 ){
            degree = (10+20*Math.random())*3.14155926/180;
            Line line1 = new Line();
            line1.setStartX(x1);
            line1.setStartY(y1);
            double endxf = x1+Math.cos(degree)*(x2-x1)-Math.sin(degree)*(y2-y1);
            double endyf = y1+Math.sin(degree)*(x2-x1)+Math.cos(degree)*(y2-y1);
            double newxf = endxf + (endxf - x1)*rate;
            double newyf = endyf + (endyf - y1)*rate;
            line1.setEndX(endxf);
            line1.setEndY(endyf);
            root.getChildren().add(line1);
            x2 = x2 +(x2 - x1)*(-rate1+2*rate1*Math.random());
            y2 = y2 +(y2 - y1)*(-rate1+2*rate1*Math.random());
            Line line2 = new Line();
            line2.setStartX(x1);
            line2.setStartY(y1);
            double endxs = x1+Math.cos(degree-toRadians)*(x2-x1)-Math.sin(degree-toRadians)*(y2-y1);
            double endys = y1+Math.sin(degree-toRadians)*(x2-x1)+Math.cos(degree-toRadians)*(y2-y1);
            double newxs = endxs + (endxs - x1)*rate;
            double newys = endys + (endys - y1)*rate;
            line2.setEndX(endxs);
            line2.setEndY(endys);
            root.getChildren().add(line2);
            recursive(endxf, endyf,newxf,newyf);
            recursive(endxs, endys,newxs,newys);
        }
        if ( len > 7 && len <= 9 ){
            Circle circle = new Circle();
            circle.setCenterX(x1);
            circle.setCenterY(y1);
            circle.setRadius(1.5);
            circle.setFill(javafx.scene.paint.Color.rgb(255,153,255));
            root.getChildren().add(circle);
        }
    }
    @Override
    public void start(Stage primaryStage) {
        // Create the root stack pane
        primaryStage.setTitle("Recursive Tree");
//        StackPane root = new StackPane();

        // Set scene of stage with size 150x150 and show the stage
        Scene scene = new Scene(root, 800, 600);
//        primaryStage.setScene(new Scene(root, 150, 150));

        Line line = new Line();
        line.setStartX(400);
        line.setStartY(550);
        line.setEndX(400);
        line.setEndY(450);
        root.getChildren().add(line);
        recursive(400, 450, 400,390);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Leave the main method as is, required to launch JavaFX
    public static void main(String[] args) {
        launch(args);
    }
}
