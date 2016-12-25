package Voting;

import Observers.*;



public class main {

	public static void main(String[] args){
		States[] states=new States[5];
		
		states[0]=new States("NEW YORK",4143874,2640570,29);
		states[1]=new States("TEXAS",3867816,4681590,38);
		states[2]=new States("NEVADA", 537753,511319,6);
		states[3]=new States("CALIFORNIA", 7362490,3916209,55);
		states[4]=new States("OHIO",2771984,2317001,18);
		
		VotesObservable observable=new VotesObservable(states);
		
		
		abstractVoteObserver observer=new ObserverFavorRepublican(observable);
		
		observer=new ObserverFavorDemocratic(observable);
		
		observer=new ObserverDemPop_RepElect(observable);
		
		observer=new ObserverDemHonest_RepFavElect(observable);
		
		observer=new ObserverHonest(observable);
	
		observable.setStates(states);
		
		}
}
