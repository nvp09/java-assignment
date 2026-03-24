//  parent class
class Vehicle {
    //  private field
    private String brand;

    //  constructor
    public Vehicle(String brand) {
        setBrand(brand);
    }

    // setter
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

    //  method
    public void start() {
        System.out.println(brand + " กำลังสตาร์ท...");
    }
}

//  child class
class Car extends Vehicle {

    //  constructor (เรียก parent)
    public Car(String brand) {
        super(brand);
    }

    //  method
    public void drive() {
        System.out.println(getBrand() + " กำลังขับเคลื่อนบนถนน");
    }
}

//  main class
public class MyInfo {
    public static void main(String[] args) {

        //  สร้าง object
        Car myCar = new Car("Toyota");

        // เรียกใช้ method
        myCar.start();
        myCar.drive();
    }
}