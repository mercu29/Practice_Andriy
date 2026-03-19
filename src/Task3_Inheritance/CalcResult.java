package Task3_Inheritance;

import java.io.Serializable;

public class CalcResult implements Displayable, Serializable {

    private double value;

    public CalcResult(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void display() {
        System.out.println("Result: " + value);
    }
}