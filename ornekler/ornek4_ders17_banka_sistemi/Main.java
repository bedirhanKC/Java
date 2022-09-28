package ornek4_ders17_banka_sistemi;

public class Main {

	public static void main(String[] args) {
		
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		KrediUI krediUI = new KrediUI();
		
		krediUI.hesapla(tarimKrediManager);

	}

}
