import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Artık yıl bulma programı");
		System.out.print("Lütfen bir yıl giriniz: ");
		int year = scanner.nextInt(); 

		if(year%100 == 0) {
			
			if(year%400 == 0) {   //100 ün ve 400 ün katı olanlar bu bloğa girecektir. İç içe if bloğuyla sağladım.
				System.out.println(year + " artık yıldır.");
			}
			else {
				System.out.println(year + " artık yıl değildir.");
			}
		}
		else if(year % 4 == 0) {  //100 ün katı olmayıp 4 ün katı olan yıllar bu bloğa girecek.
			System.out.println(year + " artık yıldır.");
		}
		
		else {
			System.out.println(year + " artık yıl değildir.");
		}
	}
}
