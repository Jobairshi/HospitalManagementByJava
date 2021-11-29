import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class AddMedUi extends JFrame implements ActionListener  {
    JButton button;
    JRadioButton normal,emer,corona;
    JLabel label,MedName,MedLabel;
    JTextField medField,quantity;
    JLabel lab;
    JButton back;
    AddMedUi()
    {
        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/med.png");
        lab = new JLabel();
        back = new JButton("Back");
        back.addActionListener(this);
        lab.setBounds(500,300,600,600);
        lab.setBackground(Color.LIGHT_GRAY);
        lab.setOpaque(true);
        lab.setIcon(clip);
        MedName = new JLabel("Medicine Name :");
        MedLabel = new JLabel("Quantity :");
        MedName.setBounds(20,300 + 100,100,30);
        MedLabel.setBounds(20,350 + 100,100,30);
        label = new JLabel("Enter Medicine Info:");
        medField = new JTextField();
        quantity = new JTextField();
      //  normal.setBounds(70,600,30,30);
        medField.setBounds(110,350 + 100,200,30);
        quantity.setBounds(120,300 +100,200,30);
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
        this.add(MedName);
        MedName.setOpaque(true);
        this.add(MedName);
        this.add(medField);
        MedLabel.setOpaque(true);
        this.add(MedLabel);
        this.add(quantity);
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
        //arrli.get(i) to get the elements
        if(e.getSource() == button)
        {
            String Name = "",blood = "",quan = "";
            //name,phone,place,room,type;
            Name = medField.getText();
            quan = quantity.getText();
            names.add(Name);
            bloods.add(quan);
           //FileReader ins = null;
            FileWriter outs = null;
           // File inFile = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
            File outFile = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
            try
            {
                outs = new FileWriter(outFile,true); // passed true for append mode
                //ins = new FileReader(inFile);
               File Read = new File("C:/Users/USER/Desktop/hospital management/medicine info.txt");
               Scanner input = new Scanner(Read);
               System.out.println(quan);
               System.out.println(Name);
                outs.write(quan + '\n');
                outs.write(Name + '\n');
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
         //       button.setEnabled(false);
            
        }
        if(e.getSource() == back)
        {
            this.dispose();
            PharmaUi frame = new PharmaUi();
        }
    }
    
}
