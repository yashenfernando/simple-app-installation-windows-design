//yash-2022.08.19/20-activity01@ijse-tested-homepageDesignErrorInButtons-version1.0
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Screen01 extends JFrame{
	//Screen01 scen1 = this;
	Screen02 s2 = new Screen02(this);
	JFrame frame1 = new JFrame();
	private JLabel lbl1 = new JLabel("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
	private JPanel pnl1 = new JPanel(); 
	private JLabel lbl2 = new JLabel();
	private JLabel lbl3 = new JLabel();
	private JPanel btnpnl = new JPanel();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();

	Screen01(){
		frame1.setSize(750,550);
		frame1.setTitle("setup wizard");
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);
		//frame1.setResizable(false);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lbl1.setSize(100,100);
		lbl1.setHorizontalAlignment(JTextField.CENTER);
		lbl1.setFont(new Font("Arial",1,25));
		frame1.add("North",lbl1);

		pnl1.setSize(200,200);
		pnl1.setLayout(new GridLayout(3,1));
		frame1.add("Center",pnl1);

		lbl2.setSize(200,100);
		lbl2.setFont(new Font ("",0,15));
		lbl2.setText("This guid of instrollation process in wizard...");
		pnl1.add(lbl2);

		lbl3.setSize(200,100);
		lbl3.setFont(new Font ("",0,15));
		lbl3.setText("Click 'Next' to continue");
		pnl1.add(lbl3);

		btnpnl.setSize(200,200);
		btnpnl.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnl1.add(btnpnl);

		btn1.setSize(100,50);
		btn1.setText("Next");
		//btn1.setFont(new Font("",1,15));
		btn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					frame1.dispose();
					s2.frame2.setVisible(true);
				}
			}
		);
		btnpnl.add(btn1);

		btn2.setSize(100,50);
		btn2.setText("Cancel");
		//btn2.setFont(new Font("",1,15));
		btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					System.exit(0);
				}
			}
		);
		btnpnl.add(btn2);
		//pack();


	}
}

class Screen02 extends JFrame{
	//Screen01 scen1 = Screen01.scen1; // runtime error
	JFrame frame2 = new JFrame();
	JLabel lbl1 = new JLabel();
	JPanel centerPnl = new JPanel();
	JLabel lbl2 = new JLabel();
	JLabel lbl3 = new JLabel();
	JLabel lbl4 = new JLabel();
	JTextField txt1 = new JTextField(10);
	JPanel btnPanel = new JPanel();
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();


	Screen02(Screen01 s1){
		Screen03 s3 = new Screen03(this);
		frame2.setSize(750,400);
		frame2.setTitle("setup wizard");
		frame2.setVisible(false);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lbl1.setSize(100,100);
		lbl1.setText("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
		lbl1.setHorizontalAlignment(JLabel.CENTER);
		lbl1.setFont(new Font("Arial",1,25));
		frame2.add("North",lbl1);

		centerPnl.setLayout(new GridLayout(4,1));
		centerPnl.setSize(500,150);
		frame2.add(centerPnl);

		lbl2.setSize(400,75);
		lbl2.setText("This Engenies environment setup wizard will install the Engenies software on your computer ");
		lbl2.setFont(new Font("Arial",0,15));
		centerPnl.add(lbl2);

		lbl3.setSize(400,50);
		lbl3.setText("Enter Your NIC Number :");
		lbl3.setFont(new Font("Arial",0,15));
		centerPnl.add(lbl3);

		txt1.setFont(new Font("Arial",1,20));
		txt1.setSize(400,50);
		txt1.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent evt){
				if (txt1.getText().equals("")) {
					btn2.setEnabled(false);
				}else{
					btn2.setEnabled(true);
				}
			}
		});
		txt1.setHorizontalAlignment(JLabel.CENTER);
		centerPnl.add(txt1);

		lbl4.setSize(400,50);
		lbl4.setText("Click \"NEXT\" to continue :");
		lbl4.setFont(new Font("Arial",0,15));
		centerPnl.add(lbl4);

		btnPanel.setSize(400,100);
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		frame2.add("South",btnPanel);

		btn1.setSize(100,50);
		btn1.setText("back");
		btn1.setFont(new Font("Arial",1,15));
		btn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					frame2.dispose();
					s1.frame1.setVisible(true);
					
				}
			}
		);
		btnPanel.add(btn1);

		btn2.setSize(100,50);
		btn2.setEnabled(false);
		btn2.setText("next");
		btn2.setFont(new Font("Arial",1,15));
		btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					frame2.dispose();
					s3.frame3.setVisible(true);
				}
			}
		);
		btnPanel.add(btn2);

		btn3.setSize(100,50);
		btn3.setText("cansel");
		btn3.setFont(new Font("Arial",1,15));
		btn3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					System.exit(0);
				}
			}
		);
		btnPanel.add(btn3);

	}
}


