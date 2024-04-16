package so.schedule;

import so.cpu.CpuManager;
import so.Process;

public abstract class Schedule {
	public CpuManager cm;
	
	public Schedule() {
		cm = new CpuManager();
	}
	
	public abstract void execute (Process p);
	public abstract void finish (Process p);

	public CpuManager getCm() {
		return cm;
	}
	
	
	
}
	
	
	
	
	
	
	
	
	//private CpuManager cpu;
	
	//public Schedule(int numberOfCores) {
		//this.cpu = new CpuManager(numberOfCores);
	//}
	
	//public CpuManager getCpu() {
		//return cpu;
	//}
	
	//public void setCpu(CpuManager cpu) {
		//this.cpu = cpu;
	//}
	
	//public abstract void execute (Process p);
	
	//public abstract voi finish (Process p);

//}
