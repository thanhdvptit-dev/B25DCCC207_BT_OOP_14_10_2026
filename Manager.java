public class Manager extends Employee {
    int teamSize;
    long bonusPerMember; // Đổi thành long

    public Manager(String name, int birthYear, String address, String phone, String id, String department, long baseSalary, int startYear, int teamSize, long bonusPerMember) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.teamSize = teamSize;
        this.bonusPerMember = bonusPerMember;
    }

    @Override
    public long calculateSalary() { // Trả về long
        return super.calculateSalary() + (teamSize * bonusPerMember);
    }

    @Override
    public String getRole() {
        return "Quản lý";
    }
}