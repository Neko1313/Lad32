import java.util.*;
public class MyClass implements Comparable{
    private String name;
    private int year;

    void setYear(int year){
        this.year = year;
    }
    void setName(String name){
        this.name = name;
    }
    int getYear(){
        return this.year;
    }
    String getName(){
        return this.name;
    }
    MyClass(){
        Random rand = new Random();
        name = "Neko";
        year = rand.nextInt(14);
    }
    MyClass(String name,int year){
        this.year = year;
        this.name = name;
    }

    public String toString(){
        String result = "";
        result += this.year + " " + this.name + " ";
        return  result;
    }
    public int compareTo(Object o) {
        if ( o instanceof MyClass){
            if(this.year == ((MyClass) o).year) {
                return 0;
            }
            if(this.year < ((MyClass) o).year){
                return -1;
            }
            if(this.year > ((MyClass) o).year) {
                return 1;
            }
        }

        return 0;
    }
}
