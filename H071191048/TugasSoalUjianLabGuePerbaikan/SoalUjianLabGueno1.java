import java.util.*;

public class SoalUjianLabGueno1 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);

        // input matriks 1
        System.out.println("Matriks 1 : ");
        System.out.print("Jumlas baris ==> ");
        int a = input.nextInt();
        System.out.print("Jumlas kolom ==> ");
        int b = input.nextInt();
        int matriks_1[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matriks_1[i][j] = input.nextInt();
            }
        }

        // input matriks 2
        System.out.println("Matriks 2 : ");
        System.out.print("Jumlah baris ==> ");
        int c = input.nextInt();
        System.out.print("Jumlas kolom ==> ");
        int d = input.nextInt();
        int matriks_2[][] = new int[c][d];
        input.nextLine();

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                matriks_2[i][j] = input.nextInt();
            }
        }

        // input matrix 3
        System.out.println("Matriks 3 : ");
        System.out.print("Jumlah baris ==> ");
        int e = input.nextInt();
        System.out.print("Jumlas kolom ==> ");
        int f = input.nextInt();
        int matriks_3[][] = new int[e][f];
        input.nextLine();

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < f; j++) {
                matriks_3[i][j] = input.nextInt();
            }
        }

        System.out.println("-----------------");
        // conditioning matriks 1 & 2
        if (b != c) {
            System.out.println("Matriks 1 X Matriks 2 ?");
            System.out.println("Kedua Matriks tidak dapat dikalikan");
        } else if (b == c) {
            int result_12[][] = new int[a][d];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    int z = 0;
                    for (int k = 0; k < b; k++) {
                        z += matriks_1[i][k] * matriks_2[k][j];
                    }
                    result_12[i][j] = z;
                }
            }
            System.out.println("Matriks 1 X Matriks 2 ?");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.print(result_12[i][j] + " ");
                }
                System.out.println();
            }
        }

        // conditioning matrix 1 & 3
        if (b != e) {
            System.out.println("Matriks 1 X Matriks 3 ?");
            System.out.println("Kedua Matriks tidak dapat dikalikan");
        } else if (b == e) {
            int result_13[][] = new int[a][f];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < f; j++) {
                    int z = 0;
                    for (int k = 0; k < b; k++) {
                        z += matriks_1[i][k] * matriks_3[k][j];
                    }
                    result_13[i][j] = z;
                }
            }
            System.out.println("Matriks 1 X Matriks 3 ?");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < f; j++) {
                    System.out.print(result_13[i][j] + " ");
                }
                System.out.println();
            }
        }
        // conditioning matriks 2 & 3
        if (d != e) {
            System.out.println("Matriks 2 X Matriks 3 ?");
            System.out.println("Kedua Matriks tidak dapat dikalikan");
        } else if (d == e) {
            int result_23[][] = new int[c][f];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < f; j++) {
                    int z = 0;
                    for (int k = 0; k < d; k++) {
                        z += matriks_2[i][k] * matriks_3[k][j];
                    }
                    result_23[i][j] = z;
                }
            }
            System.out.println("Matriks 2 X Matriks 3 ?");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < f; j++) {
                    System.out.print(result_23[i][j] + " ");
                }
                System.out.println();
            }
        }
        // conditioning matrix 3 & 2
        if (f != c) {
            System.out.println("Matriks 3 X Matriks 2 ?");
            System.out.println("Kedua Matriks tidak dapat dikalikan");
        } else if (f == c) {
            int result_32[][] = new int[e][d];
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < d; j++) {
                    int z = 0;
                    for (int k = 0; k < f; k++) {
                        z += matriks_3[i][k] * matriks_2[k][j];
                    }
                    result_32[i][j] = z;
                }
            }
            System.out.println("Matriks 3 X Matriks 2 ?");
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.print(result_32[i][j] + " ");
                }
                System.out.println();
            }
        }
        // conditioning matrix 3 & 1
        if (f != a) {
            System.out.println("Matriks 3 X Matriks 1 ?");
            System.out.println("Kedua Matriks tidak dapat dikalikan");
        } else if (f == a) {
            int result_13[][] = new int[e][b];
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < b; j++) {
                    int z = 0;
                    for (int k = 0; k < f; k++) {
                        z += matriks_3[i][k] * matriks_1[k][j];
                    }
                    result_13[i][j] = z;
                }
            }
            System.out.println("Matriks 3 X Matriks 1 ?");
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(result_13[i][j] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
}