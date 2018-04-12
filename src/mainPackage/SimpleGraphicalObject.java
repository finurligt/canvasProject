package mainPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class SimpleGraphicalObject extends GraphicalObject {
    public SimpleGraphicalObject(String url, double x, double y) {
        super(url, x, y);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.drawImage(new Image(url),x,y);
    }
}
