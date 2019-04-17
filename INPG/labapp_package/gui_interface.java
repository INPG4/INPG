package labapp_package;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class gui_interface extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton Calc_Button;
	private JTextArea Data_First;
	private JTextArea Data_Second;
	private JTextArea Data_Third;
	private JTextField Const_First_Field;
	private JTextField Const_Second_Field;
	private JTextField Const_Third_Field;
	private JTextField Const_Fourth_Field;
	private JTextField Velocity_Exercise13;
	private JTextField Reynolds_Exercise13;
	private JTextField d_Exercise51;
	private JTextField U_d_Exercise51;
	private JTextArea Results_Series;
	private JTextField Results_Average;
	private JTextArea Ex41_Angle_Series;
	private JLabel Ex_41_Label;
	private JTextField Ex41_Average;
	private JComboBox<String> Exercises;
	
	public gui_interface() {
		super(global.Super);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(900, 350);
		setLocationRelativeTo(null); 
		setResizable(true);
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		setLayout(gridbag);
		//ImageIcon iconImage = new ImageIcon(this.getClass().getResource("woch.png"));
        //this.setIconImage(iconImage.getImage());
		
		//JLabel describing the list
		JLabel Desc_Label = new JLabel(global.Desc_Label);
		constraints.gridheight=2;
		constraints.gridx = 0;
		constraints.gridy = 0;
		gridbag.setConstraints(Desc_Label, constraints);
		this.add(Desc_Label);
		
		//Text field describing the first data series
		JTextField First_Data_Field = new JTextField(global.Data_Field[0]);
		First_Data_Field.setEditable(false);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 2;
		gridbag.setConstraints(First_Data_Field, constraints);
		this.add(First_Data_Field);
		
		//Text area for the first data series
		Data_First = new JTextArea(20,8);
		Data_First.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridheight = 4;
		gridbag.setConstraints(Data_First, constraints);
		Data_First.setEditable(false);
		Data_First.setLineWrap(true);
		this.add(Data_First);
		
		//Text field describing the second data series
		JTextField Second_Data_Field = new JTextField(global.Data_Field[0]);
		Second_Data_Field.setEditable(false);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 2;
		gridbag.setConstraints(Second_Data_Field, constraints);
		this.add(Second_Data_Field);
		
		//Text area for the second data series
		Data_Second = new JTextArea(20,8);
		Data_Second.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridheight = 4;
		gridbag.setConstraints(Data_Second, constraints);
		Data_Second.setEditable(false);
		Data_Second.setLineWrap(true);
		this.add(Data_Second);
		
		//Text field describing the third data series
		JTextField Third_Data_Field = new JTextField(global.Data_Field[0]);
		Third_Data_Field.setEditable(false);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 2;
		gridbag.setConstraints(Third_Data_Field, constraints);
		this.add(Third_Data_Field);
		
		//Text area for the third data series
		Data_Third = new JTextArea(20,8);
		Data_Third.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 2;
		constraints.gridy = 4;
		constraints.gridheight = 4;
		gridbag.setConstraints(Data_Third, constraints);
		Data_Third.setEditable(false);
		Data_Third.setLineWrap(true);
		this.add(Data_Third);
		
		//JLabel for constants description
		JLabel Const_Label = new JLabel(global.Const_Label);
		constraints.gridx = 3;
		constraints.gridy = 2;
		gridbag.setConstraints(Const_Label, constraints);
		this.add(Const_Label);
		
		//JPanel for constants
		JPanel constants = new JPanel();
		constants.setLayout(new GridLayout(12,1));
		constants.setSize(20, 8);
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridx = 3;
		constraints.gridy = 4;
		gridbag.setConstraints(constants, constraints);
		
		//Text field for the first constant name
		JTextField Const_Name_First_Field = new JTextField(global.Const_Name[0]);
		Const_Name_First_Field.setEditable(false);
		constants.add(Const_Name_First_Field);
		
		//Text field for the first constant
		Const_First_Field = new JTextField(10);
		Const_First_Field.setEditable(false);
		constants.add(Const_First_Field);
		
		//Text field for the second constant name
		JTextField Const_Name_Second_Field = new JTextField(global.Const_Name[0]);
		Const_Name_Second_Field.setEditable(false);
		constants.add(Const_Name_Second_Field);
				
		//Text field for the second constant
		Const_Second_Field = new JTextField(10);
		Const_Second_Field.setEditable(false);
		constants.add(Const_Second_Field);
		
		//Text field for the third constant name
		JTextField Const_Name_Third_Field = new JTextField(global.Const_Name[0]);
		Const_Name_Third_Field.setEditable(false);
		constants.add(Const_Name_Third_Field);
				
		//Text field for the third constant
		Const_Third_Field = new JTextField(10);
		Const_Third_Field.setEditable(false);
		constants.add(Const_Third_Field);
		
		//Text field for the fourth constant name
		JTextField Const_Name_Fourth_Field = new JTextField(global.Const_Name[0]);
		Const_Name_Fourth_Field.setEditable(false);
		constants.add(Const_Name_Fourth_Field);
				
		//Text field for the fourth constant
		Const_Fourth_Field = new JTextField(10);
		Const_Fourth_Field.setEditable(false);
		constants.add(Const_Fourth_Field);
		
		this.add(constants);
		
		//Calculate button
		Calc_Button = new JButton(global.Calc_Button);
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridheight = 2;
		constraints.gridx = 2;
		constraints.gridy = 0;
		Calc_Button.addActionListener(this);
		gridbag.setConstraints(Calc_Button, constraints);
		this.add(Calc_Button);
		
		//JLabel for results description
		JLabel Res_Label = new JLabel(global.Res_Label);
		constraints.gridx = 4;
		constraints.gridy = 2;
		gridbag.setConstraints(Res_Label, constraints);
		this.add(Res_Label);
		
		//text area for result series
		Results_Series = new JTextArea(17,14);
		Results_Series.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 4;
		constraints.gridy = 4;
		constraints.gridheight = 4;
		gridbag.setConstraints(Results_Series, constraints);
		Results_Series.setEditable(false);
		Results_Series.setLineWrap(true);
		this.add(Results_Series);
		
		//Text field for the average
		Results_Average = new JTextField(14);
		Results_Average.setEditable(false);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 4;
		constraints.gridy = 8;
		gridbag.setConstraints(Results_Average, constraints);
		this.add(Results_Average);
		
		//JPanel for exercise 13 bonus parts
		JPanel exercise13 = new JPanel();
		exercise13.setLayout(new GridLayout(12,1));
		exercise13.setSize(20, 8);
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridx = 5;
		constraints.gridy = 4;
		gridbag.setConstraints(exercise13, constraints);
		
		//Text field for the velocity name (Exercise 13)
		JTextField Velocity_Exercise13_Name = new JTextField("Szybkoœæ pomiar 0");
		Velocity_Exercise13_Name.setEditable(false);
		exercise13.add(Velocity_Exercise13_Name);
		
		//Text field for the velocity (Exercise 13)
		Velocity_Exercise13 = new JTextField(10);
		Velocity_Exercise13.setEditable(false);
		exercise13.add(Velocity_Exercise13);
		
		//Text field for the Reynold's number name
		JTextField Reynolds_Exercise13_Name = new JTextField("Liczba Reynoldsa");
		Reynolds_Exercise13_Name.setEditable(false);
		exercise13.add(Reynolds_Exercise13_Name);
		
		//Text field for the Reynold's number
		Reynolds_Exercise13 = new JTextField(10);
		Reynolds_Exercise13.setEditable(false);
		exercise13.add(Reynolds_Exercise13);
		
		//JPanel for exercise 51 bonus parts
		JPanel exercise51 = new JPanel();
		exercise51.setLayout(new GridLayout(12,1));
		exercise51.setSize(20, 8);
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridx = 5;
		constraints.gridy = 4;
		gridbag.setConstraints(exercise51, constraints);
				
		//Text field for the d name (Exercise 51)
		JTextField d_Exercise51_Name = new JTextField("d [mm]");
		d_Exercise51_Name.setEditable(false);
		exercise51.add(d_Exercise51_Name);
				
		//Text field for the d (Exercise 51)
		d_Exercise51 = new JTextField(10);
		d_Exercise51.setEditable(false);
		exercise51.add(d_Exercise51);
				
		//Text field for the U(d) name
		JTextField U_d_Exercise51_Name = new JTextField("U(d) [mm]");
		U_d_Exercise51_Name.setEditable(false);
		exercise51.add(U_d_Exercise51_Name);
				
		//Text field for the U(d)
		U_d_Exercise51 = new JTextField(10);
		U_d_Exercise51.setEditable(false);
		exercise51.add(U_d_Exercise51);
		
		//JLabel for angle description
		Ex_41_Label = new JLabel("K¹t:");
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridx = 5;
		constraints.gridy = 2;
		gridbag.setConstraints(Ex_41_Label, constraints);
		this.add(Ex_41_Label);
		
		//text area for result series
		Ex41_Angle_Series = new JTextArea(17,14);
		Ex41_Angle_Series.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 5;
		constraints.gridy = 4;
		constraints.gridheight = 4;
		gridbag.setConstraints(Ex41_Angle_Series, constraints);
		Ex41_Angle_Series.setEditable(false);
		Ex41_Angle_Series.setLineWrap(true);
		this.add(Ex41_Angle_Series);
		
		//Exercise 41 average with uncertainty
		Ex41_Average = new JTextField(14);
		Ex41_Average.setEditable(false);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 5;
		constraints.gridy = 8;
		gridbag.setConstraints(Ex41_Average, constraints);
		this.add(Ex41_Average);
		
		pack();
		this.add(exercise13);
		this.add(exercise51);
		exercise13.setVisible(false);
		exercise51.setVisible(false);
		Ex_41_Label.setVisible(false);
		Ex41_Angle_Series.setVisible(false);
		Ex41_Average.setVisible(false);
		
		
		
		//List of exercises to choose
		Exercises = new JComboBox<String>(global.Exercises);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridheight=2;
		Exercises.setSelectedIndex(0);
		Exercises.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
			          Object item = e.getItem();
			          if(item.toString()==global.Exercises[0]) {
			        	  //no exercise
			        	  Const_Name_First_Field.setText(global.Const_Name[0]);
			        	  Const_First_Field.setEditable(false);
			        	  Const_First_Field.setText("0");
			        	  
			        	  Const_Name_Second_Field.setText(global.Const_Name[0]);
			        	  Const_Second_Field.setEditable(false);
			        	  Const_Second_Field.setText("0");
			        	  
			        	  Const_Name_Third_Field.setText(global.Const_Name[0]);
			        	  Const_Third_Field.setEditable(false);
			        	  Const_Third_Field.setText("0");
			        	  
			        	  Const_Name_Fourth_Field.setText(global.Const_Name[0]);
			        	  Const_Fourth_Field.setEditable(false);
			        	  Const_Fourth_Field.setText("0");
			        	  
			        	  First_Data_Field.setText(global.Data_Field[0]);
			        	  Data_First.setEditable(false);
			        	  Data_First.setText("0");
			        	  
			        	  Second_Data_Field.setText(global.Data_Field[0]);
			        	  Data_Second.setEditable(false);
			        	  Data_Second.setText("0");
			        	  
			        	  Third_Data_Field.setText(global.Data_Field[0]);
			        	  Data_Third.setEditable(false);
			        	  Data_Third.setText("0");
			        	  
			        	  Ex_41_Label.setVisible(false);
			      		  Ex41_Angle_Series.setVisible(false);
			      		  Ex41_Average.setVisible(false);
			        	  exercise13.setVisible(false);
			        	  exercise51.setVisible(false);
			          }
			          if(item.toString()==global.Exercises[1]) {
			        	  //Exercise 13
			        	  Const_Name_First_Field.setText(global.Const_Name[1]);
			        	  Const_First_Field.setEditable(true);
			        	  Const_First_Field.setText("0");
			        	  
			        	  Const_Name_Second_Field.setText(global.Const_Name[2]);
			        	  Const_Second_Field.setEditable(true);
			        	  Const_Second_Field.setText("0");
			        	  
			        	  Const_Name_Third_Field.setText(global.Const_Name[3]);
			        	  Const_Third_Field.setEditable(true);
			        	  Const_Third_Field.setText("0");
			        	  
			        	  Const_Name_Fourth_Field.setText(global.Const_Name[4]);
			        	  Const_Fourth_Field.setEditable(true);
			        	  Const_Fourth_Field.setText("0");
			        	  
			        	  First_Data_Field.setText(global.Data_Field[1]);
			        	  Data_First.setEditable(true);
			        	  Data_First.setText("0");
			        	  
			        	  Second_Data_Field.setText(global.Data_Field[2]);
			        	  Data_Second.setEditable(true);
			        	  Data_Second.setText("0");
			        	  
			        	  Third_Data_Field.setText(global.Data_Field[3]);
			        	  Data_Third.setEditable(true);
			        	  Data_Third.setText("0");
			        	  
			        	  Ex_41_Label.setVisible(false);
			      		  Ex41_Angle_Series.setVisible(false);
			      		  Ex41_Average.setVisible(false);
			        	  exercise13.setVisible(true);
			        	  exercise51.setVisible(false);
			          }
			          if(item.toString()==global.Exercises[2]) {
			        	  //Exercise 32
			        	  Const_Name_First_Field.setText(global.Const_Name[5]);
			        	  Const_First_Field.setEditable(true);
			        	  Const_First_Field.setText("0");
			        	  
			        	  Const_Name_Second_Field.setText(global.Const_Name[0]);
			        	  Const_Second_Field.setEditable(false);
			        	  Const_Second_Field.setText("0");
			        	  
			        	  Const_Name_Third_Field.setText(global.Const_Name[0]);
			        	  Const_Third_Field.setEditable(false);
			        	  Const_Third_Field.setText("0");
			        	  
			        	  Const_Name_Fourth_Field.setText(global.Const_Name[0]);
			        	  Const_Fourth_Field.setEditable(false);
			        	  Const_Fourth_Field.setText("0");
			        	  
			        	  First_Data_Field.setText(global.Data_Field[4]);
			        	  Data_First.setEditable(true);
			        	  Data_First.setText("0");
			        	  
			        	  Second_Data_Field.setText(global.Data_Field[5]);
			        	  Data_Second.setEditable(true);
			        	  Data_Second.setText("0");
			        	  
			        	  Third_Data_Field.setText(global.Data_Field[0]);
			        	  Data_Third.setEditable(false);
			        	  Data_Third.setText("0");
			        	  
			        	  Ex_41_Label.setVisible(false);
			      		  Ex41_Angle_Series.setVisible(false);
			      		  Ex41_Average.setVisible(false);
			        	  exercise13.setVisible(false);
			        	  exercise51.setVisible(false);
			          }
			          if(item.toString()==global.Exercises[3]) {
			        	  //Exercise 1
			        	  Const_Name_First_Field.setText(global.Const_Name[0]);
			        	  Const_First_Field.setEditable(false);
			        	  Const_First_Field.setText("0");
			        	  
			        	  Const_Name_Second_Field.setText(global.Const_Name[0]);
			        	  Const_Second_Field.setEditable(false);
			        	  Const_Second_Field.setText("0");
			        	  
			        	  Const_Name_Third_Field.setText(global.Const_Name[0]);
			        	  Const_Third_Field.setEditable(false);
			        	  Const_Third_Field.setText("0");
			        	  
			        	  Const_Name_Fourth_Field.setText(global.Const_Name[0]);
			        	  Const_Fourth_Field.setEditable(false);
			        	  Const_Fourth_Field.setText("0");
			        	  
			        	  First_Data_Field.setText(global.Data_Field[6]);
			        	  Data_First.setEditable(true);
			        	  Data_First.setText("0");
			        	  
			        	  Second_Data_Field.setText(global.Data_Field[7]);
			        	  Data_Second.setEditable(true);
			        	  Data_Second.setText("0");
			        	  
			        	  Third_Data_Field.setText(global.Data_Field[0]);
			        	  Data_Third.setEditable(false);
			        	  Data_Third.setText("0");
			        	  
			        	  Ex_41_Label.setVisible(false);
			      		  Ex41_Angle_Series.setVisible(false);
			      		  Ex41_Average.setVisible(false);
			        	  exercise13.setVisible(false);
			        	  exercise51.setVisible(false);
			          }
			          if(item.toString()==global.Exercises[4]) {
			        	  //Exercise 51
			        	  Const_Name_First_Field.setText(global.Const_Name[6]);
			        	  Const_First_Field.setEditable(true);
			        	  Const_First_Field.setText("0");
			        	  
			        	  Const_Name_Second_Field.setText(global.Const_Name[7]);
			        	  Const_Second_Field.setEditable(true);
			        	  Const_Second_Field.setText("0");
			        	  
			        	  Const_Name_Third_Field.setText(global.Const_Name[0]);
			        	  Const_Third_Field.setEditable(false);
			        	  Const_Third_Field.setText("0");
			        	  
			        	  Const_Name_Fourth_Field.setText(global.Const_Name[0]);
			        	  Const_Fourth_Field.setEditable(false);
			        	  Const_Fourth_Field.setText("0");
			        	  
			        	  First_Data_Field.setText(global.Data_Field[8]);
			        	  Data_First.setEditable(true);
			        	  Data_First.setText("0");
			        	  
			        	  Second_Data_Field.setText(global.Data_Field[9]);
			        	  Data_Second.setEditable(true);
			        	  Data_Second.setText("0");
			        	  
			        	  Third_Data_Field.setText(global.Data_Field[0]);
			        	  Data_Third.setEditable(false);
			        	  Data_Third.setText("0");
			        	  
			        	  Ex_41_Label.setVisible(false);
			      		  Ex41_Angle_Series.setVisible(false);
			      		  Ex41_Average.setVisible(false);
			        	  exercise13.setVisible(false);
			        	  exercise51.setVisible(true);
			          }
			          if(item.toString()==global.Exercises[5]) {
			        	  //Exercise 41
			        	  Const_Name_First_Field.setText(global.Const_Name[8]);
			        	  Const_First_Field.setEditable(true);
			        	  Const_First_Field.setText("0");
			        	  
			        	  Const_Name_Second_Field.setText(global.Const_Name[9]);
			        	  Const_Second_Field.setEditable(true);
			        	  Const_Second_Field.setText("0");
			        	  
			        	  Const_Name_Third_Field.setText(global.Const_Name[10]);
			        	  Const_Third_Field.setEditable(true);
			        	  Const_Third_Field.setText("0");
			        	  
			        	  Const_Name_Fourth_Field.setText(global.Const_Name[0]);
			        	  Const_Fourth_Field.setEditable(false);
			        	  Const_Fourth_Field.setText("0");
			        	  
			        	  First_Data_Field.setText(global.Data_Field[8]);
			        	  Data_First.setEditable(true);
			        	  Data_First.setText("0");
			        	  
			        	  Second_Data_Field.setText(global.Data_Field[9]);
			        	  Data_Second.setEditable(true);
			        	  Data_Second.setText("0");
			        	  
			        	  Third_Data_Field.setText(global.Data_Field[0]);
			        	  Data_Third.setEditable(false);
			        	  Data_Third.setText("0");
			        	  
			        	  exercise13.setVisible(false);
			        	  exercise51.setVisible(false);
			        	  Ex_41_Label.setVisible(true);
			      		  Ex41_Angle_Series.setVisible(true);
			      		  Ex41_Average.setVisible(true);
			          }
			       }
			}
	    });
		gridbag.setConstraints(Exercises, constraints);
		this.add(Exercises);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == Calc_Button) {
			data_object Data = new data_object();
			Data.Data_First_String = Data_First.getText();
			Data.Data_Second_String = Data_Second.getText();
			Data.Data_Third_String = Data_Third.getText();
			Data.Const_First = Const_First_Field.getText();
			Data.Const_Second = Const_Second_Field.getText();
			Data.Const_Third = Const_Third_Field.getText();
			Data.Const_Fourth = Const_Fourth_Field.getText();
			Data.Exercise_Name = Exercises.getSelectedItem().toString();
			results Results = analyze_labapp.analyze(Data);
			Results_Series.setText(Results.Results_Series);
			Results_Average.setText(Results.Results_Average);
			if(Data.Exercise_Name==global.Exercises[1]) {
				Velocity_Exercise13.setText(Results.Add_Value_1);
				Reynolds_Exercise13.setText(Results.Add_Value_2);
			}
			if(Data.Exercise_Name==global.Exercises[4]) {
				d_Exercise51.setText(Results.Add_Value_1);
				U_d_Exercise51.setText(Results.Add_Value_2);
			}
		};
		
	}
}