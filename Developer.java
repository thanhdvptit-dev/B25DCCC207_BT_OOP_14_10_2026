public class Developer extends Employee {
    String language;
    int overtimeHours;
    long overtimeRate; // Đổi thành long

    public Developer(String name, int birthYear, String address, String phone, String id, String department, long baseSalary, int startYear, String language, int overtimeHours, long overtimeRate) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.language = language;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public long calculateSalary() { // Trả về long
        return super.calculateSalary() + (overtimeHours * overtimeRate);
    }

    @Override
    public String getRole() {
        return "Lập trình viên";
    }
}