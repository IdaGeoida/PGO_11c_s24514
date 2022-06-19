package pjatk.pgo6;

public interface Fun {

    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        double min = a;
        double temp = a;
        if( a > b ){
            throw new RuntimeException("Value a is greater than value b");
        }
        else{
            while ( b >= temp ){
                temp+=alpha;
                if (func.f(temp) < func.f(min)){
                    min = temp;
                }
            }
        }
        return func.f(min);
    }

}
