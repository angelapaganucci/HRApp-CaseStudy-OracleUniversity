package hrapp;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(230, "Jerry", 333998);
        Employee e2 = new Employee(420, "Gracie", 3325410);

        Department dept = new Department("Education");

        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(772, "Jack", 2998));

        Employee[] emps = dept.getEmployees();

        for(Employee emp : emps){
            System.out.println("Emp " + emp);
        }
        System.out.println("Total " + dept.getTotalSalary());
        System.out.println("Avg " + dept.getAverageSalary());

        System.out.println("Emp " + dept.getEmployeeByID(23122));
    }
}
