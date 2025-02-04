package CreationalDP.AbstractFactoryDP;

public class ShapeFactory implements AbstractFactory<Shape> {
    @Override
    public Shape getObject(String objectType) {
        return getShape(objectType);
    }


    public static Shape getShape(String type){
        if (type.equalsIgnoreCase("triangle")){
            return new Triangle("triangle",60,3);
        } else if (type.equalsIgnoreCase("square")) {
            return new Square("square",90,4);

        } else if (type.equalsIgnoreCase("pentagon")) {
            return new Pentagon("pentagon",108,5);

        }
        return null;

    }


}
