import java.util.*;
import java.io.*;
public class Solution13
{
	public static void main(String args[])
	{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
Spaced m=new Spaced();
boolean d=m.evenlySpaced(a,b,c);
System.out.println(d);
}
}
