package BallBounceWithThreads;

import BallBounceWithThreads.Ball;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class BounceFrame extends JFrame {

    private JPanel canvas;
    private JButton startButton;
    private JButton closeButton;
     private JButton stopButton;
    
    public BounceFrame() {
        setSize(300, 200);
        setTitle("Bounce");
        canvas = new JPanel();
        add(canvas, "Center");

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        closeButton = new JButton("Close");
        stopButton = new JButton("Stop");

        buttonPanel.add(startButton);
        buttonPanel.add(closeButton);
        buttonPanel.add(stopButton);

        ButtonHandler handler = new ButtonHandler();

        startButton.addActionListener(handler);
        closeButton.addActionListener(handler);
        stopButton.addActionListener(handler);

        add(buttonPanel, "South");
    }

    private class ButtonHandler implements ActionListener {

        /* It is neccessery to use a thread here because 
           we have the run() in 
        */
        public void actionPerformed(ActionEvent event) {
            
            ArrayList<Ball> thread = new ArrayList();
             Runnable r1;
            if (event.getSource() == startButton) {
                 r1 = new Ball(canvas);
                Thread t1 = new Thread(r1);
                t1.start();
                
            } else if (event.getSource() == closeButton) {
                System.exit(0);
            }
            else if(event.getSource() == stopButton)
            {
              
                
         
            }
        }
    }
}
