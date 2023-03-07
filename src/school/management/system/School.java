package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * A school can have many teachers and students
 * ArrayList is the best way to account for all students and teachers
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalIncome;
    private static int expenditure;

    /**
     * School object created
     * @param teachers number of teachers
     * @param students number of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalIncome  = 0;
        expenditure = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Takes teachers from Teacher Class and adds to school
     * @param teacher to be added to school
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    /**
     * This is to total income adding the partiol payments
     * @param income is what is currently incoming.
     */
    public static void updateTotalIncome(int income) {
        totalIncome += income;
    }

    public int getExpenditure() {
        return expenditure;
    }

    /**
     * Updates money school pays to teachers
     * @param salary is the salary of a teacher
     * */
    public static void updateExpenditure(int salary) {
        expenditure -= salary;
        System.out.println(expenditure);
    }
}
