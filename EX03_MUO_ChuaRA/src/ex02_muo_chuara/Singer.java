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
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public static int totalPerformances;
    
    public String getName(){
        return name;
    }
    
    public int getNoOfPerformances(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public Song getFavoriteSong(){
        return favoriteSong;
    }
    
    public void setName(String swift){
        name = swift;
    }
    
    public void setNoOfPerformances(int many){
        noOfPerformances = many;
    }
    
    public void setEarnings(double rich){
        earnings = rich;
    }
    
    public void setFavoriteSong(Song style){
        favoriteSong = style;
    }
    
    public void performForAudience(int people){
        noOfPerformances += 1;
        earnings += 100*people;
        totalPerformances += 1;
    }
    
    public void performForAudience(int people, Singer taytay){
        int money = 100*people;
        earnings += money/2;
        taytay.earnings += money/2;
        noOfPerformances += 1;
        taytay.noOfPerformances += 1;
        totalPerformances += 1;
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
