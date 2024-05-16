import java.util.*;
class Vote
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("enter the age");
age=sc.nextInt();
if(age>=18)
{
System.out.println("eligible to vote");
}
else
{
System.out.println("not eligible to vote");
}
}
}