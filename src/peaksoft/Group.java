package peaksoft;

import java.time.LocalDate;
import java.util.Arrays;

public class Group extends Student {
    private String[] students;
    private String course;
    private LocalDate startDate;

    public Group() {
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    //    public void setValues(String[] students, String course, LocalDate startDate,
//                          LocalDate birthday, String name, String lastName, String email, byte age) {
//        this.students = students;
//        this.course = course;
//        this.startDate = startDate;
//        super.age = age;
//        super.birthday = birthday;
//        super.email = email;
//        super.lastName = lastName;
//        super.name = name;
//}

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", course='" + course + '\'' +
                ", startDate=" + startDate +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
