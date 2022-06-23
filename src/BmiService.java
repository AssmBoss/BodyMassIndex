public class BmiService {
    public double calculate(double rost, double ves) {
        double bmi = ves / Math.pow(rost / 100, 2);
        return bmi;
    }
}
