import java.util.*;
class Leap
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int year;
System.out.println("enter the year");
year=sc.nextInt();
if(year%4==0)
{
System.out.println("it is a leap year");
}
else
{
System.out.println("it is not a leap yesr");
}
}
}

