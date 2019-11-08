import java.util.Scanner;

public class TPraktikumDev14 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Jodohku");
            return;

        }
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }
        for (int x : data) {
            if (x % 2 == 0) {
                System.out.print(x + " genap ");
            } else if (x > 0) {
                System.out.print(x + " ganjil ");
            }

        }
        System.out.println();
    }
}