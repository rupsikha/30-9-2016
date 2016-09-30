public class Spaced
{
public boolean evenlySpaced(int a,int b,int c)
{
if(a>b && a>c)
{
if(b>c)
{
if(a-b == b-c)
return true;
else
return false;
}
else
{
if(a-c == c-b)
return true;
else
return false;
}
}
else if(b>a && b>c)
{
if(a>c)
{
if(b-a == a-c)
return true;
else
return false;
}
else
{
if(b-c == c-a)
return true;
else
return false;
}
}
else
{
if(a>b)
{
if(c-a == a-b)
return true;
else
return false;
}
else
{
if(c-b == b-a)
return true;
else
return false;
}
}
}
}


