public class Separator
{
	String s,st;
	int n;
public String repeatSeparator(String s,String st,int n)
{
String s2=s;
for(int i=n-1;i>=1;i--)
{
s2=s2+st;
s2=s2+s;
}
return s2;
}
}
