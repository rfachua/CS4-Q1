/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_muo_chuara;

/**
 *
 * @author rui
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;

    public void performForAudience(int people){
        noOfPerformances += 1;
        earnings += 100*people;
    }
    
    public void changeFavSong(Song newSong){
        favoriteSong = newSong;
    }
    
    public Singer(String A, int b, double u, Song d){
        name = A;
        noOfPerformances = b;
        earnings = u;
        favoriteSong = d;
    }
}
