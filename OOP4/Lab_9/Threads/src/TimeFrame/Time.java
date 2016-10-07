/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TimeFrame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import TimeFrame.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author t00166011
 */
public class Time implements Runnable {
    private boolean timeBool = true;
    private JLabel label;
    
    public Time(JLabel p) {
		label = p;
	}

    public String getDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
           String myDate;
           myDate = dateFormat.format(date);
           label.setText(myDate);
	   //System.out.println(dateFormat.format(date));
            return myDate;
    }
    
    public void run() {
        
        while(true)
        {
          getDate();
        }
       
    }
    
}
