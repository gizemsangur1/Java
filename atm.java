package first;

import java.util.Scanner;

public class atm {
	static int islem;
	public static void islemsec(int islem) {
		Scanner scanneri=new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islem seciniz.");
		System.out.println("---1)Para yatirma---");
		System.out.println("---2)Para cekme---");
		System.out.println("---3)Bakiye sorgulama---");
		System.out.println("---4)Cikis---");
		islem=scanneri.nextInt();
	}
	public static void main(String[] args) {
		int bakiye=1000;
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
		islemsec(islem);
		
		switch(islem){
		case 1:
			System.out.println("Ne kadar yatirmak istediginiz miktari soyleyiniz.");
			int yatirma=scanner.nextInt();
			bakiye=bakiye+yatirma;
			System.out.println("Yatirma islemiden sonraki miktar."+bakiye);
			break;
		case 2:
			System.out.println("Cekmek istediginiz miktari soyleyiniz");
			int cekme=scanner.nextInt();
			bakiye=bakiye-cekme;
			System.out.println("Cekme islemiden sonraki miktar."+bakiye);
			break;
		case 3:
			System.out.println(bakiye);
			break;
		case 4:
			System.exit(0);
		}
		
	}

}
