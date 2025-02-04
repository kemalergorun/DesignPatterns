package CreationalDP.FactoryDP;

public class ShapeFactory {

    public static Shape getShape(ShapeType type){
        if (type==ShapeType.TRIANGLE){
            return new Triangle("triangle",60,3);
        } else if (type==ShapeType.SQUARE) {
            return new Square("square",90,4);

        } else if (type==ShapeType.PENTAGON) {
            return new Pentagon("pentagon",108,5);

        }
        return null;

    }
}
