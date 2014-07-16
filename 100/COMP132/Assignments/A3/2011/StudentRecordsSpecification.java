import java.util.Iterator;

// Interface type for a collection of student records
interface StudentRecordsSpecification extends Iterable<Integer> {

  // Constructor: create with zero records
  // public StudentRecords();

  // Add a student to the records
  // Throw an exception if there is already a student with the
  // same student number
  void addStudent(Student student) throws DuplicateStudentNumber;

  // Remove the student with this student number
  // Return 'false' if no such student
  boolean removeStudent(int studentNumber);

  // Get the name of the student with this student number
  // Return null if no such student
  String getName(int studentNumber);

  // Get the year of commencement of the student with this student number
  // Return zero if no such student
  int getYearOfCommencement(int studentNumber);

  // Return an iterator which iterates through the student numbers of
  // all of the students.
  // The order should be by increasing year of commencement and if several
  // students have the same year of commencement then in alphabetic
  // order of their names.
  // This method is declared in the interface type 'Iterable'.
  
  // Iterator<Integer> iterator();

}

// Exception class for duplicate records
class DuplicateStudentNumber extends Exception {
  public DuplicateStudentNumber(String message) { super(message); }
}
