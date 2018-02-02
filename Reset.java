package x7;
import java.awt.Color;
class Reset extends x7.Board{
	static final int U = 0;
	static final int D = 1;
	static final int L = 2;
	static final int R = 3;
	static void setColor(int x,int y,int arrow,Color color){
		switch(arrow){
		case U:
			background[x][y] = color;
			background[x][y+1] = color;
			background[x][y-1] = color;
			background[x][y+2] = color;
			background[x][y-2] = color;
			background[x][y+3] = color;
			background[x][y-3] = color;
			background[x-1][y] = color;
			background[x-1][y+1] = color;
			background[x-1][y-1] = color;
			background[x-1][y+2] = color;
			background[x-1][y-2] = color;
			background[x-2][y] = color;
			background[x-2][y+1] = color;
			background[x-2][y-1] = color;
			background[x-3][y] = color;
			background[x-4][y] = color;
			break;
		case D:
			background[x][y] = color;
			background[x][y+1] = color;
			background[x][y-1] = color;
			background[x][y+2] = color;
			background[x][y-2] = color;
			background[x][y+3] = color;
			background[x][y-3] = color;
			background[x+1][y] = color;
			background[x+1][y+1] = color;
			background[x+1][y-1] = color;
			background[x+1][y+2] = color;
			background[x+1][y-2] = color;
			background[x+2][y] = color;
			background[x+2][y+1] = color;
			background[x+2][y-1] = color;
			background[x+3][y] = color;
			background[x+4][y] = color;
			break;
		case L:
			background[x][y] = color;
			background[x+1][y] = color;
			background[x-1][y] = color;
			background[x+2][y] = color;
			background[x-2][y] = color;
			background[x+3][y] = color;
			background[x-3][y] = color;
			background[x][y-1] = color;
			background[x+1][y-1] = color;
			background[x-1][y-1] = color;
			background[x+2][y-1] = color;
			background[x-2][y-1] = color;
			background[x][y-2] = color;
			background[x+1][y-2] = color;
			background[x-1][y-2] = color;
			background[x][y-3] = color;
			background[x][y-4] = color;
			break;
		case R:
			background[x][y] = color;
			background[x+1][y] = color;
			background[x-1][y] = color;
			background[x+2][y] = color;
			background[x-2][y] = color;
			background[x+3][y] = color;
			background[x-3][y] = color;
			background[x][y+1] = color;
			background[x+1][y+1] = color;
			background[x-1][y+1] = color;
			background[x+2][y+1] = color;
			background[x-2][y+1] = color;
			background[x][y+2] = color;
			background[x+1][y+2] = color;
			background[x-1][y+2] = color;
			background[x][y+3] = color;
			background[x][y+4] = color;
			break;
		}
	}
	static void setTxt(int x,int y,int arrow){
		switch(arrow){
		case U:
			text[x][y+1] = new String("\u88E8");
			text[x][y-1] = new String("\u504F");
			text[x][y+2] = new String("\u528D");
			text[x][y-2] = new String("\u528D");
			text[x][y+3] = new String("\u9A0E");
			text[x][y-3] = new String("\u9A0E");
			text[x-1][y] = new String("\u7832");
			text[x-1][y+1] = new String("\u528D");
			text[x-1][y-1] = new String("\u528D");
			text[x-1][y+2] = new String("\u9A0E");
			text[x-1][y-2] = new String("\u9A0E");
			text[x-2][y] = new String("\u5F29");
			text[x-2][y+1] = new String("\u5200");
			text[x-2][y-1] = new String("\u5200");
			text[x-3][y] = new String("\u5F13");
			text[x-4][y] = new String("\u4F7F");
			break;
		case D:
			text[x][y+1] = new String("\u504F");
			text[x][y-1] = new String("\u88E8");
			text[x][y+2] = new String("\u528D");
			text[x][y-2] = new String("\u528D");
			text[x][y+3] = new String("\u9A0E");
			text[x][y-3] = new String("\u9A0E");
			text[x+1][y] = new String("\u7832");
			text[x+1][y+1] = new String("\u528D");
			text[x+1][y-1] = new String("\u528D");
			text[x+1][y+2] = new String("\u9A0E");
			text[x+1][y-2] = new String("\u9A0E");
			text[x+2][y] = new String("\u5F29");
			text[x+2][y+1] = new String("\u5200");
			text[x+2][y-1] = new String("\u5200");
			text[x+3][y] = new String("\u5F13");
			text[x+4][y] = new String("\u4F7F");
			break;
		case L:
			text[x+1][y] = new String("\u504F");
			text[x-1][y] = new String("\u88E8");
			text[x+2][y] = new String("\u528D");
			text[x-2][y] = new String("\u528D");
			text[x+3][y] = new String("\u9A0E");
			text[x-3][y] = new String("\u9A0E");
			text[x][y-1] = new String("\u7832");
			text[x+1][y-1] = new String("\u528D");
			text[x-1][y-1] = new String("\u528D");
			text[x+2][y-1] = new String("\u9A0E");
			text[x-2][y-1] = new String("\u9A0E");
			text[x][y-2] = new String("\u5F29");
			text[x+1][y-2] = new String("\u5200");
			text[x-1][y-2] = new String("\u5200");
			text[x][y-3] = new String("\u5F13");
			text[x][y-4] = new String("\u4F7F");
			break;
		case R:
			text[x+1][y] = new String("\u88E8");
			text[x-1][y] = new String("\u504F");
			text[x+2][y] = new String("\u528D");
			text[x-2][y] = new String("\u528D");
			text[x+3][y] = new String("\u9A0E");
			text[x-3][y] = new String("\u9A0E");
			text[x][y+1] = new String("\u7832");
			text[x+1][y+1] = new String("\u528D");
			text[x-1][y+1] = new String("\u528D");
			text[x+2][y+1] = new String("\u9A0E");
			text[x-2][y+1] = new String("\u9A0E");
			text[x][y+2] = new String("\u5F29");
			text[x+1][y+2] = new String("\u5200");
			text[x-1][y+2] = new String("\u5200");
			text[x][y+3] = new String("\u5F13");
			text[x][y+4] = new String("\u4F7F");
			break;
		}
	}
	static void reset(){
		text[0][5] = new String("\u71D5");
		text[0][13] = new String("\u8D99");
		text[5][18] = new String("\u9B4F");
		text[9][0] = new String("\u79E6");
		text[9][9] = new String("\u5468");
		text[13][18] = new String("\u9F4A");
		text[18][5] = new String("\u695A");
		text[18][13] = new String("\u97D3");
		background[9][9] = new Color(128,128,0);
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
