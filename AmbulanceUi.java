import javax.swing.Action;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.naming.NamingEnumeration;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AmbulanceUi extends JFrame implements ActionListener{
    int a = 0;
    int i = 0;
    JPanel labels = new JPanel();
    JLabel[] label = new JLabel[12];
    JLabel ambCount = new JLabel("Available : ");
    JLabel title = new JLabel("Ambulance Management : ");
    JLabel count = new JLabel();
    JButton submit = new JButton("Submit");
    JTextField dest = new JTextField();
    JLabel desLabel = new JLabel("Enter destination : ");
    JButton  back = new JButton("Back");
    AmbulanceUi()
    {
        Color cd = new Color(153,204,255);
        Color c = new Color(68,167,196);
        back.setBounds(250,350,80,30);
        back.setFocusable(false);
        back.addActionListener(this);
        back.setBackground(c);
        submit.setBackground(c);
       submit.setBounds(130,350,100,30);
       submit.setFocusable(false);
       submit.addActionListener(this);
        desLabel.setBounds(20,300,140,30);
        desLabel.setOpaque(true);
        dest.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        dest.setBounds(130,300,250,30);
        dest.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        count.setBounds(120,200,100,50);
        count.setBackground(cd);
        count.setForeground(Color.BLUE);
        count.setOpaque(true);
        count.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,30));
        title.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,70));
        title.setBackground(cd);
        title.setForeground(Color.blue);
        title.setOpaque(true);
        title.setBounds(0,0,870,80);
        ambCount.setBackground(cd);
        ambCount.setForeground(Color.BLUE);
        ambCount.setOpaque(true);
        ambCount.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,30));
        ambCount.setBounds(0,200,150,50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1870,1080);
        this.getContentPane().setBackground(cd);
        this.setLayout(null);
        this.setVisible(true);
        labels.setLayout(new GridLayout(10,1));
        labels.setBounds(870,0,1000,1070);
        labels.setBackground(Color.BLACK);
        Color css = new Color(204,229,255);
        for(int i= 0;i<10;i++)
        {
            label[i] = new JLabel();
           // label[i].setSize(200,200);
            labels.add(label[i]);
            label[i].setBackground(css);
            label[i].setForeground(Color.black);
            label[i].setFont(new Font("serif",Font.BOLD,20));
            label[i].setOpaque(true);
        }
            FileReader ins = null;
            FileWriter outs = null;
            FileWriter out = null;
            File inFile = new File("C:/Users/USER/Desktop/hospital management/ambDetails.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/ambDetails.txt");
            File OutFile = new File("C:/Users/USER/Desktop/hospital management/ambCount.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                ins = new FileReader(inFile);
                File read = new File("C:/Users/USER/Desktop/hospital management/ambCount.txt");
               File Read = new File("C:/Users/USER/Desktop/hospital management/ambDetails.txt");
               Scanner input = new Scanner(Read);
               Scanner inputs = new Scanner(read); 
               int flag = 0;
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    label[i].setText("Number "+ (i+1) + " Ambulance is At : " +  s);
                    i++;
                }
                while(inputs.hasNext())
                {
                    a = inputs.nextInt();
                    if(i == 0 && a< 10)
                    {
                        a = 10;
                    }
                    count.setText("    " + Integer.toString(a));
                    break;
                }
            } 
            catch(IOException eg)
            {
                System.out.print(eg);
                System.exit(-1);
            }
            finally // close file \\
            {
                try{
                    outs.close();
                }
                catch(IOException eg)
                {
                    
                }
            }
        this.add(title);
        this.add(labels);
        this.add(ambCount);
        this.add(count);
        this.add(dest);
        this.add(desLabel);
        this.add(submit);
        this.add(back);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == submit)
        {
            FileReader ins = null;
            FileWriter outs = null;
            FileWriter out = null;
            File inFile = new File("C:/Users/USER/Desktop/hospital management/ambDetails.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/ambDetails.txt");
            File OutFile = new File("C:/Users/USER/Desktop/hospital management/ambCount.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                ins = new FileReader(inFile);
               // File read = new File("C:/Users/USER/Desktop/hospital management/ambCount.txt");
               File Read = new File("C:/Users/USER/Desktop/hospital management/ambDetails.txt");
               Scanner input = new Scanner(Read);
              // Scanner inputs = new Scanner(read); 
               int flag = 0;
               String ab = dest.getText();
               label[i].setText("Number "+ (i+1) + " Ambulance is At : " +  ab);
               outs.write(ab + '\n');
               out = new FileWriter(OutFile);
               out.flush();
               out.close();
               a--;
               System.out.println(a);
               count.setText("    " + Integer.toString(a));
               out = new FileWriter(OutFile,true);
               out.write(Integer.toString(a) + '\n');
            } 
            catch(IOException eg)
            {
                System.out.print(eg);
                System.exit(-1);
            }
            finally // close file \\
            {
                try{
                    out.close();
                    outs.close();
                }
                catch(IOException eg)
                {
                    
                }
            }
            i++;
        }
        if(e.getSource() == back)
        {
            this.dispose();
            Ui frame = new Ui();
        }
        
    }
    
}
