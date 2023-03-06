package first;

import java.util.Scanner;

public class atm {
	static int islem;
	static int bakiye=1000;
	public static void islemsec() {
		Scanner scanneri=new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islemi seciniz.");
		System.out.println("---1)Para yatirma---");
		System.out.println("---2)Para cekme---");
		System.out.println("---3)Bakiye sorgulama---");
		System.out.println("---4)Cikis---");
		islem=scanneri.nextInt();
	}

	public static void giris(){
		System.out.println("Lutfen kart numarnizi giriniz.");
		Scanner scanner = new Scanner(System.in);
		int kartno=scanner.nextInt();
		while(kartno!=123456) {
			System.out.println("Boyle bir kart numarasi bulunmamaktadir.Lutfen tekrar giriniz.");
			kartno=scanner.nextInt();
		}
		System.out.println("Lutfen sifrenizi giriniz.");
		int sifre=scanner.nextInt();
		while(sifre!=2002) {
			System.out.println("Sifre yanlis lutfen tekrar gir.");
			sifre=scanner.nextInt();
		}
	}
	public static void islemyap(){
		if(islem==1) {
			Scanner scannerekle=new Scanner(System.in);
			System.out.println("Ne kadar yatirmak istediginiz miktari soyleyiniz.");
			int yatirma=scannerekle.nextInt();
			bakiye=bakiye+yatirma;
			System.out.println("Yatirma islemiden sonraki miktar."+bakiye);
			System.out.println("Ne islem yapmak istediginizi seciniz.");
			islemsec();
			islemyap();

		}
		else if(islem==2){
			if(bakiye>0) {
				Scanner scannercek=new Scanner(System.in);
				System.out.println("Cekmek istediginiz miktari soyleyiniz");
				int cekme=scannercek.nextInt();
				bakiye=bakiye-cekme;
				System.out.println("Cekme islemiden sonraki miktar."+bakiye);
				System.out.println("Ne islem yapmak istediginizi seciniz.");
				islemsec();
				islemyap();
			}
			else {
				System.out.println("Bakiyeniz 0 oldugu icin daha fazla para cekemezsiniz.");
				System.out.println("Ne islem yapmak istediginizi seciniz.");
				islemsec();
				islemyap();
			}
		}
		else if(islem==3) {
			System.out.println(bakiye);
			System.out.println("Ne islem yapmak istediginizi seciniz.");
			islemsec();
			islemyap();
		}
		else if(islem==4){
			System.exit(0);
		}
		else {
			System.out.println("Yapmak istediginiz islem gecersiz lutfen gecerli bir islem seciniz.");
			islemsec();
			islemyap();
		}
		
	}
	
	public static void main(String[] args) {
		giris();
		islemsec();
		islemyap();
	}

}
