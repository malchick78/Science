import java.util.*;

public class Palindrome
{
	 public static void main(String[] args)
	{
		String word1, word2, word3;
		
		word1 = "kayak";
		palindrome(word1);
		System.out.println();
		
		word2 = "radar";
		palindrome(word2);
		System.out.println();
		
		word3 = "mark";
		palindrome(word3);
		System.out.println();
	}
	
	public static boolean palindrome(String s)
	{
		boolean flag = false;
		int count = 0;
		
		Stack<Character> stack = new Stack<Character>();
		char[] current = s.toCharArray();
			
		for (int index = 0; index < current.length; index++)
			stack.push(current[index]);
		
		for (int index = 0; index < current.length; index++)
		{
			if (stack.peek() == current[index])
			{
				count++;
				stack.pop();
			}
		}
		
		if (count == current.length)
			flag = true;
		
		System.out.println(s);
		System.out.println(flag);
		
		return flag;
	}
}