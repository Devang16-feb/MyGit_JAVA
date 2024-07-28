import java.util.ArrayList;
import java.util.Scanner;

class Employee 
{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class PermanentEmployee extends Employee 
{
    private double benefits;

    public PermanentEmployee(String name, int id, double salary, double benefits) 
    {
        super(name, id, salary);
        this.benefits = benefits;
    }

    public double getTotalSalary() 
    {
        return getSalary() + benefits;
    }
}

class ContractEmployee extends Employee 
{
    private int contractDuration;

    public ContractEmployee(String name, int id, double salary, int contractDuration) {
        super(name, id, salary);
        this.contractDuration = contractDuration;
    }

    public double getTotalSalary() {
        return getSalary();
    }
}

class EmployeeManagement {
    //Array_list Contains object of that Employee class
    //ArrayList is resizable
    private ArrayList<Employee> employees; // Name of variable collection of emplyees

    public EmployeeManagement() 
    {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) 
    {
        employees.add(employee); //Pass employee object as arguments to the employees list,
        //which appends the specified element to the end of the list(emplyees).
    }

    public void removeEmployee(int id) 
    {
        for (Employee employee : employees) 
        {
            if (employee.getId() == id) 
            {
                employees.remove(employee);
                break;
            }
        }
    }

    public void displayEmployees() 
    {
        for (Employee employee : employees) 
        {
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Salary: " + employee.getSalary());

            if (employee instanceof PermanentEmployee) 
            {
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
                System.out.println("Total Salary: " + permanentEmployee.getTotalSalary());
            } 
            else if (employee instanceof ContractEmployee) 
            {
                ContractEmployee contractEmployee = (ContractEmployee) employee;
                System.out.println("Total Salary: " + contractEmployee.getTotalSalary());
            }
            System.out.println("---------------------");
        }
    }
}

public class EmployeeManagementSystem 
{
    public static void main(String[] args) 
    {
        EmployeeManagement management = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        
        // Adding employees
        management.addEmployee(new PermanentEmployee("Devang", 1001, 50000, 10000));
        management.addEmployee(new ContractEmployee("Mohit", 1002, 30000, 12));

        // Displaying employees
        management.displayEmployees();
    }
}
