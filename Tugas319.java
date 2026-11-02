
import java.util.Scanner;

public class Tugas319 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int jumlahToko;
            do {
                System.out.print("Masukkan jumlah toko: ");
                jumlahToko = sc.nextInt();
                if (jumlahToko < 1) {
                    System.out.println("Jumlah toko minimal harus 1!");
                }
            } while (jumlahToko < 1);

            int totalBarangSeluruhToko = 0;
            int tokoTerbanyak = 1;
            int barangTerbanyak = -1;
            for (int t = 1; t <= jumlahToko; t++) {
                int jumlahPelanggan;
                do {
                    System.out.print("\nMasukkan jumlah pelanggan Toko " + t + ": ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;

                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Jumlah barang tidak boleh negatif!");
                        }
                    } while (barang < 0);

                    totalBarangToko += barang;
                }
                System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = t;
                }

                totalBarangSeluruhToko += totalBarangToko;
            }
            System.out.println("\nTotal barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
    }
}
