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
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class searchUI extends JFrame implements ActionListener {
    JButton searcButton,back;
    JTextField namTextField;
    JLabel inform,title;
    JLabel name;
    JPanel panel = new JPanel();
    JLabel[] labels = new JLabel[16];
    searchUI()
    {
        Color cd = new Color(153,204,255);
        Color css = new Color(204,229,255);
        panel.setLayout(new GridLayout(4,3));
        panel.setBounds(400,200,800,600 + 200);
        panel.setBackground(css);
        for(int i= 0;i<12;i++)
        {
            labels[i] = new JLabel();
            // label[i].setSize(200,200);
             panel.add(labels[i]);
             labels[i].setBackground(css);
            // labels[i].setText("SD");
             labels[i].setForeground(Color.black);
             labels[i].setFont(new Font("serif",Font.BOLD,15));
             labels[i].setOpaque(true);
        }
        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/cc.png");
        inform = new JLabel();
        Color c = new Color(68,167,196);
        inform.setBounds(1250,180,500,800);
        back = new JButton("Back");
        inform.setBackground(cd);
        inform.setIcon(clip);
        name = new  JLabel("Enter Name : ");
        name.setBounds(20,300 + 100,100,30);
        name.setOpaque(true);
        name.setBackground(Color.LIGHT_GRAY);
        name.setForeground(Color.black);
         title = new JLabel();
       title.setBounds(0,0,1870,200); 
        title.setOpaque(true);
        inform.setOpaque(true);
        title.setBackground(cd);
        title.setText("Search Paitent :");
        title.setForeground(Color.blue);
        name.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        title.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,100));
        back.setBackground(c);
        back.setBounds(240,480,100,30);
        back.setFocusable(false);
        searcButton = new JButton("Search");
        searcButton.setBackground(c);
        searcButton.setBounds(130,480,100,30);
        searcButton.setFocusable(false);
        namTextField = new JTextField();
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
        this.add(inform);
        this.add(panel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == searcButton)
        {
            String Name = namTextField.getText();
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
                int i = 0;
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    String ex = s.toLowerCase();
                    String s1 = input.nextLine();
                    String s2 = input.nextLine();
                    String s3 = input.nextLine();
                    String s4 = input.nextLine();
                    String s5 = input.nextLine();
                    if(name.equals(ex))
                    {
                        flag = 1;
                       String Text ="<html>Name :"+s.toUpperCase()+"<br>Phone :"+s1.toUpperCase()+"<br>Place :"+s2.toUpperCase()+"<br>Ward : "+s3.toUpperCase()+"<br>Unit : "+s4.toUpperCase()+"<br>Admit date : "+s5.toUpperCase()+"</html>";
                    //    lap.setText(Text);
                     /*  System.out.println(s);
                       System.out.println(s1);
                       System.out.println(s2);
                       System.out.println(s3);
                       System.out.println(s4);*/
                       System.out.println(s + " " + i);
                       labels[i].setText(Text);
                       i++;
                    }
                }
                if(flag == 0)
                {
                    labels[3].setText("No Paitent Found 😢");
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
        if(e.getSource() == back)
        {
            this.dispose();
            Ui  frame = new Ui();
        }
    }
    
}
