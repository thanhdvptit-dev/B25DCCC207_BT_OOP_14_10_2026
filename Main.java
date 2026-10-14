public class Main {
    public static void main(String[] args) {
        Person[] list = new Person[3];

        // Truyền các số tiền lương bình thường, không cần thay đổi cách nhập
        list[0] = new Employee("Trị", 2000, "Hà Nội", "0123", "NV01", "Hành chính", 5000000, 2023);
        list[1] = new Developer("Nam", 2000, "Hà Nội", "0124", "DEV1", "IT", 8000000, 2024, "Java", 10, 150000);
        list[2] = new Manager("Thành", 2000, "Hà Nội", "0125", "MGR1", "Kinh doanh", 12000000, 2022, 5, 500000);

        long totalSalary = 0; // Đổi thành long
        int countDev = 0;
        int countMgr = 0;

        System.out.println("--- DANH SÁCH NHÂN SỰ ---");
        for (int i = 0; i < list.length; i++) {
            list[i].showInfo();
            System.out.println("--------------------");

            if (list[i] instanceof Employee) {
                Employee emp = (Employee) list[i];
                totalSalary = totalSalary + emp.calculateSalary();
            }

            if (list[i] instanceof Developer) {
                countDev++;
            }
            if (list[i] instanceof Manager) {
                countMgr++;
            }
        }

        System.out.println("Tổng lương toàn công ty: " + totalSalary);
        System.out.println("Số lượng Developer: " + countDev);
        System.out.println("Số lượng Manager: " + countMgr);
    }
}