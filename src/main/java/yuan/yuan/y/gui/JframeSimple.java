package yuan.yuan.y.gui;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class JframeSimple extends JFrame{
	
	private static final long serialVersionUID = 3595245304447834196L;
	

	public JframeSimple() throws HeadlessException {
		super();
		initGUI();
	}

	private void initGUI(){  	
	        setVisible(true);  
	        setSize(300,400);  
	        setLocationRelativeTo(null);  
	        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  
	    } 
	 
	 public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {  
	         public void run() {  
	        	 new JframeSimple();  
	         }                 
	     });  
	}
}
