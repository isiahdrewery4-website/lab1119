import java.util.Random;
public class TemperatureGenerator {
    public static void main(String[] args) {
// Check whether the number of readings was provided
        if (args.length != 1) {
            System.err.println(
                    "Usage: java TemperatureGenerator <number_of_readings>"
            );
            return;
        }
        int numberOfReadings;
// Convert the command-line argument to an integer
        try {
            numberOfReadings = Integer.parseInt(args[0]);
            if (numberOfReadings <= 0) {
                System.err.println(
                        "Error: Enter a positive number of readings."
                );
                return;
            }
        } catch (NumberFormatException e) {
            System.err.println(
                    "Error: Please enter a valid integer."
            );
            return;
        }
// Create a Random object
        Random random = new Random();
// Generate the specified number of temperature readings
        for (int i = 1; i <= numberOfReadings; i++) {
// Generate a random temperature between 15 and 40 inclusive
            int temperature = random.nextInt(26) + 15;
// Display each temperature on a separate line
            System.out.println(temperature + "°C");
        }
    }
}
