import java.util.Scanner;

public class TPraktikumDev20 {
  public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    myDay(a);

  }

  static void myDay(int b) {
    int tahun = b / 365;
    b = b % 365;
    int bulan = b / 30;
    b = b % 30;
    int hari = b;
    System.out.println(tahun + " tahun ");
    System.out.println(bulan + " bulan ");
    System.out.println(hari + " hari ");
  }

}