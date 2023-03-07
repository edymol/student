package school.management.system;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 20000);
        Teacher thomas = new Teacher(2, "Thomas", 19000);

        List<Teacher> teacherList = new ArrayList<>();


        teacherList.add(lizzy);
        teacherList.add(thomas);

        Student jhon =  new Student(1, "Jhon", 12);
        Student sandra = new Student(3, "Sandra", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jhon);
        studentList.add(sandra);

        School newtown = new School(teacherList, studentList);

        sandra.payFees(50000);
        System.out.println("NewTown HS has earned $" + newtown.getTotalIncome());

        lizzy.receivedSalary(lizzy.getSalary());

        System.out.println("NewTown HS has spend $" + newtown.getExpenditure()+ " in salaries and now has $"
                + newtown.getExpenditure());
    }
}