package Observers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Observable;
import java.util.Observer;

import ElectoralVote.IelectoralVote;
import PopularVote.IpopularVote;
import Voting.States;
import Voting.VotesObservable;

public abstract class abstractVoteObserver implements Observer {

	IelectoralVote electoralVote;
	IpopularVote popularVote;
	private States[] states;
	private int[] democratElectoral;
	private int[] republicanElectoral;
	private long[] democratPopular;
	private long[] republicanPopular;
	
	
	public abstractVoteObserver(Observable observable){
		observable.addObserver(this);
		this.democratElectoral=new int[5];
		this.democratPopular=new long[5];
		this.republicanElectoral=new int[5];
		this.republicanPopular= new long[5];
		this.states=new States[5];
	}
	
	
	public void update(Observable observable, Object object){
		if(observable instanceof VotesObservable)
		{
	    VotesObservable votesObservable=(VotesObservable)observable;
		this.states=votesObservable.getStates();
		
		electoralVote.countVotes(states);
		popularVote.countVotes(states);
		
		
		democratElectoral=electoralVote.getDemocratElect();
		republicanElectoral=electoralVote.getRepublicanElect();
		
		democratPopular=popularVote.getDemocratPop();
		republicanPopular=popularVote.getRepublicanPop();
		
		voteResults();
		
		}
		
	}

		
	
	public void voteResults(){
		long totalDemocrat=0;
		long totalRepub=0;
		
		
		System.out.println("\nAll reports are purely observational and not legally binding in any way "+LocalDate.now()+" "+LocalTime.now());
		System.out.print("\t\t\t");
		for(States stateX:states)
		{
			System.out.printf("%-25s",stateX.getName());
		}
		    System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------");
		    
		System.out.printf("%-25s","Popular Democratic:");  
		for(long dem:democratPopular)
		{
			System.out.printf("%-,25d", dem);
		}
		
	    System.out.printf("\n%-25s","Popular Republican:");
		for(long rep: republicanPopular)
		{
			System.out.printf("%-,25d", rep);
		}
		
		 System.out.printf("\n%-25s","Electoral Democratic:");
		for(int dem:democratElectoral)
		{
			System.out.printf("%-,25d", dem);
		}
		
		 System.out.printf("\n%-25s","Electoral Republican:");
		for(int rep:republicanElectoral)
		{
			System.out.printf("%-,25d", rep);
		}
		
	
		for(int i=0;i<states.length;i++)
		{
			totalDemocrat+=democratElectoral[i];
			totalRepub+=republicanElectoral[i];
		}
		System.out.println("\n\nTotal Democratic votes: "+totalDemocrat);
		System.out.println("Total Republican votes: "+ totalRepub);
	}

	
}
