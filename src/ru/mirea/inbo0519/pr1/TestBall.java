package ru.mirea.inbo0519.pr1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball j1 = new Ball("golf", 12);
        Ball j2 = new Ball("Soccer", 34);
        Ball j3 = new Ball("volleyball");
        j3.setRadius(20);
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
    }
}
