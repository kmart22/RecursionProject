package recursion.model;

public class RecursionTool 
{
	
	public double calculateFactIterative()
	{
		
	}
	
	public int calcFibIter()
	{
		
	}
	
	
	public int calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculate Fibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber -1) + calculateFibonacci(currentNumber -2);
		}
	}
}
