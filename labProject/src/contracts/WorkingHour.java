package contracts;
public class WorkingHour {
	public WorkingHour(int start, int end)
	{
		changeWorkingHours(start, end);
	}
	private int start;
	private int end;
	
	public int getStartingHour() {
		return this.start;
	}

	public int getEndingHour() {
		return this.end;
	}

	public void changeWorkingHours(int start, int end) {
		if(end <= start) {
			throw new Error("Invalid working hours interval");
		}
		this.start = start;
		this.end = end;
	}
}