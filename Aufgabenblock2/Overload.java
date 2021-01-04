package Aufgabenblock2;

public class Overload {

    private String name;

    public Overload(String name) {
        this.name = name;
    }
    public Overload(Overload other){
        this.name = other.name;
    }

    public void print(){
        System.out.println("Mein Name ist: " + this.name);
    }

    public void print(String message) {
        System.out.println(this.name + " sagt: " + message);
    }
    
}