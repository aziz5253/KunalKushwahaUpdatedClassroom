import java.util.Arrays;

public class VarRags {
    public static void main(String args[])
    {
        fun(2,3,4,5,6,7,8,9,10);
        fun();
        multiple(12,13,"Aziz","Rahul","Mohit");
        demo(5,7,8,9,12,15,18);
        demo("Aziz","Rahul","Mohit","Sunil");

    }
    static void multiple(int a,int b,String ...v)
    {
        System.out.println("a==="+a+"b======"+b+"v======="+Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
