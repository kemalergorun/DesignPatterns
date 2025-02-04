package CreationalDP.SingletonDP;

public class Runner {
    public static void main(String[] args) {

       // SingletonObject object1=new SingletonObject();
        //SingletonObject object2=new SingletonObject();
        //System.out.println(object1==object2);
        //object referansları farklı

        SingletonObject obje3=SingletonObject.getInstance();
        SingletonObject obje4=SingletonObject.getInstance();
        System.out.println(obje3==obje4);
        System.out.println("------------------------------");
        System.out.println(obje3.message);
        obje3.changeMessage();
        System.out.println(obje3.message);
        System.out.println("------------------------------");
        System.out.println(obje4.message);

        //sadece bir obje oluşturulmalı ve sadece cons tek olmalı
        //default cons private olmalı def cons none seçilmeli
        //artık yeni obje oluşmaz




    }
}
