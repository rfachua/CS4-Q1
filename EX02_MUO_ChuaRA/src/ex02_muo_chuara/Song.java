/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_muo_chuara;

/**
 *
 * @author rui
 */
public class Song {
    String title;
    int length;
    double streams;
    
    public Song(String mkns, int dknm, double mkb) {
        title = mkns;
        length = dknm;
        streams = mkb;
    }
    
    public void listenToSong(){
        streams += 1;
    }
}
