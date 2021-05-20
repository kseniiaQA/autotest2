public class Main {
    public static void main(String[] args) {
     //   int bodyMass = 77;
      //  double bodyHeight = 1.75;
     //   double bmi;

     //  bmi = bodyMass / (bodyHeight * bodyHeight);
        BmiService calculate = new BmiService();
        double bmi = calculate.calculateBmiService( 75, 1.85);
        System.out.println(bmi);



    }
}

