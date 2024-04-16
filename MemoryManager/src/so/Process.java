package so;

import java.util.LinkedList;
import java.util.List;

public class Process {
	private String id;
	private int sizeInMemory;
	private List<String> processes;
	private int timeToExecute;
	private PriorityProcessType priorityType;
	public static int count;
	
	
	
	   public Process(int sizeMemory) {
	    	count++;
	    	Random rand = new Random();
			List<Integer> timeList = Arrays.asList(100,200,300,400,500,600,700,800,900,1000,10000);
			this.timeToExecute = timeList.get(rand.nextInt(timeList.size()));	
			
			PriorityProcessType[] priorityList = PriorityProcessType.values();
			this.priorityType = priorityList[rand.nextInt(priorityList.length)];
			
		    this.id = "P" + count;
	        this.sizeInMemory = sizeMemory;
	        this.processes = this.getProcesses();

	        
	   }
	   
		public List<String> getProcesses() {
			if (this.processes == null){
				this.processes = new LinkedList<>();
				for (int i = 0; i < this.sizeInMemory; i++) {
					String spId = this.getId() + i;
					this.processes.add(spId);
				}
			}
			return this.processes;
		}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSizeInMemory() {
		return sizeInMemory;
	}

	public void setSizeInMemory(int sizeInMemory) {
		this.sizeInMemory = sizeInMemory;
	}
	
	public int getTimeToExecute() {
		return timeToExecute;
	}
	public void setTimeToExecute(int timeToExecute) {
		this.timeToExecute = timeToExecute;
	}

	public PriorityProcessType getPriorityType() {
		return priorityType;
	}

	public void setPriorityType(PriorityProcessType priorityType) {
		this.priorityType = priorityType;
	}
	
	

	

	
 
        //this.sizeInMemory = sizeInMemory;
	
	//public Process(int sizeInMemory) {
		//this.id = UUID.randomUUID().toString();
		//this.sizeInMemory = sizeInMemory;
		/*Random r = new Random();
		List<Integer> numbers = Arrays.asList(1,2,4,6,10,20,50,100);
		this.sizeInMemory = numbers.get(r.nextInt(numbers.size()));*/
		
	//}


    
    }

