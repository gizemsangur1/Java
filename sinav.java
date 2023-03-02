package first;
import java.util.Scanner;
public class sinav {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Adinizi giriniz:");
		String isim=scanner.nextLine();
		
		System.out.println("Soyadinizi giriniz:");
		String soyisim=scanner.nextLine();
		
		System.out.println("Dersinizi giriniz:");
		String dersadi =scanner.nextLine();
		
		System.out.println("1.Vize notunuzu giriniz:");
		double vizenot1=scanner.nextDouble();
		
		System.out.println("2.Vize notunuzu giriniz:");
		double vizenot2=scanner.nextDouble();
		
		System.out.println("Final notunuzu giriniz:");
		double finalnot=scanner.nextDouble();
		
		double ogrencinotu=((vizenot1*30)/100)+((vizenot2*30)/100)+((finalnot*40)/100);
		
		if(ogrencinotu<60) {
			System.out.println(isim+soyisim+" adli ogrenci "+ogrencinotu+" ortalamasi ile "+dersadi+" dersinden kalmistir.");
		}
		else {
			System.out.println(isim+soyisim+" adli ogrenci "+ogrencinotu+" ortalamasi ile "+dersadi+" dersinden gecmistir.");
		}
	}

}
