package recursion.view;

import javax.swing.JFrame;
import recursion.controller.RecursionController;
import java.awt.Dimension;
import recursion.view.RecursionPanel;

public class Recursionframe extends JFrame
{
	private RecursionPanel basePanel;
	
	private RecursionController baseController;

	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.recursionPanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(new Dimension(500, 500));
		this.setTitle("lets do math");
		this.setResizable(false);
		this.setVisible(true);
	}
}

