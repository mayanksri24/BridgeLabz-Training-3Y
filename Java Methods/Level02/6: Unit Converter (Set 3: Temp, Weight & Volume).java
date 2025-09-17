public class UnitConverter3 {
    public static double convertFtoC(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double convertCtoF(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100 F = " + convertFtoC(100) + " C");
        System.out.println("50 kg = " + convertKgToPounds(50) + " pounds");
    }
}
