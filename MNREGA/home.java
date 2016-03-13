import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.text.*;



class JError{

	public void login_error(){
		JPanel panel = new JPanel();
		JLabel error_label= new JLabel("Enter correct email id or password");
		JFrame mm = new JFrame();

		mm.setLayout(null);
		error_label.setBounds(50,40,400,30);
		mm.setLocationRelativeTo(null);
		mm.add(error_label);
		mm.setVisible(true);
		mm.setResizable(false);	
		mm.setSize(350,100);
	}	
}

class JHome{
	private static JHome home_obj = new JHome();
	private JHome(){}
	public static JHome getInstance(){
			return home_obj;
	}
	
	Runnable runner = new Runnable(){
			public void run(){
				JFrame frame = new JFrame("The Mahatma Gandhi National Rural Employment Guarantee Act");
				
				JLabel login_emailid = new JLabel("Email Id");
				JLabel login_password = new JLabel("Password");


				JTextField login_text_emailid = new JTextField("Email Id");
				JTextField search_p = new JTextField("Enter Panchayet name");
				JPasswordField login_text_password = new JPasswordField("Password");
				JButton login_btn = new JButton("Login");
				JButton back = new JButton("Back");
				JButton ctrate_project = new JButton("Create Project");
				JButton search_button = new JButton("Search");
				JButton p_back = new JButton("Back");


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

				ctrate_project.setBounds(700,30,140,20);
				frame.add(ctrate_project);
				ctrate_project.setVisible(false);

				search_p.setBounds(230,70,300,30);
				frame.add(search_p);
				search_p.setVisible(false);

				search_button.setBounds(550,65,100,40);
				frame.add(search_button);
				search_button.setVisible(false);

				p_back.setBounds(380,30,120,20);
				frame.add(p_back);
				p_back.setVisible(false);


				//exp
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



				///end exp



				
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
							ctrate_project.setVisible(true);
							search_p.setVisible(true);
							search_button.setVisible(true);
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
						ctrate_project.setVisible(false);
						search_p.setVisible(false);
						search_button.setVisible(false);
						scrollPane.setVisible(false);
					}
				};

				


				//create project 
				ActionListener listener_create_p = new ActionListener(){
					public void actionPerformed(ActionEvent e){
						back.setVisible(false);
						ctrate_project.setVisible(false);
						search_p.setVisible(false);
						search_button.setVisible(false);
						scrollPane.setVisible(false);
						p_back.setVisible(true);
					}
				};

				ActionListener create_p_back = new ActionListener(){
					public void actionPerformed(ActionEvent e){
						back.setVisible(true);
						ctrate_project.setVisible(true);
						search_p.setVisible(true);
						search_button.setVisible(true);
						scrollPane.setVisible(true);
						p_back.setVisible(false);

					}
				};



				//end create project 
				login_text_emailid.addMouseListener(login_listener);
				login_text_password.addMouseListener(password_listener);
				search_p.addMouseListener(search_listener);
				login_btn.addActionListener(listener);
				back.addActionListener(listener_back);
				ctrate_project.addActionListener(listener_create_p);
				p_back.addActionListener(create_p_back);

				
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.setLayout(new GridLayout(6,7));
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);	
				frame.setSize(900,600);		
				//frame.setUndecorated(true);
				
			}
		};
}

public class home{
	public static void main(String[] args){
		
		JHome obj = JHome.getInstance();
		obj.runner.run();
		
	}
}