package train_string;

import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
import java.io.*;
import java.util.*;
public class String_practise extends JApplet implements ActionListener{
    JTextField t1,t2;
    JButton b1,b2;
    JComboBox c1,c2;
    String[] currency={"US Dollar","Indian Rupee","Saudia"};
    public void init(){
        try{SwingUtilities.invokeAndWait(new Runnable(){
            public void run(){
                makeGUI();
             }
         });
      }catch(Exception exc){System.out.println("Error found"+exc);}
   }
private void makeGUI(){
    GridBagLayout gbag=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    setLayout(gbag);
    
    c1=new JComboBox(currency);
    c1.setSelectedIndex(0);
    c2=new JComboBox(currency);
    c2.setSelectedIndex(1);
    t1=new JTextField(10);
    t2=new JTextField(10);
    b1=new JButton("Convert");
    b1.setMargin(new Insets(20,20,20,20));
    b1.setBackground(new Color(79,195,121));
    b1.setForeground(Color.WHITE);
    b1.setBorder(null);
    b1.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
   
    b1.setBorder(null);
    b2=new JButton("Clear");
    
    JLabel l1=new JLabel("Select the Input Currency:");
    l1.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
    JLabel l2=new JLabel("Enter the amount:  ");
    l2.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
    JLabel l3=new JLabel("Select hte Output Currency:");
    l3.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
    JLabel l4=new JLabel("Converted amount:  ");
    l4.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
     
    gbc.weighty=1.0;
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbc.anchor=GridBagConstraints.NORTH;
   
     
    gbc.anchor=GridBagConstraints.EAST;
     
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l1, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(c1, gbc);
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l2, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(t1, gbc);
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l3, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(c2, gbc);
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l4, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(t2, gbc);
    gbc.anchor=GridBagConstraints.CENTER;
    gbag.setConstraints(b1, gbc);
    gbc.gridwidth=GridBagConstraints.CENTER;
    gbag.setConstraints(b2, gbc);
     
    add(l1);add(c1);add(l2);add(t1);add(l3);add(c2);add(b1);add(l4);add(t2);add(b2);
     
    t1.addActionListener(this);
    t2.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    c1.addActionListener(this);
    c2.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae){
    double a,b,c=0;
    a=Double.valueOf(t1.getText());
    try{
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==1){
            c= a*60.335456;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==2){
            c= a*0.595194;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==3){
            c= a*0.723333;}
        
        t2.setText(String.valueOf(c));
        }catch(Exception x){System.out.println("Error");}
    if(ae.getSource()==b2){
        t1.setText("0000");
        t2.setText("0000");}    
   }
}