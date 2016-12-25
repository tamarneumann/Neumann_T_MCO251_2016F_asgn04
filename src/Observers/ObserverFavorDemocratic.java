package Observers;

import java.util.Observable;
import ElectoralVote.electDemocrat;
import PopularVote.popDemocrat;

public class ObserverFavorDemocratic extends abstractVoteObserver{

	public ObserverFavorDemocratic(Observable observable)
	{
		super(observable);
		electoralVote=new electDemocrat();
		popularVote=new popDemocrat();
	}
}
