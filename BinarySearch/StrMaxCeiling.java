package BinarySearch;

public class StrMaxCeiling {
    public static char binary(char[] str, char target)
    {
        int start = 0;
        int end = str.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(target<str[mid])
            {
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return str[start%str.length];
    }
    public static void main(String[] args) {
        char [] str = {'a', 'c', 'd','e','f'};
        char target = 'b';
        System.out.println(binary(str, target));
    }
    
}
