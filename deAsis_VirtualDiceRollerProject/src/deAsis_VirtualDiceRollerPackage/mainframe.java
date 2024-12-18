package deAsis_VirtualDiceRollerPackage;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class mainframe extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainframe frame = new mainframe();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public mainframe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 460, 508);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


// Main Title (Welcome Label)
        JLabel welcomeLabel = new JLabel("Welcome Game Master!");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        welcomeLabel.setBounds(0, 64, 444, 39);
        contentPane.add(welcomeLabel);

// Subtitle (ReadyGetsetRoll!) Label        
        JLabel lblReadyGetSet = new JLabel("Ready... Get set... Roll!");
        lblReadyGetSet.setHorizontalAlignment(SwingConstants.CENTER);
        lblReadyGetSet.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        lblReadyGetSet.setBounds(0, 98, 444, 17);
        contentPane.add(lblReadyGetSet);
        
// Instruction Label
        JLabel instructionLabel = new JLabel("Choose the number of dice you want to roll at a time.");
        instructionLabel.setFont(new Font("Tahoma", Font.ITALIC, 10));
        instructionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        instructionLabel.setBounds(85, 342, 286, 30);
        contentPane.add(instructionLabel);
//
//      
//
//
//        
// Dice Buttons
//ONE -------------------------------------------------------------------------------------------         
        JButton one_diceButton = new JButton("1");
        one_diceButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
                one_dice oneDiceFrame = new one_dice();
                oneDiceFrame.setVisible(true);
        	}
        });
        one_diceButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        one_diceButton.setBounds(85, 126, 128, 51);
        contentPane.add(one_diceButton);
//
//      
//
//
//
//TWO ------------------------------------------------------------------------------------------- 
        JButton two_dicesButton = new JButton("2");
        two_dicesButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
                two_dices twoDicesFrame = new two_dices();
                twoDicesFrame.setVisible(true);
        	}
        });
        two_dicesButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        two_dicesButton.setBounds(243, 126, 128, 51);
        contentPane.add(two_dicesButton);
//
//      
//
//
//
//THREE ------------------------------------------------------------------------------------------ 
        JButton three_dicesButton = new JButton("3");
        three_dicesButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
                three_dices threeDicesFrame = new three_dices();
                threeDicesFrame.setVisible(true);
        	}
        });
        three_dicesButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        three_dicesButton.setBounds(85, 202, 128, 51);
        contentPane.add(three_dicesButton);
//
//      
//
//
//
//FOUR ------------------------------------------------------------------------------------------
        JButton four_dicesButton = new JButton("4");
        four_dicesButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
                four_dices fourDicesFrame = new four_dices();
                fourDicesFrame.setVisible(true);
        	}
        });
        four_dicesButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        four_dicesButton.setBounds(243, 202, 128, 51);
        contentPane.add(four_dicesButton);
//
//       
//
//
//
//FIVE -------------------------------------------------------------------------------------------           
        JButton five_dicesButton = new JButton("5");
        five_dicesButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
	            	dispose();
	                five_dices fiveDicesFrame = new five_dices();
	                fiveDicesFrame.setVisible(true);
        	}
        });
        five_dicesButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        five_dicesButton.setBounds(85, 277, 128, 51);
        contentPane.add(five_dicesButton);
//
//      
//
//
//
//SIX ---------------------------------------------------------------------------------------------
        JButton six_dicesButton = new JButton("6");
        six_dicesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                six_dices sixDicesFrame = new six_dices();
                sixDicesFrame.setVisible(true);
            }
        });
        six_dicesButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        six_dicesButton.setBounds(243, 277, 128, 51);
        contentPane.add(six_dicesButton);   
//
//      
//
//
//
//Background ---------------------------------------------------------------------------------------
        JLabel backgroundLabel = new JLabel("");
        backgroundLabel.setIcon(new ImageIcon("bg.png"));
        backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundLabel.setBounds(0, 0, 444, 469);
        contentPane.add(backgroundLabel);
            }

    }