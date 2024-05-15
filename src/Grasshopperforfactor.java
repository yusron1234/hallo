/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Grasshopperforfactor {

    public static boolean isFactor(int factor, int number) {
        if (number % factor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int factor = 2;
        int number = 6;
        boolean isFactorBasis = isFactor(factor, number);
        System.out.println(isFactorBasis);
    }
     
    }

