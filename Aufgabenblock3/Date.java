package Aufgabenblock3;

import java.time.LocalDate;

public class Date {
    
    private int day = 01;
    private int month = 01;
    private int year = 1900;
    private int[] longMonth = new int[] {1, 3, 5, 6, 8, 10, 12};
    private int[] shortMonth = new int[] {4,7,9,11};

    public Date() {
    }
    public Date(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static Date today() {
        Date today = new Date(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth()); 
        return today;
    }

    @Override
    public String toString() {
        return Integer.toString(this.getYear()) + "-" + Integer.toString(this.getMonth()) + "-" + Integer.toString(this.getDay());
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDate(int year, int month, int day){
        if (year > 0) {
            this.setYear(year);
        }
        if (month > 0 && month < 12) {
            this.setMonth(month);
        }

        if (this.getMonth() == 2){
            if (day > 0 && day < 29) {
                this.setDay(day);
            }
            else {
                System.out.println("Ungültiger Tag");
            }
        }
        for (int i : longMonth) {
            if (this.getMonth() == i) {
                if (day > 0 && day <= 31) {
                    this.setDay(day);
                }
                else {
                    System.out.println("Ungültiger Tag");
                }
            }
        }
        for (int i : shortMonth) {
            if (this.getMonth() == i) {
                if (day > 0 && day <= 30) {
                    this.setDay(day);
                }
                else {
                    System.out.println("Ungültiger Tag");
                }
            }
        }
    }
}