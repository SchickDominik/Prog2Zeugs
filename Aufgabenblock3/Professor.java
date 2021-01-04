package Aufgabenblock3;

public class Professor extends Employee {

    private String proficiency;
    private Date dateOfBegin;
    private int age;
    private boolean isOldEnough;

    public String getProficiency() {
        return proficiency;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public Date getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(Date dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public Professor(String name, Date dateOfBirth, int salary, String proficiency, Date dateOfBegin, int age) {
        super(name, dateOfBirth, salary);
        this.proficiency = proficiency;
        this.dateOfBegin = dateOfBegin;
        this.setAge(age);
        this.setIsOldEnough();
    }

    public void setIsOldEnough() {
        final int dif_year = this.getDateOfBegin().getYear() - this.getDateOfBirth().getYear();
        final boolean dif_month = this.getDateOfBirth().getMonth() < this.getDateOfBegin().getMonth();
        final boolean dif_day = this.getDateOfBirth().getDay() <= this.getDateOfBegin().getDay();
        if (dif_year > 20 || ((dif_year == 20) && dif_month) || ((dif_year == 20) && (this.getDateOfBegin().getMonth() == this.getDateOfBirth().getMonth()) && dif_day)) {
            isOldEnough = true;
        } else {
            throw new Error("Eintrittsalter muss < 20 sein.");
        }
    }
    public boolean getIsOldEnough() {
        this.setIsOldEnough();
        return this.isOldEnough;
    }
    
}

