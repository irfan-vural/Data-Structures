/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dugum;

/**
 *
 * @author irfan
 */
public class Liste {
    public static void main(String[] args) {
        Dugum a = new Dugum();
        Dugum b = new Dugum();
        Dugum c = new Dugum();

        a.sayi = 12;
        b.sayi = 34;
        c.sayi = 53;
        
        System.out.println(a.sayi);
        System.out.println(b.sayi);
        System.out.println(c.sayi);
        
        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = null;
        
        System.out.println(a.toString());
        
        Dugum temp = new Dugum();
        temp = a;
        while(temp != null){    // dugumlerin üzerinde dolaşma
            System.out.println(temp.sayi);
            temp = temp.nextNode;
        }
        
    }
    
}
