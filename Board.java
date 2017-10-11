package x7;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import x7.*;
class Board{
	protected static JButton[][] board = new JButton[19][19];
	private JFrame frame = new JFrame("Xiangxi 1.0 Beta");
	private JPanel panel = new JPanel();
	private int x,y;
	private Board(){
		frame.add(panel);
		panel.setLayout(new BorderLayout(21,21));
		x = 0;
		y = 0;
		while(x < 21){
			y = 0;
			while(y < 21){
				if(x == 0 && y == 10)
				else if(x == 10 && y == 0)
				else if(x == 10 && y == 20)
				else if(x == 20 && y == 10)
					panel.add(new JLabel());
				else if(x != 0 && x != 20 && y != 0 && y != 20)
					panel.add(board[x][y]);
	}
}
