/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_with_arrays;

/**
 *
 * @author irfan
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        stack.print();
    }
}
