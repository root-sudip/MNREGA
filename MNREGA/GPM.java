import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.sql.*;

public class GPM{
	public static void main(String[] args){
		Runnable run = new Runnable(){
			public void run(){
				JFrame frame = new JFrame("The Mahatma Gandhi National Rural Employment Guarantee Act");
				JLabel login_emailid = new JLabel("Email Id");
				JLabel login_password = new JLabel("Password");
				JButton login_btn = new JButton("Login");

				String username="admin";
				String password="pass";


				frame.setLayout(null);



				login_emailid.setBounds(300,150,100,100);
				frame.add(login_emailid);

				login_password.setBounds(300,250,100,100);
				frame.add(login_password);
				//text area
				login_text_emailid.setBounds(300,220,300,50);
				frame.add(login_text_emailid);

				login_text_password.setBounds(300,320,300,50);
				frame.add(login_text_password);

				//button
				login_btn.setBounds(380,380,120,50);
				frame.add(login_btn);
			}
		};
		run.run();
	}
}