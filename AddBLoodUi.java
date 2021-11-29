import javax.imageio.ImageIO;
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
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddBLoodUi extends JFrame implements ActionListener  {
    JButton button;
    JRadioButton normal,emer,corona;
    JLabel label,nameLabel,BLoodLabel,PhoneLabel,PlaceLabel;
    JTextField name,Blood,Phone,Place;
    JLabel lab;
    JButton back;
    AddBLoodUi()
    {
        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/bl.png");
        lab = new JLabel();
        back = new JButton("Back");
        back.addActionListener(this);
        lab.setBounds(500,300,550,550);
        lab.setBackground(Color.LIGHT_GRAY);
        lab.setOpaque(true);
        lab.setIcon(clip);
        nameLabel = new JLabel("Name :");
        BLoodLabel = new JLabel("Blood :");
        PhoneLabel = new JLabel("Phone :");
        PlaceLabel = new JLabel("Place : ");
        PlaceLabel.setBounds(20,450 + 100,100,30);
        nameLabel.setBounds(20,300 + 100,100,30);
        BLoodLabel.setBounds(20,350 + 100,100,30);
        PhoneLabel.setBounds(20,400 + 100,100,30);
        label = new JLabel("Enter Blood Donor Info :");
        name = new JTextField();
        Blood = new JTextField();
        Phone = new JTextField();
        Place = new JTextField();
      //  normal.setBounds(70,600,30,30);
        Place.setBounds(60 + 10,450 + 100,200,30);
        Phone.setBounds(60 + 10,400 + 100,200,30);
        Blood.setBounds(70,350 + 100,200,30);
        name.setBounds(60 + 10,300 +100,200,30);
        label.setBounds(0,20,1870,200); 
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        label.setForeground(Color.blue);
        label.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,100));
        button = new JButton(); 
        button.addActionListener(this);
        button.setBounds(30,650,100,50);
        button.addActionListener(this);
        button.setText("Submit");
        button.setFocusable(false);
       // button.setFont (new java.awt.Font("serif", java.awt.Font.ITALIC, 22)); // to set font
        button.setIconTextGap(-15);
        button.setForeground(java.awt.Color.cyan);
        Color c = new Color(68,167,196);
        button.setBackground(c);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit using this X button
        this.setSize(1870,1080);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray); // set backgrnd color
        this.add(label);
        this.add(button);
        this.add(name);
        nameLabel.setOpaque(true);
        this.add(nameLabel);
        this.add(Blood);
        BLoodLabel.setOpaque(true);
        this.add(BLoodLabel);
        this.add(Phone);
        PhoneLabel.setOpaque(true);
        this.add(PhoneLabel);
        this.add(Place);
        PlaceLabel.setOpaque(true);
        this.add(PlaceLabel);
        this.add(lab);
        back.setBounds(150,650,100,50);
        back.setBackground(c);
        back.setFocusable(false);
        back.setBorder(BorderFactory.createEtchedBorder());
        back.setForeground(Color.CYAN);
        this.add(back);
       // this.add(normal);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> names  = new ArrayList<String>(1000);
        ArrayList<String> bloods  = new ArrayList<String>(1000);
        ArrayList<String> phones = new ArrayList<String>(1000);
        ArrayList<String> places = new ArrayList<String>(1000);
        ArrayList<String> units  = new ArrayList<String>(1000);
        //arrli.get(i) to get the elements
        if(e.getSource() == button)
        {
            String Name = "",blood = "",phone = "",place = "",unit = "";
            //name,phone,place,room,type;
            Name = name.getText();
            blood = Blood.getText();
            phone = Phone.getText();
            place = Place.getText();
            names.add(Name);
            bloods.add(blood);
            phones.add(phone);
            places.add(place);
            units.add(unit);
           //FileReader ins = null;
            FileWriter outs = null;
           // File inFile = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                //ins = new FileReader(inFile);
               File Read = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
               Scanner input = new Scanner(Read);
                outs.write(Name + '\n');
                outs.write(blood + '\n');
                outs.write(phone + '\n');
                outs.write(place + '\n');
                // while(input.hasNext()) // to read the file
                // {
                //     String s = input.nextLine();
                //     String s1 = input.nextLine();
                //     String s2 = input.nextLine();
                //     String s3 = input.nextLine();
                //     String s4 = input.nextLine();
                //     System.out.println(s);
                //     System.out.println(s1);
                //     System.out.println(s2);
                //     System.out.println(s3);
                //     System.out.println(s4);
                // }
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
                button.setEnabled(false);
            
        }
        if(e.getSource() == back)
        {
            this.dispose();
            blood frame = new blood();
        }
    }
    
}
