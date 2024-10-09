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
public class menu2{
   //membuat objek scan
   Scanner scan= new Scanner(System.in);
   //deklarasi variabel
   int jumlah;
   String nik, nama, tanggal, time, timeO;
   
   //method untuk mengisi data user saat memesan kamar
    protected void data(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("Silahkan Masukkan Data Anda!");
        System.out.print("Masukkan NIK Anda: ");
        nik = scan.nextLine();
        System.out.print("Masukkan Nama Anda: ");
        nama = scan.nextLine();
        System.out.print("Masukkan jumlah kamar yang ingin anda pesan: ");
        jumlah = scan.nextInt();
        System.out.println("contoh: 09-12-2021");
        scan.nextLine();
        System.out.print("Masukkan Tanggal Booking: ");
        tanggal = scan.nextLine();
        System.out.println("contoh: 09.00");
        System.out.print("Waktu Check-in: ");
        time = scan.nextLine();
        System.out.println("contoh: 09.00");
        System.out.print("Waktu Check-out: ");
        timeO = scan.nextLine();
        System.out.println("\n-------------------------------------------------");
    }
    
    //method untuk menampilkan menu kamar
    public void tampil(){
        System.out.println("1. Kamar Standar");
        System.out.println("2. Kamar Superior");
        System.out.println("3. Kamar Deluxe");
        System.out.println("4. Kamar Suite");
        System.out.println("5. Presidential Suite");
        System.out.println("6. Keluar");
    }
    
    //method untuk menampilkan jenis kamar yang ada didalam menu admin
    public void kamar(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("\nKamar yang tersedia ada:");
        System.out.println("1. Kamar Standar");
        System.out.println("2. Kamar Superior");
        System.out.println("3. Kamar Deluxe");
        System.out.println("4. Kamar Suite");
        System.out.println("5. Presidential Suite");
        System.out.println("\n-------------------------------------------------");
    }
}



