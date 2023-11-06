/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_muo_chuara;

/**
 *
 * @author rui
 */
public class EX02_MUO_ChuaRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int audience = 12;
        Sciences science1 = new Sciences("Biology", 1, 1.00);
        Sciences science2 = new Sciences("Physics", 1, 1.00);
        Sciences science3 = new Sciences("Chemistry", 1, 1.00);
        Song song1 = new Song("Love Story", 200, 800000000);
        Song song2 = new Song("You Belong With Me", 240, 900000000);
        Singer singer1 = new Singer("Taylor Swift", 50, 50000000, song1);
        System.out.println(science1.name);
        System.out.println(science2.name);
        System.out.println(science3.name);
        System.out.println(song1.title);
        System.out.println(song2.title);
        System.out.println(singer1.name);
        singer1.performForAudience(audience);
        singer1.changeFavSong(song2);
        System.out.println(singer1.name + " performed to " + audience + " people");
        System.out.println(singer1.name + "'s fave song is changed to " + song2.title);
    }
    
}
