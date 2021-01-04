package Aufgabenblock3;

public class UniApp {
    public static void main(String[] args) {
        Date d1 = new Date(1989, 11, 29);
        Date d2 = new Date(2004, 3, 15);
        Date d3 = new Date(1998, 1, 1);

        Person p1 = new Person("Paul Paulsson", d1);
        System.out.println(p1.getDateOfBirth());
        System.out.println(p1.getName());
        p1.setName("Chris Christoffersson");
        System.out.println(p1.getName());

        Student s1 = new Student("Mick Mikkelsson", d2, 313541, 2);
        System.out.println(s1.getMatrNr());
        System.out.println(s1.getName());
        System.out.println(s1.getSemester());
        System.out.println(s1.getDateOfBirth());
        s1.setDateOfBirth(d1);
        s1.setMatrNr(321654);
        s1.setName("Obi-Wan Kenobi");
        s1.setSemester(0);
        System.out.println(s1.getMatrNr());
        System.out.println(s1.getName());
        System.out.println(s1.getSemester());
        System.out.println(s1.getDateOfBirth());
        s1.setSemester(5);
        System.out.println(s1.getSemester());

        Professor prof1 = new Professor("Hans Hanson", d3, 150, "Theoretische Informatik", Date.today(), 39);

        

        System.out.println(prof1.getName());
        System.out.println(prof1.getProficiency());
        System.out.println(prof1.getSalary());
        System.out.println("#################################");
        System.out.println(prof1.getIsOldEnough());
        System.out.println(prof1.getDateOfBirth());
        System.out.println(prof1.getDateOfBegin());
        prof1.setDateOfBirth(d2);
        System.out.println(prof1.getDateOfBirth());
        System.out.println(prof1.getIsOldEnough());
        System.out.println("#################################");
        prof1.setName("Rep Repetetiv");
        prof1.setProficiency("Wiederholungslehre");
        prof1.setSalary(2);
        System.out.println(prof1.getName());
        System.out.println(prof1.getProficiency());
        System.out.println(prof1.getSalary());
        System.out.println(prof1.getDateOfBirth());
        System.out.println(prof1.getDateOfBegin());
        prof1.setSalary(500);
        System.out.println(prof1.getSalary());
    }

}