package Task4_Polymorphism;

import Task3_Inheritance.*;

public class ViewableTable extends SimpleResultFactory {

    @Override
    public CalcResult createResult(double value) {
        return new CalcResult(value);
    }

}