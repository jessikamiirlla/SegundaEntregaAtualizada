package so.memory;
import so.Process;

public class MemoryManager {
	private String[] memory;
	private Strategy strategy;
	
	public MemoryManager(Strategy strategy) {
		this.memory = new String[128];
		this.strategy = strategy;
	}
	
	public void write (Process p) {
		if (strategy.equals(Strategy.FIRST_FIT)) {
			this.writeUsingFirstFit(p);		
		} else if (strategy.equals(Strategy.BEST_FIT)) {
			this.writeUsingBestFit(p);
		} else if (strategy.equals(Strategy.WORST_FIT)) {
			this.writeUsingWorstFit(p);
		}
		
	}
	
	private void writeUsingWorstFit (Process p) {
		// TODO Auto-generated method stub
	}
	
	private void writeUsingBestFit (Process p) {
		// TODO Auto-generated method stub
	
	}
	
	private void writeUsingFirstFit (Process p) {
		int actualSize = 0;
		
		for(int i = 0; i < memory.length; i ++) {
			if(i == (memory.length - 1)) {
				
				if(actualSize > 0) {
					if(p.getSizeInMemory() <= actualSize) {
						int start = (i - actualSize);
						for(int j = start; j < start + p.getSizeInMemory(); j++ ) {
							memory[j] = p.getId();
							
						}
						break;
					}
					
				}
				
			} else if(memory[i] == null) {
				actualSize++;
			} else {
				if(actualSize > 0) {
					if(p.getSizeInMemory() <= actualSize) {
						int start = i - actualSize;
						for(int j = start; j < (start + p.getSizeInMemory()); i++ ) {
							memory[j] = p.getId();
							
						}
						break;
					}
					
				}
				
			}
		}
		printMemoryStatus();
	}
	
	private void printMemoryStatus () {
		for (int i = 0; i < memory.length; i++) {
			System.out.print(memory[i] + " | ");
		}
	
	}
	
}
