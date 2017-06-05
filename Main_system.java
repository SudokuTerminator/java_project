package java_project.erc;
import java_project.erc.CRC;
import java.util.Scanner;
public class Main_system {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		CRC crc = new CRC();
		String erc;
		byte[] data;
		int value;
		System.out.printf("Please input the way for error correction:");
		while(true){
			if(scan.hasNextLine()){
				erc = scan.nextLine();
				break;
			}
			else
				System.out.printf("You may input a wrong way,please input again:");
		}
		System.out.printf("Please input hexdemical data(Put ' ' between two byte datas!) :");
		data = scan.nextByte();
		System.out.printf("Now input datas you have declared:");
		value = scan.nextInt();
		System.out.println(CRC32(data,value));
	}
}
