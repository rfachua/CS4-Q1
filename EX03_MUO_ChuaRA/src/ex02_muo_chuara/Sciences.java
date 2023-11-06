/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_muo_chuara;

/**
 *
 * @author rui
 */
public class Sciences {
    private String name;
    private int units;
    private double grade;
    
    public String getName(){
        return name;
    }
    
    public int getUnits(){
        return units;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public void setName(String ano){
        name = ano;
    }
    
    public void setUnits(int what){
        units = what;
    }
    
    public void setGrade(double ha){
        grade = ha;
    }
    
    public Sciences(String bc, int cd, double mknsragh) {
        name = bc;
        units = cd;
        grade = mknsragh;
    }
}
