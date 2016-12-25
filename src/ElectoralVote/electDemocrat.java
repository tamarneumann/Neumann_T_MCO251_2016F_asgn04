package ElectoralVote;

import Voting.States;

public class electDemocrat implements IelectoralVote{


	private int[] democratVotes;
	private int[] republicanVotes;
	
	public electDemocrat(){
	
		democratVotes=new int[5];
		republicanVotes=new int[5];
	}
	public void countVotes(States[] states){
		
		
		//set the state with the highest electoral votes to the first state.
		 States maxState=states[0];
		
		//don't compare the first state.
		for(int i=1;i<states.length;i++)
		{
		   if(states[i].getElectoral()>maxState.getElectoral())	
		   {
			   maxState=states[i];
		      
		   }
		}
		
		for(int i=0;i<states.length;i++)
		{
			
			//if the democratic party is winning the popular vote or has the highest electoral college, it wins the electoral vote.
			if(states[i].getDemocratic()>=states[i].getRepublican()
				||states[i].getName().equals(maxState.getName()))
				
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
