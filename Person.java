import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name : ");
        String emp_name = scanner.nextLine();

        System.out.print("Enter date of birth (YYYY-MM-DD) : ");
        String input_dob = scanner.next();

        Person emp1 = new Person();

        System.out.println("Details of student are : ");
        emp1.display_employee_name(emp_name);
        emp1.display_employee_DOB(input_dob);
        Employee_Details empd1 = new Employee_Details(240, 60000.99);

        scanner.close();
    }

    public void display_employee_name(String name) {
        System.out.println("Employee name : " + name);

    }

    public void display_employee_DOB(String date) {
        LocalDate dob = LocalDate.parse(date);
        System.out.println("Employee age : " + calculateAge(dob));

    }

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        // calculates the amount of time between two dates and returns the years
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }
}
