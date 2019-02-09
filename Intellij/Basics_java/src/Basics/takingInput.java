import java.util.Scanner;
class takingInput {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);	
		
		int a;
		double b;
		float c;
		boolean d;
		short e;
		long f;
		
		System.out.printf("Input Int\n");
		a= input.nextInt();
		
		System.out.printf("Input Double\n");
		b= input.nextDouble();
		
		System.out.printf("Input Float\n");
		c= input.nextFloat();
		
		System.out.printf("Input Bool\n");
		d= input.nextBoolean();
		
		System.out.printf("Input Short\n");
		e= input.nextShort();
		
		System.out.printf("Input Long\n");
		f= input.nextLong();
		
		
		System.out.printf("Int  %d, Double  %f, Float  %f, Short %d, Long  %d", a, b, (float)c, e, f);
	}

}
