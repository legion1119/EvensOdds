import java.io.*;
import java.util.*;

public class EvensOdds 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numOfInput = input.nextInt();
        String stringInput[] = new String[numOfInput];
        
        input.nextLine();
        
        for (int index = 0; index < numOfInput; index++)
        {
            stringInput[index] = input.nextLine();
        }
        
        for (String string : stringInput)
        {
            String variable;
            String even = "";
            String odd = "";
            variable = string;
            
            for (int i = 0; i < variable.length(); i++)
            {
                if ((i % 2) == 0)
                {
                    even = even + variable.charAt(i);
                }
                else
                {
                    odd = odd + variable.charAt(i);     
                }
                
            }
            System.out.println( even + " " + odd);
        }
           
    }
}