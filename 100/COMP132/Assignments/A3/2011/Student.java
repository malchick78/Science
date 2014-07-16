
// Class to represent information for a student
public class  Student implements StudentSpecification {

  private int studentNumber; // Student number
  private String name;       // Student name
  private int year;          // Student year of commencement

  // Constructor
  public Student(int studentNumber,
                 String name,
                 int year) {
    this.studentNumber=studentNumber;
    this.name=name;
    this.year=year;
  }

  // Method for changing name
  public void setName(String name) {
    this.name=name;
  }

  // Method for changing year of commencement
  public void setYearOfCommencement(int year) {
    this.year=year;
  }

  // Method to return the student number
  public int getStudentNumber() {
    return studentNumber;
  }

  // Method to return the student name
  public String getName() {
    return name;
  }

  // Method to return the year of commencement
  public int getYearOfCommencement() {
    return year;
  }

}

