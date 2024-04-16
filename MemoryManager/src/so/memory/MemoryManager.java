package so.memory;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import so.Process;
import so.SubProcess;

public class MemoryManager {
	private SubProcess[][] physicalMemory;
	private Hashtable<String, FrameMemory> logicalMemory;
	private int pageSize;
	private int sizeMemory;
	
	public static int NUM_OF_INSTRUCTIONS_PER_SUB_PROCESS = 7;

	public MemoryManager(int sizeMemory, int pageSize) {
		this.pageSize = pageSize;
		this.sizeMemory = sizeMemory;
		
		int pages = (int)Math.ceil(this.sizeMemory / this.pageSize);
		this.physicalMemory = new SubProcess[sizeMemory] [pageSize];
		this.logicalMemory = new Hashtable<>();

		
	}

	public void write(Process p) {
		this.writeUsingPaging(p);
	}

	private void writeUsingPaging(Process p) {
		List<FrameMemory> frames = this.getFrames(p);
		if (frames != null) {
			for (int i = 0; i < frames.size(); i++) {
				for (int offset = 0; offset < this.pageSize; offset++) {
					FrameMemory frame = frames.get(i);
					
					SubProcess sp = new SubProcess(p.getId(), NUM_OF_INSTRUCTIONS_PER_SUB_PROCESS);
					this.physicalMemory[frame.getPageNumber()] [offset] = sp;
					
							
					frame.setDisplacement(offset);
					this.logicalMemory.put(sp.getId(), frame);
					
				}
			}
			
		} else {
			
		}
		SubProcess.count = 0;
		this.printMemoryStatus();
		
	}

	/*public void delete (Process p) {
		//List<FrameMemory> frames = this.logicalMemory.get(p.getId());
		for(int i = 0; i < this.physicMemory.length; i++) {
			if(i == 60) {
				System.out.println("Aqui jovem");
			}
			//FrameMemory actuallyFrame = frames.get(i);
			//for (int j = actuallyFrame.getFrameNumber(); j < actuallyFrame.getOffset();) {
			if (this.physicMemory[i] != null && this.physicMemory[i].equals(p.getId())) {
				this.physicMemory[i] = null;
			}
			//}
		}
		printMemoryStatus();
//this.logicalMemory.remove(p.getId());
}*/

	private List<FrameMemory> getFrames(Process p) {
		List<FrameMemory> frames = new LinkedList<>();
		int numOfPages = (int) Math.ceil(p.getSizeInMemory()/this.pageSize;
		for (int frame = 0; frame < this.physicalMemory.length; frame++) {
			if (this.physicalMemory[frame][0] == null) {
				frames.add(new FrameMemory(frame));
				if (frames.size() == numOfPages) {
					return frames;
					
				}
				
			}
		}
		return null;
		
		
	}
		
	//private List<String> read(String processId) {}


	private void printMemoryStatus() {
		for (int i = 0; i < this.physicalMemory.length; i++); {
			for (int j = 0; j < this.pageSize; j++) {
				Subprocess sp = this.physicalMemory[i][j];
				String spId = null;
					if (sp != null) {
						spId = sp.getId();
					}
					if (j == this.physicalMemory[i].length - 1) {
						System.out.print(spId);
					} else {
						System.out.print(spId + " | ");
					}
						
}
	

}

	}
}

	public List<SubProcess>read(Process p) {
		List<String> ids = p.getProcesses();
		List<SubProcess> sps = new LinkedList<>();
		for (String id  : ids) {
			FrameMemory frame = this.logicalMemory.get(id);
			sps.add(this.physicalMemory[frame.getPageNumber()][frame.getDisplacement()]);	

	}
		return sps;
	}

	public void delete(Process p) {
		// TODO Auto-generated method stub
		
	}
