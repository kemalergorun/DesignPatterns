package StructuralDP.DecoratorDP;

public class Iphone11 extends PhoneDecorator{



    public Iphone11(Phone basicPhone) {
        super(basicPhone);
    }
    //iphone11 ilkel iphone işlev sahibi
    //yeni işlev tanımla
    public String getModel(){
        return "11";
    }



}
