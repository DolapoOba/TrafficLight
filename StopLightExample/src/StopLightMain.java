import javax.swing.JFrame;
import javax.swing.JPanel;

public class StopLightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new StopLightPanel();
		
		frame.add(panel);
		frame.setSize(250,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		

	}

}