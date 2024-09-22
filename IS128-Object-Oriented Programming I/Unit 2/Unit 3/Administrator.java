public class Administrator extends Employee {
  private final String repairsInProgress;
  private final String totalRepairs;
  private final String totalTicketsResolved;

  public Administrator(
      int ID,
      String fname,
      String lname,
      String email,
      String phoneNumber,
      String jobTitle,
      String department,
      String repairsInProgress,
      String totalRepairs,
      String totalTicketsResolved) {
    super(ID, fname, lname, email, phoneNumber, jobTitle, department);
    this.repairsInProgress = repairsInProgress;
    this.totalRepairs = totalRepairs;
    this.totalTicketsResolved = totalTicketsResolved;
  }

  public String getRepairsInProgress() {
    return repairsInProgress;
  }

  public String getTotalRepairs() {
    return totalRepairs;
  }

  public String getTotalTicketsResolved() {
    return totalTicketsResolved;
  }

  @Override
  public String toString() {
    return String.format("%s%n %s%n %s: %s%n %s: %s%n %s: %s%n",
        "Type: IT Admin",
        super.toString(),
        "Repairs In Progress", getRepairsInProgress(),
        "Total Repairs", getTotalRepairs(),
        "Total Tickets Resolved", getTotalTicketsResolved());
  }
}
