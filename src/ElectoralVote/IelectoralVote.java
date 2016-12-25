package ElectoralVote;

import Voting.States;

public interface IelectoralVote {
	public void countVotes(States[] states);
	public int[] getDemocratElect();
	public int[] getRepublicanElect();
	
	
}
