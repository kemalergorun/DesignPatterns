package CreationalDP.AbstractFactoryDP;

public class Runner {
    public static void main(String[] args) {

        AbstractFactory<Shape> shapeFactory=FactoryProducer.getFactory("shape");
        Shape square=shapeFactory.getObject("square");
        square.draw();

        AbstractFactory<Color> colorFactory=FactoryProducer.getFactory("color");
        Color blue= colorFactory.getObject("blue");
        blue.fill();

        System.out.println("--------------------------------------");
        Shape triangle= (Shape) FactoryProducer.getFactory("shape").getObject("triangle");
        triangle.draw();
        Color red= (Color) FactoryProducer.getFactory("color").getObject("red");
        red.fill();








    }
}
