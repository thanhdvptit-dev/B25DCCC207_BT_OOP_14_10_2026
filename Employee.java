public class Employee extends Person {
    String id;
    String department;
    long baseSalary; // Đổi thành long
    int startYear;

    public Employee(String name, int birthYear, String address, String phone, String id, String department, long baseSalary, int startYear) {
        super(name, birthYear, address, phone);
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.startYear = startYear;
    }

    public long calculateSalary() { // Trả về long
        int years = 2026 - startYear;
        return baseSalary + (200000L * years); // Thêm chữ L để ép kiểu số 200.000 thành long
    }

    public String getRole() {
        return "Nhân viên";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Vai trò: " + getRole() + " | Mã NV: " + id + " | Lương: " + calculateSalary());
    }
}