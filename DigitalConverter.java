package interfaces.digitalConverter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DigitalConverter extends JLabel{
	static int x,y;
	static char c;
	static double xd,yd;
	static boolean bolhex=false,boldec=true,boloct=false,bolbin=false;
	
	
	static void convertToDec(JLabel decval,JLabel lab) {
		if(bolhex) {
			decval.setText(String.valueOf(Integer.parseInt(lab.getText(),16)));
		}
		if(boldec) {
			decval.setText(String.valueOf(Integer.parseInt(lab.getText(),10)));
		}
		if(boloct) {
			decval.setText(String.valueOf(Integer.parseInt(lab.getText(),8)));
		}
		if(bolbin) {
			decval.setText(String.valueOf(Integer.parseInt(lab.getText(),2)));
		}
	}
	
	static void convertToHex(JLabel hexval,JLabel decval) {
		hexval.setText(String.valueOf(Integer.toHexString(Integer.parseInt(decval.getText()))));
	}
	
	static void convertToOct(JLabel octval,JLabel decval) {
		octval.setText(String.valueOf(Integer.toOctalString(Integer.parseInt(decval.getText()))));
	}
	
	static void convertToBin(JLabel binval,JLabel decval) {
		binval.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(decval.getText()))));
	}
	
	static void convertToAffiche(JLabel lab, JLabel decval) {
		if(bolhex) {
			convertToHex(lab,decval);
		}
		if(boldec) {
			lab.setText(decval.getText());
		}
		if(boloct) {
			convertToOct(lab,decval);
		}
		if(bolbin) {
			convertToBin(lab,decval);
		}
	}
	public static void main(String[] args) {
		JFrame f= new JFrame("Calcule");
		f.setVisible(true);
		f.setSize(316,539);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		JPanel pan1= new JPanel(); f.add(pan1); pan1.setBackground(Color.green); pan1.setBounds(0,5,316,30);
		JPanel pan2= new JPanel(); f.add(pan2); pan2.setBackground(Color.cyan); pan2.setBounds(0,230,316,309); pan2.setLayout(null);
		JPanel pan3 = new JPanel(); f.add(pan3); pan3.setBackground(Color.cyan); pan3.setBounds(0,200,316,30); pan3.setLayout(null);
		JPanel panhex = new JPanel(); f.add(panhex); panhex.setBackground(Color.cyan); panhex.setBounds(0,80,316,29); panhex.setLayout(null);
		JPanel pandec = new JPanel(); f.add(pandec); pandec.setBackground(Color.orange); pandec.setBounds(0,110,316,29); pandec.setLayout(null);
		JPanel panoct= new JPanel(); f.add(panoct); panoct.setBackground(Color.cyan); panoct.setBounds(0,140,316,29); panoct.setLayout(null);
		JPanel panbin = new JPanel(); f.add(panbin); panbin.setBackground(Color.cyan); panbin.setBounds(0,170,316,29); panbin.setLayout(null);
		JLabel hex = new JLabel("HEX	"); panhex.add(hex); hex.setBounds(0,10,50,10);
		JLabel hexval = new JLabel(""); panhex.add(hexval); hexval.setBounds(50,10,250,10);
		JLabel dec = new JLabel("DEC	"); pandec.add(dec); dec.setBounds(0,10,100,10);
		JLabel decval = new JLabel(""); pandec.add(decval); decval.setBounds(50,10,250,10);
		JLabel oct = new JLabel("OCT	"); panoct.add(oct); oct.setBounds(0,10,100,10);
		JLabel octval = new JLabel(""); panoct.add(octval); octval.setBounds(50,10,250,10);
		JLabel bin = new JLabel("BIN	"); panbin.add(bin); bin.setBounds(0,10,100,10);
		JLabel binval = new JLabel(""); panbin.add(binval); binval.setBounds(50,10,250,10);

		JButton ba = new JButton("A"); pan3.add(ba); ba.setBounds(0,0,50,30); ba.setEnabled(false);
		JButton bb = new JButton("B"); pan3.add(bb); bb.setBounds(50,0,50,30); bb.setEnabled(false);
		JButton bc = new JButton("C"); pan3.add(bc); bc.setBounds(100,0,50,30); bc.setEnabled(false);
		JButton bd = new JButton("D"); pan3.add(bd); bd.setBounds(150,0,50,30); bd.setEnabled(false);
		JButton be = new JButton("E"); pan3.add(be); be.setBounds(200,0,50,30); be.setEnabled(false);
		JButton bf = new JButton("F"); pan3.add(bf); bf.setBounds(250,0,50,30); bf.setEnabled(false);
		JButton b0 = new JButton("0"); pan2.add(b0); b0.setBounds(0,216,225,54);
		JButton b1 = new JButton("1"); pan2.add(b1); b1.setBounds(0,162,75,54);
		JButton b2 = new JButton("2"); pan2.add(b2); b2.setBounds(75,162,75,54);
		JButton b3 = new JButton("3"); pan2.add(b3); b3.setBounds(150,162,75,54);
		JButton b4 = new JButton("4"); pan2.add(b4); b4.setBounds(0,108,75,54);
		JButton b5 = new JButton("5"); pan2.add(b5); b5.setBounds(75,108,75,54);
		JButton b6 = new JButton("6"); pan2.add(b6); b6.setBounds(150,108,75,54);
		JButton b7 = new JButton("7"); pan2.add(b7); b7.setBounds(0,54,75,54);
		JButton b8 = new JButton("8"); pan2.add(b8); b8.setBounds(75,54,75,54);
		JButton b9 = new JButton("9"); pan2.add(b9); b9.setBounds(150,54,75,54);
		JButton bce = new JButton("CE"); pan2.add(bce); bce.setBounds(150,0,75,54);
		JButton bsom = new JButton("+"); pan2.add(bsom); bsom.setBounds(225,162,75,54);
		JButton bsou = new JButton("-"); pan2.add(bsou); bsou.setBounds(225,108,75,54);
		JButton bmul = new JButton("*"); pan2.add(bmul); bmul.setBounds(225,54,75,54);
		JButton bdiv = new JButton("/"); pan2.add(bdiv); bdiv.setBounds(225,0,75,54);
		JButton bsup = new JButton("sup"); pan2.add(bsup); bsup.setBounds(75,0,75,54);
		JButton bverg = new JButton(","); pan2.add(bverg); bverg.setBounds(0,0,75,54); bverg.setEnabled(false);
		JButton beg = new JButton("="); pan2.add(beg); beg.setBounds(225,216,75,54);
		JLabel lab = new JLabel(""); pan1.add(lab); lab.setBounds(10,110,70,22);
		
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"0");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"1");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"2");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"3");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"4");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"5");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"6");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"7");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"8");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"9");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		ba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"A");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"B");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"C");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"D");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"E");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		bf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+"F");
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		bverg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText()+".");
			}
		});
		
		bce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText("");
				hexval.setText("");
				decval.setText("");
				octval.setText("");
				binval.setText("");
