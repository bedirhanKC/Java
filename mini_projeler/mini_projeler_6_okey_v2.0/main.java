import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
    	Scanner scanner = new Scanner(System.in);
    	
		Player firstPlayer= new Player();
		Player secondPlayer= new Player();
		Player thirdPlayer= new Player();
		Player fourthPlayer= new Player();
		Player[] players = {firstPlayer,secondPlayer,thirdPlayer,fourthPlayer};
		
		int winner,gosterge;
		boolean team = false;
		
		System.out.println("1-Eşli");
		System.out.println("2-normal");
		System.out.println("oynamak istediginiz turu seciniz;");
		
		if(scanner.nextInt()==1) team=true;
		System.out.println("");
		
		System.out.println("Kayit asamasina hosgeldiniz;");
		if(team) System.out.println("1. ve 3. oyuncu ile 2. ve 4. oyuncu takim olacaktir");
		
		for(int i=1 ; i<players.length+1 ; i++) {
    		
    		System.out.println( i + ". Oyuncu, lütfen adınızı yazınız : ");
            players[i-1].name=scanner.next();
            players[i-1].point=21;
    		
    	}
    	
    	System.out.println("");
    	if(team) ListelemeTakim(players);
		else Listeleme(players);
    	
    	do {
    		
    		

            System.out.println("Kazanan oyuncuyu seçiniz : ");
            winner=scanner.nextInt();
            while(winner<1 || winner>4){
            	
            	System.out.println("");
            	System.out.println("Hata! yanlis giris yaptiniz. Tekrar kazanan oyuncuyu giriniz: ");
            	winner=scanner.nextInt();
            	System.out.println("");
            	
            }
            
            System.out.println("gösterge gösteren oyuncuyu seçiniz [gösterilmediyse 0 giriniz]: ");
            gosterge=scanner.nextInt();
            while(winner<0 || winner>4){
            	
            	System.out.println("");
            	System.out.println("Hata! yanlis giris yaptiniz. Tekrar giris yapiniz: ");
            	winner=scanner.nextInt();
            	System.out.println("");
            	
            }
            
            if(gosterge!=0) {
            	
            	if(team) {
                	
                	if(gosterge+2<5) {
                		
                		players[gosterge-1].point--;
                		players[gosterge+1].point--;
                		
                	}else {
                		
                		players[gosterge-1].point--;
                		players[gosterge-3].point--;
                		
                	}
                	
                }else players[gosterge-1].point--;
            	
            }
            
            
            
            System.out.println("");

            if(team) {
            	
            	if(winner+2<5) {
            		
            		players[winner-1].point-=2;
            		players[winner+1].point-=2;
            		
            	}else {
            		
            		players[winner-1].point-=2;
            		players[winner-3].point-=2;
            		
            	}
            	
            }else players[winner-1].point-=2;
            
            if(team) ListelemeTakim(players);
    		else Listeleme(players);
           
            
    	}while(players[winner-1].point>0);
    	
    	System.out.println("");
    	
	}
	
	public static void Listeleme(Player...players) {
		
		System.out.println("-----------LIST-------------");
		
		for(int i=0 ; i<players.length ; i++) System.out.println(players[i].name + " --> " + players[i].point);
			
		System.out.println("---------------------------");
		System.out.println("");
		
	}
	
	public static void ListelemeTakim(Player...players) {
		
System.out.println("-----------LIST-------------");
		
		for(int i=0 ; i<players.length/2 ; i++) System.out.println(players[i].name +" ve "+ players[i+2].name + " --> " + players[i].point);
			
		System.out.println("---------------------------");
		System.out.println("");
		
	}
	
	

}
