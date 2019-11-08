import java.util.Scanner;
public class TPraktikumDev15 {
    public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int [] m = new int [n];
    for (int i = 0; i < m.length; i++) {
         m[i] = input.nextInt();
    } 
    for (int i = 0; i < m.length; i++){
        for (int j = 0; j < m.length; j++) {
        if (fpb(m[i], m[j]) == 1){
            int fpb = 0;
            System.out.println(m[i] + " " + m[j]);
        } 
    }
}
    }
    public static int fpb(int n, int m) {
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
            
    

