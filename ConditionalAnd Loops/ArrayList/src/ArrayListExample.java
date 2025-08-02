import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>(10);
       list.add(67);
       list.add(672);
       list.add(627);
       list.add(787);
        System.out.println(list.contains(672));
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }

    }
}