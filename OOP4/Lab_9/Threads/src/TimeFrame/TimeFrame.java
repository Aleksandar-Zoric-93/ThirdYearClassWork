/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TimeFrame;

import BallBounceWithThreads.Ball;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author t00166011
 */
public class TimeFrame extends JFrame {
     private JPanel canvas;
     private JButton startButton;
     public JLabel timeLabel;
     
      public TimeFrame() {
     setSize(300, 100);
        setTitle("Time");
        canvas = new JPanel();
        add(canvas, "Center");

        JPanel buttonPanel = new JPanel();
        
        startButton = new JButton("Start");
        timeLabel = new JLabel();
        
         buttonPanel.add(startButton);
         canvas.add(timeLabel);
          ButtonHandler handler = new ButtonHandler();
          startButton.addActionListener(handler);
          
          add(buttonPanel, "South");
         
      }
      
      
       private class ButtonHandler implements ActionListener {
           
            public void actionPerformed(ActionEvent event) {
            if (event.getSource() == startButton) {
                Runnable r1 = new Time(timeLabel);
                Thread t1 = new Thread(r1);
                t1.start();
                String getMyDate;
                Time time = new Time(timeLabel);
                getMyDate = time.getDate();
                
                //timeLabel.setText(getMyDate);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
                
                
            
        }
       }
       }
}
    

