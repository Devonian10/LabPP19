import java.util.Scanner;

public class TPraktikumDev19 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(fpb(n, m));
    }

    static int fpb(int n, int m) {
        int fpb = 0;
        for (int i = Math.min(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                fpb = i;
                break;

            }

        }
        return fpb;
    }

}