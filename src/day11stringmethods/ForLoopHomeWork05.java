package day11stringmethods;

import java.util.Scanner;

public class ForLoopHomeWork05 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp
		//bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen baslangic degerini giriniz : ");
		int num1=scan.nextInt();
		System.out.print("Lutfen bitis degerini giriniz : ");
		int num2=scan.nextInt();
		int product=1;
		
		for(int i=num1; i<=num2;i++) {
		   product=product*i;
		}System.out.println(num1+" ve "+num2+" arasindaki tum sayilar carpimi : "+product);

scan.close();

	}

}
