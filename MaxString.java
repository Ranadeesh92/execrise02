package inrhythm;

import java.util.Scanner;
public class MaxString 
{
/**
 * The method longestword is used to find out the longest word in the given sentence
 * @author ranadeesh
 * @date Feb 16th 2021
 * @param sinpuut
 * @return longestword
 * */

	public String longestword(String sInput)
	{
		//the following array will split the given sentence and moving it into the array
		String [] arrayA= sInput.split(" ");
		int i;
		//iterate the loop by getting each element of the array
		for(i=1;i<arrayA.length;i++)
		{
			if (arrayA[i-1].length() > arrayA[i].length())
			{
				arrayA[i]= arrayA[i-1];
			}
		}
		return arrayA[i-1];
	}
	/**
	 * The Method LengthString is used to find out the length of the string without using len
	 * @author ranadeesh
	 * @Date Feb 16,2021
	 * @param sInput
	 * @return lenthofstring
	 */
	
	public int lengthString(String sInput)
	{
		int j=0;
		char[] ch=sInput.toCharArray();
		for(char c:ch)
		{
			j++;
		}
		return j;
	}
	public static void main(String[] args) 
	{
		// using the scanner to take the inputs from user
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the String to Find the longest word: ");
		String input = sc.nextLine();
		MaxString objMaxString = new MaxString();
		
		if(!input.isEmpty())  //to Verify whether given input is empty or not
		{
			String LongestWord=objMaxString.longestword(input);
			System.out.println("Longest word in the given sentence is: " +LongestWord);
			System.out.println("Length of the longest word in the given sentence is: "+LongestWord.length());
			System.out.println("Length of the longest word without using length function is:"+objMaxString.lengthString(LongestWord));
		
						
	}
		else
		{
			//This should be an error box message 
			System.out.println("Please enter a Valid input or given string cannot be empty value:");
		}

	}

}
