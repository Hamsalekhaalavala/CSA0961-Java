import java.util.*;
class Remainder
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b,quo,rem;
System.out.println("enter the a");
a=sc.nextInt();
System.out.println("enter the b");
b=sc.nextInt();
quo=a/b;
rem=a%b;
System.out.println("quo"+quo);
System.out.println("rem"+rem);
}
}
