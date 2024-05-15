/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class pilarr {

    public static int pillars(int numPill, int dist, int width) {
        if (numPill <= 1) {
            return 0;
        }

        return (numPill - 1) * dist * 100 + (numPill - 2) * width;
    }

    public static void main(String[] args) {
        System.out.println("pilar");
    }

}
