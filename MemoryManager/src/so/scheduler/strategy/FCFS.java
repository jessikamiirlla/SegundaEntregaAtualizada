package so.scheduler.strategy;

import java.util.List;
import java.util.PriorityQueue;

import so.SubProcess;
import so.SystemOperation;
import so.schedule.Schedule;

public class FCFS extends Schedule {
	
	private PriorityQueue<SubProcess> queue;
	
	public FCFS	(int numberOfCores) {
		super (numberOfCores);
		this.queue = new PriorityQueue<>();
	}
	
	@Override
	public void execute (Process p) {
		List<SubProcess> sps = SystemOperation.SystemCall(SystemCallType)
		for (int i = 0; i < sps.size(); i++) {
			this.queue.add(sps.get(i));
		}
		
		while (!this.queue.isEmpty()) {
			List<Integer> cpuCoresAvailable = this.getCpu().getAvailable
			if (!cpuCoresAvaible.isEmpty()) {
				for (int j = 0; j < cpuCoresAvaible.size(); j++)
					try {
						SubProcess sp = this.queue.poll().
						this.getCpu().registerProcess(cpuCoresAvailable.
					} catch (Exception e) {
						break;
					}
			}
		}
	}

}
