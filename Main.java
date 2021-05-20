public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        double bmi = calculate.calculateBmiService( 75, 1.85);
        System.out.println(bmi);



    }
}

