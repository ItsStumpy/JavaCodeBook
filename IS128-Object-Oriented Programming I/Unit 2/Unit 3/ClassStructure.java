public class ClassStructure {
    public static void main(String[] args) {
        Employee myEmployee = new Employee(
                101,
                "Saitama",
                "One Punch",
                "saitama@heroacademy.com",
                "555-001",
                "Hero",
                "Hero Association");
        Professor myProfessor = new Professor(
                202,
                "Shoyo",
                "Hinata",
                "shoyo.hinata@school.edu",
                "555-002",
                "Professor",
                "Karasuno High School",
                "Volleyball",
                "MWF 1:00-2:00 PM",
                "25");
        Administrator myAdministrator = new Administrator(
                303,
                "Iruka",
                "Umino",
                "iruka@leafvillage.edu",
                "555-003",
                "IT Administrator",
                "Hidden Leaf Village",
                "3",
                "30",
                "27");
        Faculty myFaculty = new Faculty(
                404,
                "Jiraiya",
                "Konoha",
                "jiraiya@leafvillage.edu",
                "555-004",
                "Academic Advisor",
                "Hidden Leaf Village",
                "150",
                "100",
                "50");

        System.out.println(myEmployee);
        System.out.println(myProfessor);
        System.out.println(myAdministrator);
        System.out.println(myFaculty);
    }

}
