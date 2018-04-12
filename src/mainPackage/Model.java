package mainPackage;


public class Model {
    private GraphicalObject[] graphics;

    public void setGraphics() {
        graphics = new GraphicalObject[64];
        graphics[0] = new RotatableGraphicalObject("flame.png",50,50,45);

    }

    public GraphicalObject[] getGraphics() {
        return graphics;   //TODO make return copy?
    }

}
