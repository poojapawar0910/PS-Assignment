package pooja;

public class CalculateEggs {
	private int totalNoOfEggs;
	private int eggs;
	
	public void setTotalNoOfEggs(int totalNoOfEggs) {
		this.totalNoOfEggs = totalNoOfEggs;
	}
	public String getTotalNoOfEggs() {
		String an = cal();
		return an;
	}
	private String cal(){
	EggUnit e = new EggUnit();
	String an = "";
	int g = e.getGross();
	int d = e.getDozen();
	int r = e.getReamaining();
	eggs = 150;
	g = eggs/144;
	
	int aboveGross = eggs %144;
	
	d = aboveGross / 12;
	r = aboveGross % 12;
	an = "Grass is : "+Integer.toString(g)+" Dozen is :"+Integer.toString(d)+ " Remaining is "+Integer.toString(r);
	return an;

}
}
