/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

/**
 *
 * @author Philip
 */
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JOptionPane;



public class NewLayout extends java.awt.Frame implements ActionListener{

    int size = 3, section, first = 0, econ = 5, replyFirst, replyEconomy, dialogButton;
    JLabel label1, labelInstructions, labelInstructions2, labelInstructions3, labelInstructions4;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    JButton submitButton;
    JTextField userClass, seatNumber, statusClass;
    boolean seats[];
    /**
     * Creates new form NewLayout
     */
    public NewLayout() {
        
        super ( "NHCC Airline Seat Reservation" );
        
        initComponents();
                
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setSize( 625, 405);
        
        label1 = new JLabel("Welcome to the seat reservation form", SwingConstants.CENTER);
        labelInstructions = new JLabel ( "Please enter 1 for first");
        labelInstructions2 = new JLabel ( "class or 2 for economy class");
        labelInstructions3 = new JLabel ( "Your seat number is");
        labelInstructions4 = new JLabel ( "Your class is");
        panel4 = new JPanel ();
        panel5 = new JPanel ();
        panel6 = new JPanel ();
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        userClass = new JTextField("", 15);
        userClass.setMaximumSize( userClass.getPreferredSize() );
        seatNumber = new JTextField("", 15);
        seatNumber.setMaximumSize( userClass.getPreferredSize() );
        statusClass = new JTextField("",15);
        statusClass.setMaximumSize( userClass.getPreferredSize() );
        
        Box vertical1 = Box.createVerticalBox();
        vertical1.add ( Box.createRigidArea ( new Dimension(12,4)));
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.add(Box.createRigidArea(new Dimension(0,35)));
        panel4.add( labelInstructions);
        panel4.add( labelInstructions2);
        panel4.add(Box.createRigidArea(new Dimension(0,15)));
        panel4.add( userClass);
        panel4.add(Box.createRigidArea(new Dimension(0,15)));
        panel4.add(submitButton);
        
        Box vertical2 = Box.createVerticalBox();
        vertical2.add( Box.createRigidArea(new Dimension (12,4)));
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
        panel5.add(Box.createRigidArea(new Dimension(0,35)));
        panel5.add(labelInstructions3);
        panel5.add(Box.createRigidArea(new Dimension(0,15)));
        panel5.add(seatNumber);
        panel5.add(Box.createRigidArea(new Dimension(0,15)));
        panel5.add(labelInstructions4);
        panel5.add(Box.createRigidArea(new Dimension(0,15)));
        panel5.add(statusClass);
              
        panel1 = new JPanel();
        panel1.setLayout (new BorderLayout ());
        panel1.add( label1, BorderLayout.NORTH);
        panel1.add (panel4, BorderLayout.WEST);
        panel1.add (panel5, BorderLayout.EAST);
        tabbedPane.addTab ("Reserve Seats", null, panel1, "First Panel");
        
        
        JLabel label2 = new JLabel( "panel two", SwingConstants.CENTER);
        panel2 = new JPanel();
        panel2.setBackground (Color.YELLOW);
        panel2.setLayout( new BorderLayout());
        panel2.add(label2);
        panel2.add( new JButton( "West"), BorderLayout.WEST);
        tabbedPane.addTab( "Seat Layout", null, panel2, "Second Panel");
        
        JLabel label3 = new JLabel( "This is where there would be about topics" );
        panel3 = new JPanel();
        panel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab( "About", null, panel3, "Third Panel");
        
        JLabel label4 = new JLabel("This is where there would be help topics");
        panel6.add(label4, BorderLayout.CENTER);
        tabbedPane.addTab( "Help", null, panel6, "Fourth Panel");
        
        
        
        add (tabbedPane);
    }
    //private void classSubmitButtonActionPerformed(java.awt.event.ActionEvent evt)
    //public void actionPerformed(ActionEvent evt)
    //private void submitButtonActionPerformed(java.awt.event.ActionEvent evt)
    public void actionPerformed(ActionEvent evt)
    {
        seats = new boolean [10];
        for ( int index = 0; index < seats.length; index++ )
            seats[ index ] = false;
      
        
        if (evt.getSource() == submitButton)
        {
            section = Integer.parseInt(userClass.getText());
        }
        if ( section == 1 )
        {
          if (first < 5) 
            {
                seats[first] = true;
                statusClass.setText("First Class");
                seatNumber.setText("Seat #" + ++first); 
            }
            else
            {   
                dialogButton = JOptionPane.YES_NO_OPTION;
                replyFirst = JOptionPane.showConfirmDialog(this, "First class is full. Would you like a seat in economy class?", "No seats available",dialogButton);
                    
                    if (replyFirst == JOptionPane.YES_OPTION)
                        {
                            seats[ econ ] = true;
                            statusClass.setText("Economy Class");
                            seatNumber.setText("Seat #" + ++econ);
                        }
                    if (replyFirst == JOptionPane.NO_OPTION)
                        {
                JOptionPane.showMessageDialog(null,"Next flight leaves in three hours");
                        }
                
                //classOutput.setText("First Class is full");     
            }
        }
        if ( section == 2 )
        {
            if ( econ < 10 ) 
            {
                seats[ econ ] = true;
                statusClass.setText("Economy Class");
                seatNumber.setText("Seat #" + ++econ);
            }
            else
            {    dialogButton = JOptionPane.YES_NO_OPTION;
                replyEconomy = JOptionPane.showConfirmDialog(this, "Economy class is full. Would you like a seat in first class?", "No seats available",dialogButton);
                    
                    if (replyEconomy == JOptionPane.YES_OPTION)
                        {
                            seats[ first ] = true;
                            statusClass.setText("First Class");
                            seatNumber.setText("Seat #" + ++first);
                        }
                    if (replyEconomy == JOptionPane.NO_OPTION)
                        {
                JOptionPane.showMessageDialog(null,"Next flight leaves in three hours");
                        }
            }
                //classOutput.setText("Economy is full");
        
            //else 
                //classOutput.setText("Invalid Class");
                
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(625, 405));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLayout().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
