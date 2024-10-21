import java.util.Scanner;
class Frequency
{
public static void main(String arg[])
{
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("Enter the character to search");
Scanner st=new Scanner(System.in);
String str2=st.nextLine();
int count=0;
int i;
int len=str1.length();
for(i=0;i<len-1;i++)
{
if (str1.charAt (i)==str2.charAt (0))
{
count=count+1;
}
}
System.out.println(count);
}
}
