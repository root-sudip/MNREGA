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


				JTextField search_p = new JTextField("Enter Panchayet name");

				JButton login_btn = new JButton("Login");
				JButton back = new JButton("Back");
				JButton search_button = new JButton("Search");
				JButton assign_project = new JButton("Assign Project");
				JButton create_emp_detail = new JButton("Create emp Deatail");

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

				search_p.setBounds(230,70,300,30);
				frame.add(search_p);
				search_p.setVisible(false);

				search_button.setBounds(550,65,100,40);
				frame.add(search_button);
				search_button.setVisible(false);

				assign_project.setBounds(50,30,150,30);
				frame.add(assign_project);
				assign_project.setVisible(false);

				create_emp_detail.setBounds(600,30,200,30);
				frame.add(create_emp_detail);
				create_emp_detail.setVisible(false);







				Object rowData[][] = { 
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

				MouseAdapter search_listener = new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						search_p.setText("");
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
							search_p.setVisible(true);
							search_button.setVisible(true);
							assign_project.setVisible(true);
							create_emp_detail.setVisible(true);
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
						search_p.setVisible(false);
						search_button.setVisible(false);
						assign_project.setVisible(false);
						create_emp_detail.setVisible(false);
						}
				};


				login_text_emailid.addMouseListener(login_listener);
				login_text_password.addMouseListener(password_listener);
				search_p.addMouseListener(search_listener);
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