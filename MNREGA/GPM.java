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

				JTextField login_text_emailid = new JTextField("Email Id");
				JPasswordField login_text_password = new JPasswordField("Password");

				JButton login_btn = new JButton("Login");
				JButton back = new JButton("Back");

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


				back.setBounds(380,30,120,20);
				frame.add(back);
				back.setVisible(false);





				Object rowData[][] = { 
												   { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" },
      											   { "Row2-Column1", "Row2-Column2", "Row2-Column3" }
      										};

   							 Object columnNames[] = { "No", "Project Name","BDO Head Name"};

   							 
    						JTable table = new JTable(rowData, columnNames);

    						JScrollPane scrollPane = new JScrollPane(table);
    						frame.add(scrollPane, BorderLayout.SOUTH);;
    						scrollPane.setVisible(false);
    						scrollPane.setBounds(100,180,700,300);








					//action listener
				MouseAdapter login_listener = new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						login_text_emailid.setText("");
					}
					
				};

				MouseAdapter password_listener = new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						login_text_password.setText("");
					}
					
				};

				ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(username.equals(login_text_emailid.getText()) && password.equals(login_text_password.getText())){
							System.out.println("success!!");
							login_text_emailid.setVisible(false);
							login_text_password.setVisible(false);
							login_emailid.setVisible(false);
							login_password.setVisible(false);
							login_btn.setVisible(false);
							back.setVisible(true);
							scrollPane.setVisible(true);
						}
						else if("".equals(login_text_emailid.getText())){
							System.out.println("blank");
						}
						else{
							System.out.println("Errot:");
							JError  lerr = new JError();
							lerr.login_error();
						}
					}
				};

				ActionListener listener_back = new ActionListener(){
					public void actionPerformed(ActionEvent e){
						login_text_emailid.setVisible(true);
						login_text_password.setVisible(true);
						login_emailid.setVisible(true);
						login_password.setVisible(true);
						login_btn.setVisible(true);
						back.setVisible(false);
						scrollPane.setVisible(false);
						}
				};


				login_text_emailid.addMouseListener(login_listener);
				login_text_password.addMouseListener(password_listener);
				login_btn.addActionListener(listener);
				back.addActionListener(listener_back);

				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);	
				frame.setSize(900,600);		


			}//end run method
		};//end runnable interface
		run.run();
	}
}