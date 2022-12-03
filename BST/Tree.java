/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

/**
 *
 * @author irfan
 */
public class Tree {

    Node root;

    public Tree() {
        root = null;
    }

    Node newNode(int data) {
        root = newNode(data);
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
            root = new Node(data);
        }
        return root;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");

            inOrder(root.right);

        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    }

    int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int sol = 0, sag = 0;
            sol = height(root.left);
            sag = height(root.right);
            if (sol > sag) {
                return sol + 1;
            } else {
                return sag + 1;
            }
        }

    }

    int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return size(root.left) + 1 + size(root.right);
        }
    }
    

    Node delete(Node root, int data) {
        Node t1;
        Node t2;
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            if (root.left == root.right) { // ikiside nuldur
                root = null;
                return null;
            } else if (root.left == null) {
                t1 = root.right;
                return t1;

            } else if (root.right == null) {
                t1 = root.left;
                return t1;

            } else {
                t1 = t2 = root.right;
                while (t1.left != null) {
                    t1 = t1.left;
                }
                t1.left = root.left;
                return t2;
            }

        } else {
            if (data < root.data) {
                root.left = delete(root.left, data);
            } else {
                root.right = delete(root.right, data);

            }
            return root;
        }
    }
}
