public class ObjectReferenceApp {

    public static void main(String[] args) {
        byte numberOfSeats = 5;
        short horsePower = 392;
        int price = 14999;
        long registrationNumber = 23324245234L;

        float fuelConsumptionCombined = 15.5F;
        double fuelConsumptionPrecise = 15.134234234;

        boolean isDamaged = true;
        char energyEfficiencyCategory = 'G';

        String carModel = "Dodge Challenger SRT 392";
        String carModelNew = new String("Dodge Challenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsePower);
        System.out.println("Price: $" + (float) price);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined);
        System.out.println("Precise fuel consumption: " + (int) fuelConsumptionPrecise);
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("The car model: " + carModel);
        System.out.println("The car model with uppercase: " + carModel.toUpperCase());
        System.out.println("The car model with lowercase: " + carModel.toLowerCase());
        System.out.println("Car model and car model with new keyword are equal: " + carModel.equals(carModelNew));
        System.out.println("The car model with new keyword: " + carModelNew);
    }
}
