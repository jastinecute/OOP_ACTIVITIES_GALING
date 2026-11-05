/*
JASTINE C. GALING
BSIT - 2B
*/

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(
            "Juan Dela Cruz", "EMP001", "IT", 25000.00
        );
        Employee emp2 = new Employee("Maria Lopez", "EMP002", "HR", 22000.0);

        Manager manager1 = new Manager(
            "Maria Santos", "EMP002", "HR", 45000.00, 5
        );
        Manager manager2 = new Manager(
            "Carlo Mendoza", "EMP003", "IT", 45000.0, 8
        );

        System.out.println("===== EMPLOYEE INFORMATION =====");
        employee1.displayInfo();

        System.out.println();

        System.out.println("===== MANAGER INFORMATION =====");
        manager1.displayInfo();

        System.out.println("\n===== UPDATING EMPLOYEE RECORD =====");
        employee1.setMonthlySalary(30000.00);

        manager1.setTeamSize(8);

        System.out.println("\n===== UPDATED EMPLOYEE INFORMATION =====");
        employee1.displayInfo();

        System.out.println();

        System.out.println("===== UPDATED MANAGER INFORMATION =====");
        manager1.displayInfo();
    }
}

/*
REFLECTION QUESTIONS

1. Why should monthlySalary be private, and what does the setter protect against?

   The monthlySalary should be private to protect the data from direct access.
   The setter prevents invalid salaries, such as zero or negative values.

2. Is a Manager also an Employee? Explain using the word extends.

   Yes, a Manager is also an Employee because the Manager class extends
   the Employee class and inherits its attributes and methods.

3. What is the advantage of calling super.displayInfo() inside Manager's displayInfo()?

   It allows the Manager class to reuse the Employee class's displayInfo()
   method instead of repeating the code. It then displays the manager's
   additional team size.
*/