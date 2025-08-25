package core_java;
class CompanyEmployE {
    String name;
    int id;
    double salary;

    CompanyEmployE(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class DepartmentManager extends CompanyEmployE {
    String department;
    String designation;

    DepartmentManager(String name, int id, double salary, String department, String designation) {
        super(name, id, salary);
        this.department = department;
        this.designation = designation;
    }
}

