package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import map.CookieMap;

public class Room extends JFrame {

   private JPanel contentPane;
   private String username;
   /**
    * Create the frame.
    */
   public Room(String username) {
	   this.username=username;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 1300, 900);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(null);
      setContentPane(contentPane);
      contentPane.setBackground(new Color(30, 108, 200));
      setVisible(true);

      JPanel panel_4 = new JPanel();
      panel_4.setBounds(119, 96, 600, 400);
      panel_4.setPreferredSize(new Dimension(600, 400));
      getContentPane().add(panel_4);
      panel_4.setLayout(new GridLayout(2, 4, 10, 10));
      Ready[] ready = new Ready[8];
      for (int i = 0; i < ready.length; i++) {
         ready[i] = new Ready("images/ready.png", "아이디", "상태");
         panel_4.add(ready[i]);
      }

      ImageIcon start = new ImageIcon("Images/start.png");
      JButton btnNewButton = new JButton(start);
      btnNewButton.setOpaque(false);
      btnNewButton.setContentAreaFilled(false);
      btnNewButton.setPreferredSize(new Dimension(300, 50));
      btnNewButton.setBounds(926, 686, 190, 60);
      getContentPane().add(btnNewButton);

      btnNewButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new CookieMap(username);
            dispose();
         }
      });

      String map = "images/map.png";
      ImageIcon mapimg = new ImageIcon(map);
      JLabel lblNewLabel = new JLabel(mapimg);
      lblNewLabel.setPreferredSize(new Dimension(450, 200));
      lblNewLabel.setBounds(795, 442, 450, 200);
      getContentPane().add(lblNewLabel);

//      String ch = "Images/char.png";
//      ImageIcon chimg = new ImageIcon(ch);
//      JLabel lblNewLabel_1 = new JLabel(chimg);
//      lblNewLabel_1.setBounds(821, 84, 400, 400);
//      getContentPane().add(lblNewLabel_1);

      JButton btnNewButton_1 = new JButton(new ImageIcon("images/ch1button.png"));
      btnNewButton_1.setBounds(880, 145, 280, 90);
      contentPane.add(btnNewButton_1);
      btnNewButton_1.setOpaque(false);

      JButton btnNewButton_2 = new JButton(new ImageIcon("images/ch2button.png"));
      btnNewButton_2.setBounds(880, 235, 280, 90);
      contentPane.add(btnNewButton_2);
      btnNewButton_2.setOpaque(false);

      JButton btnNewButton_3 = new JButton(new ImageIcon("images/ch3button.png"));
      btnNewButton_3.setBounds(880, 325, 280, 90);
      contentPane.add(btnNewButton_3);
      btnNewButton_3.setOpaque(false);

   }



}