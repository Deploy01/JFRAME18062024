package uShoe;

import javax.swing.JFrame;

public abstract class Window {

	public void voltarMenu(JFrame jframe) {
		jframe.setVisible(false);
		Menu2 menu = new Menu2();
		menu.frame.setVisible(true);
	}
	
	
}
