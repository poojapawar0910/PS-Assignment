package pooja;

public class MainWorker {

	public static void main(String[] args) {
		DailyWorker d = new DailyWorker("Jon",12,35);
		SalariedWorker s = new SalariedWorker("Raja",20,50);
		
		d.pay(20);
		s.pay();

	}

}
