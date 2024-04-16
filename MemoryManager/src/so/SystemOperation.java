package so;

import java.util.Objects;

import so.cpu.CpuManager;
import so.memory.MemoryManager;
import so.memory.Strategy;
import so.schedule.Schedule;

public class SystemOperation {
	public static MemoryManager mm;
	public static Schedule schedule;
	
	public static Process SystemCall(SystemCallType type, int sizeInMemory) {
		if(type.equals(SystemCallType.CREATE_PROCESS)) {
			if (Objects.isNull(mm)) {
				mm = new MemoryManager(256, 4);
			}
			if (Objects.isNull(schedule)) {
				schedule = new FCFS();
			}

		}
		return new Process(sizeInMemory);
	}
	
	public static List<SubProcess> systemCall(SystemCallType type, Process p) {
		
		if (type.equals(SystemCallType.WRITE_PROCESS)) {
			mm.write(p);
			schedule.execute(p);
			
		} else if (type.equals(SystemCallType.CLOSE_PROCESS)) {
			mm.delete(p);
			schedule.finish(p);
		} else if (type.equals(SystemCallType.READ_PROCESS)) {
			return mm.read(p);
			
		}
		return null;
	}
	
	

}
