package pooja;

public class SalariedWorker extends Worker {
	int rate;
	
	SalariedWorker(String n,int id,int r){
		super(n,id);
		rate = r;
	}
	
	int h = 160;
	
	void pay() {
		show();
		System.out.println("Salary : "+(rate*h));
	}

}
