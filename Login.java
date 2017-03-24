package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmHome;
	private JMenuItem mntmSignOut;
	private JPanel Cards;
	private JPanel Login;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtUsername_1;
	private JTextField txtPassword;
	private JPanel Home;
	private JLabel lblBillsplit;
	private JButton btnCalendar;
	private JButton btnAddBill;
	private JButton btnSettings;
	private JPanel Calendar;
	private JTextField txtBillname;
	private JTextField txtTotalbillamount;
	private JTextField txtNumroommates;
	private JTextField txtFirstName_1;
	private JTextField txtLastName_1;
	private JTextField txtUsername_2;
	private JTextField txtPassword_1;
	private JTextField txtEnterGroupName;
	private JTextField txtCreateNewGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 400);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmHome = new JMenuItem("Home"); 
		menuBar.add(mntmHome);
		
		mntmSignOut = new JMenuItem("Sign Out");
		menuBar.add(mntmSignOut);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		Cards = new JPanel();
		contentPane.add(Cards, "name_2146934950434");
		Cards.setLayout(new CardLayout(0, 0));
		
		Login = new JPanel();
		Cards.add(Login, "name_2140769625460");
		Login.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(157, 53, 186, 32);
		Login.add(txtUsername);
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(157, 96, 186, 32);
		Login.add(pwdPassword);
		pwdPassword.setText("Password");
		
		JButton btnLogin = new JButton("Login");

		btnLogin.setBounds(157, 139, 186, 35);
		Login.add(btnLogin);
		
		JPanel SignUp = new JPanel();
		Cards.add(SignUp, "name_2175269678062");
		SignUp.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(155, 21, 186, 32);
		SignUp.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(155, 60, 186, 32);
		SignUp.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtUsername_1 = new JTextField();
		txtUsername_1.setText("Username");
		txtUsername_1.setBounds(155, 98, 186, 32);
		SignUp.add(txtUsername_1);
		txtUsername_1.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(155, 136, 186, 32);
		SignUp.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(155, 189, 186, 35);
		SignUp.add(btnSubmit);
		
		Home = new JPanel();
		Cards.add(Home, "name_2393664671946");
		Home.setLayout(null);
		
		lblBillsplit = new JLabel("BillSplit");
		lblBillsplit.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillsplit.setBounds(0, 0, 528, 61);
		lblBillsplit.setFont(new Font("Tahoma", Font.BOLD, 50));
		Home.add(lblBillsplit);
		
		btnCalendar = new JButton("Calendar");
		btnCalendar.setBounds(191, 69, 141, 35);
		Home.add(btnCalendar);
		
		btnAddBill = new JButton("Add Bill");
		btnAddBill.setBounds(191, 112, 141, 35);
		Home.add(btnAddBill);
		
		btnSettings = new JButton("Settings");
		btnSettings.setBounds(191, 154, 141, 35);
		Home.add(btnSettings);
		
		Calendar = new JPanel();
		Cards.add(Calendar, "name_2614559085932");
		Calendar.setLayout(null);
		
		JPanel AddBill = new JPanel();
		Cards.add(AddBill, "name_2684231063061");
		AddBill.setLayout(null);
		
		JLabel lblBillName = new JLabel("Bill Name:");
		lblBillName.setBounds(21, 21, 112, 26);
		AddBill.add(lblBillName);
		
		JLabel lblTotalBillAmount = new JLabel("Total Bill Amount:");
		lblTotalBillAmount.setBounds(21, 64, 176, 26);
		AddBill.add(lblTotalBillAmount);
		
		JLabel lblNumberOfRoommates = new JLabel("Number of Roommates:");
		lblNumberOfRoommates.setBounds(21, 111, 233, 26);
		AddBill.add(lblNumberOfRoommates);
		
		txtBillname = new JTextField();
		txtBillname.setBounds(126, 18, 186, 32);
		AddBill.add(txtBillname);
		txtBillname.setColumns(10);
		
		txtTotalbillamount = new JTextField();
		txtTotalbillamount.setBounds(197, 61, 186, 32);
		AddBill.add(txtTotalbillamount);
		txtTotalbillamount.setColumns(10);
		
		txtNumroommates = new JTextField();
		txtNumroommates.setBounds(255, 108, 186, 32);
		AddBill.add(txtNumroommates);
		txtNumroommates.setColumns(10);
		
		JButton btnAddBill_1 = new JButton("Add Bill");
		btnAddBill_1.setBounds(181, 180, 141, 35);
		AddBill.add(btnAddBill_1);
		
		JPanel Settings = new JPanel();
		Cards.add(Settings, "name_2866472175132");
		Settings.setLayout(null);
		
		JButton btnManageGroups = new JButton("Manage Group(s)");
		btnManageGroups.setBounds(160, 32, 195, 35);
		Settings.add(btnManageGroups);
		
		JButton btnUpdateInfo = new JButton("Update Info");
		btnUpdateInfo.setBounds(160, 93, 195, 35);
		Settings.add(btnUpdateInfo);
		
		JPanel UserInfo = new JPanel();
		Cards.add(UserInfo, "name_2942968280061");
		UserInfo.setLayout(null);
		
		txtFirstName_1 = new JTextField();
		txtFirstName_1.setText("First Name");
		txtFirstName_1.setBounds(154, 21, 186, 32);
		UserInfo.add(txtFirstName_1);
		txtFirstName_1.setColumns(10);
		
		txtLastName_1 = new JTextField();
		txtLastName_1.setText("Last Name");
		txtLastName_1.setBounds(154, 74, 186, 32);
		UserInfo.add(txtLastName_1);
		txtLastName_1.setColumns(10);
		
		txtUsername_2 = new JTextField();
		txtUsername_2.setText("Username");
		txtUsername_2.setBounds(154, 127, 186, 32);
		UserInfo.add(txtUsername_2);
		txtUsername_2.setColumns(10);
		
		txtPassword_1 = new JTextField();
		txtPassword_1.setText("Password");
		txtPassword_1.setBounds(154, 179, 186, 32);
		UserInfo.add(txtPassword_1);
		txtPassword_1.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(154, 223, 186, 35);
		UserInfo.add(btnUpdate);
		
		JPanel Group = new JPanel();
		Cards.add(Group, "name_3024945128167");
		Group.setLayout(null);
		
		txtEnterGroupName = new JTextField();
		txtEnterGroupName.setText("Enter Group Name");
		txtEnterGroupName.setBounds(21, 124, 186, 32);
		Group.add(txtEnterGroupName);
		txtEnterGroupName.setColumns(10);
		
		JButton btnJoinGroup = new JButton("Join Group");
		btnJoinGroup.setBounds(228, 123, 141, 35);
		Group.add(btnJoinGroup);
		
		txtCreateNewGroup = new JTextField();
		txtCreateNewGroup.setText("Create New Group");
		txtCreateNewGroup.setBounds(21, 54, 186, 32);
		Group.add(txtCreateNewGroup);
		txtCreateNewGroup.setColumns(10);
		
		JButton btnCreateGroup = new JButton("Create Group");
		btnCreateGroup.setBounds(228, 53, 167, 35);
		Group.add(btnCreateGroup);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login.setVisible(false);
				SignUp.setVisible(true);
			}
		});
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp.setVisible(false);
				Home.setVisible(true);
			}
		});
		btnCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.setVisible(false);
				Calendar.setVisible(true);
			}
		});
		btnAddBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.setVisible(false);
				AddBill.setVisible(true);
			}
		});
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.setVisible(false);
				Settings.setVisible(true);
			}
		});
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.setVisible(true);
				Group.setVisible(true);
			}
		});
		btnUpdateInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.setVisible(true);
				UserInfo.setVisible(true);
			}
		});
	}
}
