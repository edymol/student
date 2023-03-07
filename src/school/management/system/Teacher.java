package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

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
}
