import java.util.Arrays; 

public class Numbers12 {

    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
        
        System.out.println("### Verifikasi Jagged Array myNumbers ###");
        System.out.println("Jumlah Baris: " + myNumbers.length);
        System.out.println("Panjang Baris ke-0 (Kolom): " + myNumbers[0].length);
        System.out.println("Panjang Baris ke-1 (Kolom): " + myNumbers[1].length);
        System.out.println("Panjang Baris ke-2 (Kolom): " + myNumbers[2].length);
        
        System.out.println("--- Isi Elemen Jagged Array ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        
        System.out.println("--- Verifikasi Panjang Baris Menggunakan Loop ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}