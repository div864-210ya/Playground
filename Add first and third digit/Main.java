import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();
        int a;
          a=num/100;
      int n1,sum;
      n1=num%10;
      sum=a+n1;
      System.out.println(sum);
      
	}
}