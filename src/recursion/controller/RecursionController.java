package recursion.controller;

import javax.swing.JOptionPane;
import recursion.model.RecursionTool;
import recursion.view.Recursionframe;
import recursion.model.Timer;

public class RecursionController 
{
	private RecursionController baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	
	public RecursionController()
	{
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
		this.baseFrame = new recursionFrame(this);
	}
	
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "wow");
	}
	
	
	
	public String transferFactorial (String value)
	{
		String factorialResponse = "";
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		
		return factorialResponse;
	}
	
	public String transferFibonacci(String value)
	{
		String fibonacciResponse = "theFibonacci sequence at " + value + "is:\n";
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculateFibonacci(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibonacciResponse
	}
	
	private boolean isValid(String current)
	{
		try
		{
			double test = Double.parseDouble(current);
			if (test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame,  "type in a valid integer");
			return false;
		}
	}
}
	
	
	

