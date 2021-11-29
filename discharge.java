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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class discharge extends JFrame implements ActionListener {
    JButton searcButton,back,submit;
    JTextField namTextField,UnitText;
    JLabel inform,title,lap,unitLabel;
    JLabel name;
    discharge()
    {
        Color cd = new Color(153,204,255);
        Color c = new Color(68,167,196);
        unitLabel = new JLabel("Unit No. : ");
        unitLabel.setBounds(20,450,70,30);
        unitLabel.setOpaque(true);
        unitLabel.setFont(new Font("serif",Font.BOLD,15));
        unitLabel.setBackground(cd);
        submit = new JButton("Submit");
        submit.setBounds(200,500,80,30);
        submit.addActionListener(this);
        submit.setBackground(c);
        UnitText = new JTextField();
        UnitText.setBounds(110,450,250,30);
        lap = new JLabel();
        lap.setBounds(500,350,311,350);
        lap.setBackground(Color.white);
        lap.setOpaque(true);
        lap.setForeground(Color.BLACK);
        lap.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,17));
        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/diss.png");
        inform = new JLabel();
        inform.setBounds(840,186,800,830);
        back = new JButton("Back");
        inform.setBackground(cd);
        inform.setIcon(clip);
        name = new  JLabel("Enter Name : ");
        name.setBounds(20,300 + 100,100,30);
        name.setOpaque(true);
        name.setBackground(cd);
        name.setForeground(Color.black);
         title = new JLabel();
       title.setBounds(0,0,1870,200); 
        title.setOpaque(true);
        inform.setOpaque(true);
        title.setBackground(cd);
        title.setText("Discharge :");
        title.setForeground(Color.blue);
        name.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        title.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,100));
        back.setBackground(c);
        back.setBounds(290,500,80,30);
        back.setFocusable(false);
        searcButton = new JButton("Search");
        searcButton.setBackground(c);
        searcButton.setBounds(110,500,80,30);
        searcButton.setFocusable(false);
        namTextField = new JTextField();
        submit.setFocusable(false);
        namTextField.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        namTextField.setBounds(110,300 +100,250,30);
        this.setLayout(null);
        this.setSize(1870,1080);
        this.getContentPane().setBackground(cd);
        this.setVisible(true);
        this.add(title);
        this.add(namTextField);
        searcButton.addActionListener(this);
        back.addActionListener(this);
        this.add(name);
        this.add(searcButton);
        this.add(back);
        this.add(lap);
        this.add(inform);
        this.add(UnitText);
        this.add(unitLabel);
        this.add(submit);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
        // TODO Auto-generated method stub
        if(e.getSource() == searcButton)
        {
            String Name = namTextField.getText();
            String un = UnitText.getText();
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
                String name = Name.toLowerCase();
                int flag = 0;
                String type = new String();
                LocalDate today = LocalDate.now();
                String Date = today.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    String ex = s.toLowerCase();
                    String s1 = input.nextLine();
                    String s2 = input.nextLine();
                    String s3 = input.nextLine();
                    String s4 = input.nextLine();
                    String s5 = input.nextLine();
                    if(name.equals(ex) && un.equals(s3))
                    {
                       flag = 1;
                       int d1 = s5.charAt(0)-'0';
                       int d2 = s5.charAt(1)-'0';
                       int dd = d1 * 10 + d2;
                       int m1 = s5.charAt(3)-'0';
                       int m2 = s5.charAt(4)-'0';
                       int mm = m1 * 10 + m2;
                       int td1 = Date.charAt(0)-'0';
                       int td2 = Date.charAt(1)-'0';
                       int tdd = td1 * 10 + td2;
                       int tm1 = Date.charAt(3)-'0';
                       int tm2 = Date.charAt(4)-'0';
                       int tmm = m1 * 10 + m2;
                       System.out.println(dd + " " + tdd);
                       String ty = s4.toLowerCase();
                       int cost = 0;
                       if(ty.equals("normal"))
                       {
                           cost = 3000; // per day
                       }
                       if(ty.equals("emergency"))
                       {
                           cost = 4000;
                       }
                       if(ty.equals("corona"))
                       {
                           cost = 5000; // per day
                       }
                       int total = cost * (tdd - dd);
                       System.out.println(cost);
                       String Text ="<html>Name :"+s.toUpperCase()+"<br>Phone : "+ s1 + "<br>Place :"+s2.toUpperCase()+"<br>Ward : "+s3.toUpperCase()+"<br>Unit : "+s4.toUpperCase()+"<br>Admit date : "+s5.toUpperCase()+"<br>Todays date : "+Date.toUpperCase()+"<br>Total cost : "+ total  + "</html>";
                       lap.setText(Text);
                     /*  System.out.println(s);
                       System.out.println(s1);
                       System.out.println(s2);
                       System.out.println(s3);
                       System.out.println(s4);*/
                       break;
                    }
                }
                if(flag == 0)
                {
                    lap.setText("No Paitent Found 😢");
                }
                if(flag == 1)
                {

                    outs.flush();
                }
                // searcButton.setEnabled(false);
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
        }
        if(e.getSource() == submit)
        {
            ArrayList < String > names = new ArrayList<String>();
            ArrayList < String > phones = new ArrayList<String>();
            ArrayList < String > places = new ArrayList<String>();
            ArrayList < String > units = new ArrayList<String>();
            ArrayList < String > types = new ArrayList<String>();
            ArrayList < String > dates = new ArrayList<String>();
            String unit = UnitText.getText();
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
                String type = new String();
                LocalDate today = LocalDate.now();
                String Date = today.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    String s1 = input.nextLine();
                    String s2 = input.nextLine();
                    String s3 = input.nextLine();
                    String ex = s3.toLowerCase();
                    String s4 = input.nextLine();
                    String s5 = input.nextLine();
                    if(unit.equals(s3))
                    {
                      
                       System.out.println("beeep beep!!");
                       flag = 1;
                       /*System.out.println(s1);
                       System.out.println(s2);
                       System.out.println(s3);
                       System.out.println(s4);*/
                       //continue;
                    }
                    else
                    {
                        System.out.println("sd");
                        names.add(s);
                        phones.add(s1);
                        places.add(s2);
                        units.add(s3);
                        types.add(s4);
                        dates.add(s5);
                    }
                }
                for(int i =0 ;i<names.size();i++)
                {
                    System.out.println(names.get(i));
                    System.out.println(phones.get(i));
                    System.out.println(places.get(i));
                    System.out.println(units.get(i));
                    System.out.println(types.get(i));
                    System.out.println(dates.get(i));
                }
                System.out.println("FLag >>> " + flag);
                if(flag == 1)
                {
                    outs = new FileWriter(outFile,false);
                    outs.flush();
                    outs.close();
                    outs = new FileWriter(outFile,true);
                    for(int i =0 ;i<names.size();i++)
                    {
                        outs.write(names.get(i) + '\n');
                        outs.write(phones.get(i) + '\n');
                        outs.write(places.get(i) + '\n');
                        outs.write(units.get(i) + '\n');
                        outs.write(types.get(i) + '\n');
                        outs.write(dates.get(i) + '\n');
                    }
                }
                // searcButton.setEnabled(false);
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
            submit.setEnabled(false);
        }
        if(e.getSource() == back)
        {
            this.dispose();
            Ui  frame = new Ui();
        }
    }
    
}
