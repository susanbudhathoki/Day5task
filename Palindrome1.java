import java.util.Scanner;
class Palindrome1
{
    public static void main(String[] args)
    {
        int rem, sum=0, rev;
        int n = 12321;
        rev = n;
        while (n>0)
        {
            rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if (rev==sum)
        System.out.println("It is palindrome");
        else
        System.out.println("It is not palindrome");
    }
}