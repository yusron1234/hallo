/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class loveyou {

    public static String howMuchILoveYou(int nb_petals) {
        String[] phrases = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return phrases[(nb_petals - 1) % phrases.length];
    }

    public static void main(String[] args) {
        System.out.println("\"I love you\", Sid.howMuchILoveYou(1)");
    }

}
