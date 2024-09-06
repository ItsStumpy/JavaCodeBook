public class ConsoleInput {
  public static void main(String[] args) {
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;

    System.out.println("Enter your name");
    name = System.console().readLine();

    System.out.println("Enter your age");
    age = Integer.parseInt(System.console().readLine());

    System.out.println("Enter an address");
    address = System.console().readLine();

    System.out.println("Enter a phone number, no spaces, with format 9993335555");
    phoneNumber = System.console().readLine();

    System.out.println("Enter an email");
    email = System.console().readLine();

    System.out.println("All of the information you entered is: " + name + ", " + age + ", " + address + ", "
        + phoneNumber + ", " + email);
  }
}
