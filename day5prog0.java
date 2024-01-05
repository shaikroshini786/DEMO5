import java.util.Scanner;
class InputDayNumberIf
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
if(dn== 0){ System.out.println("SUNDAY");}
if(dn== 1){  System.out.println("MONDAY");}
if(dn== 2){ System.out.println("TUESDAY");}
if(dn== 3){ System.out.println("WEDNESDAY");}
if(dn== 4){ System.out.println("THURSDAY");}
if(dn== 5){ System.out.println("FRIDAY");}
if(dn== 6){ System.out.println("SATURDAY");}
else {System.out.println("INVALID");}
}
}
