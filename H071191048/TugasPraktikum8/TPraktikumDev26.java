
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TPraktikumDev26 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nama2 = input.nextLine();
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(nama + ".txt");
            out = new FileOutputStream(nama2 + ".txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);

            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
