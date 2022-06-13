package listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import GUI.MenuSelection;
import GUI.WindowFrame;

public class ButtonCancel extends MouseAdapter{
	WindowFrame frame;
	
	public ButtonCancel(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.setupPanel(new MenuSelection(frame));
	}
}
