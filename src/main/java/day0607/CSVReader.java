package main.java.day0607;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class CSVReader {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/day0607/qwerty.csv"))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                list.add(new Student(str[0], str[1], Float.parseFloat(str[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.stream().sorted(Comparator.comparing(Student::getLastName)).forEach(x -> System.out.println(x.toString()));


    }
}
