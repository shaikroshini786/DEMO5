import java.util.Scanner;
class LoopWhile1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//for(int i=100;i>=0;i--)
int i=n;
while(i>=0)
{
System.out.print(i + " ,");
i=i++;
}
}
} 