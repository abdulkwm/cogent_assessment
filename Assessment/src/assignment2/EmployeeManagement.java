package assignment2;

import java.util.*;

public class EmployeeManagement {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeManagement app = new EmployeeManagement();
        app.run();
    }
    public void run() {
        try {
            while (true) {
                System.out.println("Enter your choice:");
                System.out.println("1. Add an employee");
                System.out.println("2. Update an employee");
                System.out.println("3. Delete an employee");
                System.out.println("4. Read all employees");
                System.out.println("5. Search for an employee");
                System.out.println("6. Sort all employees by name");
                System.out.println("7. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addEmployee(scanner);
                        break;
                    case 2:
                        updateEmployee(scanner);
                        break;
                    case 3:
                        deleteEmployee(scanner);
                        break;
                    case 4:
                        readAllEmployees();
                        break;
                    case 5:
                        searchEmployee(scanner);
                        break;
                    case 6:
                        sortEmployees();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input please try again!");
        }
    }

    private void addEmployee(Scanner scanner) {
        System.out.println("Enter employee ID:");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        System.out.println("Enter employee name:");
        String employeeName = scanner.nextLine();

        System.out.println("Enter employee address:");
        String employeeAddress = scanner.nextLine();

        System.out.println("Enter employee email:");
        String employeeEmail = scanner.nextLine();

        System.out.println("Enter employee salary:");
        double employeeSalary = scanner.nextDouble();

        Employee employee = new Employee(employeeId, employeeName, employeeAddress, employeeEmail, employeeSalary);
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    private void updateEmployee(Scanner scanner) {
        System.out.println("Enter employee ID:");
        int employeeId = scanner.nextInt();

        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == employeeId) {
                System.out.println("Enter new employee name:");
                scanner.nextLine(); // consume newline character
                String employeeName = scanner.nextLine();
                employee.setEmployeeName(employeeName);

                System.out.println("Enter new employee address:");
                String employeeAddress = scanner.nextLine();
                employee.setEmployeeAddress(employeeAddress);

                System.out.println("Enter new employee email:");
                String employeeEmail = scanner.nextLine();
                employee.setEmployeeEmail(employeeEmail);

                System.out.println("Enter new employee salary:");
                double employeeSalary = scanner.nextDouble();
                employee.setEmployeeSalary(employeeSalary);

                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private void deleteEmployee(Scanner scanner) {
        System.out.println("Enter employee ID:");
        int employeeId = scanner.nextInt();

        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == employeeId) {
                employeeList.remove(employee);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private void readAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("List of all employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
    private void searchEmployee(Scanner scanner) {
        System.out.println("Enter employee ID:");
        int employeeId = scanner.nextInt();

        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == employeeId) {
                System.out.println("Employee found:");
                System.out.println("ID: " + employee.getEmployeeId());
                System.out.println("Name: " + employee.getEmployeeName());
                System.out.println("Address: " + employee.getEmployeeAddress());
                System.out.println("Email: " + employee.getEmployeeEmail());
                System.out.println("Salary: " + employee.getEmployeeSalary());
            }
                System.out.println("Employee not found");
        }
    }
    public void sortEmployees() {
        System.out.println("unsorted employee data: ");
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
        }
        Collections.sort(employeeList,NameComparator);
        System.out.println("Employees sorted by Name:");
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
        }
    };
}

