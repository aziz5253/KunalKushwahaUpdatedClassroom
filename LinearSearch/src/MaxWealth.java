public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={{23,4,1},{18,12,13,9},{78,99,34,56},{18,12}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts)
    {
        int maxSoFar=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            int rowSum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                rowSum+=accounts[person][account];
            }
            if(rowSum>=maxSoFar) maxSoFar=rowSum;

        }
        return maxSoFar;
    }
}
