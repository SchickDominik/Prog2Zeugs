package Aufgabenblock3;

public class Student extends Person {

    private int matrNr;
    private int semester;
    
    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if (semester > 0) { //>= macht eigentlich keinen Sinn, daher nur >
            this.semester = semester;
        }
    }

    public Student(String name, Date dateOfBirth, int matrNr, int semester) {
        super(name, dateOfBirth);
        this.matrNr = matrNr;
        this.semester = semester;
    }
    
    

}
