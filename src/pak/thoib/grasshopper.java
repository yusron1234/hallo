/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pak.thoib;

/**
 *
 * @author Admin
 */
public class grasshopper {
     public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;

    }

    public static void main(String[] args) {
        System.out.println(checkForFactor(10, 2));
    }
}
