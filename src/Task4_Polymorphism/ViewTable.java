package Task4_Polymorphism;

import Task3_Inheritance.*;

import java.util.List;

public class ViewTable {

    private int width = 10;

    public ViewTable() {}

    public ViewTable(int width) {
        this.width = width;
    }

    public void displayTable(List<CalcResult> results) {

        System.out.println("----------------------");
        System.out.println("|      Result        |");
        System.out.println("----------------------");

        for (CalcResult r : results) {
            System.out.printf("| %-" + width + ".2f |\n", r.getValue());
        }

        System.out.println("----------------------");
    }

}