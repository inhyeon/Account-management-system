package listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import GUI.WindowFrame;

public class ButtonExit extends MouseAdapter {
	public WindowFrame frame;
	public ButtonExit(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.setVisible(false);
	}
}
