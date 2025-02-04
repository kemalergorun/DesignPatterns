package CreationalDP.SingletonDP;

public class SingletonObject {

    public String message="hello";

    private SingletonObject() {
    }

    private static SingletonObject instance;

    public static SingletonObject getInstance(){
        if (instance==null){
            instance=new SingletonObject();
        }
        return instance;
    }
    //bu metod ilk çağrıldığında obje oluşur ve her defasında aynı obje
    //kullanılır

    public void changeMessage(){
        this.message+="design pattern";
    }
}
