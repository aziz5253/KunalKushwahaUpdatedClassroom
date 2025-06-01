package Function.src;
public class Scope {
    public static void main(String args[])
    {
        int a =10;//initas
        int b =20;
        String name ="Kunal";
        {
           // int a = 78; //already initalized outside the block in the same method,hence cannot initialized again
            a = 100; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            //values initialised in the block remain in the block
            name ="Rahul";
            System.out.println(name);

        }
        int c =900;
        System.out.println(a);
        System.out.println(name);
        //Scooping in FOr Loops
        for(int i= 0;i<4;i++)
        {
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
    }
    static void random(int marks)
    {
        int num =67;
        System.out.println(num);
        System.out.println(marks);

    }
}
