package core_java;
public class Inheritance32 {
    public static void main(String[] args) {
        CompanyEmployE employee = new CompanyEmployE("John Doe", 101, 50000.0);
        DepartmentManager manager = new DepartmentManager("Jane Smith", 102, 75000.0, "IT", "Project Manager");

        System.out.println("Employee Name: " + employee.name + ", ID: " + employee.id + ", Salary: " + employee.salary);

        System.out.println("Manager Name: " + manager.name + ", ID: " + manager.id + ", Salary: " + manager.salary);
        System.out.println("Department: " + manager.department + ", Designation: " + manager.designation);
    }
}

