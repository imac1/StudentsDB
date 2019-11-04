import java.util.Scanner;

public class StudentDB {

    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        int sSchoice=0;

        System.out.println("Choose your option:\n 1. Admin\n 2. Student");
        int option = scanner.nextInt();
        Student ss = new Student();

        if (option == 1) {
            Student [] studentsNr = new Student[sSchoice];
            System.out.println("Welcome admin");
            System.out.println("How many students will you add?");
            sSchoice = scanner.nextInt();


            for (int i=0; i<sSchoice; i++) {
                studentsNr[i] = new Student();
                System.out.println(studentsNr[i].toString());
            }

            } else if (option == 2) {
            System.out.println("Welcome student");
            ss.enroll();
            ss.payTuition();
        }





scanner.close();
    }
}
