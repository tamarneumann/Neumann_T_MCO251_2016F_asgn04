package ElectoralVote;

import Voting.States;

public class electHonest implements IelectoralVote {

 
	private int[] democratVotes;
	private int[] republicanVotes;
	
	public electHonest(){

		democratVotes=new int[5];
		republicanVotes=new int[5];
	}
	public void countVotes(States[] states) {
	
	
		for(int i=0;i<states.length;i++)
		{
		   if(states[i].getDemocratic()>states[i].getRepublican())
		   
			   democratVotes[i]=states[i].getElectoral();
		   else
			   republicanVotes[i]=states[i].getElectoral();
	    }
	}
	
	public int[] getDemocratElect(){
		return democratVotes;
	}
	
	public int[] getRepublicanElect(){
		return republicanVotes;
	}
	

}
