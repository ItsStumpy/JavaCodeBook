import java.util.Scanner;

public class Constructors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Employee employee1 = new Employee();
    Employee employee2 = new Employee(
        1,
        "Kirito",
        "Kirigaya",
        "dualwielderkiri@sao.com",
        "+8120-202-6295",
        "Computer Science Instructor",
        "STEM");

    System.out.println("Enter your Employee ID");
    employee1.setID(input.nextInt());
    input.nextLine();

    System.out.println("Enter your First Name");
    employee1.setFirstName(input.nextLine());

    System.out.println("Enter your Last Name");
    employee1.setLastName(input.nextLine());

    System.out.println("Enter your Employee Email");
    employee1.setEmail(input.nextLine());

    System.out.println("Enter your Employee Phone Number");
    employee1.setPhoneNumber(input.nextLine());

    System.out.println("Enter your Job Title");
    employee1.setJobTitle(input.nextLine());

    System.out.println("Enter your Department");
    employee1.setDepartment(input.nextLine());

    System.out.println();
    System.out.println("Employee 1 Information");
    System.out.println("============================");
    employee1.getEmployeeInfo();

    System.out.println();
    System.out.println("Employee 2 Information");
    System.out.println("============================");
    employee2.getEmployeeInfo();

    input.close();
  }
}
