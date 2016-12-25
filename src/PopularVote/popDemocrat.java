package PopularVote;

import Voting.States;

public class popDemocrat implements IpopularVote{


	private long[] democratVotes;
	private long[] republicanVotes;
	
	public popDemocrat(){
	
		democratVotes=new long[5];
		republicanVotes=new long[5];
	}
	public void countVotes(States[] states){
		
		States maxRepub=states[0];
		
		//find the state with the max republican votes.
		for(int i=1;i<states.length;i++)
		{
			if(states[i].getRepublican()>maxRepub.getRepublican())
				maxRepub=states[i];
		}

		
		for(int i=0;i<states.length;i++)
		{
			//ignore the republican votes of the state with the max republican votes.
			if(states[i].getName().equals(maxRepub.getName()))
			{
				republicanVotes[i]=0;
				democratVotes[i]=states[i].getDemocratic();
			}
			else{
			democratVotes[i]=states[i].getDemocratic();
			republicanVotes[i]=states[i].getRepublican();
			}
			
		}
		
	}
	
	public long[] getDemocratPop(){
		return democratVotes;
	}
	
	public long[] getRepublicanPop(){
		return republicanVotes;
	}
	

}
