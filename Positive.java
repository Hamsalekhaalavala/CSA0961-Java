import java.util.*;
class Positive
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter the year");
a=sc.nextInt();
if(a>0)
{
System.out.println("it is a positive");
}
else if(a==0)
{
System.out.println("it is a zero");
}
else
{
System.out.println("it is a negative");
}
}
}

