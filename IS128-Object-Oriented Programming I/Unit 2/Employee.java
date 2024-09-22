public class Employee {
  private int ID;
  private String fname;
  private String lname;
  private String email;
  private String phoneNumber;
  private String jobTitle;
  private String department;

  public Employee() {
  }

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

  public void setID(int ID) {
    this.ID = ID;
  }

  public int getID() {
    return ID;
  }

  public void setFirstName(String fname) {
    this.fname = fname;
  }

  public String getFirstName() {
    return fname;
  }

  public void setLastName(String lname) {
    this.lname = lname;
  }

  public String getLastName() {
    return lname;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDepartment() {
    return department;
  }

  public void getEmployeeInfo() {
    System.out.printf(
        "Employee Information%n" +
            "ID: %d%n" +
            "First Name: %s%n" +
            "Last Name: %s%n" +
            "Email: %s%n" +
            "Phone Number: %s%n" +
            "Job Title: %s%n" +
            "Department: %s%n",
        getID(), getFirstName(), getLastName(), getEmail(), getPhoneNumber(), getJobTitle(), getDepartment());
  }
}