package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create the teacher object
     * @param id teacher id unique
     * @param name teacher name
     * @param salary teacher salary
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * this will be used to se teacher salary
     * @param salary for the teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to teacher salary
     * removes from School earnings
     * @param salary is what a teacher receives.
     */
    public void receivedSalary(int salary){
        salaryEarned += salary;
        System.out.println(salaryEarned);
        School.updateExpenditure(salary);
    }
}
