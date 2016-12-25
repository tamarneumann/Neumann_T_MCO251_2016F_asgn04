package Observers;

import java.util.Observable;

import ElectoralVote.electDemocrat;
import PopularVote.popHonest;

public class ObserverDemHonest_RepFavElect extends abstractVoteObserver {

	public  ObserverDemHonest_RepFavElect(Observable observable)
	{
		super(observable);
		electoralVote=new electDemocrat();
		popularVote=new popHonest();
	}
}
