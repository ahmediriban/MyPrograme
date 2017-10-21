/**
 * @(#)TrailGUI.java
 *
 *
 * @author 
 * @version 1.00 2017/10/20
 */
import java.awt.event.*;
import javax.swing.*;
public class TrailGUI extends JFrame{
    public TrailGUI() {
    	super("Calcualtor");
    	JLabel l1 =new JLabel("LOG IN");
    	JLabel l2 =new JLabel("Username: ");
    	JLabel l3 =new JLabel("Password: ");
    	JTextField r1 = new JTextField();
    	JPasswordField r2 = new JPasswordField();
    	JButton l =new JButton(new ImageIcon("E:\\r.png"));
    	l1.setBounds(120,10,80,80);
    	l2.setBounds(30,50,80,80);
    	l3.setBounds(30,87,80,80);
    	r1.setBounds(100,83,130,20);
    	r2.setBounds(100,117,130,20);
    	l.setBounds(90,165,130,20);
    	setSize(320,250);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLayout(null);
    	l.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent e){
    			String name =r1.getText();
    			String pass =r2.getText();
    			if(name.equals("Ahmed")&&pass.equals("123")){
    				JOptionPane.showMessageDialog(null,"Welcome "+name);
    				System.exit(1);
    			}
    			else if(name.equals("")||pass.equals("")){
    				JOptionPane.showMessageDialog(null,"Make sure that you are complete the blank label");
    			}
    			else{
    				JOptionPane.showMessageDialog(null,"Invalid username or password \nPlease try agin!");
    			}
    		}
    	});
    	add(l1);add(l2);add(l3);add(r1);add(r2);add(l);
    }
    public static void main (String[] args) {
    	new TrailGUI();
    }
}