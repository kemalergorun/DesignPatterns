package CreationalDP.FactoryDP_test;

import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.ShapeFactory;
import CreationalDP.FactoryDP.ShapeType;

public class FactoryDPRunner {
    public static void main(String[] args) {

        Shape shape4= ShapeFactory.getShape(ShapeType.SQUARE);
        shape4.draw();

    }
}
