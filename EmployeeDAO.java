public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        // DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManager();
        // connectionManager.connect()
        // connectionManager.getConnectionObject().prepareStatement("Insert into Employee_tbl");
        // connectionManager.disconnect();
        System.out.println("saved employee to the database: " + employee);
    }
    
    public void deleteEmployee(Employee employee) {
        System.out.println("deleted employee to the database: " + employee);

    }

}