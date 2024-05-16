import java.util.*;
class Sphere
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double r,area;
System.out.println("enter the radius");
r=sc.nextDouble();
area=4/3*3.14*r*r*r;
System.out.println("area"+area);
}
}