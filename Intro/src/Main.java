
public class Main {

	public static void main(String[] args) {
		//camelCase  > k���k harfle ba�la b�y�k harfe d�n
				//
			String internetSubeButonu = "�nternet �ubesi";
			System.out.println("Hello world");	
			
			System.out.println(internetSubeButonu); // verileri y�netmek i�in kullan
			//System.out.println("�nternet �ubesine gir");
			//System.out.println("�nternet �ubesine gir");
			//System.out.println("�nternet �ubesine gir");
			double dolarDun = 8.20 ; 
			double dolarBugun = 8.20 ;
			int vade = 36 ; 
			boolean dustuMu = true ;
			
			
			if(dolarBugun<dolarDun) {
			
				System.out.println("Dolar D��t� resmi");
				
			}
			
			else if (dolarBugun>dolarDun) {		
				System.out.println("Dolar y�kseldi resmi");		
			}
			else {		
				System.out.println("Dolar e�ittir resmi");		
				}	
			
			String kredi1 = "H�zl� Kredisi";
			String kredi2 = "Mutlu Emekli Kredisi";
			String kredi3 = "Konut Kredisi";
			String kredi4 = "�ift�i Kredisi";
			String kredi5 = "Msb Kredisi";
			String kredi6 = "Meb kredisi";
			String kredi7 = "K�lt�r Bakanl��� Kredisi";
			
			//System.out.println(kredi1);
			//System.out.println(kredi2);	
			//System.out.println(kredi3);
			//System.out.println(kredi4);	
			//System.out.println(kredi5);
			//System.out.println(kredi6);
			//System.out.println(kredi7);
			String[] krediler= {
								"H�zl� Kredisi",
								"Mutlu Emekli Kredisi",
								"Konut Kredisi",
								"�ift�i Kredisi",
								"Msb Kredisi",
								"Meb kredisi",
								"K�lt�r Bakanl��� Kredisi"
								};
			//foreach
			for(String kredi : krediler) {
				System.out.println(kredi);
			}
			
			for(int i=0 ; i<krediler.length ; i++ ) { // saya� g�d�ml� d�ng�
				System.out.println(krediler[i]);
			}
			 int sayi1 = 10 ;
			 int sayi2 = 20 ;
			 sayi1= sayi2 ;
			 sayi2=100 ;
			 System.out.println(sayi1);
			 int[] sayilar1 = {1,2,3,4,5};
			 int[] sayilar2 = {10,20,30,40,50};
			 sayilar1 = sayilar2 ;
			 sayilar2[0]=100 ;
			 System.out.println(sayilar1[0]);
			 
			 String sehir1 = "Ankara";
			 String sehir2 = "�stanbul";
			 sehir1 = sehir2 ;
			 sehir2="�zmir";
			 System.out.println(sehir1);
			 
			 
			}
		}
