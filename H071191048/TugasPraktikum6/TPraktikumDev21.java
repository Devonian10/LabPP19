import java.util.Scanner;

public class TPraktikumDev21 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata kamu : ");
        String kata1 = input.nextLine();

        String kata2 = kata1.replaceAll(" ", "");
        String hexa = String.format("%x", kata1.length() * kata1.length());
        String oct = String.format("%o", kata1.length());
        String reverse = "";
        char letter[] = kata2.toCharArray();

        for (int i = 0; i < (kata2.length() / 2) - 1; i++) {
            reverse += letter[i];
        }

        for (int i = (kata2.length() / 2) - 1; i >= 0; i--) {
            reverse += letter[i];
        }

        System.out.println("Hasil : ");
        System.out.print("#" + hexa);
        System.out.print(reverse.toUpperCase());
        System.out.print(oct);

        if (hexa.charAt(0) >= '0' && hexa.charAt(0) <= '9') {
            System.out.print("!");
        } else {
            System.out.print("?");
        }
        input.close();
    }
}