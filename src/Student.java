import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    public String courseName = "";
    public String courses = "";
    private int tuitionFee;
    private int yearOfStudy = 0;
    private int id = 1000;
    private int balanceAccount = 0;
    private int courseCost = 600;
    private int studentID;


    public Student() {

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Enter first name ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter grade level:\n 1. Junior\n 2. Intermediate\n 3. Senior ");
        this.yearOfStudy = scanner.nextInt();
        setStudentId();

        System.out.println(firstName + " " + lastName + " " + yearOfStudy + " student ID: " + studentID);

        // scanner.close();

    }


    private void setStudentId() {
        id++;
        this.studentID = Integer.parseInt(yearOfStudy + "" + id);
        return;
    }

    public void enroll() {


        Scanner scanner = new
                Scanner(System.in);

        while (courseName != "q") {

            System.out.println("Choose your courses : \n 1. History 101\n 2. Mathematics 101\n 3. English 101\n " +
                    "4. Chemistry 101\n 5. Computer Science 101\n 6. q");

            this.courseName = scanner.nextLine();
            courses = courses + "\n" + courseName;
            tuitionFee = tuitionFee + courseCost;
            System.out.println("you chose " + courses );

            if (courseName.equalsIgnoreCase("q")) {
                System.out.println("tk");
                System.out.println("Tuition fees " + tuitionFee);
                break;
            }

            System.out.println("Tuition fees " + tuitionFee);

        }

    }

    public void payTuition(){
        Scanner scanner = new
                Scanner(System.in);


        System.out.println("How much do you want to pay: ");
        int payment = scanner.nextInt();

        this.balanceAccount = tuitionFee - payment;
        System.out.println("you have " + balanceAccount + " to pay");

    }

}
