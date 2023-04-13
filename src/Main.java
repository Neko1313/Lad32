import java.util.*;
public class Main {
    private static TreeSet<MyClass> transp(LinkedList<MyClass> temp, MyClass compareClass) {
        TreeSet<MyClass> treeClass = new TreeSet<>();
        ListIterator<MyClass> linkIter = temp.listIterator();
        while(linkIter.hasNext()){
            MyClass value = linkIter.next();
            if(value.compareTo(compareClass)==1){
                treeClass.add(value);
            }
        }
        return treeClass;
    }
    public static void main(String[] args) {



        GenerArran<MyClass> customArr = new GenerArran<>();
        for(int i = 0;i < 11; i++){
            customArr.push(new MyClass());
        }



        LinkedList<MyClass> listClass = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            listClass.push(customArr.getNewArr(i));
        }
        ListIterator<MyClass> linkIter = listClass.listIterator();
        while(linkIter.hasNext()){
            System.out.println(linkIter.next());
        }


        TreeSet<MyClass> treeClass = transp(listClass,new MyClass("Neko",9));
        System.out.println("\n");
        System.out.println(treeClass);

    }



}