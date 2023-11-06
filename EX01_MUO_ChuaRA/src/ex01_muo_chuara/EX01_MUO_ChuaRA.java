/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_muo_chuara;

/**
 *
 * @author MUON
 */
public class EX01_MUO_ChuaRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String song1 = "Blank Space";
        String song2 = "Cruel Summer";
        String song3 = "Anti-Hero";
        int length1 = 231;
        int length2 = 178;
        int length3 = 200;
        double streams1 = 1.449;
        double streams2 = 1.009;
        double streams3 = 1.092;
        
        
        System.out.println("Song 1: ");
        System.out.println("Title: " + song1);
        System.out.println("Length of Track: " + length1 + " seconds");
        System.out.println("Number of Streams: " + streams1 + " Billion streams\n");
        System.out.println("Song 2: ");
        System.out.println("Title: " + song2);
        System.out.println("Length of Track: " + length2 + " seconds");
        System.out.println("Number of Streams: " + streams2 + " Billion streams\n");
        System.out.println("Song 3: ");
        System.out.println("Title: " + song3);
        System.out.println("Length of Track: " + length3 + " seconds");
        System.out.println("Number of Streams: " + streams3 + " Billion streams");
        System.out.println("----------------------------------------");
        System.out.println("Total length of playlist:");
        System.out.println(length1+length2+length3 + " seconds\n");
        System.out.println("Blank Space is shorter than Cruel Summer: ");
        System.out.println(length1 < length2);
        System.out.println("\nCruel Summer has more streams than Anti-Hero: ");
        System.out.println(streams2 > streams3);
    }
    
}