//				convertToDec(decval,lab);
//				convertToHex(hexval,decval);
//				convertToOct(octval,decval);
//				convertToBin(binval,decval);
			}
		});
		
		bsom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(decval.getText().indexOf('.')==-1)
					x=Integer.parseInt(decval.getText());
				else
					xd=Double.parseDouble(decval.getText());
				lab.setText("");
				c='+';
			}
		});
		
		beg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					if(decval.getText().indexOf('.')==-1 && decval.getText().compareTo("")!=0)
						y=Integer.parseInt(decval.getText());
					else if(decval.getText().indexOf('.')!=-1 && decval.getText().compareTo("")!=0)
						yd=Double.parseDouble(decval.getText());
					else {
						lab.setText("Syntaxe Erreur");
						return ;
					}
				switch(c) {
				case '+':
					if(xd!=0 || yd!=0) {
						decval.setText(String.valueOf(xd+yd+x+y));
						convertToAffiche(lab,decval);
						xd=0;yd=0;
					}
					else {
						decval.setText(String.valueOf(x+y));
						convertToAffiche(lab,decval);
						x=0;y=0;
					}
					break;
				case '-': 
					if(xd!=0 || yd!=0) {
						decval.setText(String.valueOf(xd-yd-x-y));
						convertToAffiche(lab,decval);
						xd=0;yd=0;
					}
					else {
						decval.setText(String.valueOf(x-y));
						convertToAffiche(lab,decval);
						x=0;y=0;
					} 
					break;
				case '*': 
					if(xd==0 && yd==0) {
						decval.setText(String.valueOf(x*y));
						convertToAffiche(lab,decval);
						x=0;y=0;
					}
					else if(xd!=0 && yd!=0){
						 decval.setText(String.valueOf(xd*yd));
						 convertToAffiche(lab,decval);
						 xd=0; yd=0;
					}
					else if(xd!=0 && y!=0) {
						decval.setText(String.valueOf(xd*y));
						convertToAffiche(lab,decval);
						xd=0; y=0;
					}
					else if(yd!=0 && x!=0) {
						decval.setText(String.valueOf(x*yd));
						convertToAffiche(lab,decval);
						yd=0; x=0;
					}
					break;
				case '/': 
					if(xd==0 && yd==0 && y!=0) {
						decval.setText(String.valueOf(x/y));
						convertToAffiche(lab,decval);
						x=0;y=0;
					}
					else if(x==0 && y==0 && yd!=0){
						 decval.setText(String.valueOf(xd/yd));
						 convertToAffiche(lab,decval);
						 xd=0; yd=0;
					}
					else if(x==0 && yd==0 && y!=0) {
						decval.setText(String.valueOf(xd/y));
						convertToAffiche(lab,decval);
						xd=0; y=0;
					}
					else if(xd==0 && y==0 && yd!=0) {
						decval.setText(String.valueOf(x*yd));
						convertToAffiche(lab,decval);
						yd=0; x=0;
					}
					else{
						lab.setText("Erreur");
					}
					break;
				}
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		bsou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(decval.getText().indexOf('.')==-1)
					x=Integer.parseInt(decval.getText());
				else
					xd=Double.parseDouble(decval.getText());
				lab.setText("");
				c='-';
			}
		});
		
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(decval.getText().indexOf('.')==-1)
					x=Integer.parseInt(decval.getText());
				else
					xd=Double.parseDouble(decval.getText());
				lab.setText("");
				c='*';
			}
		});
		
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(decval.getText().indexOf('.')==-1)
					x=Integer.parseInt(decval.getText());
				else
					xd=Double.parseDouble(decval.getText());
				lab.setText("");
				c='/';
			}
		});
		
		bsup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText(lab.getText().substring(0,lab.getText().length()-1));
				convertToDec(decval,lab);
				convertToHex(hexval,decval);
				convertToOct(octval,decval);
				convertToBin(binval,decval);
			}
		});
		
		panhex.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				panhex.setBackground(Color.orange); bolhex=true;
				pandec.setBackground(Color.cyan); boldec=false;
				panoct.setBackground(Color.cyan); boloct=false;
				panbin.setBackground(Color.cyan); bolbin=false;
				
				ba.setEnabled(true);b3.setEnabled(true);b9.setEnabled(true);
				bb.setEnabled(true);b4.setEnabled(true);b2.setEnabled(true);
				bc.setEnabled(true);b5.setEnabled(true);
				bd.setEnabled(true);b6.setEnabled(true);
				be.setEnabled(true);b7.setEnabled(true);
				bf.setEnabled(true);b8.setEnabled(true);

			}
			public void mousePressed(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				if(!bolhex)panhex.setBackground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				if(bolhex) panhex.setBackground(Color.orange);
				else panhex.setBackground(Color.cyan);
			}
			public void mouseReleased(MouseEvent e) {}
		});
		
		pandec.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				panhex.setBackground(Color.cyan); bolhex=false;
				pandec.setBackground(Color.orange); boldec=true;
				panoct.setBackground(Color.cyan); boloct=false;
				panbin.setBackground(Color.cyan); bolbin=false;
				
				ba.setEnabled(false);b3.setEnabled(true);b9.setEnabled(true);
				bb.setEnabled(false);b4.setEnabled(true);b2.setEnabled(true);
				bc.setEnabled(false);b5.setEnabled(true);
				bd.setEnabled(false);b6.setEnabled(true);
				be.setEnabled(false);b7.setEnabled(true);
				bf.setEnabled(false);b8.setEnabled(true);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				if(!boldec)pandec.setBackground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				if(boldec) pandec.setBackground(Color.orange);
				else pandec.setBackground(Color.cyan);
			}
			public void mouseReleased(MouseEvent e) {}
		});
		
		panoct.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				panhex.setBackground(Color.cyan); bolhex=false;
				pandec.setBackground(Color.cyan); boldec=false;
				panoct.setBackground(Color.orange); boloct=true;
				panbin.setBackground(Color.cyan); bolbin=false;
				
				ba.setEnabled(false);b3.setEnabled(true);
				bb.setEnabled(false);b4.setEnabled(true);
				bc.setEnabled(false);b5.setEnabled(true);
				bd.setEnabled(false);b6.setEnabled(true);
				be.setEnabled(false);b7.setEnabled(true);
				bf.setEnabled(false);b2.setEnabled(true);
				b9.setEnabled(false);
				b8.setEnabled(false);

			}
			public void mousePressed(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				if(!boloct)panoct.setBackground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				if(boloct) panoct.setBackground(Color.orange);
				else panoct.setBackground(Color.cyan);
			}
			public void mouseReleased(MouseEvent e) {}
		});
		
		panbin.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				panhex.setBackground(Color.cyan); bolhex=false;
				pandec.setBackground(Color.cyan); boldec=false;
				panoct.setBackground(Color.cyan); boloct=false;
				panbin.setBackground(Color.orange); bolbin=true;
				
				ba.setEnabled(false);
				bb.setEnabled(false);
				bc.setEnabled(false);
				bd.setEnabled(false);
				be.setEnabled(false);
				bf.setEnabled(false);
				b9.setEnabled(false);
				b8.setEnabled(false);
				b7.setEnabled(false);
				b6.setEnabled(false);
				b5.setEnabled(false);
				b4.setEnabled(false);
				b3.setEnabled(false);
				b2.setEnabled(false);

			}
			public void mousePressed(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				if(!bolbin)panbin.setBackground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				if(bolbin) panbin.setBackground(Color.orange);
				else panbin.setBackground(Color.cyan);
			}
			public void mouseReleased(MouseEvent e) {}
		});
	}
}
