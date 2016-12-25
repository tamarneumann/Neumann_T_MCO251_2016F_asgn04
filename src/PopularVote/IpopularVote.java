package PopularVote;

import Voting.States;

public interface IpopularVote {
	public void countVotes(States[]states);
	public long[] getDemocratPop();
	public long[] getRepublicanPop();
}
