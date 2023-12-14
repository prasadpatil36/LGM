import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//public class currency_Converter extends JFrame implements ActionListener{
	@SuppressWarnings("serial")
	public class currency_Converter extends JFrame implements ActionListener{
	@SuppressWarnings("unchecked")
	JLabel j1,j2,j3;
	@SuppressWarnings("rawtypes")
	JComboBox jc , jc1;
	JTextField jt1,jt2;
	JButton b1,b2,b3;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	 currency_Converter(){
		try {
			
		     setLayout(null);
			setSize(700,400);
		    setLocation(300,70);
			Font font = new Font("Arial", Font.PLAIN, 16);
			 
	        j1= new JLabel("Select country");
	        j1.setBounds(50,80,140,20);
	        j1.setFont(font);
	       add(j1);
	        
	        String[] country= {"US","Japan","India","UK"};
		    jc= new JComboBox(country);
	        jc.setBackground(Color.WHITE);
	        jc.setBounds(50,110,130,20);
	        jc.setSelectedItem("US");
	       add(jc);
	        
	        j2= new JLabel("Select country");
	        j2.setBounds(300,80,140,20);
	        j2.setFont(font);
	        add(j2);
	        
	        
	        
	      //  String[] country= {"US","Japan","India","UK","Germany","Australia","Brazil"};
	      
			jc1= new JComboBox(country);
	        jc1.setBackground(Color.WHITE);
	        jc1.setBounds(300,110,130,20);
	        jc1.setSelectedItem("US");
	        add(jc1);
	        
	 //TextField      
	        
	         j3= new JLabel("Enter Amount");
	        j3.setBounds(70,170,140,30);
	        j3.setFont(font);
	        add(j3);
	        
	        jt1= new JTextField();
	        jt1.setBounds(100,200,110,30);
	        jt1.setBackground(Color.WHITE);
	        add(jt1);
	        
	        jt2= new JTextField();
	        jt2.setBounds(300,200,70,30);
	        jt2.setBackground(Color.WHITE);
	        add(jt2);
    // buttons       
	         b1= new JButton("Convert");
	        b1.setBounds(100,300,100,30);
	        b1.setBackground(Color.LIGHT_GRAY);
	        b1.addActionListener(this);
	        add(b1);
	        
	         b2= new JButton("CLEAR");
	        b2.setBounds(260,300,100,30);
	        b2.setBackground(Color.LIGHT_GRAY);
	        b2.addActionListener(this);
	        add(b2);
	        
	         b3= new JButton("CLOSE");
	        b3.setBounds(400,300,100,30);
	        b3.setBackground(Color.LIGHT_GRAY);
	        b3.addActionListener(this);
	        add(b3);
	        
			setVisible(true);
			}catch(Exception e) {
				System.out.println(e);
			}
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
	  String country1= (String) jc.getSelectedItem();
	  String country2= (String) jc1.getSelectedItem();
	  String a= (String) jt1.getText();
	  int amount= Integer.parseInt(a);
	  
	  if(ae.getSource()==b1) {
		  
		  	
		  switch(country1) {
			case "US":{
				if(country2=="Japan") {
					
					double amount1=  (amount *142.20);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="India") {
					double amount1=  (amount *82.81);
					String b=Double.toString(amount1);
					 jt2.setText(b);
				
				}
				if(country2=="UK") {
					double amt=  (amount *0.79);
					String b=Double.toString(amt);
					jt2.setText(b);
				}
				String b= Double.toString(amount);
				jt2.setText(b);
			}
			case "Japan":{
				if(country2=="US") {
					double amount1=  (amount *0.0070);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="India") {
					double amount1=  (amount *0.58);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="UK") {
					double amount1=  (amount *0.0055);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				else {
					String b= Double.toString(amount);
					jt2.setText(b);
				}
			}
			case "India":{
				if(country2=="Japan") {
					double amount1=  (amount *1.72);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="US") {
					double amount1=  (amount *0.012);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="UK") {
					double amount1=  (amount *0.0095);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				else {
					String b= Double.toString(amount);
					jt2.setText(b);
				}
			}
			case "UK":{
				if(country2=="Japan") {
					double amount1=  (amount *181.29);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="India") {
					double amount1=  (amount *105.24);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				if(country2=="US") {
					double amount1=  (amount *1.27);
					 String b= Double.toString(amount1);
					jt2.setText(b);
				}
				String b= Double.toString(amount);
				jt2.setText(b);
			}
			}
		  
		  
	  }
	  
	  
	  if(ae.getSource()==b2) {
		  jt1.setText("");
		  jt2.setText("");
	  }
	  if(ae.getSource() == b3) {
		  setVisible(false);
	  }
	}

	
	public static void main(String[] args) {
		new currency_Converter();
	}
}
