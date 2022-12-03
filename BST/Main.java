/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

/**
 *
 * @author irfan
 */
public class Main {
    
    public static void main(String[] args) {
        Tree tre = new Tree();
        
        tre.root = tre.insert(tre.root, 10);
        tre.root = tre.insert(tre.root, 8);
        tre.root = tre.insert(tre.root, 15);
        tre.root = tre.insert(tre.root, 5);
        tre.root = tre.insert(tre.root, 12);
        tre.root = tre.insert(tre.root, 20);
        tre.root = tre.insert(tre.root, 9);
        
        System.out.println("kok : " + tre.root.data);
        System.out.println("kok solu : " + tre.root.left.data);
        System.out.println("kok sagi: " + tre.root.right.data);
        System.out.println("kok solun solu: " + tre.root.left.left.data);
        System.out.println("kok : asgın sagı" + tre.root.right.right.data);
        
        tre.preOrder(tre.root);
        System.out.println("");
        
        tre.inOrder(tre.root);
        System.out.println("");
        
        tre.postOrder(tre.root);
        System.out.println("");
        System.out.println("yukseklik : " + tre.height(tre.root));
        System.out.println("eleman sayisi  "  + tre.size(tre.root));
        
        
    }
    
}
