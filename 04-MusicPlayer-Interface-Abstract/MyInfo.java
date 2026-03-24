//  interface
interface Playable {
    void play();
}

//  abstract class
abstract class MusicDevice {
    //  private field
    private String brand;

    //  constructor
    public MusicDevice(String brand) {
        setBrand(brand);
    }

    //  setter
    public void setBrand(String newBrand) {
        if (newBrand != null && !newBrand.isEmpty()) {
            brand = newBrand;
        } else {
            System.out.println("Invalid brand!");
        }
    }

    //  getter
    public String getBrand() {
        return brand;
    }

    //  method ปกติ
    public void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }

    //  abstract method
    public abstract void connect();
}

//  CDPlayer
class CDPlayer extends MusicDevice implements Playable {

    public CDPlayer(String brand) {
        super(brand);
    }

    @Override
    public void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }

    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

//  Smartphone
class Smartphone extends MusicDevice implements Playable {

    public Smartphone(String brand) {
        super(brand);
    }

    @Override
    public void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

//  main
public class MyInfo {
    public static void main(String[] args) {

        //  ใช้ polymorphism
        MusicDevice device1 = new CDPlayer("Sony");
        MusicDevice device2 = new Smartphone("iPhone");

        // ใช้งานแบบ generic
        device1.connect();
        device1.info();
        ((Playable) device1).play();

        System.out.println("------------------");

        device2.connect();
        device2.info();
        ((Playable) device2).play();
    }
}