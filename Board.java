package x7;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import x7.*;
class Board{
	protected static JButton board0000 = new JButton("");
	protected static JButton board0001 = new JButton("");
	protected static JButton board0002 = new JButton("");
	protected static JButton board0003 = new JButton("");
	protected static JButton board0004 = new JButton("");
	protected static JButton board0005 = new JButton("");
	protected static JButton board0006 = new JButton("");
	protected static JButton board0007 = new JButton("");
	protected static JButton board0008 = new JButton("");
	protected static JButton board0009 = new JButton("");
	protected static JButton board0010 = new JButton("");
	protected static JButton board0011 = new JButton("");
	protected static JButton board0012 = new JButton("");
	protected static JButton board0013 = new JButton("");
	protected static JButton board0014 = new JButton("");
	protected static JButton board0015 = new JButton("");
	protected static JButton board0016 = new JButton("");
	protected static JButton board0017 = new JButton("");
	protected static JButton board0018 = new JButton("");
	protected static JButton board0100 = new JButton("");
	protected static JButton board0101 = new JButton("");
	protected static JButton board0102 = new JButton("");
	protected static JButton board0103 = new JButton("");
	protected static JButton board0104 = new JButton("");
	protected static JButton board0105 = new JButton("");
	protected static JButton board0106 = new JButton("");
	protected static JButton board0107 = new JButton("");
	protected static JButton board0108 = new JButton("");
	protected static JButton board0109 = new JButton("");
	protected static JButton board0110 = new JButton("");
	protected static JButton board0111 = new JButton("");
	protected static JButton board0112 = new JButton("");
	protected static JButton board0113 = new JButton("");
	protected static JButton board0114 = new JButton("");
	protected static JButton board0115 = new JButton("");
	protected static JButton board0116 = new JButton("");
	protected static JButton board0117 = new JButton("");
	protected static JButton board0118 = new JButton("");
	protected static JButton board0200 = new JButton("");
	protected static JButton board0201 = new JButton("");
	protected static JButton board0202 = new JButton("");
	protected static JButton board0203 = new JButton("");
	protected static JButton board0204 = new JButton("");
	protected static JButton board0205 = new JButton("");
	protected static JButton board0206 = new JButton("");
	protected static JButton board0207 = new JButton("");
	protected static JButton board0208 = new JButton("");
	protected static JButton board0209 = new JButton("");
	protected static JButton board0210 = new JButton("");
	protected static JButton board0211 = new JButton("");
	protected static JButton board0212 = new JButton("");
	protected static JButton board0213 = new JButton("");
	protected static JButton board0214 = new JButton("");
	protected static JButton board0215 = new JButton("");
	protected static JButton board0216 = new JButton("");
	protected static JButton board0217 = new JButton("");
	protected static JButton board0218 = new JButton("");
	protected static JButton board0300 = new JButton("");
	protected static JButton board0301 = new JButton("");
	protected static JButton board0302 = new JButton("");
	protected static JButton board0303 = new JButton("");
	protected static JButton board0304 = new JButton("");
	protected static JButton board0305 = new JButton("");
	protected static JButton board0306 = new JButton("");
	protected static JButton board0307 = new JButton("");
	protected static JButton board0308 = new JButton("");
	protected static JButton board0309 = new JButton("");
	protected static JButton board0310 = new JButton("");
	protected static JButton board0311 = new JButton("");
	protected static JButton board0312 = new JButton("");
	protected static JButton board0313 = new JButton("");
	protected static JButton board0314 = new JButton("");
	protected static JButton board0315 = new JButton("");
	protected static JButton board0316 = new JButton("");
	protected static JButton board0317 = new JButton("");
	protected static JButton board0318 = new JButton("");
	protected static JButton board0400 = new JButton("");
	protected static JButton board0401 = new JButton("");
	protected static JButton board0402 = new JButton("");
	protected static JButton board0403 = new JButton("");
	protected static JButton board0404 = new JButton("");
	protected static JButton board0405 = new JButton("");
	protected static JButton board0406 = new JButton("");
	protected static JButton board0407 = new JButton("");
	protected static JButton board0408 = new JButton("");
	protected static JButton board0409 = new JButton("");
	protected static JButton board0410 = new JButton("");
	protected static JButton board0411 = new JButton("");
	protected static JButton board0412 = new JButton("");
	protected static JButton board0413 = new JButton("");
	protected static JButton board0414 = new JButton("");
	protected static JButton board0415 = new JButton("");
	protected static JButton board0416 = new JButton("");
	protected static JButton board0417 = new JButton("");
	protected static JButton board0418 = new JButton("");
	protected static JButton board0500 = new JButton("");
	protected static JButton board0501 = new JButton("");
	protected static JButton board0502 = new JButton("");
	protected static JButton board0503 = new JButton("");
	protected static JButton board0504 = new JButton("");
	protected static JButton board0505 = new JButton("");
	protected static JButton board0506 = new JButton("");
	protected static JButton board0507 = new JButton("");
	protected static JButton board0508 = new JButton("");
	protected static JButton board0509 = new JButton("");
	protected static JButton board0510 = new JButton("");
	protected static JButton board0511 = new JButton("");
	protected static JButton board0512 = new JButton("");
	protected static JButton board0513 = new JButton("");
	protected static JButton board0514 = new JButton("");
	protected static JButton board0515 = new JButton("");
	protected static JButton board0516 = new JButton("");
	protected static JButton board0517 = new JButton("");
	protected static JButton board0518 = new JButton("");
	protected static JButton board0600 = new JButton("");
	protected static JButton board0601 = new JButton("");
	protected static JButton board0602 = new JButton("");
	protected static JButton board0603 = new JButton("");
	protected static JButton board0604 = new JButton("");
	protected static JButton board0605 = new JButton("");
	protected static JButton board0606 = new JButton("");
	protected static JButton board0607 = new JButton("");
	protected static JButton board0608 = new JButton("");
	protected static JButton board0609 = new JButton("");
	protected static JButton board0610 = new JButton("");
	protected static JButton board0611 = new JButton("");
	protected static JButton board0612 = new JButton("");
	protected static JButton board0613 = new JButton("");
	protected static JButton board0614 = new JButton("");
	protected static JButton board0615 = new JButton("");
	protected static JButton board0616 = new JButton("");
	protected static JButton board0617 = new JButton("");
	protected static JButton board0618 = new JButton("");
	protected static JButton board0700 = new JButton("");
	protected static JButton board0701 = new JButton("");
	protected static JButton board0702 = new JButton("");
	protected static JButton board0703 = new JButton("");
	protected static JButton board0704 = new JButton("");
	protected static JButton board0705 = new JButton("");
	protected static JButton board0706 = new JButton("");
	protected static JButton board0707 = new JButton("");
	protected static JButton board0708 = new JButton("");
	protected static JButton board0709 = new JButton("");
	protected static JButton board0710 = new JButton("");
	protected static JButton board0711 = new JButton("");
	protected static JButton board0712 = new JButton("");
	protected static JButton board0713 = new JButton("");
	protected static JButton board0714 = new JButton("");
	protected static JButton board0715 = new JButton("");
	protected static JButton board0716 = new JButton("");
	protected static JButton board0717 = new JButton("");
	protected static JButton board0718 = new JButton("");
	protected static JButton board0800 = new JButton("");
	protected static JButton board0801 = new JButton("");
	protected static JButton board0802 = new JButton("");
	protected static JButton board0803 = new JButton("");
	protected static JButton board0804 = new JButton("");
	protected static JButton board0805 = new JButton("");
	protected static JButton board0806 = new JButton("");
	protected static JButton board0807 = new JButton("");
	protected static JButton board0808 = new JButton("");
	protected static JButton board0809 = new JButton("");
	protected static JButton board0810 = new JButton("");
	protected static JButton board0811 = new JButton("");
	protected static JButton board0812 = new JButton("");
	protected static JButton board0813 = new JButton("");
	protected static JButton board0814 = new JButton("");
	protected static JButton board0815 = new JButton("");
	protected static JButton board0816 = new JButton("");
	protected static JButton board0817 = new JButton("");
	protected static JButton board0818 = new JButton("");
	protected static JButton board0900 = new JButton("");
	protected static JButton board0901 = new JButton("");
	protected static JButton board0902 = new JButton("");
	protected static JButton board0903 = new JButton("");
	protected static JButton board0904 = new JButton("");
	protected static JButton board0905 = new JButton("");
	protected static JButton board0906 = new JButton("");
	protected static JButton board0907 = new JButton("");
	protected static JButton board0908 = new JButton("");
	protected static JButton board0909 = new JButton("");
	protected static JButton board0910 = new JButton("");
	protected static JButton board0911 = new JButton("");
	protected static JButton board0912 = new JButton("");
	protected static JButton board0913 = new JButton("");
	protected static JButton board0914 = new JButton("");
	protected static JButton board0915 = new JButton("");
	protected static JButton board0916 = new JButton("");
	protected static JButton board0917 = new JButton("");
	protected static JButton board0918 = new JButton("");
	protected static JButton board1000 = new JButton("");
	protected static JButton board1001 = new JButton("");
	protected static JButton board1002 = new JButton("");
	protected static JButton board1003 = new JButton("");
	protected static JButton board1004 = new JButton("");
	protected static JButton board1005 = new JButton("");
	protected static JButton board1006 = new JButton("");
	protected static JButton board1007 = new JButton("");
	protected static JButton board1008 = new JButton("");
	protected static JButton board1009 = new JButton("");
	protected static JButton board1010 = new JButton("");
	protected static JButton board1011 = new JButton("");
	protected static JButton board1012 = new JButton("");
	protected static JButton board1013 = new JButton("");
	protected static JButton board1014 = new JButton("");
	protected static JButton board1015 = new JButton("");
	protected static JButton board1016 = new JButton("");
	protected static JButton board1017 = new JButton("");
	protected static JButton board1018 = new JButton("");
	protected static JButton board1100 = new JButton("");
	protected static JButton board1101 = new JButton("");
	protected static JButton board1102 = new JButton("");
	protected static JButton board1103 = new JButton("");
	protected static JButton board1104 = new JButton("");
	protected static JButton board1105 = new JButton("");
	protected static JButton board1106 = new JButton("");
	protected static JButton board1107 = new JButton("");
	protected static JButton board1108 = new JButton("");
	protected static JButton board1109 = new JButton("");
	protected static JButton board1110 = new JButton("");
	protected static JButton board1111 = new JButton("");
	protected static JButton board1112 = new JButton("");
	protected static JButton board1113 = new JButton("");
	protected static JButton board1114 = new JButton("");
	protected static JButton board1115 = new JButton("");
	protected static JButton board1116 = new JButton("");
	protected static JButton board1117 = new JButton("");
	protected static JButton board1118 = new JButton("");
	protected static JButton board1200 = new JButton("");
	protected static JButton board1201 = new JButton("");
	protected static JButton board1202 = new JButton("");
	protected static JButton board1203 = new JButton("");
	protected static JButton board1204 = new JButton("");
	protected static JButton board1205 = new JButton("");
	protected static JButton board1206 = new JButton("");
	protected static JButton board1207 = new JButton("");
	protected static JButton board1208 = new JButton("");
	protected static JButton board1209 = new JButton("");
	protected static JButton board1210 = new JButton("");
	protected static JButton board1211 = new JButton("");
	protected static JButton board1212 = new JButton("");
	protected static JButton board1213 = new JButton("");
	protected static JButton board1214 = new JButton("");
	protected static JButton board1215 = new JButton("");
	protected static JButton board1216 = new JButton("");
	protected static JButton board1217 = new JButton("");
	protected static JButton board1218 = new JButton("");
	protected static JButton board1300 = new JButton("");
	protected static JButton board1301 = new JButton("");
	protected static JButton board1302 = new JButton("");
	protected static JButton board1303 = new JButton("");
	protected static JButton board1304 = new JButton("");
	protected static JButton board1305 = new JButton("");
	protected static JButton board1306 = new JButton("");
	protected static JButton board1307 = new JButton("");
	protected static JButton board1308 = new JButton("");
	protected static JButton board1309 = new JButton("");
	protected static JButton board1310 = new JButton("");
	protected static JButton board1311 = new JButton("");
	protected static JButton board1312 = new JButton("");
	protected static JButton board1313 = new JButton("");
	protected static JButton board1314 = new JButton("");
	protected static JButton board1315 = new JButton("");
	protected static JButton board1316 = new JButton("");
	protected static JButton board1317 = new JButton("");
	protected static JButton board1318 = new JButton("");
	protected static JButton board1400 = new JButton("");
	protected static JButton board1401 = new JButton("");
	protected static JButton board1402 = new JButton("");
	protected static JButton board1403 = new JButton("");
	protected static JButton board1404 = new JButton("");
	protected static JButton board1405 = new JButton("");
	protected static JButton board1406 = new JButton("");
	protected static JButton board1407 = new JButton("");
	protected static JButton board1408 = new JButton("");
	protected static JButton board1409 = new JButton("");
	protected static JButton board1410 = new JButton("");
	protected static JButton board1411 = new JButton("");
	protected static JButton board1412 = new JButton("");
	protected static JButton board1413 = new JButton("");
	protected static JButton board1414 = new JButton("");
	protected static JButton board1415 = new JButton("");
	protected static JButton board1416 = new JButton("");
	protected static JButton board1417 = new JButton("");
	protected static JButton board1418 = new JButton("");
	protected static JButton board1500 = new JButton("");
	protected static JButton board1501 = new JButton("");
	protected static JButton board1502 = new JButton("");
	protected static JButton board1503 = new JButton("");
	protected static JButton board1504 = new JButton("");
	protected static JButton board1505 = new JButton("");
	protected static JButton board1506 = new JButton("");
	protected static JButton board1507 = new JButton("");
	protected static JButton board1508 = new JButton("");
	protected static JButton board1509 = new JButton("");
	protected static JButton board1510 = new JButton("");
	protected static JButton board1511 = new JButton("");
	protected static JButton board1512 = new JButton("");
	protected static JButton board1513 = new JButton("");
	protected static JButton board1514 = new JButton("");
	protected static JButton board1515 = new JButton("");
	protected static JButton board1516 = new JButton("");
	protected static JButton board1517 = new JButton("");
	protected static JButton board1518 = new JButton("");
	protected static JButton board1600 = new JButton("");
	protected static JButton board1601 = new JButton("");
	protected static JButton board1602 = new JButton("");
	protected static JButton board1603 = new JButton("");
	protected static JButton board1604 = new JButton("");
	protected static JButton board1605 = new JButton("");
	protected static JButton board1606 = new JButton("");
	protected static JButton board1607 = new JButton("");
	protected static JButton board1608 = new JButton("");
	protected static JButton board1609 = new JButton("");
	protected static JButton board1610 = new JButton("");
	protected static JButton board1611 = new JButton("");
	protected static JButton board1612 = new JButton("");
	protected static JButton board1613 = new JButton("");
	protected static JButton board1614 = new JButton("");
	protected static JButton board1615 = new JButton("");
	protected static JButton board1616 = new JButton("");
	protected static JButton board1617 = new JButton("");
	protected static JButton board1618 = new JButton("");
	protected static JButton board1700 = new JButton("");
	protected static JButton board1701 = new JButton("");
	protected static JButton board1702 = new JButton("");
	protected static JButton board1703 = new JButton("");
	protected static JButton board1704 = new JButton("");
	protected static JButton board1705 = new JButton("");
	protected static JButton board1706 = new JButton("");
	protected static JButton board1707 = new JButton("");
	protected static JButton board1708 = new JButton("");
	protected static JButton board1709 = new JButton("");
	protected static JButton board1710 = new JButton("");
	protected static JButton board1711 = new JButton("");
	protected static JButton board1712 = new JButton("");
	protected static JButton board1713 = new JButton("");
	protected static JButton board1714 = new JButton("");
	protected static JButton board1715 = new JButton("");
	protected static JButton board1716 = new JButton("");
	protected static JButton board1717 = new JButton("");
	protected static JButton board1718 = new JButton("");
	protected static JButton board1800 = new JButton("");
	protected static JButton board1801 = new JButton("");
	protected static JButton board1802 = new JButton("");
	protected static JButton board1803 = new JButton("");
	protected static JButton board1804 = new JButton("");
	protected static JButton board1805 = new JButton("");
	protected static JButton board1806 = new JButton("");
	protected static JButton board1807 = new JButton("");
	protected static JButton board1808 = new JButton("");
	protected static JButton board1809 = new JButton("");
	protected static JButton board1810 = new JButton("");
	protected static JButton board1811 = new JButton("");
	protected static JButton board1812 = new JButton("");
	protected static JButton board1813 = new JButton("");
	protected static JButton board1814 = new JButton("");
	protected static JButton board1815 = new JButton("");
	protected static JButton board1816 = new JButton("");
	protected static JButton board1817 = new JButton("");
	protected static JButton board1818 = new JButton("");
	protected static String[][] text = new String[19][19];
	protected static Color[][] background = new Color[19][19];
	private JFrame frame = new JFrame("Xiangxi7 Beta");
	private JPanel panel = new JPanel();
	private int x,y;
	Board(){
		panel.setLayout(new GridLayout(21,21,5,5));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel("\u5317"));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0000);
		panel.add(board0001);
		panel.add(board0002);
		panel.add(board0003);
		panel.add(board0004);
		panel.add(board0005);
		panel.add(board0006);
		panel.add(board0007);
		panel.add(board0008);
		panel.add(board0009);
		panel.add(board0010);
		panel.add(board0011);
		panel.add(board0012);
		panel.add(board0013);
		panel.add(board0014);
		panel.add(board0015);
		panel.add(board0016);
		panel.add(board0017);
		panel.add(board0018);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0100);
		panel.add(board0101);
		panel.add(board0102);
		panel.add(board0103);
		panel.add(board0104);
		panel.add(board0105);
		panel.add(board0106);
		panel.add(board0107);
		panel.add(board0108);
		panel.add(board0109);
		panel.add(board0110);
		panel.add(board0111);
		panel.add(board0112);
		panel.add(board0113);
		panel.add(board0114);
		panel.add(board0115);
		panel.add(board0116);
		panel.add(board0117);
		panel.add(board0118);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0200);
		panel.add(board0201);
		panel.add(board0202);
		panel.add(board0203);
		panel.add(board0204);
		panel.add(board0205);
		panel.add(board0206);
		panel.add(board0207);
		panel.add(board0208);
		panel.add(board0209);
		panel.add(board0210);
		panel.add(board0211);
		panel.add(board0212);
		panel.add(board0213);
		panel.add(board0214);
		panel.add(board0215);
		panel.add(board0216);
		panel.add(board0217);
		panel.add(board0218);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0300);
		panel.add(board0301);
		panel.add(board0302);
		panel.add(board0303);
		panel.add(board0304);
		panel.add(board0305);
		panel.add(board0306);
		panel.add(board0307);
		panel.add(board0308);
		panel.add(board0309);
		panel.add(board0310);
		panel.add(board0311);
		panel.add(board0312);
		panel.add(board0313);
		panel.add(board0314);
		panel.add(board0315);
		panel.add(board0316);
		panel.add(board0317);
		panel.add(board0318);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0400);
		panel.add(board0401);
		panel.add(board0402);
		panel.add(board0403);
		panel.add(board0404);
		panel.add(board0405);
		panel.add(board0406);
		panel.add(board0407);
		panel.add(board0408);
		panel.add(board0409);
		panel.add(board0410);
		panel.add(board0411);
		panel.add(board0412);
		panel.add(board0413);
		panel.add(board0414);
		panel.add(board0415);
		panel.add(board0416);
		panel.add(board0417);
		panel.add(board0418);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0500);
		panel.add(board0501);
		panel.add(board0502);
		panel.add(board0503);
		panel.add(board0504);
		panel.add(board0505);
		panel.add(board0506);
		panel.add(board0507);
		panel.add(board0508);
		panel.add(board0509);
		panel.add(board0510);
		panel.add(board0511);
		panel.add(board0512);
		panel.add(board0513);
		panel.add(board0514);
		panel.add(board0515);
		panel.add(board0516);
		panel.add(board0517);
		panel.add(board0518);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0600);
		panel.add(board0601);
		panel.add(board0602);
		panel.add(board0603);
		panel.add(board0604);
		panel.add(board0605);
		panel.add(board0606);
		panel.add(board0607);
		panel.add(board0608);
		panel.add(board0609);
		panel.add(board0610);
		panel.add(board0611);
		panel.add(board0612);
		panel.add(board0613);
		panel.add(board0614);
		panel.add(board0615);
		panel.add(board0616);
		panel.add(board0617);
		panel.add(board0618);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0700);
		panel.add(board0701);
		panel.add(board0702);
		panel.add(board0703);
		panel.add(board0704);
		panel.add(board0705);
		panel.add(board0706);
		panel.add(board0707);
		panel.add(board0708);
		panel.add(board0709);
		panel.add(board0710);
		panel.add(board0711);
		panel.add(board0712);
		panel.add(board0713);
		panel.add(board0714);
		panel.add(board0715);
		panel.add(board0716);
		panel.add(board0717);
		panel.add(board0718);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board0800);
		panel.add(board0801);
		panel.add(board0802);
		panel.add(board0803);
		panel.add(board0804);
		panel.add(board0805);
		panel.add(board0806);
		panel.add(board0807);
		panel.add(board0808);
		panel.add(board0809);
		panel.add(board0810);
		panel.add(board0811);
		panel.add(board0812);
		panel.add(board0813);
		panel.add(board0814);
		panel.add(board0815);
		panel.add(board0816);
		panel.add(board0817);
		panel.add(board0818);
		panel.add(new JLabel(""));
		panel.add(new JLabel("\u897F"));
		panel.add(board0900);
		panel.add(board0901);
		panel.add(board0902);
		panel.add(board0903);
		panel.add(board0904);
		panel.add(board0905);
		panel.add(board0906);
		panel.add(board0907);
		panel.add(board0908);
		panel.add(board0909);
		panel.add(board0910);
		panel.add(board0911);
		panel.add(board0912);
		panel.add(board0913);
		panel.add(board0914);
		panel.add(board0915);
		panel.add(board0916);
		panel.add(board0917);
		panel.add(board0918);
		panel.add(new JLabel("\u6771"));
		panel.add(new JLabel(""));
		panel.add(board1000);
		panel.add(board1001);
		panel.add(board1002);
		panel.add(board1003);
		panel.add(board1004);
		panel.add(board1005);
		panel.add(board1006);
		panel.add(board1007);
		panel.add(board1008);
		panel.add(board1009);
		panel.add(board1010);
		panel.add(board1011);
		panel.add(board1012);
		panel.add(board1013);
		panel.add(board1014);
		panel.add(board1015);
		panel.add(board1016);
		panel.add(board1017);
		panel.add(board1018);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1100);
		panel.add(board1101);
		panel.add(board1102);
		panel.add(board1103);
		panel.add(board1104);
		panel.add(board1105);
		panel.add(board1106);
		panel.add(board1107);
		panel.add(board1108);
		panel.add(board1109);
		panel.add(board1110);
		panel.add(board1111);
		panel.add(board1112);
		panel.add(board1113);
		panel.add(board1114);
		panel.add(board1115);
		panel.add(board1116);
		panel.add(board1117);
		panel.add(board1118);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1200);
		panel.add(board1201);
		panel.add(board1202);
		panel.add(board1203);
		panel.add(board1204);
		panel.add(board1205);
		panel.add(board1206);
		panel.add(board1207);
		panel.add(board1208);
		panel.add(board1209);
		panel.add(board1210);
		panel.add(board1211);
		panel.add(board1212);
		panel.add(board1213);
		panel.add(board1214);
		panel.add(board1215);
		panel.add(board1216);
		panel.add(board1217);
		panel.add(board1218);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1300);
		panel.add(board1301);
		panel.add(board1302);
		panel.add(board1303);
		panel.add(board1304);
		panel.add(board1305);
		panel.add(board1306);
		panel.add(board1307);
		panel.add(board1308);
		panel.add(board1309);
		panel.add(board1310);
		panel.add(board1311);
		panel.add(board1312);
		panel.add(board1313);
		panel.add(board1314);
		panel.add(board1315);
		panel.add(board1316);
		panel.add(board1317);
		panel.add(board1318);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1400);
		panel.add(board1401);
		panel.add(board1402);
		panel.add(board1403);
		panel.add(board1404);
		panel.add(board1405);
		panel.add(board1406);
		panel.add(board1407);
		panel.add(board1408);
		panel.add(board1409);
		panel.add(board1410);
		panel.add(board1411);
		panel.add(board1412);
		panel.add(board1413);
		panel.add(board1414);
		panel.add(board1415);
		panel.add(board1416);
		panel.add(board1417);
		panel.add(board1418);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1500);
		panel.add(board1501);
		panel.add(board1502);
		panel.add(board1503);
		panel.add(board1504);
		panel.add(board1505);
		panel.add(board1506);
		panel.add(board1507);
		panel.add(board1508);
		panel.add(board1509);
		panel.add(board1510);
		panel.add(board1511);
		panel.add(board1512);
		panel.add(board1513);
		panel.add(board1514);
		panel.add(board1515);
		panel.add(board1516);
		panel.add(board1517);
		panel.add(board1518);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1600);
		panel.add(board1601);
		panel.add(board1602);
		panel.add(board1603);
		panel.add(board1604);
		panel.add(board1605);
		panel.add(board1606);
		panel.add(board1607);
		panel.add(board1608);
		panel.add(board1609);
		panel.add(board1610);
		panel.add(board1611);
		panel.add(board1612);
		panel.add(board1613);
		panel.add(board1614);
		panel.add(board1615);
		panel.add(board1616);
		panel.add(board1617);
		panel.add(board1618);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1700);
		panel.add(board1701);
		panel.add(board1702);
		panel.add(board1703);
		panel.add(board1704);
		panel.add(board1705);
		panel.add(board1706);
		panel.add(board1707);
		panel.add(board1708);
		panel.add(board1709);
		panel.add(board1710);
		panel.add(board1711);
		panel.add(board1712);
		panel.add(board1713);
		panel.add(board1714);
		panel.add(board1715);
		panel.add(board1716);
		panel.add(board1717);
		panel.add(board1718);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(board1800);
		panel.add(board1801);
		panel.add(board1802);
		panel.add(board1803);
		panel.add(board1804);
		panel.add(board1805);
		panel.add(board1806);
		panel.add(board1807);
		panel.add(board1808);
		panel.add(board1809);
		panel.add(board1810);
		panel.add(board1811);
		panel.add(board1812);
		panel.add(board1813);
		panel.add(board1814);
		panel.add(board1815);
		panel.add(board1816);
		panel.add(board1817);
		panel.add(board1818);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel("\u5357"));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		Reset.reset();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new Board();
	}
}
