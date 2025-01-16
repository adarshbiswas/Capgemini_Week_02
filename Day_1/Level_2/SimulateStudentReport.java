// Q.1) Create a Student class with attributes name, rollNumber, and marks. Add two methods:
//To calculate the grade based on the marks.
//To display the student's details and grade.

// Create Student class
class Student{

//    Set attributes
    public String name;
    public String rollNumber;
    public double marks;

//    Create a constructor
    Student(String name, String rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

//    Create calculateGrade method to calculate the grade based on the marks
    public String calculateGrade(){
        return switch ((int) marks) {
            case 90 -> "Grade A+";
            case 80 -> "Grade A";
            case 70 -> "Grade B+";
            case 60 -> "Grade B";
            case 50 -> "Grade C+";
            case 40 -> "Grade C";
            case 30 -> "Grade D";
            default -> "Grade F, You are failed!";
        };
    }

//    Create getStudentDetails method to get student details
    void getStudentDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student marks: " + marks);
    }

}

public class SimulateStudentReport {
    public static void main(String[] args) {

//        Create object of Student class
        Student obj = new Student("Zaahil", "0111AL21143", 29.0);

//        Call method to get student details
        obj.getStudentDetails();

//        Call method to get student's grade
       String grade =  obj.calculateGrade();
        System.out.println("The grade of " + obj.name + " is: " + grade);
    }
}
