package ru.mirea.inbo0519.pr1;
import java.lang.*;

public class Ball {
    private String type;
    private int radius;
    public Ball(String t, int r){
        type = t;
        radius = r;
    }
    public Ball(String t) {
        type = t;
    }
    public Ball(){
        type = "football";
        radius = 34;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getType(String type){
        return type;
    }
    public int getRadius(int radius){
        return radius;
    }
    public String toString(){
        return this.type+", radius is "+radius;
    }
}
