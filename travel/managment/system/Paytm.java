package travel.managment.system;

import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{

    Paytm() {
        setBounds(500, 200, 800, 600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try {
            pane.setPage("https://paytm.com/");
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html><body><h2>Could not load Paytm website.</h2>"
                        + "<p>Error: " + e.getMessage() + "</p>"
                        + "<p>Please try using a more modern browser.</p></body></html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);
                
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args) {
        new Paytm();
    }
}
