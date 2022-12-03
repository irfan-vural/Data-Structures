/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Binary_Trees;

/**
 *
 * @author irfan
 */
public class Btree {

    Node root;

    public Btree() {
        root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        System.out.println(data + " agaca eklendi");
        return root;
    }

    Node insert(Node root, int data) {

        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }

        } else {
            root = newNode(data);
        }

        return root;

    }

}
