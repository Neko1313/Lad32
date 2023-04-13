import java.util.*;

public class GenerArran<T extends Comparable> {
    ArrayList<T> newArr;
    private int curValue = 0;
    private final int maxValue = 10;


    int getMaxValue(){
        return maxValue;
    }
    int getCurValue(){
        return curValue;
    }
    T getNewArr(int i){
        return newArr.get(i);
    }

    GenerArran(){
        this.curValue = 0;
        this.newArr = new ArrayList<T>(this.maxValue);
    }

    void push(T x){
        try{
            if(this.getCurValue() == this.getMaxValue()){
                throw new Exception("Вы не можете добавить больше элементов");
            }
            else {
                newArr.add(x);
                curValue++;
            }
        }
        catch(Exception var3){
            System.out.println(var3.getMessage());
        }
    }
    void del(T x){
        try {
            if (this.getCurValue() - 1 == 0) {
                throw new Exception("Нельзя удалить элементы из пустого стека");
            } else {
                newArr.remove(this.getCurValue());
                curValue--;
            }
        }
        catch(Exception var3) {
            System.out.println(var3.getMessage());
        }

    }

    int isSmaller(T x){
        int count = 0;
        for(int i = 0; i < this.getCurValue(); i++){
            if(x.compareTo(newArr.get(i)) < 0){
                count++;
            }
        }
        return count;
    }
    boolean equalVal(){
        boolean equality = false;
        for(int i=0;i<getMaxValue();i++){
            for(int j=0;j < getMaxValue(); j++){
                if(getNewArr(i) == getNewArr(j) && i != j){
                    equality = true;
                    break;
                }
            }
        }
        return equality;
    }
    public String toString(){
        String result = "";
        for(int i = 0; i < this.getCurValue(); i++){
            result += newArr.get(i) + ", ";
        }
        return result;
    }

}