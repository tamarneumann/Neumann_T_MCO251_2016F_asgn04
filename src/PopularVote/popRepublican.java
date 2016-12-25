package PopularVote;

import Voting.States;

public class popRepublican implements IpopularVote {


	private long[] democratVotes;
	private long[] republicanVotes;
	
	public popRepublican(){
	
		democratVotes=new long[5];
		republicanVotes=new long[5];
	}
	public void countVotes(States[] states){
		
		
		//report 5% fewer democratic votes for each state.
		for(int i=0;i<states.length;i++)
		{
			democratVotes[i]=(long)(states[i].getDemocratic()*.95);
			republicanVotes[i]=states[i].getRepublican();
		}
		
		
	}
	
	public long[] getDemocratPop(){
		return democratVotes;
	}

	public long[] getRepublicanPop(){
		return republicanVotes;
	}
	
}
