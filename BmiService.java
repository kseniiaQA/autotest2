public class BmiService {
    public double calculateBmiService (int bodyMass, double bodyHeight) {
        double bmi;
        bmi = bodyMass / (bodyHeight * bodyHeight);
        return bmi;
    }
}

