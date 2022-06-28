import java.util.Scanner;  
 class ReverseNumber  
{  
public static void main(String args[])  
{  
int number; 
int reversenum=0;
System.out.print("Enter the number that you want to reverse: ");  
Scanner sc = new Scanner(System.in);  
 number = sc.nextInt();  

while(number!=0)  
{
	int n=number%10;             // n is remainder
    reversenum = reversenum * 10 + n;
    number = number/10;          
}  

System.out.print("The reverse of the given number is: "+reversenum);  

}  
}  