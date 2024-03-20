package so;

import java.util.List;

import so.memory.AddressMemory;

public class Process {
	private String id;
	private int sizeInMemory;
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

	public AddressMemory getAddress() {
		return address;
	}

	public void setAddress(AddressMemory address) {
		this.address = address;
	}

	private int timeToExecute;
	private int priority;
	private List<Process> processes;
	private int instructions;
	private AddressMemory address;
	
    public Process(int sizeInMemory, String nextProcessNumber) {
        this.id = nextProcessNumber;
        this.sizeInMemory = sizeInMemory;
	
	//public Process(int sizeInMemory) {
		//this.id = UUID.randomUUID().toString();
		//this.sizeInMemory = sizeInMemory;
		/*Random r = new Random();
		List<Integer> numbers = Arrays.asList(1,2,4,6,10,20,50,100);
		this.sizeInMemory = numbers.get(r.nextInt(numbers.size()));*/
		
	}

}
