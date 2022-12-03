/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedList;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Main {

    public static void main(String[] args) {
        DoubleLinkedList liste = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int secim = -1;
        int sayi, indis;

        while (secim != 0) {
            System.out.println("1 basa ekle");
            System.out.println("2 sona ekle");
            System.out.println("3 sondan basa yazdir");
            System.out.println("4 araya ekle");
            System.out.println("5 bastan sil ");
            System.out.println("6 sondan sil");
            System.out.println("7 aradan sil");

            System.out.println("0 cikis");

            System.out.println("Seciminiz : ");
            secim = sc.nextInt();

            if (secim == 1) {
                System.out.println("sayi gir ");
                sayi = sc.nextInt();
                liste.basaEkle(sayi);
            } else if (secim == 2) {
                System.out.println("sayi gir ");
                sayi = sc.nextInt();
                liste.sonaEkle(sayi);
            } else if (secim == 0) {
                System.out.println("gule gule");

            } else if (secim == 3) {
                liste.sondanYazdir();
            } else if (secim == 4) {
                System.out.println("sayi giriniz ");
                sayi = sc.nextInt();
                System.out.println("indis gir");
                indis = sc.nextInt();
                liste.arayaEkle(sayi, indis);
            } else if (secim == 5) {

                liste.bastanSil();
            } else if (secim == 6) {

                liste.sondanSil();
            }else if(secim == 7){
                System.out.println("indis : ");
                indis = sc.nextInt();
                liste.aradanSil(indis);
            }else {
                System.out.println("hatali secim yaptiniz");
                secim = sc.nextInt();
            }

            liste.yazdir();
        }

    }
}
