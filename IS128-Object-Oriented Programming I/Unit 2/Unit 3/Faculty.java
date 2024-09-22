public class Faculty extends Employee {
  private final String totalStudentsAdvised;
  private final String totalStudentsSignedUp;
  private final String totalStudentsUnenrolled;

  public Faculty(
      int ID,
      String fname,
      String lname,
      String email,
      String phoneNumber,
      String jobTitle,
      String department,
      String totalStudentsAdvised,
      String totalStudentsSignedUp,
      String totalStudentsUnenrolled) {
    super(ID, fname, lname, email, phoneNumber, jobTitle, department);
    this.totalStudentsAdvised = totalStudentsAdvised;
    this.totalStudentsSignedUp = totalStudentsSignedUp;
    this.totalStudentsUnenrolled = totalStudentsUnenrolled;
  }

  public String getTotalStudentsAdvised() {
    return totalStudentsAdvised;
  }

  public String getTotalStudentsSignedUp() {
    return totalStudentsSignedUp;
  }

  public String getTotalStudentsUnenrolled() {
    return totalStudentsUnenrolled;
  }

  @Override
  public String toString() {
    return String.format("%s%n %s%n %s: %s%n %s: %s%n %s: %s%n",
        "Type: Faculty",
        super.toString(),
        "Total Students Advised", getTotalStudentsAdvised(),
        "Total Students Signed Up", getTotalStudentsSignedUp(),
        "Total Students Unenrolled", getTotalStudentsUnenrolled());
  }
}
