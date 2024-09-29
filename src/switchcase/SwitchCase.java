package switchcase;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int jumlah, harga, pilihan, jawab, variasi;
        double diskon, total=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Warung Sederhana");
        System.out.println("==============================");
        System.out.println("Pilihan Menu");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        System.out.println("==============================");
        System.out.print("Pilih Menu = ");
        byte Pilih = sc.nextByte();
        System.out.println("==============================");
        System.out.println("Variasi Menu");
        
        switch(Pilih){
            case 1: System.out.println("1. Sate Ayam [1500/tusuk]");
                    System.out.println("2. Sate Kambing [3000/tusuk]");
                    System.out.println("==============================");
                    System.out.print("Pilih Variasi = "); pilihan=sc.nextInt();
                        if (pilihan==1) {
                            harga = 1500;
                            System.out.print("Jumlah = "); jumlah=sc.nextInt();
                            total=harga*jumlah;
                            System.out.print("Total Harga = "+total);
                        }else if (pilihan==2) {
                            harga = 3000;
                            System.out.print("Jumlah = "); jumlah=sc.nextInt();
                            total=harga*jumlah;
                            System.out.println("Total Harga = "+total);
                        }
                    break;
            case 2: System.out.println("1. Lauk Ayam [13000]");
                    System.out.println("2. Lauk Empal [15000]");
                    System.out.println("==============================");
                    System.out.print("Pilih Variasi = "); pilihan=sc.nextInt();
                        if (pilihan==1) {
                            harga = 13000;
                            System.out.print("Jumlah = "); jumlah=sc.nextInt();
                            total=harga*jumlah;
                            System.out.print("Total Harga = "+total);
                        }else if (pilihan==2) {
                            harga = 15000;
                            System.out.print("Jumlah = "); jumlah=sc.nextInt();
                            total=harga*jumlah;
                            System.out.println("Total Harga = "+total);
                        }
                    break;
            case 3: System.out.println("1. Lauk Tahu/Tempe [5000]");
                    System.out.println("2. Telur [7000]");
                    System.out.println("3. Lauk Ayam [10000]");
                    System.out.println("==============================");
                    System.out.print("Pilih Variasi = "); pilihan=sc.nextInt();
                        switch (pilihan) {
                            case 1:
                                harga = 5000;
                                System.out.print("Jumlah = "); jumlah=sc.nextInt();
                                total=5000*jumlah;
                                System.out.println("Total Harga = "+total);
                                break;
                            case 2:
                                harga = 7000;
                                System.out.print("Jumlah = "); jumlah=sc.nextInt();
                                total=7000*jumlah;
                                System.out.println("Total Harga = "+total);
                                break;
                            case 3:
                                harga = 10000;
                                System.out.print("Jumlah = "); jumlah=sc.nextInt();
                                total=10000*jumlah;
                                System.out.println("Total Harga = "+total);
                                break;
                            }
         }
        System.out.println("==============================");
        System.out.println("Apakah anda memiliki kartu member?");
        System.out.println("1. Ya, saya memiliki kartu member");
        System.out.println("2. Tidak, saya tidak memilki kartu member");
        System.out.println("==============================");
        System.out.print("Jawaban = "); 
        int kartu=sc.nextInt();
            if (kartu==1) {
                System.out.println("Anda mendapatkan diskon 5%");
                diskon=0.05*total;
                System.out.println("Diskon = "+diskon);
                total=total-diskon;
                System.out.print("Total Akhir = "+total);
            }else if (kartu==2) {
                System.out.println("Maaf, anda tidak mendapatkan diskon");
                System.out.println("Total akhir = "+total);
                
            }
            
        
    }
    
}
