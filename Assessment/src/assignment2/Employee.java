package assignment2;

public class Employee {
    int employeeId;
    String employeeName;
    String employeeAddress;
    String employeeEmail;
    double employeeSalary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeAddress, String employeeEmail, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeEmail = employeeEmail;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
