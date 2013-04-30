import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
/* TO DO: CREATE MONSTER CLASS. RESTRUCTURE CODE TO BE MORE EXPANDABLE. WORK ON BUFFEREDREADER FOR READING MOVELIST.
 * COMPLEX FORMULAS FOR ATTACK(USE DEFENSE AND/OR EVASIVENESS), LEVEL UP SYSTEM
 *
 */
//ajdkf;ajsdkfdj;asasdjfasdfj;afaslfasdkf;a
public class Arena extends JPanel{
	//boolean oneFirst = false;
	//boolean gameEnded = false;
	//boolean gameStarted = false; 
	Character one = new Character("ANDREW", new Attacks(5, 0, "tackle"));
	Character two = new Character("BLADE", new Attacks(4, .25 , "scratch"));
	JMenuBar menuBar;
	JMenu fileMenu, optionMenu, levelMenu;
	JMenuItem exit, normal, desert, city, endGame;
	Environments background;
	DesertChoice desertChoice;
	CityChoice cityChoice;
	NormalChoice normalChoice;
	ExitChoice exitChoice;
	public Arena()
	{
		setSize(500,400);
		setMaximumSize(new Dimension(500,400));
		setBackground(new Color(100, 200, 250));
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		optionMenu = new JMenu("Options");
		levelMenu = new JMenu("Choose Background");
		exit = new JMenuItem("Exit");
		desert = new JMenuItem("Desert");
		city = new JMenuItem("City");
		normal = new JMenuItem("Normal");
		//endGame = new JMenuItem("End Game");
		desertChoice = new DesertChoice();
		cityChoice = new CityChoice();
		normalChoice = new NormalChoice();
		exitChoice = new ExitChoice();
		//        endChoice = new EndChoice();
		background = new Environments(1);

		add(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(optionMenu);
		fileMenu.add(exit);
		//fileMenu.add(endGame);
		optionMenu.add(levelMenu);
		levelMenu.add(normal);
		levelMenu.add(desert);
		levelMenu.add(city);

		normal.addActionListener(normalChoice);
		desert.addActionListener(desertChoice);
		city.addActionListener(cityChoice);
		exit.addActionListener(exitChoice);
		//        endGame.addActionListener(endChoice);

		//battle(one, two);

	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		background.paint(g);
		one.create(g,50,300,Color.RED);
		two.create(g, 350, 300, Color.BLUE);
	}
	private class DesertChoice implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			background = new Environments(2);
			repaint();
		}

	}
	private class CityChoice implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			background = new Environments(3);
			repaint();
		}
	}
	private class NormalChoice implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			background = new Environments(1);
			repaint();
		}
	}
	private class ExitChoice implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			System.exit(0);
		}
	}
	/*
    private class EndChoice implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            gameEnded = true;
        }
    }
	 */
}