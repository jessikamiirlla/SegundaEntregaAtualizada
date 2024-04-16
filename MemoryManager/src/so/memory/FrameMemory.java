package so.memory;

public class FrameMemory {
	private int frameNumber;
	private int offset;
	
	public int getFrameNumber() {
		return frameNumber;
	}
	public void setFrameNumber(int frameNumber) {
		this.frameNumber = frameNumber;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public FrameMemory(int frameNumber, int offset) {
		super();
		this.frameNumber = frameNumber;
		this.offset = offset;
	}
	
	
	
	
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public int getDisplacement() {
		return displacement;
	}
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
		
	public FrameMemory(int pageNumber, int displacement) {
		this.pageNumber = pageNumber;
		this.displacement = displacement;
	}

	public FrameMemory(int pageNumber) {
		this(pageNumber, 0);
	}
	
	
	


}
