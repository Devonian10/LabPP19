import java.util.*;

public class SoalUjianLabGueno3 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka input berapa yang kamu inginkan = ");
        int n = input.nextInt();
        int o = 0;
        int p = 0;

        int matriks[][] = new int[n][n];

        // input element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = input.nextInt();
            }
        }
        // segitiga atas
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriks[i][j] != 0) {
                    o++;
                }
            }
        }

        // segitiga bawah
        // membalik matriks untuk di cek dengan posisi yang sama
        // dengan segitiga atas
        // dengan cara transpose > balik 180 > transpose > balik 180
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int t = matriks[i][j];
                matriks[i][j] = matriks[j][i];
                matriks[j][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int t = matriks[j][i];
                matriks[j][i] = matriks[k][i];
                matriks[k][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int t = matriks[i][j];
                matriks[i][j] = matriks[j][i];
                matriks[j][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int t = matriks[j][i];
                matriks[j][i] = matriks[k][i];
                matriks[k][i] = t;
            }
        }

        // pengecekan matriks segitiga bawah
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriks[i][j] != 0) {
                    p++;
                }
            }
        }

        System.out.println("-------");
        if (o != 0 && p != 0) {
            System.out.println("Bukan matriks segitiga atas atau bawah");
        } else if (o == 0) {
            System.out.println("Matriks segitiga atas");
        } else if (p == 0) {
            System.out.println("Matriks segitiga bawah");
        }
        input.close();
    }
}