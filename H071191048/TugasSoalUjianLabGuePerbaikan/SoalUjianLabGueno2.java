import java.util.*;

public class SoalUjianLabGueno2 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata yang kamu ingingkan = ");
        String kata = input.nextLine();
        char letter[] = kata.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            char c = letter[i];
            if (c >= 'a' && c <= 'z') {
                letter[i] -= 32;
            }
        }
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i]);
        }
        input.close();
    }
}