package Aufgabenblock2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Gregorian2JulianApp {
    public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("F:\\Studium\\2. Semester\\Programmieren 2\\Aufgabenblock2\\daten-greg.csv");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("F:\\Studium\\2. Semester\\Programmieren 2\\Aufgabenblock2\\daten-jul.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        Stream<String> x = br.lines();
        for (Object line : x.toArray()) {
            String[] currentLine = line.toString().split("[,; ]");
            for (int i = 0; i<currentLine.length; i++) {
                if (!currentLine[i].isEmpty()){
                    LocalDate d = LocalDate.of(Integer.parseInt(currentLine[i].split("-")[0]),Integer.parseInt(currentLine[i].split("-")[1]),Integer.parseInt(currentLine[i].split("-")[2]));
                    if (i<currentLine.length-1){
                        bw.append(d.plusDays(13).toString() + ", ");
                    }
                    else {
                        bw.append(d.plusDays(13).toString());
                    }
                }
            }
            bw.newLine();
        }

        br.close();
        bw.close();
        
    }
}
