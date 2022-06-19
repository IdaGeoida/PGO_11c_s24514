package pjatk.pgo6;

public class AbsoluteLinearFunction extends LinearFunction implements Fun {

    AbsoluteLinearFunction(double a, double b){
        super(a,b);
    }

    @Override
    public double f(double x) {
        return Math.abs(super.f(x));
    }

}
