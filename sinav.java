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
		
		System.out.println("Birinci vize notunuz ortalamanizi yuzde kac etkiliyor");
		double vize1etki=scanner.nextDouble();
		
		System.out.println("1.Vize notunuzu giriniz:");
		double vizenot1=scanner.nextDouble();
		
		System.out.println("Ikinci vize notunuz ortalamanizi yuzde kac etkiliyor");
		double vize2etki=scanner.nextDouble();
		
		System.out.println("2.Vize notunuzu giriniz:");
		double vizenot2=scanner.nextDouble();
		
		
		double finaletki=100-(vize1etki+vize2etki);
		
		System.out.println("Final notunuzu giriniz:");
		double finalnot=scanner.nextDouble();
		
		double ogrencinotu=((vizenot1*vize1etki)/100)+((vizenot2*vize2etki)/100)+((finalnot*finaletki)/100);
		
		if(ogrencinotu<60) {
			System.out.println(isim+soyisim+" adli ogrenci "+ogrencinotu+" ortalamasi ile "+dersadi+" dersinden kalmistir.");
		}
		else {
			System.out.println(isim+ soyisim+" adli ogrenci "+ogrencinotu+" ortalamasi ile "+dersadi+" dersinden gecmistir.");
		}
	}

}
