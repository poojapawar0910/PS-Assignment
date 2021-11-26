package pooja;

public class DailyWorker extends Worker{
	int rate;
	
	DailyWorker(String n,int id,int r){
		super(n,id);
		rate = r;
	}
	
	void pay(int h) {
		show();
		System.out.println("Salary : "+(rate*h));
	}

}
