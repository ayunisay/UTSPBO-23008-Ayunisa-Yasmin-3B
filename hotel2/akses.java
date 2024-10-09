/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel2;

import hotel.menu;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class akses implements akses1 {
    int pilih;
    //membuat objek menu dengan parameter
    menu menu = new menu(10,30,50,60,20);
    //membuat objek scan
    Scanner scan = new Scanner(System.in);
    
    //overriding dari class akses1
    @Override
    public void login() {
        //perulangan untuk mengulang program jika belum selesai
        do{
            System.out.println("\n--- SELAMAT DATANG DI SISTEM RESERVASI HOTEL ---");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Logout");
            System.out.print("Ingin Masuk Sebagai: ");
            pilih = scan.nextInt();
            //percabangan untuk membagi aksi yg nanti dilakukan oleh user
            switch(pilih){
            case 1:
                System.out.println("Login berhasil!");
                menu.menu2();
            break;
            case 2:
                System.out.println("Login berhasil!");
                menu.menu();
            break;
            case 3:
                System.out.println("Logout berhasil!");
            break;
            default:
                System.out.println("pilihan tidak ada!");
            break;
            }
        }while(pilih != 3);
    }
}

