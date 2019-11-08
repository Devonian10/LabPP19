import java.util.Scanner;
import java.util.Random;

public class TPraktikumDev18 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial (int n, int m) {
        String jodoh = " ";
        Random input = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = input.nextInt(10);
                jodoh += x;
            }
         if (i < n - 1){
             jodoh += "-";
         }    
        }
        return jodoh;
    }
}
