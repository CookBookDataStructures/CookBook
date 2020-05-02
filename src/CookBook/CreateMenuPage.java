package CookBook;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class CreateMenuPage extends JFrame{
	public CreateMenuPage() {
		
		Main.bstDessert.inorderTraversal();
		
		Recipe recipeStarter = new Recipe("aa","ss","ff");
		Recipe recipeMainMeal = new Recipe("dd", "dd", "d");
		Recipe recipeDessert = new Recipe("j","j","j");
		
		getContentPane().setBackground(new Color(255, 222, 173));
		setTitle("Cook-Book");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(703, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		TitledBorder titleStarter = new TitledBorder("Starter:");
		JTextArea textAreaStarter = new JTextArea();
		textAreaStarter.setBounds(131, 81, 138, 218);
		getContentPane().add(textAreaStarter);
		textAreaStarter.setBorder(titleStarter);
		
		
		
		TitledBorder titleDessert = new TitledBorder("Dessert:");
		JTextArea textAreaDessert = new JTextArea();
		textAreaDessert.setBounds(501, 81, 138, 218);
		getContentPane().add(textAreaDessert);
		textAreaDessert.setBorder(titleDessert);
		
		Vector<String> v = new Vector<String>(); 
		JList<String> recipe = new JList<>(v);
		textAreaDessert.append(recipeDessert.getName() + recipeDessert.getRecipe());
		Main.bstDessert.inorderTraversal();
		
		
		TitledBorder titleMain = new TitledBorder("Main Meal:");
		JTextArea textAreaMain = new JTextArea();
		textAreaMain.setBounds(321, 81, 138, 218);
		getContentPane().add(textAreaMain);
		textAreaMain.setBorder(titleMain);
		
		JButton btnChangeStarter = new JButton("Change it");
		btnChangeStarter.setBackground(new Color(255, 250, 205));
		btnChangeStarter.setBounds(141, 49, 115, 29);
		getContentPane().add(btnChangeStarter);
		
		JButton btnChangeDessert = new JButton("Change it");
		btnChangeDessert.setBackground(new Color(255, 250, 205));
		btnChangeDessert.setBounds(511, 49, 115, 29);
		getContentPane().add(btnChangeDessert);
		
		JButton btnChangeMain = new JButton("Change it");
		btnChangeMain.setBackground(new Color(255, 250, 205));
		btnChangeMain.setBounds(331, 49, 115, 29);
		getContentPane().add(btnChangeMain);
		
		JButton btnLikeStarter = new JButton("Like ");
		btnLikeStarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.likedList.insertAtFront(recipeStarter);
				try {
					FileWriter writer = new FileWriter("saveLiked.txt", true);
					writer.write(recipeStarter.getName() + "\r\n");
					writer.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Recipe is added to liked list!");
			}
		});
		btnLikeStarter.setBackground(new Color(240, 255, 240));
		btnLikeStarter.setBounds(141, 299, 115, 29);
		getContentPane().add(btnLikeStarter);
		
		JButton btnLikeMain = new JButton("Like ");
		btnLikeMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.likedList.insertAtFront(recipeMainMeal);
				try {
					FileWriter writer = new FileWriter("saveLiked.txt", true);
					writer.write(recipeMainMeal.getName() + "\r\n");
					writer.close();
				}
				catch(IOException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Recipe is added to liked list!");
				
			}
		});
		btnLikeMain.setBackground(new Color(240, 255, 240));
		btnLikeMain.setBounds(331, 299, 115, 29);
		getContentPane().add(btnLikeMain);
		
		JButton btnLikeDessert = new JButton("Like ");
		btnLikeDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.likedList.insertAtFront(recipeDessert);
				try {
					FileWriter writer = new FileWriter("saveLiked.txt", true);
					writer.write(recipeDessert.getName() + "\r\n");
					writer.close();
				}
				catch(IOException e2) {
					e2.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Recipe is added to liked list!");
			}
		});
		btnLikeDessert.setBackground(new Color(240, 255, 240));
		btnLikeDessert.setBounds(511, 299, 115, 29);
		getContentPane().add(btnLikeDessert);
		
		JLabel lblCreateTodaysMenu = new JLabel("Create Today's Menu!");
		lblCreateTodaysMenu.setFont(new Font("Consolas", Font.BOLD, 22));
		lblCreateTodaysMenu.setBounds(240, 16, 257, 20);
		getContentPane().add(lblCreateTodaysMenu);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage welcomeWindow = new WelcomePage();
				setVisible(false);
				welcomeWindow.setVisible(true);
			}
		});
		btnGoBack.setBounds(11, 16, 115, 51);
		getContentPane().add(btnGoBack);
		
		
		
		
		
	    
	    
	    
	}
}
