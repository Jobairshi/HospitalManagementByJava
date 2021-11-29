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
public class blood extends JFrame implements ActionListener {
    JButton searcButton,back,Add;
    JTextField namTextField;
    JLabel inform,title,lap;
    JLabel name;
    JPanel panel = new JPanel();
    JLabel[] label = new JLabel[6];
    blood()
    {
        Color C = new Color(204,255,229);
        Color c = new Color(68,167,196);
        Color cd = new Color(153,204,255);
        Add = new JButton("Add");
        Add.setBounds(60 + 10,480,80,30);
        Add.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,17));
        Add.setFocusable(false);
        Add.setBackground(cd);
        Add.addActionListener(this);
        panel.setLayout(new GridLayout(3,4));
        panel.setBounds(400,180,600,800);
        panel.setBackground(Color.BLACK);
        Color cs = new Color(229,255,204);
        for(int i= 0;i<6;i++)
        {
            label[i] = new JLabel();
           // label[i].setSize(200,200);
            panel.add(label[i]);
            label[i].setBackground(cd);
         //   label[i].setText("AM HERE");
            label[i].setForeground(Color.BLACK);
            label[i].setFont(new Font("serif",Font.BOLD,15));
            label[i].setOpaque(true);
        }
        /*// lap = new JLabel();
        // lap.setBounds(500,442,311,350);
        // lap.setBackground(Color.white);
        // lap.setOpaque(true);
        // lap.setForeground(Color.BLACK);*/
        //lap.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,17));
        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/cc.png");
        inform = new JLabel();
      //  inform.setBounds(400,180,800,800);
        back = new JButton("Back");
      //  inform.setBackground(Color.lightGray);
      //  inform.setIcon(clip);
        name = new  JLabel("Blood Group :");
        name.setBounds(20,300 + 100,100,30);
        name.setOpaque(true);
        name.setBackground(C);
        name.setForeground(Color.black);
         title = new JLabel();
        title.setBounds(0,0,1870,200); 
        title.setOpaque(true);
       // inform.setOpaque(true);
        title.setBackground(C);
        title.setText("Search Blood Group :");
        title.setForeground(Color.blue);
        name.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        title.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,100));
        back.setBackground(cd);
        back.setBounds(260,480,100,30);
        back.setFocusable(false);
        searcButton = new JButton("Search");
        searcButton.setBackground(cd);
        searcButton.setBounds(150 + 10,480,100-10,30);
        searcButton.setFocusable(false);
        namTextField = new JTextField();
        namTextField.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        namTextField.setBounds(115,300 +100,250,30);
        this.setLayout(null);
        this.setSize(1870,1080);
        this.getContentPane().setBackground(C);
        this.setVisible(true);
        this.add(title);
        this.add(namTextField);
        searcButton.addActionListener(this);
        back.addActionListener(this);
        this.add(name);
        this.add(searcButton);
        this.add(back);
       // this.add(lap);
      //  this.add(inform);
        this.add(Add);
        this.add(panel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == searcButton)
        {
            for(int i= 0;i<6;i++)
            {
                label[i].setText("");
            }
            String Bgroup = namTextField.getText();
            FileReader ins = null;
            FileWriter outs = null;
            File inFile = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                ins = new FileReader(inFile);
               File Read = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
               Scanner input = new Scanner(Read);
                int flag = 0;
                int i = 0;
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    String s1 = input.nextLine();
                    String s2 = input.nextLine();
                    String s3 = input.nextLine();
                    if(Bgroup.equals(s1))
                    {
                       flag = 1;
                       String Text ="<html>Name :"+s.toUpperCase()+"<br>Blood Group :"+s1.toUpperCase()+"<br>Phone :"+s2.toUpperCase()+"<br>Place : "+s3.toUpperCase()+"</html>";
                       label[i].setText(Text);
                       i++;
                       if(i >=6)
                       break;
                     /*  System.out.println(s);
                       System.out.println(s1);
                       System.out.println(s2);
                       System.out.println(s3);
                       System.out.println(s4);*/
                       //break;
                    }
                }
                if(flag == 0)
                {
                    label[2].setText("Blood Group Not Available😢");
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
        if(e.getSource() == Add)
        {
            this.dispose();
            AddBLoodUi frame = new AddBLoodUi();
        }
    }
    
}
