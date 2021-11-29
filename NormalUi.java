import javax.swing.JFrame;

import java.lang.annotation.IncompleteAnnotationException;
import java.text.SimpleDateFormat;

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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.PanelUI;
import javax.swing.text.AttributeSet.ColorAttribute;

import com.toedter.calendar.JDateChooser;

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
public class NormalUi extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JLabel[] label = new JLabel[20];
    JLabel title = new JLabel("All Regular Unit Paitent's Data : ");
    JButton back = new JButton("Back");
    NormalUi()
    {
        Color C = new Color(204,255,229);
        back.setBounds(1650,985,150,50);
        back.setFocusable(false);
        back.addActionListener(this);
        back.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        Color cd = new Color(153,204,255);
        title.setBounds(0,0,1870,150);
        title.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,70));
        title.setOpaque(true);
        title.setBackground(C);
        panel.setLayout(new GridLayout(5,4));
        panel.setBounds(0,150,1870,830);;
        panel.setBackground(Color.BLACK);
        for(int i= 0;i<20;i++)
        {
            label[i] = new JLabel();
           // label[i].setSize(200,200);
            panel.add(label[i]);
            label[i].setBackground(cd);
            label[i].setForeground(Color.BLACK);
            label[i].setFont(new Font("serif",Font.BOLD,15));
            label[i].setOpaque(true);
        }
        FileReader ins = null;
            FileWriter outs = null;
            File inFile = new File("C:/Users/USER/Desktop/hospital management/paitent_fileO.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/paitent_fileO.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                ins = new FileReader(inFile);
               File Read = new File("C:/Users/USER/Desktop/hospital management/paitent_fileO.txt");
               Scanner input = new Scanner(Read);
                int flag = 0;
                int  i= 0;
                String ex = new String("normal");
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    String s1 = input.nextLine();
                    String s2 = input.nextLine();
                    String s3 = input.nextLine();
                    String s4 = input.nextLine();
                    String s5 = input.nextLine();
                    String x = s4.toLowerCase();
                    if(x.equals(ex))
                    {
                    String Text ="<html>Name :"+s.toUpperCase()+"<br>Phone :"+s1.toUpperCase()+"<br>Place :"+s2.toUpperCase()+"<br>Ward : "+s3.toUpperCase()+"<br>Unit : "+s4.toUpperCase()+"<br>Admit date : "+s5.toUpperCase()+"</html>";
                    label[i].setText(Text);
                    i++;
                    }
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
        this.setSize(1870,1080);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(cd);
        this.add(panel);
        this.add(title);
        this.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == back)
        {
            this.dispose();
            ClinicalUi frame = new ClinicalUi();
        }
    }
}
