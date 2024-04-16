package so.schedule;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.PriorityQueue;

import so.SubProcess;
import so.SystemOperation;
import so.cpu.Core;

public class SchedulerQueue extends Schedule {
	private PriorityQueue<Process> queue; 
	private Hashtable<String, List<SubProcess>> SubProcesses;
	
	
	public SchedulerQueue(Comparator<Process> comparator) {
		this.queue = new PriorityQueue<>(comparator);
		
		
	}
	public PriorityQueue<Process> getQueue() {
		return queue;
	}
	
	@Override
	public void execute(Process p) {
		List<SubProcess> sps = SystemOperation.SystemCall(SystemCallType.READ_PROCESS, p);
		this.queue.add(p);
		this.subProcesses.put(p.getId(), sps);
		this.registerSubProcesses();
		
	}
	
	private void registerSubProcesses() {
		//while() {
		//bugado
			
		//}
		Process p = this.queue.peek();
		List<SubProcess> sps = this.subProcesses.get(p.getId());
		
		Core[] cores = this.getCm().getCores();
		for (Core core: cores) {
			if (core.getCurrentSubProcess() != null) {
				SubProcess sp = sps.get(0);
				this.getCm().registerProcess(core.getId(),sp);
				
			}
			
		}
		
	}
	
	@Override
	public void finish(Process p) {
	
	}	

}
