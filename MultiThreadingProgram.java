package MyThread;

import java.util.Arrays;
class AA extends Thread
{
public void run()
{
// Fibonacci series
int n1=21,n2=34,n3,i,count=10;
System.out.println(n1);
System.out.println(n2);
for(i=2;i<count;++i)
{
n3=n1+n2;
System.out.println(n3);
if(n3>=233)
{
try
{
sleep(2000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
n1=n2;
n2=n3;
}
}
}
class BB extends Thread
{
public void run()
{
// anagram
String str1 = "race";
String str2="care";
str1 = str1.toLowerCase();
str2=str2.toLowerCase();
if(str1.length()==str2.length())
{
char[] charArray1=str1.toCharArray();
char[] charArray2=str2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
boolean result = Arrays.equals(charArray1,charArray2);
if(result)
{
System.out.println(str1 + "and" + str2 + "are anagram");

}
else
{
System.out.println(str1 + "and" + str2 + "are not anagram");
}
}
else
{
System.out.println(str1 + "and" + str2 + "are not anagram");

}
}
}
class CC extends Thread
{
public void run()
{
// Palindrome
String original = " malayalam";
String reverse = "";
int length = original.length();
for(int i=length-1;i>=0;i--)
reverse=reverse+original.charAt(i);
if(original.equals(reverse))
System.out.println("Entered string is a Palindrome");
else
System.out.println("Entered string / number is not a Palindrome");
}
}
class DD extends Thread

{
public void run()
{
int number = 97862;
for(int i = 1;i<=10;i++)
{
System.out.println(number + "*" + i + "=" + (number*i));

}
}
}
public class MultiThreadingProgram
{
public static void main(String args[])
{
AA a = new AA();
a.start();
BB b = new BB();
b.start();
CC c = new CC();
c.start();
DD d = new DD();
d.start();
}
} 
