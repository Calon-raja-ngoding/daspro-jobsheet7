import java.net.Socket;
import java.util.Scanner;
public class Parkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total = 0,harga;
        System.out.println("1(Mobil)");
        System.out.println("2(Motor)");
        System.out.println("0(Keluar)");
        do {
            
            System.out.print("Masukkan jenis kendaraan : ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                break;
            }
            System.out.print("Masukkan durasi jam : ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                harga = 12500;
            } else{
                if (jenis == 1) {
                    harga = durasi * 3000;
                } else{
                    harga = durasi * 2000;
                }
            }
            total += harga;
            System.out.println("Harga : Rp." + harga);
        } while (jenis == 1 || jenis == 2);
        System.out.println("Total pendapatan parkir : Rp." + total);
    }

}
