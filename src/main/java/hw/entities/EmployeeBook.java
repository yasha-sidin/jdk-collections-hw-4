package hw.entities;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class EmployeeBook {
    @Getter(AccessLevel.NONE)
    private final List<Employee> employeeList;

    public EmployeeBook() {
        employeeList = new LinkedList<>();
    }

    public EmployeeBook(List<Employee> employeeList) {
        this.employeeList = new LinkedList<>(employeeList);
    }

    public List<Employee> getEmployeeWithInputYearsOfSeniority(long yearsOfSeniority) {
        if (yearsOfSeniority < 0) throw new RuntimeException("Days of seniority must be more than 0 or equal it");
        List<Employee> checkingList = new LinkedList<>();
        for (Employee checkingEmployee : employeeList) {
            if (checkingEmployee.getYearsOfSeniority() == yearsOfSeniority) checkingList.add(checkingEmployee);
        }
        if (checkingList.isEmpty()) return null;
        return checkingList;
    }

    public List<PhoneNumber> getPhoneNumberByName(String name) {
        List<PhoneNumber> checkingList = new LinkedList<>();
        for (Employee checkingEmployee : employeeList) {
            if (checkingEmployee.getName().equals(name)) checkingList.add(checkingEmployee.getPhoneNumber());
        }
        if (checkingList.isEmpty()) return null;
        return checkingList;
    }

    public Employee getEmployeeByID(long ID) {
        if (ID < 0) throw new RuntimeException("ID must be more than 0 or equal it");
        for (Employee employee : employeeList) {
            if (employee.getID() == ID) return employee;
        }
        return null;
    }

    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmployeeBook {\n");
        for (Employee employee : employeeList) {
            sb.append("\t").append(employee).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
