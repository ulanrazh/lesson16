package peaksoft;

import java.util.Arrays;

public class Course extends Student {
    private String courseName;
    private byte courseNumber;
    private String mentorName;
    private String[] groups; // there should've Group[] groups update getters & setters & toString();

    public Course() {
    }

    //all-arg constructors
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public byte getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(byte courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber=" + courseNumber +
                ", mentorName='" + mentorName + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}


