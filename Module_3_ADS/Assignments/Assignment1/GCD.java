import java.util.Scanner;
public class GCD {
private static int gcd(int n1, int n2) {
if(n2==0) 
return n1;
return gcd(n2,n1%n2);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Two Number:");
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println("GCD:"+gcd(n1,n2));
}
}
