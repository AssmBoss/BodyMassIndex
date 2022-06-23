public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 170; // В САНТИМЕТРАХ!
        int weight = 100;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);
    }
}
