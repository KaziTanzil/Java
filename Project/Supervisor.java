package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Supervisor {

	public JFrame frame;

	
	public Supervisor() {
		initialize();
	}
	
	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Registration");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration r= new Registration();
				r.setVisible(true);
				frame.setVisible(false);
				
				
				
			}
		});
		btnNewButton.setBounds(20, 199, 176, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("Vahicle List");
		btnNewButton_1_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(20, 131, 176, 29);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Employee List");
		btnNewButton_1_2.setBackground(new Color(192, 192, 192));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(20, 56, 176, 29);
		frame.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserData Ud= new UserData();
				Ud.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(123, 100, 81));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l= new Login();
				l.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(518, 384, 129, 29);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\padma-bridge-2-768x432.jpg"));
		lblNewLabel.setBounds(0, 0, 657, 423);
		frame.getContentPane().add(lblNewLabel);
	}


	public void setVisible(boolean b) {
		if(b==true)
			frame.setVisible(true);
		
	}
	}

