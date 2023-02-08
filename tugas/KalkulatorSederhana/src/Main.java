import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);

            System.out.println("=== Kalkulator Sederhana ===\n");
            System.out.println(" ^ Menu");
            System.out.println("1. Penjumlahan \n2. Pengurangan \n3. Perkalian \n4. Pembagian \n5. Sisa bagi (modulus)\n");

            System.out.print("Masukan pilihan anda  : ");
            int choice = input.nextInt();
            System.out.print("\nMasukan angka pertama : ");
            double num1 = input.nextDouble();
            System.out.print("Masukan angka kedua   : ");
            double num2 = input.nextDouble();
            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                case 5:
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    return;
            }
            System.out.println("\nHasil nya adalah      : " + result);
            PrintWriter output = new PrintWriter(new FileWriter("result.txt"));
            output.println(result);
            output.close();
        }
}