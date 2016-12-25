package Observers;

import java.util.Observable;

import ElectoralVote.electSplit;
import PopularVote.popDemocrat;

public class ObserverDemPop_RepElect extends abstractVoteObserver {

	public ObserverDemPop_RepElect(Observable observable){
		super(observable);
		electoralVote= new electSplit();
		popularVote= new popDemocrat();
	}
}
