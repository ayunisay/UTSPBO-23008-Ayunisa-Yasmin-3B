/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class menu{
    //membuat objek dengan nama scan dan menu
    Scanner scan= new Scanner(System.in);
    menu2 menu = new menu2();
    //deklarasi variable
    int pilihan, pilihan3;
    int pilih2, pilih4;
    int kamar1, kamar2, kamar3, kamar4, kamar5;
    //inisialisasi totalHarga 0
    public int totalHarga = 0;
    
    //konstraktor untuk memeberi nilai kamar
    public menu(int kamar1, int kamar2, int kamar3, int kamar4, int kamar5){
        this.kamar1 = kamar1;
        this.kamar2 = kamar2;
        this.kamar3 = kamar3;
        this.kamar4 = kamar4;
        this.kamar5 = kamar5;
    }
       
    //method untuk menu utama user
    public void menu(){ 
       //perulangan untuk mengulang program menu
        do{
            System.out.println("\nMenu Reservasi Hotel");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();//menyimpan input yang diinputkan oleh user
            //percabangan untuk membagi aksi yg nanti dilakukan oleh user
            switch (pilihan) {
                case 1:
                    pesan();//memanggil method pesan
                break;
                case 2:
                    System.out.println("\nTerima kasih telah berkunjung!");
                    System.out.println("Silahkan Datang Kembali!!");
                break;
                default:
                    System.out.println("\nPilihan tidak valid!");
                break;
            }
        }while(pilihan != 2);
    }
    
    //method untuk menu utama admin
    public void menu2(){  
       //perulangan untukmengulang program menu
        do{
            System.out.println("\nMenu Hotel");
            System.out.println("1. Ketersediaan Kamar");
            System.out.println("2. Jenis Kamar yang tersedia");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilih2 = scan.nextInt();//menyimpan input yang diinputkan oleh user
            //percabangan untuk membagi aksi yg nanti dilakukan oleh user
            switch (pilih2) {
                case 1:
                    pesan1();
                break;
                case 2:
                    menu.kamar();
                break;
                case 3:
                    System.out.println("\nSelamat Bekerja!");
                    System.out.println("Silahkan Datang Kembali!!");
                break;
                default:
                    System.out.println("\nPilihan tidak valid!");
                break;
            }
        }while(pilih2 != 3);
    }
    
    //method untuk memesan kamar
    public void pesan(){
    do{
        System.out.println("\nPilih Jenis Kamar");
        menu.tampil();
        System.out.print("\nPilih Kamar: ");
        pilihan3 = scan.nextInt();//menyimpan input yang diinputkan oleh user
        //percabangan untuk membagi aksi yg nanti dilakukan oleh user
        switch(pilihan3){
            case 1:
                System.out.println("Kamar Standar");
                System.out.println("Harga: Rp 500.000");
                menu.data();//mengambil method data didalam class menu2
                totalHarga += menu.jumlah * 500000;
                konfir1();//memanggil method konfir1 untuk mengkonfirmasi data
            break;
            case 2:
                System.out.println("Kamar Superior");
                System.out.println("Harga: Rp 800.000");
                menu.data();//mengambil method data didalam class menu2
                totalHarga += menu.jumlah * 800000;
                konfir1();//memanggil method konfir1 untuk mengkonfirmasi data
            break;
            case 3:
                System.out.println("Kamar Deluxe");
                System.out.println("Harga: Rp 1.000.000");
                menu.data();//mengambil method data didalam class menu2
                totalHarga += menu.jumlah * 1000000;
                konfir1();//memanggil method konfir1 untuk mengkonfirmasi data
            break;
            case 4:
                System.out.println("Kamar suite");
                System.out.println("Harga: Rp 1.200.000");
                menu.data();//mengambil method data didalam class menu2
                totalHarga += menu.jumlah * 120000000;
                konfir1();//memanggil method konfir1 untuk mengkonfirmasi data
            break;
            case 5:
                System.out.println("Presidential Suite");
                System.out.println("Harga: Rp 2.000.000");
                menu.data();//mengambil method data didalam class menu2
                totalHarga += menu.jumlah * 2000000;
                konfir1();//memanggil method konfir1 untuk mengkonfirmasi data
            break;
            case 6:
                menu();//memanggil method menu
            break;
            default:
                System.out.println("Pilihan tidak valid!");
            break;
        }
    } while(pilihan3 != 6);
   }
    
    //method untuk melihat ketersedaan kamar
    public void pesan1(){
        //perulangan untuk mengulang program
        do{
            System.out.println("\nIngin melihat kamar yang mana?");
            menu.tampil();//menampilkan daftar kamar dari class menu2
            System.out.print("\nPilih Kamar: ");
            pilih4 = scan.nextInt();//menyimpan input yg diinput oleh user

            //percabangan untuk menampilkan kamar yg dipilih oleh admin
            switch(pilih4){
                case 1:
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Kamar Standar");
                    System.out.println("Kamar yang tersedia: " + kamar1);
                    System.out.println("-------------------------------------------------");
                break;
                case 2:
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Kamar Superior");
                    System.out.println("Kamar yang tersedia: " + kamar2);
                    System.out.println("-------------------------------------------------");
                break;
                case 3:
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Kamar Deluxe");
                    System.out.print("Kamar yang tersedia: " + kamar3);
                    System.out.println("\n-------------------------------------------------");
                break;
                case 4:
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Kamar suite");
                    System.out.println("Kamar yang tersedia: " + kamar4);
                    System.out.println("-------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Presidential Suite");
                    System.out.println("Kamar yang tersedia: " + kamar5);
                    System.out.println("-------------------------------------------------");
                break;
                case 6:
                    menu2();
                break;
                default:
                    System.out.println("\nPilihan tidak valid!");
                break;
            }
        } while(pilih4 != 6);
   }
    //getter untuk mengambil totalHarga
    public int getHarga(){
        return totalHarga;
    }
    
    //menampilkan informasi booking yg telah dilakukan oleh user
    protected void info(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("\n--- INFORMASI BOOKING ---\n");
        System.out.println("NIK: " + menu.nik);
        System.out.println("Nama: " + menu.nama);
        System.out.println("Jumlah Kamar: " + menu.jumlah);
        System.out.println("Tanggal Booking: " + menu.tanggal);
        System.out.println("Check-in: " + menu.time);
        System.out.println("Check-out: " + menu.timeO);
        System.out.println("\n-------------------------------------------------");
        System.out.println("Harga yang harus dibayarkan: " + getHarga());
        System.out.println("\n-------------------------------------------------");
    }
    
    //method untuk mengkonfirmasi apakah data yang dimasukkan sudah benar atau belum
    public void konfir1(){
        boolean valid = false;
        do {
            scan.nextLine();
            System.out.print("Apakah data sudah benar? (y/n): ");
            String konfirmasi = scan.nextLine().toLowerCase(); // Ubah ke huruf kecil untuk memudahkan pengecekan

            if (konfirmasi.equals("y")) {
                valid = true;
                System.out.println("Data telah dikonfirmasi.");
                info();//memanggil method info
            } else if (konfirmasi.equals("n")) {
                System.out.println("Silakan ulangi input data.");
                menu.data();
            } else {
                System.out.println("Input tidak valid. Harap jawab dengan 'y' atau 'n'.");
            }
        } while (!valid);
    }
}
    
