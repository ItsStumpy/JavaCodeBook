public class Professor extends Employee {
  private final String subject;
  private final String officeHours;
  private final String averageStudents;

  public Professor(
      int ID,
      String fname,
      String lname,
      String email,
      String phoneNumber,
      String jobTitle,
      String department,
      String subject,
      String officeHours,
      String averageStudents) {
    super(ID, fname, lname, email, phoneNumber, jobTitle, department);
    this.subject = subject;
    this.officeHours = officeHours;
    this.averageStudents = averageStudents;
  }

  public String getSubjectTaught() {
    return subject;
  }

  public String getOfficeHours() {
    return officeHours;
  }

  public String getAverageStudents() {
    return averageStudents;
  }

  @Override
  public String toString() {
    return String.format("%s%n %s%n %s: %s%n %s: %s%n %s: %s%n",
        "Type: Professor",
        super.toString(),
        "Subject", getSubjectTaught(),
        "Office Hours", getOfficeHours(),
        "Average Students", getAverageStudents());
  }
}
