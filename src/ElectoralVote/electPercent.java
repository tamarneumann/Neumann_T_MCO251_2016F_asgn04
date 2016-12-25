package ElectoralVote;

import Voting.States;

public class electPercent implements IelectoralVote {


	private int[] democratVotes;
	private int[] republicanVotes;
	
	public electPercent(){
	
		democratVotes=new int[5];
		republicanVotes=new int[5];
	}

		public void countVotes(States[]OriginalStates) {
			
			States[] states=copyStates(OriginalStates);
			
			for(int i=0;i<states.length;i++)
			{
				//add %2 of republican votes to Democratic votes.
				states[i].setDemocratic(states[i].getDemocratic()+((long)(states[i].getRepublican()*.02)));
				
				//remove 2% of republican votes.
				states[i].setRepublican((long)(states[i].getRepublican()*.98));
				
				if(states[i].getDemocratic()>states[i].getRepublican())
					democratVotes[i]=states[i].getElectoral();
				
				else
					republicanVotes[i]=states[i].getElectoral();
			}
			
     	
	}
		
 
		public States[] copyStates(States[] OriginalStates){
			
			States[]states=new States[5];
			
			for(int i=0;i<OriginalStates.length;i++)
			{
				states[i]=OriginalStates[i];
			}
			
			return states;
		}
		
		public int[] getDemocratElect(){
			return democratVotes;
		}
		
		public int[] getRepublicanElect(){
			return republicanVotes;
		}
		
		
}
