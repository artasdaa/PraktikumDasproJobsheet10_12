import java.util.InputMismatchException;
import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int menu;

        do {
            System.out.println("\n==================================");
            System.out.println("          MENU BIOSKOP            ");
            System.out.println("==================================");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu (1/2/3): ");

            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("!!! Peringatan: Pilihan menu harus berupa angka (1, 2, atau 3). !!!");
                sc.nextLine();
                menu = 0;
                continue;
            }

            switch (menu) {
                case 1:
                    inputDataPenonton(sc, penonton);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak tersedia. Silakan coba lagi.");
            }
        } while (menu != 3);

        sc.close();
    }

    public static void inputDataPenonton(Scanner sc, String[][] penonton) {
        String nama;
        int baris = 0; 
        int kolom = 0; 
        String next;

        do {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            boolean inputValid = false;
            while (!inputValid) {
                try {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("!!! Peringatan: Nomor baris/kolom kursi tidak tersedia. !!!");
                        System.out.println("Silakan masukkan baris (1-4) dan kolom (1-2) yang benar.");
                        continue; 
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("!!! Peringatan: Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". !!!");
                        System.out.println("Silakan masukkan baris dan kolom yang kosong kembali.");
                        continue;
                    }

                    inputValid = true;
                    
                } catch (InputMismatchException e) {
                    System.out.println("!!! Peringatan: Input baris/kolom harus berupa angka bulat. !!!");
                    sc.nextLine(); 
                }
            }
            
            penonton[baris - 1][kolom - 1] = nama;
            System.out.println("Data " + nama + " berhasil diinput di Baris " + baris + " Kolom " + kolom + ".");

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
    }

    public static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("\n==================================");
        System.out.println("       DAFTAR PENONTON BIOSKOP    ");
        System.out.println("==================================");
        
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Penonton Baris " + (i + 1) + ": ");
            String[] barisSaatIni = penonton[i];
            
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < barisSaatIni.length; j++) {
                String nama = barisSaatIni[j];
                output.append(nama == null ? "***" : nama);
                if (j < barisSaatIni.length - 1) {
                    output.append(" | ");
                }
            }
            System.out.println(output.toString());
        }
    }
}