/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Abbreviate {

    public static String abbrevName(String name) {
        String[] nameArray = name.split(" ");
        char firstInitial = Character.toUpperCase(nameArray[0].charAt(0));
        char lastInitial = Character.toUpperCase(nameArray[1].charAt(0));
        return firstInitial + "." + lastInitial;
    }

    public static void main(String[] args) {
        System.out.println("Sam Harris");
        System.out.println("Patrick Feenan");
    }

}
