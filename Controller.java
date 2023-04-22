package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;

public class Controller extends JFrame {

	private JPanel mainPane;
	private JTextField userSubmissionField;
	int currentScene = 1;
	int currentSubScene = 1;
	boolean intro = true;
	String userSelection = "";
	private JTextPane storyArea;
	private JTextPane pictureArea;
	String userName = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller frame = new Controller();
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
	public Controller() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 431);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(new Dimension(1000, 1250));

		// Main pane for displaying content
		setContentPane(mainPane);
		mainPane.setLayout(new BorderLayout(0, 0));

		// Bottom bar that will contain submit button and user input field
		JSplitPane userInput = new JSplitPane();
		mainPane.add(userInput, BorderLayout.SOUTH);

		// Builds the field where the user enters text
		userSubmissionField = new JTextField();
		userInput.setRightComponent(userSubmissionField);
		userSubmissionField.setColumns(10);

		// Builds the bar where the Inventory will be displayed
		JToolBar inventoryBar = new JToolBar();
		mainPane.add(inventoryBar, BorderLayout.NORTH);

		// Label to show where the inventory is located
		JLabel lblNewLabel = new JLabel("Inventory");
		inventoryBar.add(lblNewLabel);

		// Container to hold picture and story
		JPanel PictureStoryContainer = new JPanel();
		mainPane.add(PictureStoryContainer, BorderLayout.CENTER);
		PictureStoryContainer.setLayout(new BorderLayout(0, 0));

		// Builds the area that the story text is displayed
		storyArea = new JTextPane();
		storyArea.setForeground(Color.GREEN);
		storyArea.setBackground(Color.BLACK);
		PictureStoryContainer.add(storyArea, BorderLayout.SOUTH);
		storyArea.setText("Hello! Please enter your name!");

		// Builds the area that the pictures are displayed
		pictureArea = new JTextPane();
		pictureArea.setForeground(Color.GREEN);
		pictureArea.setBackground(Color.BLACK);
		PictureStoryContainer.add(pictureArea, BorderLayout.CENTER);
		pictureArea.setFont(new Font("Monospaced", Font.PLAIN, 5));
		pictureArea.setText(Pictures.displayScene(1));
		pictureArea.setEditable(false);

		// Builds the button that progresses the user through the game
		JButton btnSubmitUserText = new JButton("Submit");
		btnSubmitUserText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userSelection = userSubmissionField.getText();

				if (intro) {
					if (userSelection.length() == 0) {
						storyArea.setText("Invalid entry!");
					} else {
						userName = userSelection;
						userSubmissionField.setText("");
						intro = false;
						storyArea.setText(Story.missionText(userName, 1, 1, userSelection));
						userSubmissionField.setText("Type \"continue\" to proceed");
					}
					System.out.println(1);
				} else if (currentScene == 1 && userSelection.toLowerCase().equals("continue")) {
					currentScene = 2;
					userSubmissionField.setText("");
					pictureArea.setText(Pictures.displayScene(currentScene));
					storyArea.setText(Story.missionText(userName, currentScene, currentSubScene, userSelection));
				} else if (currentSubScene == 2 && userSelection.toLowerCase().equals("continue")) {
					nextScene();
					userSubmissionField.setText("");
					pictureArea.setText(Pictures.displayScene(currentScene));
					storyArea.setText(Story.missionText(userName, currentScene, currentSubScene, userSelection));
				} else if (currentSubScene == 1 && userSelection.toLowerCase().equals("y")) {
					nextScene();
					userSubmissionField.setText("");
					pictureArea.setText(Pictures.displayScene(currentScene));
					storyArea.setText(Story.missionText(userName, currentScene, currentSubScene, userSelection));
					if(storyArea.getText().contains("SUCCESS")) {
						
					}
				}

				else {
					storyArea.setText(storyArea.getText() + "\nInvalid entry!");
				}

			}
		});
		userInput.setLeftComponent(btnSubmitUserText);

	}

	// Determines what the next scene in the game is
	public void nextScene() {
		if (currentSubScene == 2) {
			currentScene++;
			currentSubScene = 1;
		} else if (currentScene == 1) {
			currentScene = 2;
		} else {
			currentSubScene++;
		}
	}
}
