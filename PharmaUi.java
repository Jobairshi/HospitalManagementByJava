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
import java.util.function.IntPredicate;
import java.util.prefs.BackingStoreException;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PharmaUi extends JFrame implements ActionListener{
    int a = 0;
    int i = 0;
    JPanel labels = new JPanel();
    JLabel[] label = new JLabel[20];
    JLabel title = new JLabel("Pharmacy Management : ");
    JLabel count = new JLabel();
    JButton Buy = new JButton("Buy");
    JTextField MedField = new JTextField();
    JLabel MedLabel = new JLabel("Medicine Name : ");
    JTextField quantity = new JTextField();
    JButton  back = new JButton("Back");
    JLabel quLabel = new JLabel("Quantity : ");
    JButton Add = new JButton("Add");
    PharmaUi()
    {
        quLabel.setBounds(20,370,140,30);
        quLabel.setOpaque(true);
        quantity.setBounds(130,370,250 + 50,30);
        Color cd = new Color(153,204,255);
        Color c = new Color(68,167,196);
        Add.setBackground(c);
        Add.addActionListener(this);
        Add.setFocusable(false);
        Add.setBounds(250,410,80,30);
        back.setBounds(250 + 100,350 + 60,80,30);
        back.setFocusable(false);
        back.addActionListener(this);
        back.setBackground(c);
        Buy.setBackground(c);
        Buy.setBounds(130,350 + 60,100,30);
        Buy.setFocusable(false);
        Buy.addActionListener(this);
        MedLabel.setBounds(20,300,100,30);
        MedLabel.setOpaque(true);
        MedField.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        MedField.setBounds(121,300,250 + 50,30);
        MedField.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1870,1080);
        this.getContentPane().setBackground(cd);
        this.setLayout(null);
        this.setVisible(true);
        labels.setLayout(new GridLayout(10,1));
        labels.setBounds(870,0,1000,1070);
        labels.setBackground(Color.BLACK);
        Color css = new Color(204,229,255);
        for(int i= 0;i<20;i++)
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
            File inFile = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                ins = new FileReader(inFile);
                File read = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
               File Read = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
               Scanner input = new Scanner(Read);
               Scanner inputs = new Scanner(read); 
               while(input.hasNext())
               {
                   String s = input.nextLine();
                   String s1 = input.nextLine();
                String Text ="<html>Medicine name :"+s.toUpperCase()+"<br>Quantity :"+s1.toUpperCase()+"</html>";
                   label[i].setText(Text);
                   i++;
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
            this.add(count);
            this.add(MedField);
            this.add(MedLabel);
            this.add(Buy);
            this.add(back);
            this.add(quantity);
            this.add(quLabel);
            this.add(Add);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == Buy)
        {
            ArrayList < String > names = new ArrayList<String>();
            ArrayList < Integer > quan = new ArrayList<Integer>();
            String medName = MedField.getText();
            String Quan = quantity.getText();
            FileReader ins = null;
            FileWriter outs = null;
            File inFile = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                ins = new FileReader(inFile);
               File Read = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
               Scanner input = new Scanner(Read);
                int flag = 0;
                String type = new String();
                while(input.hasNext()) // to read the file
                {
                    String s = input.nextLine();
                    String s1 = input.nextLine();
                    String ac = medName.toLowerCase();
                    String ab = s.toLowerCase();
                    int a = Integer.valueOf(s1);
                    System.out.println(ac + "   " + ab + "  " + ac.equals(ab));
                    if(ac.equals(ab))
                    {
                        int b = Integer.valueOf(Quan);
                       a -= b; 
                       System.out.println("beeep beep!!");
                       flag = 1;
                       /*System.out.println(s1);
                       System.out.println(s2);
                       System.out.println(s3);
                       System.out.println(s4);*/
                       //continue;
                    }
                       // System.out.println("sd");
                       if(a > 0){
                        names.add(s);
                        quan.add(a);
                       }
                }
                for(int i =0 ;i<names.size();i++)
                {
                    System.out.println(names.get(i));
                    System.out.println(quan.get(i));
                }
                if(flag == 1)
                {
                    outs = new FileWriter(outFile,false);
                    outs.flush();
                    outs.close();
                    outs = new FileWriter(outFile,true);
                    for(int i =0 ;i<names.size();i++)
                    {
                        String s = names.get(i);
                        int a = quan.get(i);
                        String s1 = Integer.toString(a);
                     String Text ="<html>Medicine name :"+s.toUpperCase()+"<br>Quantity :"+s1.toUpperCase()+"</html>";
                        label[i].setText(Text);
                        outs.write(names.get(i) + '\n');
                        int b = quan.get(i);
                        String s2 = Integer.toString(b);
                        outs.write( s2 + '\n');
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
         //   Buy.setEnabled(false);
        }
        if(e.getSource() == back)
        {
            this.dispose();
            Ui frame = new Ui();
        }
        if(e.getSource() == Add)
        {
            this.dispose();
            AddMedUi frame = new AddMedUi();
        }
    }
    
}
