package mainPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.transform.Rotate;

public class RotatableGraphicalObject extends GraphicalObject {
    private double privAngle;
    public RotatableGraphicalObject(String url, double x, double y, double angle) {
        super(url, x, y);
        this.privAngle =angle;

    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.save();
        rotate(gc,privAngle,x,y); //TODO fix rotate around middle instead
        gc.drawImage(new Image(url),x,y);
        gc.restore();
    }

    private void rotate(GraphicsContext gc, double angle, double px, double py) {
        Rotate r = new Rotate(angle, px, py);
        gc.setTransform(r.getMxx(), r.getMyx(), r.getMxy(), r.getMyy(), r.getTx(), r.getTy());
    }
}
