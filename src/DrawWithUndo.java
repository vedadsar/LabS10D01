import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawWithUndo {

	public static void main(String[] args) {

		RepaintListener listener = new RepaintListener();

		JPanel canvasPanel = new JPanel();
		canvasPanel.setBackground(Color.WHITE);

		canvasPanel.addMouseListener(listener);
		
		JFrame mainWindow = new JFrame("Nesto sta ja znam");

		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(800, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);

	}



	public static class RepaintListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			g.setColor(Color.RED);
			g.fillOval(e.getX() - 50, e.getY() - 50, 100, 100);

		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			g.setColor(Color.BLUE);
			g.fillOval(e.getX() - 50, e.getY() - 50, 100, 100);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}



	}

}