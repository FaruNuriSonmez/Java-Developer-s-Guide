public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        System.out.println(customer.email);

        System.out.println(employee.salary);

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.Add();
        customerManager.List();


        employeeManager.Add();
        employeeManager.List();
        employeeManager.BestEmployee();
    }
}
