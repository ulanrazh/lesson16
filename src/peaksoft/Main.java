package peaksoft;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setBirthday(LocalDate.of(1989,2,20));
        student.setName("Ulan");
        student.setLastName("Razhapov");
        student.setEmail("ulanrazhapov@gmail.com");
        student.setAge(student.getAge());

        System.out.println(student);

        Group group = new Group();
        group.setBirthday(LocalDate.of(1996,5,25));
        group.setName("Mirbek");
        group.setLastName("Nurbelovich");
        group.setEmail("tg@gmail.com");
        group.setAge(student.getAge());
        group.setStudents(new String[] {"Ulan","Nurlan","Bekzhan"});
        group.setStartDate(LocalDate.of(2022,1,5));
        group.setCourse("Java5");

        System.out.println(group);

        Course course = new Course();
        course.setName("Jalil");
        course.setLastName("Amirovich");
        course.setBirthday(LocalDate.of(1994,6,6));
        course.setEmail("star@gmail.com");
        course.setAge(student.getAge());
        course.setCourseName("Java");
        course.setCourseNumber((byte) 5);
        course.setMentorName("Muhammed");
        course.setGroups(new String[] {"Java4","Java5","JS5"});

        System.out.println(course);






    }
}
