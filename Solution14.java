import java.util.*;
import java.io.*;
public class Solution14
{
	public static void main(String args[])
	{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
String s=in.next();
String st=in.next();
Separator m=new Separator();
String d=m.repeatSeparator(s,st,a);
System.out.println(d);
}
}
