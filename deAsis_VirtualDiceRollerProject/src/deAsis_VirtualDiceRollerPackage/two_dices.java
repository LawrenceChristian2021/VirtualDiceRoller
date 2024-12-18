package deAsis_VirtualDiceRollerPackage;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class two_dices extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea scoreHistoryArea; //history
    private JLabel totalScoreLabel;     //total score
    private JLabel highestScoreLabel;   //highest score
    private int highestScore = 0;       //base highest score

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    two_dices frame = new two_dices();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
//
//
//
//
//
//Dice Labels-------------------------------------------------------------------
    public two_dices() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 460, 516);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel dice1Label = new JLabel("");
        dice1Label.setBounds(36, 137, 100, 100);
        contentPane.add(dice1Label);

        JLabel dice2Label = new JLabel("");
        dice2Label.setBounds(148, 137, 100, 100);
        contentPane.add(dice2Label);
//
//
//
//
//   
//Total Score Label ---------------------------------------------------------------
        totalScoreLabel = new JLabel("Total Score: 0");
        totalScoreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        totalScoreLabel.setBounds(36, 360, 200, 30);
        contentPane.add(totalScoreLabel);

//Highest Score Label -------------------------------------------------------------
        highestScoreLabel = new JLabel("Highest Score: 0");
        highestScoreLabel.setForeground(new Color(255, 0, 255));
        highestScoreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        highestScoreLabel.setBounds(36, 381, 200, 30);
        contentPane.add(highestScoreLabel);

//Score History Pane --------------------------------------------------------------
        scoreHistoryArea = new JTextArea();
        scoreHistoryArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(scoreHistoryArea);
        scrollPane.setBounds(270, 27, 150, 380);
        contentPane.add(scrollPane);

//Back Button ---------------------------------------------------------------------
        JButton BackButton = new JButton("Back");
        BackButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        BackButton.setForeground(new Color(255, 0, 0));
        BackButton.setBounds(36, 427, 100, 23);
        contentPane.add(BackButton);

        BackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // closes or dispose the current (six_dices) class/frame.    
                mainframe mainFrame = new mainframe(); // make, calls, displays class 'mainframe'
                mainFrame.setVisible(true);
            }
        });
//
//
//
//
//
//Clear Button ---------------------------------------------------------------------        
        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        clearButton.setForeground(new Color(0, 0, 160));
        clearButton.setBounds(307, 427, 100, 23);
        contentPane.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreHistoryArea.setText("");  // clears the score history
                totalScoreLabel.setText("Total Score: 0"); // reset the total 'score label' to 0
                highestScoreLabel.setText("Highest Score: 0"); // resets the 'highest score label' to 0
                highestScore = 0; // resets the highest score
            }
        });

//Roll Button ---------------------------------------------------------------------    
        JButton rollButton = new JButton("Roll");
        rollButton.setForeground(new Color(0, 128, 0));
        rollButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        rollButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int dice1Face = new Random().nextInt(6)+1;  // roll dice and randomly generate faces
                int dice2Face = new Random().nextInt(6)+1;
               
                dice1Label.setIcon(new ImageIcon(dice1Face + ".png")); // set the icons for dice images/faces
                dice2Label.setIcon(new ImageIcon(dice2Face + ".png"));

                int totalScore = dice1Face + dice2Face; // Calculate total score

                totalScoreLabel.setText("Total Score: " + totalScore); // updates the total score label

                if (totalScore > highestScore) { // checks if the total score is higher than the highest score
                    highestScore = totalScore;  // update highest score, if the total score is higher than the current highest score
                    highestScoreLabel.setText("Highest Score: " + highestScore);  // updates the 'highest score label'
                }
              
                scoreHistoryArea.append("Score: " + totalScore + "\n"); // append/tallies the score to the score history
            }
        });
        rollButton.setBounds(172, 427, 100, 23);
        contentPane.add(rollButton);
        
        JLabel BackgroundLabel = new JLabel("");
        BackgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        BackgroundLabel.setIcon(new ImageIcon("bg.png"));
        BackgroundLabel.setBounds(0, 0, 444, 477);
        contentPane.add(BackgroundLabel);
    }
}
