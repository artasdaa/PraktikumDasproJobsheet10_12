import java.util.Scanner;

public class semester1polinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array 3 responden dengan 3 pertanyaan
        int[][] nilai = new int[3][3];
        double totalKeseluruhan = 0;

        // Input nilai survei
        System.out.println("==== INPUT NILAI SURVEY KEPUASAN PELANGGAN ====");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai untuk pertanyaan ke-" + (j + 1) + " (1-5): ");
                nilai[i][j] = input.nextInt();
                totalKeseluruhan += nilai[i][j];
            }
        }
        // Menampilkan hasil survei
        System.out.println("==== HASIL SURVEY KEPUASAN PELANGGAN ====");

        // Rata-rata per responden
        System.out.println("Rata-rata per Responden:");
        for (int i = 0; i < 3; i++) {
            int totalResponden = 0;
            for (int j = 0; j < 3; j++) {
                totalResponden += nilai[i][j];
            }
            double rataResponden = (double) totalResponden / 3;
            System.out.printf("Responden ke-%d : %.2f\n", (i + 1), rataResponden);
        }

        // Rata-rata setiap pertanyaan
        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < 3; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < 3; i++) {
                totalPertanyaan += nilai[i][j];
            }
            double rataPertanyaan = (double) totalPertanyaan / 3;
            System.out.printf("Pertanyaan ke-%d : %.2f\n", (j + 1), rataPertanyaan);
        }
        // Rata-rata keseluruhan
        double rataKeseluruhan = totalKeseluruhan / (3 * 3);
        System.out.printf("\nRata-rata keseluruhan : %.2f\n", rataKeseluruhan);

    }
}