import java.util.*;
class Biggest
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter the number");
a=sc.nextInt();
System.out.println("enter the number");
b=sc.nextInt();
if(a>b)
{
System.out.println("a is biggest"+a);
}
else
{
System.out.println("b is biggest"+b);
}
}
}