class Car {
    //  private fields
    private String brand;
    private int speed;

    //  constructor
    public Car(String brand, int speed) {
        setBrand(brand);   // ใช้ setter เพื่อคุมค่า
        setSpeed(speed);
    }

    //  setter
    public void setBrand(String newBrand) {
        if (newBrand != null && !newBrand.isEmpty()) {
            brand = newBrand;
        } else {
            System.out.println("Invalid brand!");
        }
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed >= 0) {
            speed = newSpeed;
        } else {
            System.out.println("Speed must be positive!");
        }
    }

    //  getter
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    //  method แสดงข้อมูล
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

//  main class
public class MyInfo {
    public static void main(String[] args) {

        //  สร้าง object 
        Car myCar = new Car("Toyota", 120);

        // แสดงผล
        myCar.displayInfo();
    }
}