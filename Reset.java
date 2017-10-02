package x7;
import java.awt.Color;
import x7.Board;
class Reset extends Board{
	static final int U = 0;
	static final int D = 1;
	static final int L = 2;
	static final int R = 3;
	static void setColor(int x,int y,int arrow,Color color){
		switch(arrow){
		case U:
			board[x][y].setBackground(color);
			board[x][y+1].setBackground(color);
			board[x][y-1].setBackground(color);
			board[x][y+2].setBackground(color);
			board[x][y-2].setBackground(color);
			board[x][y+3].setBackground(color);
			board[x][y-3].setBackground(color);
			board[x-1][y].setBackground(color);
			board[x-1][y+1].setBackground(color);
			board[x-1][y-1].setBackground(color);
			board[x-1][y+2].setBackground(color);
			board[x-1][y-2].setBackground(color);
			board[x-2][y].setBackground(color);
			board[x-2][y+1].setBackground(color);
			board[x-2][y-1].setBackground(color);
			board[x-3][y].setBackground(color);
			board[x-4][y].setBackground(color);
			break;
		case D:
			board[x][y].setBackground(color);
			board[x][y+1].setBackground(color);
			board[x][y-1].setBackground(color);
			board[x][y+2].setBackground(color);
			board[x][y-2].setBackground(color);
			board[x][y+3].setBackground(color);
			board[x][y-3].setBackground(color);
			board[x+1][y].setBackground(color);
			board[x+1][y+1].setBackground(color);
			board[x+1][y-1].setBackground(color);
			board[x+1][y+2].setBackground(color);
			board[x+1][y-2].setBackground(color);
			board[x+2][y].setBackground(color);
			board[x+2][y+1].setBackground(color);
			board[x+2][y-1].setBackground(color);
			board[x+3][y].setBackground(color);
			board[x+4][y].setBackground(color);
			break;
		case L:
			board[x][y].setBackground(color);
			board[x+1][y].setBackground(color);
			board[x-1][y].setBackground(color);
			board[x+2][y].setBackground(color);
			board[x-2][y].setBackground(color);
			board[x+3][y].setBackground(color);
			board[x-3][y].setBackground(color);
			board[x][y-1].setBackground(color);
			board[x+1][y-1].setBackground(color);
			board[x-1][y-1].setBackground(color);
			board[x+2][y-1].setBackground(color);
			board[x-2][y-1].setBackground(color);
			board[x][y-2].setBackground(color);
			board[x+1][y-2].setBackground(color);
			board[x-1][y-2].setBackground(color);
			board[x][y-3].setBackground(color);
			board[x][y-4].setBackground(color);
			break;
		case R:
			board[x][y].setBackground(color);
			board[x+1][y].setBackground(color);
			board[x-1][y].setBackground(color);
			board[x+2][y].setBackground(color);
			board[x-2][y].setBackground(color);
			board[x+3][y].setBackground(color);
			board[x-3][y].setBackground(color);
			board[x][y+1].setBackground(color);
			board[x+1][y+1].setBackground(color);
			board[x-1][y+1].setBackground(color);
			board[x+2][y+1].setBackground(color);
			board[x-2][y+1].setBackground(color);
			board[x][y+2].setBackground(color);
			board[x+1][y+2].setBackground(color);
			board[x-1][y+2].setBackground(color);
			board[x][y+3].setBackground(color);
			board[x][y+4].setBackground(color);
			break;
		}
	}
	static void setTxt(int x,int y,int arrow){
		switch(arrow){
		case U:
			board[x][y+1].setText("\u88E8");
			board[x][y-1].setText("\u504F");
			board[x][y+2].setText("\u528D");
			board[x][y-2].setText("\u528D");
			board[x][y+3].setText("\u9A0E");
			board[x][y-3].setText("\u9A0E");
			board[x-1][y].setText("\u7832");
			board[x-1][y+1].setText("\u528D");
			board[x-1][y-1].setText("\u528D");
			board[x-1][y+2].setText("\u9A0E");
			board[x-1][y-2].setText("\u9A0E");
			board[x-2][y].setText("\u5F29");
			board[x-2][y+1].setText("\u5200");
			board[x-2][y-1].setText("\u5200");
			board[x-3][y].setText("\u5F13");
			board[x-4][y].setText("\u4F7F");
			break;
		case D:
			board[x][y+1].setText("\u504F");
			board[x][y-1].setText("\u88E8");
			board[x][y+2].setText("\u528D");
			board[x][y-2].setText("\u528D");
			board[x][y+3].setText("\u9A0E");
			board[x][y-3].setText("\u9A0E");
			board[x+1][y].setText("\u7832");
			board[x+1][y+1].setText("\u528D");
			board[x+1][y-1].setText("\u528D");
			board[x+1][y+2].setText("\u9A0E");
			board[x+1][y-2].setText("\u9A0E");
			board[x+2][y].setText("\u5F29");
			board[x+2][y+1].setText("\u5200");
			board[x+2][y-1].setText("\u5200");
			board[x+3][y].setText("\u5F13");
			board[x+4][y].setText("\u4F7F");
			break;
		case L:
			board[x+1][y].setText("\u504F");
			board[x-1][y].setText("\u88E8");
			board[x+2][y].setText("\u528D");
			board[x-2][y].setText("\u528D");
			board[x+3][y].setText("\u9A0E");
			board[x-3][y].setText("\u9A0E");
			board[x][y-1].setText("\u7832");
			board[x+1][y-1].setText("\u528D");
			board[x-1][y-1].setText("\u528D");
			board[x+2][y-1].setText("\u9A0E");
			board[x-2][y-1].setText("\u9A0E");
			board[x][y-2].setText("\u5F29");
			board[x+1][y-2].setText("\u5200");
			board[x-1][y-2].setText("\u5200");
			board[x][y-3].setText("\u5F13");
			board[x][y-4].setText("\u4F7F");
			break;
		case R:
			board[x+1][y].setText("\u88E8");
			board[x-1][y].setText("\u504F");
			board[x+2][y].setText("\u528D");
			board[x-2][y].setText("\u528D");
			board[x+3][y].setText("\u9A0E");
			board[x-3][y].setText("\u9A0E");
			board[x][y+1].setText("\u7832");
			board[x+1][y+1].setText("\u528D");
			board[x-1][y+1].setText("\u528D");
			board[x+2][y+1].setText("\u9A0E");
			board[x-2][y+1].setText("\u9A0E");
			board[x][y+2].setText("\u5F29");
			board[x+1][y+2].setText("\u5200");
			board[x-1][y+2].setText("\u5200");
			board[x][y+3].setText("\u5F13");
			board[x][y+4].setText("\u4F7F");
			break;
		}
	}
	static void reset(){
		board[0][5].setText("\u71D5");
		board[0][13].setText("\u8D99");
		board[5][18].setText("\u9B4F");
		board[9][0].setText("\u79E6");
		board[9][9].setText("\u5468");
		board[13][18].setText("\u9F4A");
		board[18][5].setText("\u695A");
		board[18][13].setText("\u97D3");
		board[9][9].setBackground(new Color(128,128,0));
		setTxt(0,5,D);
		setTxt(0,13,D);
		setTxt(5,18,L);
		setTxt(9,0,R);
		setTxt(13,18,L);
		setTxt(18,5,U);
		setTxt(18,13,U);
		setColor(0,5,D,new Color(0,0,0));
		setColor(0,13,D,new Color(128,0,128));
		setColor(5,18,L,new Color(0,128,0));
		setColor(9,0,R,new Color(255,255,255));
		setColor(13,18,L,new Color(0,0,255));
		setColor(18,5,U,new Color(255,0,0));
		setColor(18,13,U,new Color(224,128,64));
	}
}
