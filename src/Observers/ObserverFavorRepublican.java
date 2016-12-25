package Observers;

import java.util.Observable;

import ElectoralVote.electRepublican;
import PopularVote.popRepublican;

public class ObserverFavorRepublican extends abstractVoteObserver {


	
	
	public ObserverFavorRepublican(Observable observable){
		super(observable);
		electoralVote=new electRepublican();
	   
		popularVote=new popRepublican();
	}

	
	
	
}
