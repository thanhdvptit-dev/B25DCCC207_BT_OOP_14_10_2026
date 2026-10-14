public class Person {
    String name;
    int birthYear; 
    String address;
    String phone;

    public Person(String name, int birthYear, String address, String phone) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
    }

    public int getAge() {
        return 2026 - birthYear;
    }

    public void showInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + getAge() + ", Địa chỉ: " + address);
    }
}
