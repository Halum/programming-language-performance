import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class JavaPrime {
    private static final int RUN_TIME = 5; // seconds
    private static final String OUTPUT_FILE = "output/perf_data.csv";

    public static void main(String[] args) {
        double tStart = System.currentTimeMillis();
        int calculations = 1;
        double totalTime = 0;

        while (true) {
            boolean prime = isPrime(calculations);
            calculations++;
            totalTime = (System.currentTimeMillis() - tStart) / 1000.0;

            if (totalTime > RUN_TIME) {
                break;
            }
        }

        savePerfData(calculations, totalTime);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void savePerfData(int calculations, double totalTime) {
        boolean fileExists = new File(OUTPUT_FILE).exists();
        try (PrintWriter writer = new PrintWriter(new FileWriter(OUTPUT_FILE, true))) {
            if (!fileExists) {
                writer.println("language,calculation,time");
            }
            writer.printf("Java,%d,%.6f%n", calculations, totalTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}