import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Start extends JFrame 
{
	
	public static void main(String[] args) 
    {
    	
    	EventQueue.invokeLater(new Runnable()
    	{
    		public void run()
    		{
    			//SimpleFrame0 frame = new SimpleFrame0();
    			//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			//frame.setVisible(true);
    			Start frame = new Start();
    			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			frame.setVisible(true);
    			
    		}
    	});
    }
	
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=300;
	
	public Start()
	{
		JPanel north = new JPanel();
		JPanel south = new JPanel();
		
		JLabel label = new JLabel("是否确认开始测试？    点击‘确认’将开始计时",JLabel.CENTER); 
		JButton btn1 = new JButton("确定");
		JButton btn2 = new JButton("取消");
		add(label);
		south.add(btn1);
		south.add(btn2);
		add(south,BorderLayout.SOUTH);
		
		 btn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					setVisible(false);
					SimpleFrame0 frame = new SimpleFrame0();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    			frame.setVisible(true);
					
				}
			});
	        
		 
		 btn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					System.exit(0);
				}
			});
		 
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("小学生四则运算系统");
		setLocation(500,200);
		
	}
	
}
