public class Employee {
  private final int ID;
  private final String fname;
  private final String lname;
  private final String email;
  private final String phoneNumber;
  private final String jobTitle;
  private final String department;

  public Employee(
      int ID,
      String fname,
      String lname,
      String email,
      String phoneNumber,
      String jobTitle,
      String department) {
    this.ID = ID;
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.jobTitle = jobTitle;
    this.department = department;
  }

  public int getID() {
    return ID;
  }

  public String getFirstName() {
    return fname;
  }

  public String getLastName() {
    return lname;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public String getDepartment() {
    return department;
  }

  @Override
  public String toString() {
    return String.format("%s%n %s: %d%n %s: %s%n %s: %s%n %s: %s%n %s: %s%n %s: %s%n %s: %s%n",
        "Employee Information",
        "ID", getID(),
        "First Name", getFirstName(),
        "Last Name", getLastName(),
        "Email", getEmail(),
        "Phone Number", getPhoneNumber(),
        "Job Title", getJobTitle(),
        "Department", getDepartment());
  }
}