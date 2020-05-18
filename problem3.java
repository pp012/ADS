package adsass;
import java.util.Scanner;
public class problem3 {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	int cases;
	int bun,chickenpatties,hamburgerpatties,numberofburgers,costofchickeburgers,costofhamburgers,greaterofboth,greaterofbothcost,smallerofboth,smallerofbothcost;
	cases=scan.nextInt();
	int profit[]=new int[cases];
	for(int i=0;i<cases;i++)
	{
	bun=scan.nextInt();
	hamburgerpatties=scan.nextInt();
	chickenpatties=scan.nextInt();
	costofhamburgers=scan.nextInt();
	costofchickeburgers=scan.nextInt();
	numberofburgers=bun/2;
	if(costofchickeburgers>costofhamburgers)
	{
		greaterofboth=chickenpatties;
		greaterofbothcost=costofchickeburgers;
		smallerofboth=hamburgerpatties;
		smallerofbothcost=costofhamburgers;
	}
	else
	{
		greaterofboth=hamburgerpatties;
		greaterofbothcost=costofhamburgers;
		smallerofboth=chickenpatties;
		smallerofbothcost=costofchickeburgers;
	}
	if(numberofburgers==0)
	{
		profit[i]=0;
	}
	else if(numberofburgers>0)
	{
		if(greaterofboth==numberofburgers)
		{
			profit[i]=greaterofboth*greaterofbothcost;
		}
		else if(greaterofboth>numberofburgers)
		{
			profit[i]=greaterofbothcost*numberofburgers;
		}
		else
		{
			if((greaterofboth + smallerofboth) < numberofburgers)
			{
				profit[i]=(greaterofboth*greaterofbothcost)+(smallerofboth*smallerofbothcost);
			}
			else if((greaterofboth + smallerofboth) > numberofburgers) 
			{
				profit[i]=(greaterofboth*greaterofbothcost)+((numberofburgers-greaterofboth)*smallerofbothcost);
			}
		}
	}
}
	for(int i=0;i<profit.length;i++)
	{
		System.out.println(profit[i]);
	}
}
}
