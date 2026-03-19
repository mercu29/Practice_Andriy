package Task3_Inheritance;

public class SimpleResultFactory implements ResultFactory {

    @Override
    public CalcResult createResult(double value) {
        return new CalcResult(value);
    }

}