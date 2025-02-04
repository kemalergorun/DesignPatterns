package CreationalDP.FactoryDP;

public class Square implements Shape{
    private String name;

    private int angle;

    private int edge;

    public Square(String name, int angle, int edge) {
        this.name = name;
        this.angle = angle;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println(this.name+"drawen. Angle : "+this.angle+ "Edge:"+this.edge);
    }
}
