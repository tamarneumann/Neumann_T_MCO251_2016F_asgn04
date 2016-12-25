package Voting;

import java.util.Observable;
import java.util.Observer;

public class VotesObservable extends Observable{

	
	private States[]states;

	public VotesObservable(States[]states)
	{
		this.states=states;
		setChanged();
		notifyObservers();
	
	}
	//for a pull.
	public States[] getStates()
	{
		return states;
	}
	
	public void setStates(States[] states){
		this.states=states;
		setChanged();
		notifyObservers();
	}
	

}

	
