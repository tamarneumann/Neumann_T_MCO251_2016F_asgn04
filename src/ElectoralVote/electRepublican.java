package ElectoralVote;

import Voting.States;

public class electRepublican implements IelectoralVote {


	private int[] democratVotes;
	private int[] republicanVotes;
	
	public electRepublican(){
	
		democratVotes=new int[5];
		republicanVotes=new int[5];
	}
	public void countVotes(States[] states) {
			
		for(int i=0; i<states.length;i++)
		{
			//Texas will always be republican.
			if(states[i].getName().equals("TEXAS")
			   ||states[i].getRepublican()>=states[i].getDemocratic())
				
				republicanVotes[i]=states[i].getElectoral();
			
			else
				democratVotes[i]=states[i].getElectoral();
		}
	
	
	}

	public int[] getDemocratElect(){
		return democratVotes;
	}
	
	public int[] getRepublicanElect(){
		return republicanVotes;
	}

	
}
