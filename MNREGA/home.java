import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.sql.*;

class JError{

	public void login_error(){
		JPanel panel = new JPanel();
		JLabel error_label= new JLabel("Enter correct email Id or Password");
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

				JTextField project_name = new JTextField();
				JTextField signed_BDO_Name = new JTextField();
				JTextField date_Of_Issue = new JTextField();
				JTextField panchayat_Name = new JTextField();
				JTextField recived_Panchayat_member_name = new JTextField();
				JTextField money = new JTextField();
				JTextField duration = new JTextField();

				JLabel l_project_name = new JLabel("Project Name");
				JLabel l_signed_BDO_Name = new JLabel("BDO Signed Name");
				JLabel l_date_Of_Issue = new JLabel("Date of Issue");
				JLabel l_panchayat_Name = new JLabel("Panchayat Name");
				JLabel l_recived_Panchayat_member_name = new JLabel("Recived Pamchayat Member Name");
				JLabel l_money = new JLabel("Money");
				JLabel l_duration = new JLabel("Duration");

				JButton project_submit = new JButton("Submit");

				String username="admin";
				String password="pass";


				Object[][] j_rowData = new Object[1000][6];

   				Object j_columnNames[] = { "ID", "BDO Name","Project Name","GPN","Money","GPMN"};

   				JTable j_table = new JTable(j_rowData, j_columnNames);
    			JScrollPane j_p_l_scrollPane = new JScrollPane(j_table);

//new
    			Object[][] gpm_l_rowData = new Object[1000][3];

   				Object gpm_l_columnNames[] = { "FULL NAME", "CONTACT","GP Name"};

   				JTable gpm_l_table = new JTable(gpm_l_rowData, gpm_l_columnNames);
    			JScrollPane gpm_l_p_l_scrollPane = new JScrollPane(gpm_l_table);

//end_new
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


				project_name.setBounds(500,100,240,40);
				frame.add(project_name);
				project_name.setVisible(false);

				signed_BDO_Name.setBounds(500,150,240,40);
				frame.add(signed_BDO_Name);
				signed_BDO_Name.setVisible(false);

				date_Of_Issue.setBounds(500,200,240,40);	
				frame.add(date_Of_Issue);
				date_Of_Issue.setVisible(false);

				panchayat_Name.setBounds(500,250,240,40);
				frame.add(panchayat_Name);
				panchayat_Name.setVisible(false);

				recived_Panchayat_member_name.setBounds(500,300,240,40);
				frame.add(recived_Panchayat_member_name);
				recived_Panchayat_member_name.setVisible(false);

				money.setBounds(500,350,240,40);
				frame.add(money);
				money.setVisible(false);

				duration.setBounds(500,400,240,40);
				frame.add(duration);
				duration.setVisible(false);

				l_project_name.setBounds(200,100,300,40);
				frame.add(l_project_name);
				l_project_name.setVisible(false);

				l_signed_BDO_Name.setBounds(200,150,300,40);
				frame.add(l_signed_BDO_Name);
				l_signed_BDO_Name.setVisible(false);

				l_date_Of_Issue.setBounds(200,200,300,40);
				frame.add(l_date_Of_Issue);
				l_date_Of_Issue.setVisible(false);

				l_panchayat_Name.setBounds(200,250,300,40);
				frame.add(l_panchayat_Name);
				l_panchayat_Name.setVisible(false);

				l_recived_Panchayat_member_name.setBounds(200,300,300,40);
				frame.add(l_recived_Panchayat_member_name);
				l_recived_Panchayat_member_name.setVisible(false);

				l_money.setBounds(200,350,300,40);
				frame.add(l_money);
				l_money.setVisible(false);

				l_duration.setBounds(200,400,300,40);
				frame.add(l_duration);
				l_duration.setVisible(false);

				project_submit.setBounds(350,500,200,40);
				frame.add(project_submit);
				project_submit.setVisible(false);

				//exp
							Object rowData[][] = { };
   							 Object columnNames[] = { "No", "Project Name","BDO Head Name"};
   							 
    						JTable table = new JTable(rowData, columnNames);

    						JScrollPane scrollPane = new JScrollPane(table);
    						frame.add(scrollPane, BorderLayout.SOUTH);
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
						//user login
				Connection conn = null;
				Statement stmt = null;
				String url = "jdbc:mysql://localhost:3306/MNREGA";
				String driver = "com.mysql.jdbc.Driver";
        		String userName = "root"; 
        		String passWord = "sudipdas";
        		ResultSet rs=null;

				try {
        				Class.forName(driver).newInstance();
        				conn = DriverManager.getConnection(url,userName,passWord);
        				System.out.println("Connected to the database");
         				stmt = conn.createStatement();

         				String sql ="select * from BDO_info where password ='"+login_text_password.getText() +"'";

        				PreparedStatement ps=conn.prepareStatement(sql);
     		 //rs = stmt.executeQuery(sql);
      					rs=ps.executeQuery();

     		 			if(rs.next()){

     		 				System.out.println("success");
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
     		 			else{
     		 				System.out.println("Errot:");
							JError  lerr = new JError();
							lerr.login_error();
     		 			}
     		 
        					conn.close();
        					System.out.println("Disconnected from database");
        			} catch (Exception ee) {
        					ee.printStackTrace();
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
						project_name.setVisible(true);
						signed_BDO_Name.setVisible(true);
						date_Of_Issue.setVisible(true);
						panchayat_Name.setVisible(true);
						recived_Panchayat_member_name.setVisible(true);
						money.setVisible(true);
						duration.setVisible(true);
						l_project_name.setVisible(true);
						duration.setVisible(true);
						l_project_name.setVisible(true);
						l_signed_BDO_Name.setVisible(true);
						l_date_Of_Issue.setVisible(true);
						l_panchayat_Name.setVisible(true);
						l_recived_Panchayat_member_name.setVisible(true);
						l_money.setVisible(true);
						l_duration.setVisible(true);
						project_submit.setVisible(true);
						j_p_l_scrollPane.setVisible(false);
						gpm_l_p_l_scrollPane.setVisible(false);
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
						project_name.setVisible(false);
						signed_BDO_Name.setVisible(false);
						date_Of_Issue.setVisible(false);
						panchayat_Name.setVisible(false);
						recived_Panchayat_member_name.setVisible(false);
						money.setVisible(false);
						duration.setVisible(false);
						l_project_name.setVisible(false);
						duration.setVisible(false);
						l_project_name.setVisible(false);
						l_signed_BDO_Name.setVisible(false);
						l_date_Of_Issue.setVisible(false);
						l_panchayat_Name.setVisible(false);
						l_recived_Panchayat_member_name.setVisible(false);
						l_money.setVisible(false);
						l_duration.setVisible(false);
						project_submit.setVisible(false);

					}
				};
//java jdbc conntion ....insert data to the database after clicking to the submit bttn
				ActionListener project_submit_listener = new ActionListener(){
					public void actionPerformed(ActionEvent e){
						//AFTER

					}
				};

				ActionListener bdo_search_listener = new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						if("L_PROJECT".equals(search_p.getText())){
							System.out.println("got event");
							//

							Connection conn = null;
							Statement stmt = null;
							String url = "jdbc:mysql://localhost:3306/MNREGA";
							String driver = "com.mysql.jdbc.Driver";
        					String userName = "root"; 
        					String passWord = "sudipdas";
        					ResultSet rs=null;
        					scrollPane.setVisible(false);
        					//

        					try{

        						Class.forName("com.mysql.jdbc.Driver");
        						conn = DriverManager.getConnection(url,userName,passWord);
        						stmt = conn.createStatement();
        						String sql ="select * from BDO_project";/////have to write
        						rs = stmt.executeQuery(sql);
        						int i=1,j=1;
        						
        						///
        						
    						while(rs.next()){
    					
    							//int id = rs.getInt("id");
    							j_rowData[j][0] = rs.getInt("id");
    							//String BDO_name = rs.getString("BDO_name");
    							j_rowData[j][1] = rs.getString("BDO_name");
    							//String GNP_p = rs.getString("GPN");
    							j_rowData[j][2] = rs.getString("project_name");
    							j_rowData[j][3] = rs.getString("GPN");
    							//Double BDO_money = rs.getDouble("money");
    							j_rowData[j][4] = rs.getDouble("money");
    							//String GPM_n = rs.getString("GPMN");
    							j_rowData[j][5] = rs.getString("GPMN");
    							/*System.out.println(BDO_money);*/
    								j++;
    						}

    						frame.add(j_p_l_scrollPane, BorderLayout.SOUTH);;
    						j_p_l_scrollPane.setVisible(true);
    						j_p_l_scrollPane.setBounds(100,180,700,300);
    						rs.close();

        						///

        					}catch(Exception ee){
        						ee.printStackTrace();
        					}

							//

						}
//error start
						else if("L_GPM".equals(search_p.getText())){
							System.out.println("got view");
							Connection conn = null;
							Statement stmt = null;
							String url = "jdbc:mysql://localhost:3306/MNREGA";
							String driver = "com.mysql.jdbc.Driver";
        					String userName = "root"; 
        					String passWord = "sudipdas";
        					ResultSet rs=null;
        					scrollPane.setVisible(false);
        					j_p_l_scrollPane.setVisible(false);
        					//
        					gpm_l_p_l_scrollPane.setVisible(true);

        					try{

        						Class.forName("com.mysql.jdbc.Driver");
        						conn = DriverManager.getConnection(url,userName,passWord);
        						stmt = conn.createStatement();
        						String sql ="select * from GPM_name";/////have to write
        						rs = stmt.executeQuery(sql);
        						int i=1,j=1;
        						
        						///
        						
    						while(rs.next()){
    					
    							//int id = rs.getInt("id");
    							gpm_l_rowData[j][0] = rs.getString("fullname");
    							System.out.println(rs.getString("fullname"));
    							//String BDO_name = rs.getString("BDO_name");
    							gpm_l_rowData[j][1] = rs.getString("contact");
    							//String GNP_p = rs.getString("GPN");
    							gpm_l_rowData[j][2] = rs.getString("gpn");
    							
    							/*System.out.println(BDO_money);*/
    								j++;
    						}

    						frame.add(gpm_l_p_l_scrollPane, BorderLayout.SOUTH);;
    						gpm_l_p_l_scrollPane.setVisible(true);
    						gpm_l_p_l_scrollPane.setBounds(100,180,700,300);
    						rs.close();

        						///

        					}catch(Exception ee){
        						ee.printStackTrace();
        					}

						}
						else{
							System.out.println("Blank");
						}
					}
				};

//end error
				//end create project 
				login_text_emailid.addMouseListener(login_listener);
				login_text_password.addMouseListener(password_listener);
				search_p.addMouseListener(search_listener);
				login_btn.addActionListener(listener);
				back.addActionListener(listener_back);
				ctrate_project.addActionListener(listener_create_p);
				
				p_back.addActionListener(create_p_back);
				project_submit.addActionListener(project_submit_listener);
				search_button.addActionListener(bdo_search_listener);
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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


//java -cp .:mysql-connector-java-5.1.18-bin.jar home