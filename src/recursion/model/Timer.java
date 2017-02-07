package recursion.model;

public class Timer 
{
	
	private long executionTime;

	public Timer()
	{
		executionTime = 0;
	}
	
	public void startTimer()
	{
		executionTime = System.nanoTime();
	}
	
	public void resetTimer()
	{
		executionTime = 0;
	}
	
	public void stopTimer()
	{
		executionTime = System.nanoTime() - executionTime;
	}
	
	
	public String toString()
	{
		String info ="the execution time is" + executionTime + " in nanoseconds";
		info += "\nThat means " + ((double) executionTime)/ 1000000000 + " in seconds";
		
		return info;
	}
}
