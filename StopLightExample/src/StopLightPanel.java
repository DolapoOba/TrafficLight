import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StopLightPanel extends JPanel {
	
	
	StopLightDrawing light = new StopLightDrawing();
	/**
	 private static final long serialVersionUID = 6151076054315404813L;
	 */
	

	public StopLightPanel() {
		JButton changeButton = new JButton("Switch");
		
		
		light.setPreferredSize(new Dimension(160,260));
		
		buttonListener l = new buttonListener();	
		changeButton.addActionListener(l);
		
		add(light);
		add(changeButton);
	}
	
	class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			light.changeColor();
			
		}
		
	}
}