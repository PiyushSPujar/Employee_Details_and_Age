public class Employee_Details extends Person {
    int id;
    double salary;

    public Employee_Details(int id, double salary){
        this.id = id;
        this.salary = salary;
        display_details();
    }

    public void display_details(){
        System.out.println("Employee ID : "+ id);
        System.out.println("Salary : "+ salary);
    }
}
