package ElectoralVote;

import Voting.States;

public class electSplit implements IelectoralVote {


	private int[] democratVotes;
	private int[] republicanVotes;
	
	public electSplit(){
	
		democratVotes=new int[5];
		republicanVotes=new int[5];
	}
	
	public void countVotes(States[] states) {

		
		States closest=null;
		for(int i=0;i<states.length;i++)
		{
			if(states[i].getDemocratic()>states[i].getRepublican())
			{
				if(closest==null)
					closest=states[i];
				
				else if(states[i].getDemocratic()-states[i].getRepublican()<closest.getDemocratic()-closest.getRepublican())
				closest=states[i];
			}
		}
		
		for(int i=0;i<states.length;i++)
		{
			if(states[i].getName().equals(closest.getName()))
			 {
				double split=(double)states[i].getElectoral()/2;
				democratVotes[i]=(int) Math.floor(split);
				republicanVotes[i]=(int)Math.ceil(split);
			 }
			
			else
			{
				if(states[i].getDemocratic()>states[i].getRepublican())
					democratVotes[i]=states[i].getElectoral();
				
				else
					republicanVotes[i]=states[i].getElectoral();
			}
		}
		
	}
	
	public int[] getDemocratElect(){
		return democratVotes;
	}
	
	public int[] getRepublicanElect(){
		return republicanVotes;
	}
}
