import java.util.Scanner;
class Palindrome
{
public static void main(String arg[])
{
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
int flag=0;
int len=str1.length();
for(int i=0;i<=len/2;i++)
{
if(str1.charAt(i)!=str1.charAt(len-1-i))
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.print("string is not palindrome");
}
else
{
System.out.print("string is palindrome");
}
}
}
