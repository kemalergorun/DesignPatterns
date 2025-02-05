package CreationalDP.PrototypeDP;

public class Runner {
    public static void main(String[] args) {
        Soldier soldierAvailable=new Soldier(100,20,60,"sword",true);
        Soldier soldierNotAvailable=new Soldier(100,20,60,"sword",false);
        Soldier soldierWeapon=new Soldier(100,20,60,"arrow",true);

        //bir tane askeri prototip alıp klonlasak,sadece farklı özellik set edelim
        //sold ava protip olsun
        Soldier soldier4=soldierAvailable.clone();

        System.out.println("----------------prototip--------------");
        soldierAvailable.printInfo();
        System.out.println("--------------clone----------------");
        soldier4.printInfo();
        System.out.println("--------------------soldiernot ava");
        Soldier soldier5=soldierAvailable.clone();
        soldier5.setAvailable(false);
        soldier5.printInfo();


    }
}
