package Observers;

import java.util.Observable;

import ElectoralVote.electHonest;
import PopularVote.popHonest;

public class ObserverHonest extends abstractVoteObserver{
	
	public ObserverHonest(Observable observable){
		super(observable);
		electoralVote=new electHonest();
		popularVote=new popHonest();
	}

}
