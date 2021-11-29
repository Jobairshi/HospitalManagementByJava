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
public class ClinicalUi extends JFrame implements ActionListener {
    JButton emer,corona,normal;
    JLabel emrCount,CorCount,norCount; // avaiable beds
    JLabel emrTitle,corTitle,norTitle;
    JLabel title;
    JLabel emrName,corName,norName;
    JLabel avail = new JLabel("Available Beds : ");
    JButton back = new JButton("Back");
    int Cor = 0;
    int Emr = 0;
    int Nor = 0;
    ClinicalUi()
    {
        Color cs = new Color(153,255,255);
        Color C = new Color(204,255,229);
        Color c = new Color(68,167,196);
        Color cd = new Color(153,204,255);
        title = new JLabel("Hospital Info : ");
        emrTitle = new JLabel("Emergency");
        emrCount = new JLabel();
        emrCount.setBounds(350 + 5 +3 + 2 + 30,228 + 50,80,50);
        emrCount.setOpaque(true);
        emrCount.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,30));
        emrCount.setBackground(cd);
        emrTitle.setBounds(350,228,100,50);
        emrTitle.setBackground(C);
        emrTitle.setOpaque(true);
        emrTitle.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        CorCount = new JLabel();
        CorCount.setBounds(460 + 10 + 10,228 + 50,70,50);
        CorCount.setOpaque(true);
        CorCount.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,30));
        CorCount.setBackground(cd);
        corTitle = new JLabel("Corona");
        corTitle.setBounds(470,228,70,50);
        corTitle.setBackground(C);
        corTitle.setOpaque(true);
        corTitle.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        norCount = new JLabel();
        norCount.setBounds(550 + 20 + 15,228 + 50,80,50);
        norCount.setOpaque(true);
        norCount.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,30));
        norCount.setBackground(cd);
        norTitle = new JLabel("Normal");
        norTitle.setBounds(470 + 100,228,80,50);
        norTitle.setBackground(C);
        norTitle.setOpaque(true);
        norTitle.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        title.setBackground(cd);
        avail.setBackground(cd);
        avail.setBounds(0,280,300,50);
        avail.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,40));
        avail.setOpaque(true);
        title.setBounds(0,0,1870,150);
        title.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,100));
        title.setOpaque(true);
    /*//     Date              d;
    //    SimpleDateFormat  sdf;
    //     String            s;

    //     d = dateChooser.getDate();                      // Date selected by user
    //    sdf = SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  // Or whatever format you need
    //     s = sdf.format(d);                          // Viola
      /*  dateCos.setPreferredSize(new Dimension(220,30));
        dateCos.getComponent(0).setPreferredSize(new Dimension(50,30)); //Jbuton
        dateCos.getComponent(1).setPreferredSize(new Dimension(200,30));//JFormattedTextField
        dateCos.setDateFormatString("dd-MM-yyyy");*/
        emer = new JButton();
        corona = new JButton();
        normal = new JButton();
        ImageIcon cor = new ImageIcon("C:/Users/USER/Pictures/cor.png");
        ImageIcon emr = new ImageIcon("C:/Users/USER/Pictures/emer.png");
        ImageIcon norm = new ImageIcon("C:/Users/USER/Pictures/pat.png");
        emer.setBounds(100 + 400 + 100,500,100,100);
        emer.addActionListener(this);
        emer.setFocusable(false);
        emer.setIcon(emr);
        corona.setIcon(cor);
        normal.setIcon(norm);
        corona.setBounds(250 + 400 + 100 + 100,500,100,100);
        corona.addActionListener(this);
        corona.setFocusable(false);
        corona.setIcon(cor);
        back.setBounds(850,700 + 50,100,50);
        back.setFocusable(false);
        back.addActionListener(this);
        back.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        normal.setBounds(400 + 400 + 200 + 100,500,100,100);
        normal.addActionListener(this);
        normal.setFocusable(false);
        emrName = new JLabel("Emergency");
        emrName.setBounds(603,605,100,30);
        emrName.setOpaque(true);
        emrName.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        emrName.setBackground(cd);
        corName = new JLabel("Corona");
        corName.setBounds(870,605,100,30);
        corName.setOpaque(true);
        corName.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        corName.setBackground(cd);
        norName = new JLabel("Normal");
        norName.setBounds(1120,605,100,30);
        norName.setOpaque(true);
        norName.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,20));
        norName.setBackground(cd);


        FileReader ins = null;
        FileWriter outs = null;
        File inFile = new File("C:/Users/USER/Desktop/hospital management/paitent_fileO.txt");
        File outFile = new File("C:/Users/USER/Desktop/hospital management/paitent_fileO.txt");
        File CoroutFile = new File("C:/Users/USER/Desktop/hospital management/CorCount.txt");
        File NoroutFile = new File("C:/Users/USER/Desktop/hospital management/NorCount.txt");
        File EmroutFile = new File("C:/Users/USER/Desktop/hospital management/EmrCount.txt");
        try
        {
            outs = new FileWriter(outFile,true); // passed true for append mode
            ins = new FileReader(inFile);
           File Read = new File("C:/Users/USER/Desktop/hospital management/paitent_fileO.txt");
           Scanner input = new Scanner(Read);
            int flag = 0;
            int  i= 0;
            String ex = new String("emergency");
            String ey = new String("corona");
            String ez = new String("normal");
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
                  Emr++;
                }
                if(x.equals(ey))
                {
                    Cor++;
                }
                if(x.equals(ez))
                {
                    Nor++;
                }
            }
            Read = new File("C:/Users/USER/Desktop/hospital management/EmrCount.txt");
            input = new Scanner(Read);
            int a = 0;
            while(input.hasNext())
            {
                a = input.nextInt();
                if(a < 30)
                a = 30;
                break;
            }
            a-=Emr;
            System.out.println(a);
          //  a++;
            emrCount.setText(Integer.toString(a));
            Read = new File("C:/Users/USER/Desktop/hospital management/CorCount.txt");
            input = new Scanner(Read);
             a = 0;
            while(input.hasNext())
            {
                a = input.nextInt();
                if(a < 110)
                a = 110;
                break;
            }
            a-=Cor;
         //   a++;
            System.out.println(a);
             CorCount.setText(Integer.toString(a));
             Read = new File("C:/Users/USER/Desktop/hospital management/NorCount.txt");
             input = new Scanner(Read);
              a = 0;
             while(input.hasNext())
             {
                 a = input.nextInt();
                 if(a < 120)
                 a = 120;
                 break;
             }
             a-=Nor;
//           a++;
             //System.out.println(a);
              norCount.setText(Integer.toString(a));
           // System.out.println(Emr + "  " + Cor + "  " + Nor);
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
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(cd);
        this.add(title);
        this.add(avail);
        this.add(emrTitle);
        this.add(corTitle);
        this.add(norTitle);
        this.add(emrCount);
        this.add(CorCount);
        this.add(norCount);
        this.add(emer);
        this.add(corona);
        this.add(normal);
        this.add(emrName);
        this.add(corName);
        this.add(norName);
        this.add(back);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == normal)
        {
            this.dispose();
            NormalUi frame = new NormalUi();
        }
        if(e.getSource() == corona)
        {
            this.dispose();
            CoronaUi frame = new CoronaUi();
        }
        if(e.getSource() == emer)
        {
            this.dispose();
            EmergencyUi frame = new EmergencyUi();
        }
        if(e.getSource() == back)
        {
            this.dispose();
            Ui frame = new Ui();
        }
    }
}
