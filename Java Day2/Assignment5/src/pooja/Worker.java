package pooja;

public class Worker {
	String emp_name;
	int emp_id;
	
	
	Worker(String n,int id){
		emp_name = n;
		emp_id = id;
	}
	void show() {
		System.out.println("Employee Name : "+emp_name);
		System.out.println("Employee ID : "+emp_id);
	}

}
