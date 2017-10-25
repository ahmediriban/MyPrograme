import com.sun.deploy.panel.ExceptionListDialog;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Operation extends JFrame {
    JLabel num1,num2,operation,result;
    JTextField tnum1,tnum2,result1;
    JComboBox operation1;
    JButton sr;
    Container c;
    public Operation(){
        super("Operation");
        c=getContentPane();
        setLayout(null);
        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JavaLabel
        num1=new JLabel("Number1"); num1.setBounds(20,80,80,20); add(num1);
        num2=new JLabel("Number2"); num2.setBounds(20,120,80,20); add(num2);
        operation=new JLabel("Operation"); operation.setBounds(20,160,80,20); add(operation);
        result=new JLabel("Result"); result.setBounds(20,200,80,20); add(result);
        //JavaTextFiled
        tnum1=new JTextField(); tnum1.setBounds(120,80,80,20); add(tnum1);
        tnum2=new JTextField(); tnum2.setBounds(120,120,80,20); add(tnum2);
        result1=new JTextField(); result1.setBounds(120,200,80,20); add(result1);
        //JavaComboBox
        operation1=new JComboBox(new String[]{"+","-","/","*","%"}); operation1.setBounds(120,160,80,20);
        operation1.setSelectedIndex(0); add(operation1);
        //JavaButtons
        sr=new JButton("Show result"); sr.setBounds(80,240,120,20); add(sr);
        //UnderTheHood
        sr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int x =0; int y=0;
                try{
                    x=Integer.parseInt(tnum1.getText());
                    y=Integer.parseInt(tnum2.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Invalid Input!");
                }
                if(operation1.getSelectedIndex()==0)result1.setText(""+(x+y));
                if(operation1.getSelectedIndex()==1)result1.setText(""+(x-y));
                if(operation1.getSelectedIndex()==2)result1.setText(""+(x/y));
                if(operation1.getSelectedIndex()==3)result1.setText(""+(x*y));
                if(operation1.getSelectedIndex()==4)result1.setText(""+(x%y));
            }
        });
    }
    public static void main(String[] args){
        new Operation();
    }
}
