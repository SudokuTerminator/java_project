import java.util.Scanner;
public class Delta{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int character;
		char[] delta = {0x0394,'y','/',0x0394,'x','='};
		char[] dir = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String str = new String(delta);
		int count = 1;
		int power = 0;
		System.out.printf("x^?(0 <= ? <= 25)\n? = ");
		while(true){
			if(scan.hasNextInt()){
				power = scan.nextInt();
				break;
			}
			else
				System.out.println("You may not input an integer value,input again:");
		}
		if(power == 0){
			System.out.println(str + "0");
			return;
		}
		double[] data = new double[power];
		while(count <= power){
			character =  dir[count - 1];
			System.out.printf((char)character + " = ");
			while(true){
				if(scan.hasNextDouble()){
					data[count - 1] = scan.nextDouble();
					break;
				}
			}
			++count;
		}
		count = 0;
		System.out.printf(str);
		while(count < power){
			if(data[count] >= 0.0d)
				System.out.printf("+" + ((power - count) * data[count]) + "x^" + (power - count - 1));
			else
				System.out.printf("-" + ((power - count) * data[count]) + "x^" + (power - count - 1));
			++count;
		}
	}
}
