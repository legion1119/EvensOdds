/*
 * Code accepts a number of strings and returns two separate strings
 * based on where the characters were in the original string. (even or odd position)
 */
import java.io.*;
import java.util.*;

public class EvensOdds 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number or words to be divided:");
        System.out.println("Enter the words to be divided:");
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
            String even = "";//creating two strings to place the letters in
            String odd = "";
            variable = string;
            
            for (int i = 0; i < variable.length(); i++)
            {	//seperating letters of the words by determining their position
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