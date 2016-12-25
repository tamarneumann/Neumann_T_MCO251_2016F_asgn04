package PopularVote;

import Voting.States;

public class popHonest implements IpopularVote{
	

	private long[] democratVotes;
	private long[] republicanVotes;
	
	public popHonest(){
	
		democratVotes=new long[5];
		republicanVotes=new long[5];
	}
	
	public void countVotes(States[] states){
	
		for(int i=0;i<states.length;i++)
		{
			democratVotes[i]=states[i].getDemocratic();
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
