/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pak.thoib;

/**
 *
 * @author Admin
 */
public class holliday {
    public static int dutyFree(int normPrice, int discount, int hol) {
        double savingPerBottle = normPrice * (discount / 100.0);
        return (int) (hol / savingPerBottle);
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
