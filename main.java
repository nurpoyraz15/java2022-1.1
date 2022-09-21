package sartblok;

public class main {

	public static void main(String[] args) {
		// Şart Blokları
		//1.if-else blokları
		int sayi1 = 36;
	    int sayi2 = 33;
	    int sayi3 =35;
	    int enKucuk = sayi3;
	    if (sayi2< enKucuk) {
	    enKucuk= sayi2;
	    }
        if (sayi1< enKucuk) {
        enKucuk = sayi1;	
        }
        System.out.println("En Küçük:"+ enKucuk);
        
        System.out.println("--------");
        // 2.Switch Blokları
        char city= 'İ';
        switch (city) {
        case 'K':
        System.out.println("Konya'nın yemekleri güzeldir.");
        break;
        case 'A':
        	System.out.println("Ankara'nın yemekleri güzeldir.");
        	break;
        case 'İ':
        	System.out.println("İstanbul'un yemekleri güzeldir.");
        	break;
        case 'T':
        	System.out.println("Trabzon'un yemekleri güzeldir.");
        	break;
        default:
        	System.out.println("Diğer şehirlerin yemekleri de güzeldir.");
        	{
        		
        	}
        	
       
        	
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
	    }
        
}
	
	
