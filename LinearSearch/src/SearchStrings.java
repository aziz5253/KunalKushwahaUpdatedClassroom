import java.util.Arrays;

public class SearchStrings {
    public static void main(String[] args) {
        String name="Kunal";
        char target='o';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(char ch:str.toCharArray())
            if(target==ch) return true;
return false;
    }
}
