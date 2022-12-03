/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_with_LinkedList;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Scanner sc = new Scanner(System.in);

        int secim = -1;
        int sayi;

        while (secim != 0) {
            System.out.println("1 ekle");
            System.out.println("2 cikar");
            System.out.println("3 en usttekii gostr");
            System.out.println("4 yazdir");
            System.out.println("0 cikis");
            System.out.println("seeciminiz : ");
            secim = sc.nextInt();

            if (secim == 1) {
                System.out.println(" sayi gir: ");
                
                sayi = sc.nextInt();
                stack.push(sayi);

            } else if (secim == 2) {
                stack.pop();
            } else if (secim == 3) {
                stack.topGoster();
            } else if (secim == 4) {
                stack.print();
            }else if(secim == 0){
                 System.out.println("gule gule");
            }else{
                System.out.println("hatali secim");
            }
        }

    }

}