class Screen03 extends JFrame{
	//Screen01 scen1 = Screen01.scen1; // runtime error
	JFrame frame3 = new JFrame();
	JLabel lbl1 = new JLabel();
	JPanel centerPnl = new JPanel();
	JLabel lbl2 = new JLabel();
	JLabel lbl3 = new JLabel();
	JLabel lbl4 = new JLabel();
	JTextField txt1 = new JTextField(10);
	JPanel btnPanel = new JPanel();
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();


	Screen03(Screen02 s2){
		Screen04 s4 = new Screen04(this);
		frame3.setSize(750,400);
		frame3.setTitle("setup wizard");
		frame3.setVisible(false);
		frame3.setLocationRelativeTo(null);
		frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lbl1.setSize(100,100);
		lbl1.setText(" WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD ");
		lbl1.setHorizontalAlignment(JLabel.CENTER);
		lbl1.setFont(new Font("Arial",1,25));
		frame3.add("North",lbl1);

		centerPnl.setLayout(new GridLayout(4,1));
		centerPnl.setSize(500,150);
		frame3.add(centerPnl);

		lbl2.setSize(400,75);
		lbl2.setText(" Fill in the following requirements to continue the installation process. ");
		lbl2.setFont(new Font("Arial",0,15));
		centerPnl.add(lbl2);

		lbl3.setSize(400,50);
		lbl3.setText("Enter Your Name :");
		lbl3.setFont(new Font("Arial",0,15));
		centerPnl.add(lbl3);

		txt1.setFont(new Font("Arial",1,20));
		txt1.setSize(400,50);
		txt1.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent evt){
				if (txt1.getText().equals("")) {
					btn2.setEnabled(false);
				}else{
					btn2.setEnabled(true);
				}
			}
		});
		txt1.setHorizontalAlignment(JLabel.CENTER);
		centerPnl.add(txt1);

		lbl4.setSize(400,50);
		lbl4.setText("Click \"NEXT\" to continue :");
		lbl4.setFont(new Font("Arial",0,15));
		centerPnl.add(lbl4);

		btnPanel.setSize(400,100);
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		frame3.add("South",btnPanel);

		btn1.setSize(100,50);
		btn1.setText("back");
		btn1.setFont(new Font("Arial",1,15));
		btn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					frame3.dispose();
					s2.frame2.setVisible(true);
					
				}
			}
		);
		btnPanel.add(btn1);

		btn2.setSize(100,50);
		btn2.setEnabled(false);
		btn2.setText("next");
		btn2.setFont(new Font("Arial",1,15));
		btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					frame3.dispose();
					s4.frame4.setVisible(true);
				}
			}
		);
		btnPanel.add(btn2);

		btn3.setSize(100,50);
		btn3.setText("cansel");
		btn3.setFont(new Font("Arial",1,15));
		btn3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					System.exit(0);
				}
			}
		);
		btnPanel.add(btn3);

	}
}


class Screen04 extends JFrame{

	JFrame frame4 = new JFrame();
	private JLabel lbl1 = new JLabel("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
	private JPanel pnl1 = new JPanel(); 
	private JLabel lbl2 = new JLabel();
	private JLabel lbl3 = new JLabel();
	private JPanel buttonPanel = new JPanel();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();

	Screen04(Screen03 s3){
		frame4.setSize(750,400);
		frame4.setTitle("setup wizard");
		frame4.setVisible(false);
		frame4.setLocationRelativeTo(null);
		frame4.setResizable(false);
		frame4.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lbl1.setSize(100,100);
		lbl1.setHorizontalAlignment(JTextField.CENTER);
		lbl1.setFont(new Font("Arial",1,25));
		frame4.add("North",lbl1);

		pnl1.setSize(200,200);
		pnl1.setLayout(new GridLayout(3,1));
		frame4.add("Center",pnl1);

		lbl2.setSize(200,100);
		lbl2.setFont(new Font ("",0,15));
		lbl2.setText("Your installation requirements has been fulfilled . Click FINISH to complete the installation process ");
		pnl1.add(lbl2);

		lbl3.setSize(200,100);
		lbl3.setFont(new Font ("",0,15));
		lbl3.setText("");
		pnl1.add(lbl3);

		buttonPanel.setSize(200,200);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnl1.add(buttonPanel);

		btn1.setSize(100,50);
		btn1.setText("Finish");
		btn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					System.exit(0);
				}
			}
		);
		buttonPanel.add(btn1);

		btn2.setSize(100,50);
		btn2.setText("Back");
		btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					frame4.dispose();
					s3.frame3.setVisible(true);
				}
			}
		);
		buttonPanel.add(btn2);
		pack();


	}
}

class Demo{ 
	public static void main(String args[]){

		new Screen01();
	}
}
