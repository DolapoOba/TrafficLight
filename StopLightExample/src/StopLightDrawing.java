import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Color;

public class StopLightDrawing extends JComponent{
	
	
	/**
	 private static final long serialVersionUID = 302987205206132165L; 
	 */
	
	Color go = Color.gray;
	Color slow = Color.gray;
	Color stop = Color.red;
	
	String activeLight = "red";
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(0 ,0 ,150, 250);
		
		g.setColor(stop);
		g.fillOval(50, 30, 50, 50);
		
		g.setColor(slow);
		g.fillOval(50, 100, 50, 50);
		
		g.setColor(go);
		g.fillOval(50, 170, 50, 50);
		
	}
	
	public void changeColor() {
		go = Color.gray;
		slow = Color.gray;
		stop = Color.gray;
		
		
		
		if(activeLight.equals("red")) {
			activeLight ="green";
			go = Color.green;
		} else if (activeLight.equals("green")) {
			activeLight = "yellow";
			slow = Color.orange;
			
		} else {
			activeLight ="red";
			stop = Color.red;
		}
		
		repaint();
	}

	
}