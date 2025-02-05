package CreationalDP.PrototypeDP;

public class Soldier implements Cloneable {

    private int health;

    private int maxLifeTime;

    private int power;

    private String weapon;

    private boolean isAvailable;

    //param const


    public Soldier(int health, int maxLifeTime, int power, String weapon, boolean isAvailable) {
        this.health = health;
        this.maxLifeTime = maxLifeTime;
        this.power = power;
        this.weapon = weapon;
        this.isAvailable = isAvailable;
    }

    public void printInfo(){
        System.out.println("lifetime: "+this.maxLifeTime);
        System.out.println("health: "+this.health);
        System.out.println("weapon: "+this.weapon);
        System.out.println("power: "+this.power);
        if (isAvailable){
            System.out.println("soldier can fight");
        }else {
            System.out.println("soldier can not fight");
        }




    }

    @Override
    public Soldier clone() {
        try {
            Soldier cloneSoldier = (Soldier) super.clone();
            return cloneSoldier;
        } catch (CloneNotSupportedException e) {
            System.out.println("an error accrued when soldier cloned");
            e.printStackTrace();
        }
        return null;
    }

    //getter setter

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
