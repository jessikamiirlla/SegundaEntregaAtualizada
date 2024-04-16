package so.scheduler.strategy;

import so.schedule.Schedule;

public class Lottery extends Schedule{
	public Lottery(int numberOfCores) {
		super(numberOfCores);
	}
	
	@Override
	public void execute (Process p) {
		
	}
	
	@Override
	public void finish (Process p) {
		
	}

}
