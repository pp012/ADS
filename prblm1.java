package adsass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class prblm1 
{
public static void main(String[] args) 
{
	int m,flag;
	flag=0;
	LinkedList<Integer> link=new LinkedList<Integer>();
	LinkedList<Integer> result=new LinkedList<Integer>();
	String number;
	Scanner scan=new Scanner(System.in);
	String s;
	System.out.println("Enter input");
	s=scan.next();
	System.out.println("Enter the number");
	number=scan.next();
	int a[]=new int[s.length()] ;
	int b[]=new int[number.length()];
	for(int i=0;i<s.length();i++)
	{
		a[i]=Integer.parseInt(s.substring(i, i+1));
	}
	Arrays.sort(a);
	for(int i=a.length-1;i>=0;i--)
	{
		link.add(a[i]);
	}
	for(int i=0;i<number.length();i++)
	{
		b[i]=Integer.parseInt(number.substring(i, i+1));
	}
	int k=0;
	
		int j=0;
		if(link.size()<number.length())
		{
			while(link.size()!=1)
			{
			m=0;
			j=j+(number.length()-link.size());
				result.add(link.get(m));
				link.remove(m);
				m++;
				j++;
			}
		}
		if(link.size()==number.length())
		{
			while(link.size()!=1)
			{
			for(int i=0;i<link.size();i++)
			{
				if(b[k]<link.get(i))
				{
				continue;
				}
				else if(b[k]>link.get(i))
				{
					result.add(link.get(i));
					link.remove(i);
					flag=1;
					break;
				}
				else if(b[k]==link.get(i));
				{
					result.add(link.get(i));
					link.remove(i);
					break;
				}
			}
			if(flag==0)
			{
			k++;
			}
			if(flag==1)
			{
				break;
			}
			}
		}
		if(flag==0)
		{
	result.add(link.getLast());
		}
		else if(flag==1)
		{
			for(int i=0;i<link.size();i++)
			{
				result.add(link.get(i));
			}
		}
	for(int i=0;i<result.size();i++)
	{
		System.out.print(result.get(i));
	}
}
}
