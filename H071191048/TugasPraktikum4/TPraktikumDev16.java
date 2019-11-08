import java.util.Scanner;
public class TPraktikumDev16 {
    public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int [][] matriks_A = new int [a][b];
    int [][] matriks_B = new int [b][c];
    int [][] matriks_C = new int [a][c];
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            matriks_A[i][j] = input.nextInt();
        }
    }
    for (int j = 0; j < b; j++ ){
        for (int i = 0; i < c; i++){
            matriks_B[j][i] = input.nextInt();
        }
    }
    for (int i = 0; i < a; i++ ){
        for (int j = 0; j < c;j++){
            int x = 0;
            for (int k = 0; k < b; k++){
                x += matriks_A [i][k] * matriks_B [k][j];
                
            }
            matriks_C[i][j] = x;
        }
    }
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < c; j++) {
        System.out.println(matriks_C[i][j] + " ");            
        }
    }
    }
}