import java.util.Scanner;
public class Squareroot{
static int Sqrt(int x)
{
if (x == 0 || x == 1)
return x;
int i = 1, result = 1;
while (result < x) {
i++;
result = i * i;
}
return i ;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int x = sc.nextInt();
System.out.print("Square Root:"+Sqrt(x));
}
}

