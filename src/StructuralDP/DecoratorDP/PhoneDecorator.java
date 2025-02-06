package StructuralDP.DecoratorDP;

public class PhoneDecorator implements Phone{

    private Phone basicPhone;//mevcut obje

    public PhoneDecorator(Phone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getCameraCount() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
