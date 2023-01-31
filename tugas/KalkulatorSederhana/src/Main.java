import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);

            System.out.println("== Kalkulator Sederhana ==\n");
            System.out.println(" ^ Menu");
            System.out.println("1. Penjumlahan \n2. Pengurangan \n3. Perkalian \n4. Pembagian \n5. Sisa bagi (modulus)\n0. Exit");

            System.out.print("\nMasukkan kode angka diatas : ");
            int choice = input.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    System.out.println("\n^ Penjumlahan");
                    System.out.print("Masukkan angka pertama     : ");
                    double num1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua       : ");
                    double num2 = input.nextDouble();
                    result = num1 + num2;
                    System.out.println("Hasil                      : " + result);
                    break;

                case 2:
                    System.out.println("\n^ Pengurangan");
                    System.out.print("Masukkan angka pertama     : ");
                    double num3 = input.nextDouble();
                    System.out.print("Masukkan angka kedua       : ");
                    double num4 = input.nextDouble();
                    result = num3 - num4;
                    System.out.println("Hasil                      : " + result);
                    break;

                case 3:
                    System.out.println("\n^ Perkalian");
                    System.out.print("Masukkan angka pertama     : ");
                    double num5 = input.nextDouble();
                    System.out.print("Masukkan angka kedua       : ");
                    double num6 = input.nextDouble();
                    result = num5 * num6;
                    System.out.println("Hasil                      : " + result);
                    break;

                case 4:
                    System.out.println("\n^ Pembagian");
                    System.out.print("Masukkan angka pertama     : ");
                    double num7 = input.nextDouble();
                    System.out.print("Masukkan angka kedua       : ");
                    double num8 = input.nextDouble();
                    result = num7 / num8;
                    System.out.println("Hasil                      : " + result);
                    break;

                case 5:
                    System.out.println("\n^ Sisa bagi (modulus)");
                    System.out.print("Masukkan angka pertama     : ");
                    double num9 = input.nextDouble();
                    System.out.print("Masukkan angka kedua       : ");
                    double num10 = input.nextDouble();
                    result = num9 % num10;
                    System.out.println("Hasil                      : " + result);
                    break;

                case 0:
                    System.out.println("\nAnda telah keluar dari program.");
                    break;

                default:
                    System.out.println("\nKode yang anda masukan salah!");
                    return;
            }

            PrintWriter output = new PrintWriter(new FileWriter("result.txt"));
            output.println(result);
            output.close();

        }
}