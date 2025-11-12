import java.util.Scanner;
import java.util.Arrays;

public class SIAKAD12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     PENGATURAN DATA SIAKAD DINAMIS       ");
        System.out.println("==========================================");
        
        System.out.print("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMatkul = sc.nextInt();
        
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];
        
        System.out.println("\n==========================================");
        System.out.printf("   INPUT NILAI SIAKAD (%d SISWA, %d MK)   \n", jumlahSiswa, jumlahMatkul);
        System.out.println("==========================================");
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1) + ")");
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- Data Nilai yang Sudah Diinput (Siswa x Mata Kuliah) ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa " + (i + 1) + ": " + Arrays.toString(nilai[i]));
        }
        
        System.out.println("\n==========================================");
        System.out.println("          HITUNG RATA-RATA SISWA          ");
        System.out.println("==========================================");
        
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            
            System.out.println("\nMenghitung nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j]; 
            }
            
            double rataRata = totalPerSiswa / jumlahMatkul; 
            
            System.out.println("Total Nilai: " + totalPerSiswa);
            System.out.printf("Nilai Rata-rata: %.2f\n", rataRata);
        }
        
        System.out.println("\n==========================================");
        System.out.println("       HITUNG RATA-RATA MATA KULIAH       ");
        System.out.println("==========================================");
        
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j]; 
            }
            
            double rataRataMatkul = totalPerMatkul / jumlahSiswa; 
            
            System.out.printf("Rata-rata Nilai Matkul %d: %.2f\n", (j + 1), rataRataMatkul);
        }
        
        sc.close();
    }
}