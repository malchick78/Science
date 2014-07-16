// Interface type for a student record with student number, name
// and year of commencement
interface StudentSpecification {

  // Constructor
  // public Student(int studentNumber, String name, int year);

  // Change the name of the student
  void setName(String name);

  // Change the year of commencement
  void setYearOfCommencement(int year);

  // Get the student number of a student
  int getStudentNumber();

  // Get the name
  String getName();

  // Get the year of commencement
  int getYearOfCommencement();
}

