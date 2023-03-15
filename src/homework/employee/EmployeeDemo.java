package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("c001","Gexam OOO", "Gyumri", "123456");
        company.setCountOfEmployees(3);
        companyStorage.add(company);
        employeeStorage.add(new Employee("poxos", "poxosyan", "a001", 100, company, "jr manager", true, new Date(), DateUtil.stringToDate("12/02/2023")));
        employeeStorage.add(new Employee("petros", "poxosyan", "a002", 200, company, "manager", true, new Date(), DateUtil.stringToDate("12/02/2020")));
        employeeStorage.add(new Employee("martiros", "poxosyan", "a003", 300, company, "sr manager", true, new Date(), DateUtil.stringToDate("12/02/1999")));

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    companyStorage.print();
                    System.out.println("Please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchByCompany(companyById);
                    }else {
                        System.out.println("Company does not exists!");
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeesBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changeEmployeePositionById();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEES:
                    inactivateEmployeeById();
                    break;
                case ACTIVATE_EMPLOYEES:
                    activateEmployeeById();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("wrong command, try again!");
            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input company id,name,address,phone");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company added!");
        } else {
            System.out.println("Company with " + companyId + " already exists");
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            int countOfEmployees = employee.getCompany().getCountOfEmployees() - 1;
            employee.getCompany().setCountOfEmployees(countOfEmployees);
            System.out.println("Employee inactivated!");
        } else {
            System.out.println("Employee does not exists, please try again.");
        }
    }

    private static void activateEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && !employee.isActive()) {
            employee.setActive(true);
            System.out.println("Employee activated!");
        } else {
            System.out.println("Employee does not exists, or employee already active, please try again.");
        }
    }

    private static void changeEmployeePositionById() {
        employeeStorage.print();
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed!");
        } else {
            System.out.println("Employee does not exists, please try again.");
        }
    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("Please input min,max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary should be less then max salary");
        } else {
            employeeStorage.searchBySalaryRange(minSalary, maxSalary);
        }
    }


    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with " + employeeId + " does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("please input name,surname,employeeId,salary,position,dateOfBirthday(15/04/1994)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Employee employee = employeeStorage.getEmployeeById(employeeId);
            if (employee == null) {
                Date regsiterDate = new Date();
                Date dateOfBirthday = DateUtil.stringToDate(employeeData[5]);
                Employee newEmployee = new Employee(employeeData[0], employeeData[1],
                        employeeId, Double.parseDouble(employeeData[3]), companyById,
                        employeeData[4], true, regsiterDate, dateOfBirthday);
                employeeStorage.add(newEmployee);
                companyById.setCountOfEmployees(companyById.getCountOfEmployees() + 1);
                System.out.println("Employee was added");
            } else {
                System.out.println("employee with " + employeeId + " already exists!!!");
            }
        }
    }
}
