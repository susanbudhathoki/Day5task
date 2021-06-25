public class OddNumbers 
{
    public static void main(String[] args) 
    {
        int number=100;
        System.out.print("List of odd numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)    
        {
            //logic to check if the number is odd or not
            //if i%2 is equal to one, the number is odd
            if(i%2==1)
            {
                System.out.println(i + " ");
            }
        }
    }
}
