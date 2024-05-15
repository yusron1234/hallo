/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pak.thoib;

/**
 *
 * @author Admin
 */
public class Countofpositivessumofnegatives {
     public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int countPositives = 0;
        int sumNegatives = 0;

        for (int num : input) {
            if (num > 0) {
                countPositives++;
            } else {
                sumNegatives += num;
            }
          
        }

        return new int[]{countPositives, sumNegatives};
    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
