import java.util.*;
class herons
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double a,b,c,area,s;
System.out.println("enther the a");
a=sc.nextDouble();
System.out.println("enter the b");
b=sc.nextDouble();
System.out.println("enter the c");
c=sc.nextDouble();
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("s ="+s);
System.out.println("area = "+area);
}
} 