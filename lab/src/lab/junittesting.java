package lab;
import java.util.Scanner;

public class junittesting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2=sc.nextInt();
		sum1(n1,n2);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String n3=s.nextLine();
		System.out.println("Enter the second string: ");
		String n4=s.nextLine();
		join(n3,n4);
		}
		//sum method
		public static int sum1(int A,int B){
		int sum=0;
		sum=A+B;
		return sum;
		}
		public static String join(String C,String D){
			return C+D;
			}
        
	}


