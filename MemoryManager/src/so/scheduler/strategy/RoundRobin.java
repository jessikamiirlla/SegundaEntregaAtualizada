package so.scheduler.strategy;

public class RoundRobin extends Scheduler {
	
	private int quantum;
	
	public RoundRobin(int numberOfCores, int quantum) {
		super (numberOfCores);
		this.quantum = quantum;
	}
	
	public RoundRobin(int numberOfCores) {
		this(numberOfCores, 500);
	}
	
	@Override
	Public void execute(Process p) {
		
	}

}
