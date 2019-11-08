
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TPraktikumDev25 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nama2 = input.nextLine();
        
        FileReader reader = null;
        BufferedReader x = null;
        FileWriter file = null;
        BufferedWriter z = null;
        try {
            file = new FileWriter(nama2 + ".txt");
            reader = new FileReader(nama + ".txt");
            x = new BufferedReader(reader);
            z = new BufferedWriter(file);
            String s;
            int max = 0;
            while ((s = x.readLine()) != null) {
                if (s.length() > max ){
                    max = s.length();
                } 
            } 
            reader = new FileReader (nama + ".txt");
            x = new BufferedReader(reader);
            String t;
            while ((t = x.readLine()) != null) {
                z.write(String.format("%" + max + "s\n",t));
                
            }
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (x != null) {
                    x.close();
                }
                if (z != null) {
                    z.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());

            }
        }
    }
}