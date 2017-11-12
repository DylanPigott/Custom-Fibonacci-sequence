
package Custom_Fibonacci;

public class User 
{
    private String name; 
    private int n;
    
    public User(String name, int n )          //user details to be input to generate personal sequence
    {
        this.name=name;
        this.n=n;
    }
    
    public int[] getFibonacci()
    {
        int[] customFib = new int[this.n];    //make array of length n//
        customFib[0]=1;                       //array to hold sequence - start 1 incase n is 1
        
        int i=1;
        int num1=0;
        int num2=1;
        int total=1;
    
        
        while(i<this.n)
        { 
            total=num1+num2;                  //add the previous number to the current number, as per fibonacci standards
            customFib[i]=total;
            
            num1=num2;                        
            num2=total;
            
            customFib[i]=total;
            i++;
        }
        
        return(customFib);                    //return as array
    }
    
    public String getName(){        
        return(this.name);
    }
    public int getN(){
        return(this.n);
    }
    
}
