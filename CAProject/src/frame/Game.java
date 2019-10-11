package frame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import map.CookieMap;

public class Game extends JFrame{
	
	

	
	private Image woonie;
	private ImageIcon woonieF,woonieB,woonieL,woonieR;
	boolean left = false;
	int imgX = 290;
	int imgY = 30;
	
	

	public Game() {
		//new CookieMap();
		setSize(700,300);
		setLocationRelativeTo(null);	// 화면 가운데 배치
		MyPanel myPanel = new MyPanel();
		myPanel.setFocusable(true);
		setContentPane(myPanel);	// 패널을 변경하는 이유: paintComponent함수를 오버라이딩 하기 위해서
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			woonieF = new ImageIcon("images/woonie_front.png");		
			woonieB = new ImageIcon("images/woonie_back.png");		
			woonieL = new ImageIcon("images/woonie_left.png");		
			woonieR = new ImageIcon("images/woonie_right.png");		
			
			woonie = woonieL.getImage();
			ImageIcon img2 = new ImageIcon("images/bomb.png");
			Image bomb = img2.getImage();	
			g.drawImage(woonie, imgX, imgY, null);
			

			
		}
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					imgX = e.getX();
					imgY = e.getY();
					repaint();
				}
			});
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println(e.getKeyCode());
					switch (e.getKeyCode()) {
					case KeyEvent.VK_RIGHT :
						woonie = woonieR.getImage();					
						imgX += 10;
						left=true;
						break;
					case KeyEvent.VK_LEFT :
						imgX -= 10;
						break;
					case KeyEvent.VK_UP:
						imgY -= 10;
						break;
					case KeyEvent.VK_DOWN:
						imgY += 10;
						break;
					case KeyEvent.VK_SPACE:
						
					case KeyEvent.VK_ENTER :
						break;
					}
					repaint();
				}
			});
		}
		
		
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
