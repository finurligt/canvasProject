package mainPackage;

import javafx.scene.canvas.GraphicsContext;

public abstract class GraphicalObject {
    String url;
    double x,y;
    public GraphicalObject(String url, double x, double y) {
        this.url=url;
        this.x=x;
        this.y=y;
    }

    public abstract void draw(GraphicsContext gc);
}
