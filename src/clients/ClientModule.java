package src.clients;

import src.domain.Employee;

import src.reporting.EmployeeReportFormatter;
import src.reporting.FormatType;

public class ClientModule {

    public static void main(String arg[]) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmployee(employee);

    }

    public static void printEmployeeReport(Employee employee) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, FormatType.CSV);
        System.out.println(formatter.getFormattedEmployee());
    }
}