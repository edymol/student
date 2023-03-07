package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    /**
     * Create and initialize Student object
     *
     * @param id    unique to student
     * @param name  for student
     * @param grade for student
     */
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        totalFees = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // student names or id are not editable

    /**
     * this will update the student's grade
     *
     * @param grade updated grade of student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * This will be used to track student fees paid
     *
     * @param fees the fees student has paid
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalIncome(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return totalFees - feesPaid;
    }
}
