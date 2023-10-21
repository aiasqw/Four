//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Sort extends JFrame 
{
	private static final int DEFAULT_WIDTH=500;
	private static final int DEFAULT_HEIGHT=600;
	ArrayList<String> nums = new ArrayList<String>();
	String[] snum = new String[2];
	int[] save = new int[4];
	public Sort(ArrayList<String> num)
	{
		//JTextArea Area1 = new JTextArea();
		//add(Area1);
		//Area1.setBounds(100, 100, 200, 100);
		/*JTextArea Area = new JTextArea();
		//add(Area);
		//Area.setBounds(50, 50, 500, 50);
		add(Area,BorderLayout.NORTH);
		
		Area.append("���յ÷�Ϊ��");*/
		for(String e: num)
		{
			nums.add(e);
			
		}
		nums.toArray(snum);
		
		
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Сѧ����������ϵͳ");
		setLocation(500,100);
		setVisible(false);
	}
	
	public void paint(Graphics g)
    {  
		int snum2 = Integer.parseInt(snum[0]);
		//int snum3 = Integer.parseInt(snum[1]);
		
	    File file = new File("result.txt");
		StringBuilder result = new StringBuilder();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
            String s = new String();
            do
            {//ʹ��readLine������һ�ζ�һ��
            	for(int i=0;i<4;i++)
            	{
            		s = br.readLine() ;
            		save[i] = Integer.parseInt(s);
            		
            	}
                
            }while((s = br.readLine())!=null);
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //return result.toString();
		
		
		
		
        int Width = 400;
        int Height = 450; 
        Random ran = new Random();
        int leftMargin = 15;//����ͼ��߽�  
        int topMargin = 50;//����ͼ�ϱ߽�  
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(50, 100);
        int ruler = Height-topMargin-5;  
        int rulerStep = ruler/10;//����ǰ�ĸ߶�����Ϊ10����λ  
        g2.setColor(Color.gray);//���ư�ɫ����  
        g2.fillRect(0, 0, Width, Height);//���ƾ���ͼ  
        g2.setColor(Color.LIGHT_GRAY);  
        for(int i=0;i<=10;i++){//���ƻ�ɫ���ߺͰٷֱ�  
            g2.drawString((100-10*i)+"", 10, topMargin+rulerStep*i);//д�°ٷֱ�  
            g2.drawLine(10, topMargin+rulerStep*i, Width, topMargin+rulerStep*i);//���ƻ�ɫ����  
        }  
        g2.setColor(Color.PINK);  
        for(int i=0;i<4;i++){//��������ͼ  
            int value =save[i]*4;// ran.nextInt(Height-topMargin-10)+10;//����������εİٷֱ�  
            int step = (i+1)*35;//����ÿ������ͼ��ˮƽ���Ϊ40  
            //���ƾ���  
            g2.fillRoundRect(leftMargin+step*2, Height-value-10, 40, value, 40, 10); 
            //g2.fillRoundRect(leftMargin+step*2, Height-value, 40, value, 40, 10);  
            //�г���Ʒ�ı��  
            g2.drawString("����"+(i+1), leftMargin+step*2, Height-value-15); 
            
        } 
        JPanel south = new JPanel();
		JButton btn1 = new JButton("��������");
		south.add(btn1);
		JButton btn2 = new JButton("����");
		south.add(btn2);
		add(south,BorderLayout.SOUTH);
		
		 btn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					setVisible(false);
					SimpleFrame0 frame = new SimpleFrame0();
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
		
        
        JTextArea Area = new JTextArea();
        add(Area,BorderLayout.NORTH);
        Area.setFont(new Font(" ",Font.PLAIN,20));
        Area.append("��ȷ����Ϊ��"+(snum2/5)+"\n");
        Area.append("���յ÷�Ϊ��"+snum2+"��");
       
        
      
        
    }  
	
}
