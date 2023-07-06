class Armstrong
{
public static void main(String[] args)
{
int n=153;
int sum=0;
int temp=n;
while(temp>0)
{
int rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(sum==n)
{
System.out.println("a is a armstrong num");
}
else
{
System.out.println("a is not a armstrong num ");
}
}
}