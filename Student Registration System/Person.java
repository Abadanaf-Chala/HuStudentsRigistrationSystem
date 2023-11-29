
/*This is java Student's Registration portal project
The program asks the students to enter their profile, view the entered information
Re-enter if there is wrong entered. and finally submit.
it also give an option to register another student or logout from the system.
but, you have to give your suggestion for the programmer(ABDINAF) before you logout.
                   NAME: ABADANAF CHALA
                   ID: 1848/14
                   DEP'T: SWE
                   SECTION: A
*/

class Person {
    private String firstName;
    private String lastName;
    private String sex;

    // super class constructor
    public Person(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    // getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }
}

// subclass Student extends superclass person
class Student extends Person {
    private int age;
    private String department;
    private int academicYear;
    private String currentSemester;
    private double gpa;

    // subclass constructor
    public Student(String firstName, String lastName, String sex, int age, String department,
                   int academicYear, String currentSemester, double gpa)
    {
        super(firstName, lastName, sex);
        this.age = age;
        this.department = department;
        this.academicYear = academicYear;
        this.currentSemester = currentSemester;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public double getGpa() {
        return gpa;
    }
}
