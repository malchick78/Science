import java.util.*;

// Class to hold a collection of student records
public class StudentRecords implements StudentRecordsSpecification {

  // Map for holding records and providing fast lookup by student number
  private Map<Integer, Student> students = new TreeMap<Integer, Student>();

  // Student records are also held in this sorted set in order of
  // year of commencement and then by alphabetical name order
  private SortedSet<Student> orderedStudents = new TreeSet<Student>(new StudentOrder());

  // Add a student
  public void addStudent(Student student) throws DuplicateStudentNumber {
    // Check if student with same number is already there
    int num=student.getStudentNumber();
    Student check=students.get(num);
    if (check!=null)
      throw new DuplicateStudentNumber("Student with number "+num+" already in records");
    // Put student record into both collections
    students.put(num, student);
    orderedStudents.add(student);
  }

  // Remove student; return false if not there
  public boolean removeStudent(int studentNumber) {
    // Check whether student with this number is there
    Student check=students.get(studentNumber);
    if (check==null) return false;
    // Remove record from both collections
    students.remove(studentNumber);
    orderedStudents.remove(studentNumber);
    return true;
  }

  // Get the name of the student with this number; return null if no such
  public String getName(int studentNumber) {
    // Retrieve from map
    Student student=students.get(studentNumber);
    if (student==null) {
      return null;
    }
    else {
      return student.getName();
    }
  }

  // Get the year of the student with this number; return zero if no such
  public int getYearOfCommencement(int studentNumber) {
    // Retrieve from map
    Student student=students.get(studentNumber);
    if (student==null) {
      return 0;
    }
    else {
      return student.getYearOfCommencement();
    }
  }

  // Return an iterator for traversing the collection in the
  // order of the sorted set
  public Iterator<Integer> iterator() {
    return new StudentIterator(orderedStudents);
  }

  // Main method for testing
  public static void main(String[] arg) {
    StudentRecords s=new StudentRecords();
    s.addStudent(new Student(123, "Fran", 2009));
    s.addStudent(new Student(465, "Bernard", 2008));
    s.addStudent(new Student(222, "Manny", 2008));

    System.out.println(s.getName(222));
    System.out.println(s.getYearOfCommencement(123));

    for (Integer i : s) System.out.println(s.getName(i));

    // This should cause an exception
    try {
      s.addStudent(new Student(465, "Zoe", 2011));
    } catch (DuplicateStudentNumber e) {
      System.out.println("The program was going to crash but I saved it.");
    }
  }

}

// Iterator for providing the student numbers of the student records
// in the order held by the sorted set
class StudentIterator implements Iterator<Integer> {
  private Iterator<Student> it;

  // Create an iterator by using the sorted set iterator
  public StudentIterator(SortedSet<Student> students) {
    it=students.iterator();
  }

  // Any records left?
  public boolean hasNext() {
    return it.hasNext();
  }

  // Return the student number of the next record
  public Integer next() {
    return it.next().getStudentNumber();
  }

  // Not required
  public void remove() {};
}

// Comparator class for maintaining the required order in the sorted set
class StudentOrder implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    if (s1.getYearOfCommencement()<s2.getYearOfCommencement()) {
      return -1;
    }
    else
    if (s1.getYearOfCommencement()>s2.getYearOfCommencement()) {
      return 1;
    }
    else
      return s1.getName().compareTo(s2.getName());
  }
}

