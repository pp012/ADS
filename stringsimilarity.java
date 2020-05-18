import java.util.*;
public class string1
{
static int solve(String sample){    
        int len=sample.length();
        char[] letters = sample.toCharArray();
        int sim=sample.length();
        for(int i=1;i<len;i++){
            for(int j=i;j<len;j++){
                if(letters[j-i]==letters[j])
                    sim++;
                else
                    break;
            }
        }
    return sim;
}
    public static void main(String ar[])
    {
        string1 obj=new string1();
        Scanner scan=new Scanner(System.in);
        int cases=scan.nextInt();
        int result[]=new int[cases];
        for(int p=0;p<cases;p++)
        {
            String s=scan.next();
            result[p]=obj.solve(s);
        }
        for(int p=0;p<cases;p++)
        {
            System.out.println(result[p]);
        }
    }
}