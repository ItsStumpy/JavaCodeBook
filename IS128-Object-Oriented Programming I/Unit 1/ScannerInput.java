import java.util.Scanner;

class ScannerInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;

    System.out.println("Enter your name");
    name = sc.nextLine();

    System.out.println("Enter your age");
    age = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter an address");
    address = sc.nextLine();

    System.out.println("Enter a phone number, no spaces, with format 9993335555");
    phoneNumber = sc.next();

    System.out.println("Enter an email");
    email = sc.next();

    System.out.println("All of the information you entered is: " + name + ", " + age + ", " + address + ", "
        + phoneNumber + ", " + email);

    sc.close();
  }

}
