/**
 * @(#)PersonalInformationForm.java
 *
 *
 * @author 
 * @version 1.00 2017/10/21
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PersonalInformationForm extends JFrame {
	//Compenants
	JButton b;
	JLabel name,age,gender,ms,hobbies,country;
	JTextField name1;
	JSpinner age1;
	JCheckBox football,swimming,running;
	JRadioButton male,female,married,single;
	JTextArea result;
	JComboBox country1;
	Container c;
    public PersonalInformationForm() {
    	//Design
    	/*******Frame*******/
    	c=getContentPane();
    	c.setLayout(null);
    	setVisible(true);
    	setSize(500,650);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	/*******LabelsArea*******/
    	name=new JLabel("Name: ");
    	age=new JLabel("Age: ");
    	gender=new JLabel("Gender: ");
    	ms=new JLabel("Marital status: ");
    	hobbies=new JLabel("Hobbies: ");
    	country=new JLabel("Country: ");
    	/*******LabelsArea_SetBounds*******/
    	name.setBounds(20,20,100,30);
    	age.setBounds(20,60,100,30);
    	gender.setBounds(20,100,100,30);
    	ms.setBounds(20,140,100,30);
    	hobbies.setBounds(20,180,100,30);
    	country.setBounds(20,220,100,30);
    	/*******LabelsArea_Add*******/
    	add(name);add(age);add(gender);add(ms);add(hobbies);add(country);
    	/*******TextArea*******/
    	result=new JTextArea();
    	result.setBounds(20,300,380,200);
    	add(result);
    	/*******Name_TextField*******/
    	name1=new JTextField();
    	name1.setBounds(130,20,100,30);
    	add(name1);
    	/*******Age_Spinner*******/
    	SpinnerModel value=new SpinnerNumberModel(19,15,30,1);
    	age1=new JSpinner(value);
    	age1.setBounds(130,60,100,30);
    	add(age1);
    	/*******Gender_RadioButton*******/
    	male=new JRadioButton("Male");
    	female=new JRadioButton("Female");
    	male.setBounds(130,100,100,30);
    	female.setBounds(230,100,100,30);
    	male.setSelected(true);
    	ButtonGroup bg=new ButtonGroup();   
    	bg.add(male);
    	bg.add(female);
    	/*******MaritalStatus_RadioButton*******/
    	married=new JRadioButton("Married");
    	single=new JRadioButton("Single");
    	married.setBounds(130,100,140,30);
    	single.setBounds(230,140,100,30);
    	single.setSelected(true);
    	ButtonGroup bg1=new ButtonGroup();   
    	bg1.add(married);
    	bg1.add(single);
    	/*******Hobbies_CheckBox*******/
    	football=new JCheckBox("Football");
    	swimming=new JCheckBox("Swimming");
    	running=new JCheckBox("Running");
    	football.setBounds(130,180,100,30);
    	swimming.setBounds(230,180,100,30);
    	running.setBounds(330,180,100,30);
    	add(football);
    	add(swimming);
    	add(running);
    	/*******Country_ComboBox*******/
    	country1=new JComboBox<String>(new String[]{"Palestine","Egypt","Israil","Jordan","UAE","Syria"});
    	country1.setBounds(130,220,100,30);
    	add(country1);
    	/*******Button*******/
    	b=new JButton(new ImageIcon("E:\\r.png"));
    	b.setBounds(20,260,100,30);
    	add(b);
    	//UnderTheHood
    	b.addActionListener(new ActionListener(){
    		//@override
    		public void actionPerformed(ActionEvent e){
    			String info="Your Info: ";
    			info+="\n Name: "+name1.getText();
    			info+="\n Age: "+age1.getValue().toString();
    			if(male.isSelected()){info+="\n Gender: "+"male";}else{info+="\n Gender: "+"female";}
    			if(single.isSelected()){info+="\n Martial status: "+"single";}else{info+="\n Martial status: "+"married";};
    			info+="\n Hobbies: ";
    			if(football.isSelected())info+="football ";
    			if(swimming.isSelected())info+="swimming ";
    			if(running.isSelected())info+="running ";
    			info+="\n Country: "+country1.getSelectedItem().toString();
    			result.setText(info);
    		}
    	});
    }
    public static void main (String[] args) {
    	new PersonalInformationForm();
    }
}