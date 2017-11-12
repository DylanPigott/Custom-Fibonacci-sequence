package Custom_Fibonacci;

import java.util.Scanner;

public class Processor 
{

   
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter the number you wish 'n' to be. For example, entering '6' will result in 1,1,2,3,5,8.");
        int num     = sc.nextInt();
        
        
        User user1 = new User(name,num);        //making a user who will recieve a sequence
        int[] customFib = user1.getFibonacci();
        int digit=1;                            //counter to determine which digit of the sequence we are on
        
        
        System.out.println(user1.getName()+"'s personal fibonacci sequence when n is "+user1.getN()+": ");
        
        for(int i=0;i<customFib.length;i++)
        {
            System.out.println(+customFib[i]);
            digit++;
        }
    }
    
}
