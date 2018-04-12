package mainPackage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Window extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1920, 1080);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Model model = new Model();
        model.setGraphics();
        GraphicalObject[] graphics = model.getGraphics();
        if (graphics!=null) {
            for(GraphicalObject o : graphics) {
                if (o!=null) {
                    o.draw(gc);
                }
            }
        }

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();



    }

    private void draw(GraphicsContext gc, GraphicalObject o) {
        o.draw(gc);
    }
}
