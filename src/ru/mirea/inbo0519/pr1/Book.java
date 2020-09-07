package ru.mirea.inbo0519.pr1;
import java.lang.*;

public class Book {
    private String name;
    private String author;
    public Book(String n, String a){
        name = n;
        author = a;
    }
    public Book(String n){
        name = n;
    }
    public Book(){
        name = "1984";
        author = "Orwell";
    }
    public void setName(String name){
        this.name= name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String author){
        return author;
    }
    public String toString(){
        return this.name+", author is "+this.author;
    }
}
