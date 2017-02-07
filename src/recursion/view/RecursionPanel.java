package recursion.view;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.Dimension;
import java.awt.Color;
import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JTextArea displayArea;
	private JTextField inputField;
	private JButton fibButton, FactButton;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.displayArea = new JTextArea(5,25);
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton("calculate the Fibonacci sequence");
		this.factButton = new JButton("Calculate the Factorial");
		this.inputField = new JTextField(25);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		factButton.addListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				display
			}
		}
	}
	
}
