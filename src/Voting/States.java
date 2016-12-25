package Voting;

public class States {

	private String name;
	private long democratic;
	private long republican;
	private int electoral;
	
	
	
	public States(String name, long democratic,long republican, int electoral){
		this.name=name;
		this.democratic=democratic;
		this.republican=republican;
		this.electoral=electoral;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDemocratic() {
		return democratic;
	}

	public void setDemocratic(long democratic) {
		this.democratic = democratic;
	}

	public long getRepublican() {
		return republican;
	}

	public void setRepublican(long republican) {
		this.republican = republican;
	}

	public int getElectoral() {
		return electoral;
	}

	public void setElectoral(int electoral) {
		this.electoral = electoral;
	}


}
