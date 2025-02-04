package CreationalDP.FactoryDP;

public class Runner {
    public static void main(String[] args) {

        Shape triangle=new Triangle("triangle",60,3);
        triangle.draw();

        Shape square=new Square("square",90,4);
        square.draw();

        Shape pentagon=new Pentagon("pentagon",108,5);
        pentagon.draw();
        //nesnenin const veya domain hakkında bilgi olmadan objeyi
        //kullanma istiyoruz bunun için factory method design pattern kullan
        System.out.println("-----------------------------");

        Shape shape1=ShapeFactory.getShape(ShapeType.TRIANGLE);
        shape1.draw();

        Shape shape2=ShapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();
        //artık new keywordu olmadığı için objeler bağımsız









    }
}
