import java.util.*;
public class ToCalculateShape{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type 1 To Calculate Circle ");
		System.out.println("Type 2 To Calculate Rectangle ");
		System.out.println("Type 3 To Calculate Square");
		System.out.println("Type 4 To Calculate Triangle ");
		
		Scanner sc = new Scanner(System.in);
		int shape = sc.nextInt();
		switch (shape) {
		case 1 :
			System.out.print("Enter the radius ");
			int b1 = sc.nextInt();
			double area = (3.14 *b1*b1);
			System.out.println("Area is "+ area);
			break;
		case 2 :
			System.out.print("Enter the length ");
			int c1 = sc.nextInt();
			System.out.print("Enter the Width ");
			int c2 = sc.nextInt();
			double are = (c1 * c2);
			System.out.println("Area Of rectangle is "+ are);
			break;
		case 3 :
			System.out.print("Enter the Length ");
			int d1 = sc.nextInt();
			double ar = (d1*d1);
			System.out.println("Area Of Square is "+ ar);
			break;
		case 4 :
			System.out.print("Enter the base ");
			int e1 = sc.nextInt();
			System.out.print("Enter the Height");
			//int e1 = sc.nextInt();
			int e2 = sc.nextInt();
			double g = ((e1*e2)/2);
			System.out.println("Area of Triangle is "+ g);
			break;
		}
	}
}

