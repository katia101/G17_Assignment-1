package za.ac.cput;

/*StudentClass getters and setters
 * author: ZintleZothe_216130565
 */
public class Student {
    private String studentName;
    private String studentNumber;
    private  double testMark;

    public Student( String studentName, String studentNumber,double testMark ){
        this.studentName= studentName;
        this.studentNumber= studentNumber;
        this.testMark=testMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double testMark() {
        return testMark;
    }

    public void setCourse(double testMark) {
        this.testMark =testMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", testMark=" + testMark +
                '}';
    }

    public static void main(String[] args) {
        Student s1= new Student("Namhla","217130565",90.6 );
        Student s2 = new Student("Odwa","217030565",80.9);

        System.out.println("Student details:");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

}