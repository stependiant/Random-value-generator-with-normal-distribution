import java.util.Random;

public class RandomValue {
    
    public static short randomValue(int min, int max) {
        Random random = new Random();

        short mean = (short) ((max + min) / 2);
        short stdDev = (short) ((max - min) / 5);

        double randomValue;
        do {
            randomValue = random.nextGaussian() * stdDev + mean;
        } while (randomValue <= min || randomValue >= max);

        return (short) Math.round(randomValue);
    }
}
