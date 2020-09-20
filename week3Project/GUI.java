package week3Project;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class GUI implements ActionListener{
	
	private JLabel sensorLabel;
	private JLabel sensorGraphics;
	
	
	public GUI(){
		sensorLabel = new JLabel("Engines: ");
		sensorGraphics = new JLabel("Sensors: ");
	
		JFrame frame= new JFrame("Robot Control Panel");
		frame.setLayout(new GridLayout(0,2));
		
	
		 //Engine Button
        JButton enginesOnButton = new JButton("Engine On");
        enginesOnButton.addActionListener(new Action1());
        enginesOnButton.setBackground(Color.GREEN);
        frame.add(enginesOnButton);
        JButton enginesOffButton = new JButton("Engine Off");
        enginesOffButton.addActionListener(new Action2());
        enginesOffButton.setBackground(Color.RED);
        frame.add(enginesOffButton);
		
		
		//Sensors Button 
        JButton sensorsOnButton = new JButton("Sensors On");
        sensorsOnButton.addActionListener(new Action3());
        sensorsOnButton.setBackground(Color.GREEN);
        frame.add(sensorsOnButton);
        JButton sensorsOffButton = new JButton("Sensors Off");
        sensorsOffButton.addActionListener(new Action4());
        sensorsOffButton.setBackground(Color.RED);
        frame.add(sensorsOffButton);
        
        //Navigation Button
        JButton navOnButton = new JButton("Navigation On");
        navOnButton.addActionListener(new Action5());
        navOnButton.setBackground(Color.GREEN);
        frame.add(navOnButton);
        JButton navOffButton = new JButton("Navigation Off");
        navOffButton.addActionListener(new Action6());
        navOffButton.setBackground(Color.RED);
        frame.add(navOffButton);
        
        //Status Screen
        frame.add(sensorLabel);
        frame.add(sensorGraphics);


        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public class Action1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Engine engine = new Engine("On");
			sensorLabel.setText(engine.on());
		}
	}
	public class Action2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Engine engine = new Engine("off");
			sensorLabel.setText(engine.off());
		}
	}
	public class Action3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Sensors sensor = new Sensors("Passive", 6);
			sensorGraphics.setText(sensor.on());
		}
	}
	public class Action4 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Sensors sensor = new Sensors("Passive", 6);
			sensorGraphics.setText(sensor.off());
		}
	}
	public class Action5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Navigation navigation = new Navigation("On");
			sensorGraphics.setText(navigation.on());
		}
	}
	public class Action6 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Navigation navigation = new Navigation("On");
			sensorGraphics.setText(navigation.off());
		}
	}


}
