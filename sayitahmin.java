package first;
import java.util.Random;
import java.util.Scanner;
public class sayitahmin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		System.out.println("Lutfen 0 ve 100 arasinda bir sayi soyleyiniz.");
		
		int tahmin=scanner.nextInt();
		int a=0;
		int sayi=random.nextInt(101);
		a++;
		
			while(tahmin!=sayi) {
				
				if(tahmin<sayi){
					System.out.println("Daha buyuk bir sayi giriniz.");
					tahmin=scanner.nextInt();
					a++;
					if(a>=3) {
						System.out.println("Oyunu kaybettiniz");
						System.exit(a);
					}
				}
				else if(tahmin>sayi) {
					System.out.println("Daha kucuk bir sayi giriniz.");
					tahmin=scanner.nextInt();
					a++;
					if(a<3) {
						System.out.println("Oyunu kaybettiniz");
						System.exit(a);
					}
				}	
		}	
		System.out.println("Oyunu kazandiniz");
		
		

	}

}
