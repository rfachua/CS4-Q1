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
    private String title;
    private int length;
    private double streams;
    
    public String getTitle(){
        return title;
    }
    
    public int getLength(){
        return length;
    }
    
    public double getStreams(){
        return streams;
    }
    
    public void setTitle(String bejeweled){
        title = bejeweled;
    }
    
    public void setLength(int minutes){
        length = minutes;
    }
    
    public void setStreams(double plenty){
        streams = plenty;
    }
    
    public Song(String mkns, int dknm, double mkb) {
        title = mkns;
        length = dknm;
        streams = mkb;
    }
    
    public void listenToSong(){
        streams += 1;
    }
}
