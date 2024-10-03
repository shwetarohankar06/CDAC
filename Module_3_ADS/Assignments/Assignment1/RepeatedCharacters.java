import java.util.Scanner;
public class RepeatedCharacters {
private static void findRepeat(String str) {
char[] c=str.toCharArray();
System.out.println("Repeated Character:");
for(int i=0;i<str.length();i++) {
for(int j=i+1;j<str.length();j++)
{
if(c[i]==c[j])
{
System.out.print(c[j]+" ");
   }
  }
 }
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String str=sc.nextLine();
findRepeat(str);
 }
}
