import java.util.Scanner;
import java.util.Arrays;

public class SIAKAD12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];
        
        System.out.println("==========================================");
        System.out.println("       INPUT NILAI SIAKAD (4 SISWA)       ");
        System.out.println("==========================================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1) + ")");
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " (MK" + (j+1) + "): ");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- Data Nilai yang Sudah Diinput (Siswa x Mata Kuliah) ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa " + (i + 1) + ": " + Arrays.toString(nilai[i]));
        }
        
        System.out.println("\n==========================================");
        System.out.println("         HITUNG RATA-RATA SISWA           ");
        System.out.println("==========================================");
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            
            System.out.println("\nMenghitung nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j]; 
            }
            
            double rataRata = totalPerSiswa / 3.0; 
            
            System.out.println("Total Nilai: " + totalPerSiswa);
            System.out.printf("Nilai Rata-rata: %.2f\n", rataRata);
        }
        
        System.out.println("\n==========================================");
        System.out.println("        HITUNG RATA-RATA MATA KULIAH      ");
        System.out.println("==========================================");
        
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j]; 
            }
            
            double rataRataMatkul = totalPerMatkul / 4.0; 
            String namaMatkul = switch (j) {
                case 0 -> "Dasar Pemrograman";
                case 1 -> "Matematika";
                case 2 -> "CTPS";
                default -> "Matkul Lain";
            };
            
            System.out.printf("Rata-rata Nilai Matkul %d (%s): %.2f\n", (j + 1), namaMatkul, rataRataMatkul);
        }
        
        sc.close();
    }
}