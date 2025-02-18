package CreationalDP.AbstractFactoryDP;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color getObject(String objectType) {
        return getColor(objectType);
    }
    public Color getColor(String color){
        if (color.equalsIgnoreCase("red")){
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();

        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }


}
