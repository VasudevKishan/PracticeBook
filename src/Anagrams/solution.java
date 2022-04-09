package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {

    public List<Integer> findAnagrams (String s, String p) {

    	char[] pChar=p.toCharArray(); 
		Arrays.sort(pChar);
		List<Integer> angrmResult=new ArrayList<>();
		if(s == null || s.length() == 0 || s.length() < p.length()) 
		{
			return angrmResult;
		}
		for(int i=0;i<s.length()-p.length()+1;i++)
		{
		   String sTempString=s.substring(i,i+p.length());
		   char[] sTempChar=sTempString.toCharArray();
		   Arrays.sort(sTempChar);
		   boolean rst1=Arrays.equals(sTempChar, pChar);
		 
			if(rst1)
			{
				angrmResult.add(i);
			 
			}
		}
		return angrmResult;
    }

    public static void main(String[] args) { 
        System.out.println(new solution ().findAnagrams ("cbaebabacd", "abc"));
    }

}