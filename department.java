import java.util.Vector;


public class Department {
private String name; // the name of school “Dept of Computing and Info Science.”
private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
Vector<Course> courseList; // all courses offered by the department
Vector<Student> registerList; // all students taking courses in the department.

public String getName() {
return name;
}

public String getId() {
return id;
}

public Department(String name, String id) {
// also initialize the vectors
this.name = name;
this.id = id;
courseList = new Vector<>();
registerList = new Vector<>();
}

// adding course to the courseList of the dept.
public void offerCourse(Course course) {
courseList.add(course);
}

// printing all the courses offered by the dept. using Course's toString() method
public void printCoursesOffered() {
for (Course course : courseList) {
course.toString();
}
}

// printing all the students in the dept. using Student's toString() method
public void printStudentsByName() {
for (Student student : registerList) {
student.toString();
}
}

// checking if the given student is registered using Vector.contains() method
public boolean isStudentRegistered(Student student) {
return registerList.contains(student);
}

// returning all the students registered in the given course using the course number(not code)
public Vector<Student> studentsRegisteredInCourse(int number) {
for (Course course : courseList) {
if (course.getNumber() == number)
return course.classList;
}
// if no student is registered, returning null
return null;
}

// printing students registered in a course using the course number(not code)
public void printStudentsRegisteredInCourse(int number) {
// if there are no students registered in the given course, printing None
if (studentsRegisteredInCourse(number).isEmpty()) {
System.out.println("None");
return;
}
  
for (Student student : studentsRegisteredInCourse(number)) {
System.out.println(student.getId() + ", " + student.getName());
}
}

// returning the course with highest number of students
public Course largestCourse() {
// variable to store the max number of students
int max = 0;
// variable to store the course with highest number of students
Course largCourse = new Course();
for (Course course : courseList) {
if (course.classList.size() > max) {
// if the current course has more students than max
max = course.classList.size();
largCourse = course;
}
}
return largCourse;
}

public String toString() {
// returns a string representation of department name, number
// of courses offered and number of students registered in the
// department. Use the format:
// ECSE: 53 courses, 460 students
return id + ": " + String.valueOf(courseList.size()) + " courses, " + String.valueOf(registerList.size()) + " students";
}
}
