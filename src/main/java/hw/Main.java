package hw;

import hw.entities.Employee;
import hw.entities.EmployeeBook;
import hw.entities.PhoneNumber;
import hw.exceptions.PhoneNumberException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws PhoneNumberException {
        Employee employee1 = new Employee(new PhoneNumber("+7", "9998883344"), "Make",
                new GregorianCalendar(2022, Calendar.FEBRUARY, 28).getTime());
        Employee employee2 = new Employee(new PhoneNumber("+212", "8888888"), "Fedor",
                new GregorianCalendar(2023, Calendar.FEBRUARY, 22).getTime());
        Employee employee3 = new Employee(new PhoneNumber("+212", "9998883"), "Alexandr",
                new GregorianCalendar(2010, Calendar.JULY, 12).getTime());
        Employee employee4 = new Employee(new PhoneNumber("+7", "5554443366"), "Kate",
                new GregorianCalendar(2011, Calendar.APRIL, 15).getTime());
        Employee employee5 = new Employee(new PhoneNumber("+7", "9997778989"), "Kate",
                new GregorianCalendar(2023, Calendar.FEBRUARY, 22).getTime());
        Employee employee6 = new Employee(new PhoneNumber("+7", "9991119944"), "Mary",
                new GregorianCalendar(2014, Calendar.JANUARY, 2).getTime());
        Employee employee7 = new Employee(new PhoneNumber("+7", "9228884884"), "Jacob",
                new GregorianCalendar(2013, Calendar.MARCH, 1).getTime());

        List<Employee> employeeList = List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7);

        EmployeeBook employeeBook = new EmployeeBook(employeeList);

        System.out.println(employeeBook);

        System.out.println();

        System.out.println(employeeBook.getEmployeeWithInputYearsOfSeniority(0));
        System.out.println();
        System.out.println(employeeBook.getPhoneNumberByName("Kate"));
        System.out.println();
        System.out.println(employeeBook.getEmployeeByID(0));
    }
}
