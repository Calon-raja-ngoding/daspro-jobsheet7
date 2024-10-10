import java.util.Scanner;
public class Bioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket,totalTiket = 0,i = 0;
        String lanjut;
        double totalHarga = 0, harga;

        do {
            System.out.print("Jumlah tiket : ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();
            if (jumlahTiket < 1) {
                System.out.println("Jumlah tiket yg anda masukkan invalid, silahkan input ulang");
                continue;
            }
             if (jumlahTiket > 3 && jumlahTiket < 11) {
                harga = (50000 * jumlahTiket) - (50000 * jumlahTiket * 0.1);
             } else if (jumlahTiket > 10) {
                harga = (50000 * jumlahTiket) - (50000 * jumlahTiket * 0.15) ;
             } else {
                harga = 50000 * jumlahTiket;
             }
             totalHarga += harga;
             totalTiket += jumlahTiket;
             i ++;
             System.out.println("Harga : Rp." + harga);
             System.out.print("Masih mau tambah data (y/n) : ");
             lanjut = sc.nextLine();
             if (lanjut.equalsIgnoreCase("n")) {
                break;
             } else {
                continue;
            }
             


        } while (true);

        System.out.println("Total penjualan tiket hari ini : " + totalTiket);
        System.out.println("Jumlah penjualan hari ini : " + i);
        System.out.println("Total pendapatan hari ini : Rp." + totalHarga);
    }
}
