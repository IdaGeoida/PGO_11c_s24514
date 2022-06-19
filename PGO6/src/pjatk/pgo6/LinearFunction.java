package pjatk.pgo6;

public class LinearFunction extends Function implements Fun {

    private double a;
    private double b;

    LinearFunction(double a, double b){
        setA(a);
        setB(b);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a+=delta;
        b+=delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a-=delta;
        b-=delta;
    }

    @Override
    public double f(double x) {
        return a*x+b;
    }
}
