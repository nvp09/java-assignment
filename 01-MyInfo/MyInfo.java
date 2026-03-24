class Person {
    //  private fields
    private String name;
    private int age;
    private String hobby;

    //  setter
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setHobby(String newHobby) {
        hobby = newHobby;
    }

    //  getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    //  method แสดงข้อมูล
    public void displayInfo() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My hobby is " + hobby);
    }
}

//  main class
public class MyInfo {
    public static void main(String[] args) {

        // สร้าง object
        Person p = new Person();

        // set ค่า
        p.setName("Jump");
        p.setAge(35);
        p.setHobby("Coding");

        // แสดงผล
        p.displayInfo();
    }
}