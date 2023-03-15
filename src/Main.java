public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        int Bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(Bmi);
        
    }
}