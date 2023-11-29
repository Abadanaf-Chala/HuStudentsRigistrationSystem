
//this is a class contains main method
import java.util.Scanner;
public class StudentsRegistrationPortal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String sex;
        int age;
        String department;
        int academicYear;
        String currentSemester;
        double gpa;
        System.out.println();
        System.out.println("  WELCOME TO HARAMAYA UNIVERSITY STUDENT'S REGISTRATION PORTAL!");
        System.out.println("\t********* BY ABDINAF *****************");

        while (true) {
            System.out.println("Enter your first name:");
            firstName = scanner.nextLine();

            if (isValidName(firstName)) {
                break;
            }
            else {
                System.out.println("This name doesn't exist. Please Re-enter.");
            }
        }

        while (true) {
            System.out.println("Enter your last name:");
            lastName = scanner.nextLine();

            if (isValidName(lastName)) {
                break;
            }
            else {
                System.out.println("This name doesn't exist. Please try again.");
            }
        }

        while (true) {
            System.out.println("Enter your sex:");
            sex = scanner.nextLine().toLowerCase();

            if (isValidSex(sex)) {
                break;
            }
            else {
                System.out.println("Invalid sex. Please Enter male(M) or female(F).");
            }
        }

        while (true) {
            System.out.println("Enter your age:");
            String ageStr = scanner.nextLine();

            if (isValidAge(ageStr)) {
                age = Integer.parseInt(ageStr);
                break;
            }
            else {
                System.out.println("your age should be(18-50) . Please Re-enter!.");
            }
        }

        while (true) {
            System.out.println("Enter your department:");
            department = scanner.nextLine();

            if (isValidName(department)) {
                break;
            }
            else {
                System.out.println("There is no such department in our university. Please try again.");
            }
        }

        while (true) {
            System.out.println("Enter your academic year:");
            String academicYearStr = scanner.nextLine();

            if (isValidAcademicYear(academicYearStr)) {
                academicYear = Integer.parseInt(academicYearStr);
                break;
            }
            else {
                System.out.println("Academic year should be between 1 and 7 . Please try again.");
            }
        }

        while (true) {
            System.out.println("Enter your current semester:");
            currentSemester = scanner.nextLine().toLowerCase();

            if (isValidSemester(currentSemester)) {
                break;
            }
            else {
                System.out.println("Semester should be(1,2,i or ii). Please try again.");
            }
        }

        while (true) {
            System.out.println("Enter your GPA:");
            String gpaStr = scanner.nextLine();

            if (isValidGpa(gpaStr)) {
                gpa = Double.parseDouble(gpaStr);
                break;
            }
            else {
                System.out.println("Your GPA must be (2.00-4.00). Please re-enter.");
            }
        }

        Student student = new Student(firstName, lastName, sex, age, department,
                academicYear, currentSemester, gpa);
        System.out.println("\tThese are all about the required informations!");
        System.out.println("\t   Choice one of the following options!");

        boolean logIn = true;

        while (logIn) {
            System.out.println("---------------------");
            System.out.println("1. View Profile");
            System.out.println("2. Re-enter Information");
            System.out.println("3. Submit");
            System.out.println("---------------------");
            System.out.println("Enter your choice:");

            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    viewProfile(student);
                    break;
                case "2":
                    student = reenterInformation();
                    main(args);
                    break;

                case "3":
                    System.out.println("\tCONGRATULATIONS!!");
                    System.out.println("You have successfully REGISTERED for this semester!!");
                    System.out.println("\t Take your slip from your department head office!!");

                    logIn=false;
                    break;

                default:
                    System.out.println(" Invalid option!. Please Re-enter 1,2 or 3.");
            }
        }
        System.out.println("\n Enter #1 to register another student or any key to LOGOUT");
        String register = scanner.nextLine();
        if (register.equals("1")) {
            main(args);
        } else {

            System.out.println("Please put your comment for ABDINAF!!");
            String comment;
            Scanner in = new Scanner(System.in);
            comment = in.nextLine();
            System.out.println("  Thank you for your comment, " + comment);
            System.out.println("        I will improve my limitation!");
            System.out.println(" .....You are LOGGED OUT!!");
        }
    }

    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+") && name.length() > 1;
    }

    private static boolean isValidSex(String sex) {
        return sex.equals("male") || sex.equals("female") || sex.equals("m") || sex.equals("f") || sex.equals("M") || sex.equals("F");
    }

    private static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18 && age <= 50;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidAcademicYear(String academicYearStr) {
        try {
            int academicYear = Integer.parseInt(academicYearStr);
            return academicYear >= 1 && academicYear <= 7;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidSemester(String semester) {
        return semester.equals("1") || semester.equals("2") || semester.equals("i") || semester.equals("ii") || semester.equals("I") || semester.equals("II");
    }

    private static boolean isValidGpa(String gpaStr) {
        try {
            double gpa = Double.parseDouble(gpaStr);
            return gpa >= 2.00 && gpa <= 4.00;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void viewProfile(Student student) {
        System.out.println();
        System.out.println("         This is all about your profile");
        System.out.println("--------------------------------------------");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("--------------------------------------------");
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("--------------------------------------------");
        System.out.println("Sex: " + student.getSex());
        System.out.println("--------------------------------------------");
        System.out.println("Age: " + student.getAge());
        System.out.println("--------------------------------------------");
        System.out.println("Department: " + student.getDepartment());
        System.out.println("--------------------------------------------");
        System.out.println("Academic Year: " + student.getAcademicYear());
        System.out.println("--------------------------------------------");
        System.out.println("Current Semester: " + student.getCurrentSemester());
        System.out.println("--------------------------------------------");
        System.out.println("GPA: " + student.getGpa());
        System.out.println("---------------------------------------------");

    }
    private static Student reenterInformation() {
        System.out.println("Re-entering information...");
        return new Student("", "", "", 0, "", 0, "", 0.0);
    }
}
