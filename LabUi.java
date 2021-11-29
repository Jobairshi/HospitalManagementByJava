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
import javax.swing.JPopupMenu.Separator;
import javax.swing.plaf.FontUIResource;
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
import java.text.SimpleDateFormat;
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
public class LabUi extends JFrame implements ActionListener{
    JLabel title = new JLabel("Hospital Lab : ");
    JLabel info = new JLabel("Enter Test Info :");
    JTextField name,Age;
    JLabel ageLabel = new JLabel("Paitent's Age : ");
    JLabel nameLabel = new JLabel("Paitent's Name : ");
    JCheckBox[] Sex = new JCheckBox[3];
    JPanel sexPanel = new JPanel();
    JLabel sexLabel = new JLabel("Paitent's Sex : ");
    JCheckBox[] Services = new JCheckBox[10];
    JPanel serPanel = new JPanel();
    JLabel serLabel = new JLabel("Select Test Name : ");
    JDateChooser Date = new JDateChooser();
    Color cd = new Color(153,204,255);
    JLabel dateLabel = new JLabel("Reporting Date : ");
    JDateChooser dateCos = new JDateChooser();
    JButton submit  = new JButton("Submit");
    JButton Back = new JButton("Back");
    JLabel logo = new JLabel();
    JTextField searchField = new JTextField();
    JButton Search = new JButton("Search");
    JLabel search = new JLabel("Enter Name : ");
    JLabel searchTitle = new JLabel("Enter Name to Search : ");
    LabUi()
    {
        // searchTitle.setBackground(cd);
        // searchTitle.setBounds(0,900-90,400,60);
        // searchTitle.setOpaque(true);
        // searchTitle.setFont(new Font("serif",Font.BOLD,35));

        // search.setBounds(20,860 +40,100,30);
        // search.setBackground(cd);
        // search.setOpaque(true);
        // search.setFont(new Font("serif",Font.BOLD,15));

        // searchField.setBounds(130,860 + 40,250,30);
        // searchField.setFont(new Font("serif",Font.BOLD,15));
        
        Search.setBounds(470,750,80,30);
        Search.setFont(new Font("serif",Font.BOLD,15));
        Search.addActionListener(this);
        Search.setFocusable(false);

        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/labb.png");
        logo.setBounds(870,300,600,600);
        logo.setBackground(cd);
        logo.setOpaque(true);
        logo.setIcon(clip);

        submit.setBounds(350,750,100,30);
        submit.setFont(new Font("serif",Font.BOLD,15));
        submit.addActionListener(this);
        submit.setFocusable(false);

        Back.setBounds(570,750,80,30);
        Back.setFont(new Font("serif",Font.BOLD,15));
        Back.addActionListener(this);
        Back.setFocusable(false);

        dateLabel.setBackground(cd);
        dateLabel.setBounds(20,800-50,130,30);
        dateLabel.setFont(new Font("serif",Font.BOLD,15));
        dateLabel.setOpaque(true);

        dateCos.setBounds(135, 800-50,150,30);;
        dateCos.getComponent(0).setSize(100,30);; //Jbuton
        dateCos.getComponent(1).setSize(50,40);;//JFormattedTextField
        dateCos.setDateFormatString("dd-MM-yyyy");
        dateCos.getComponent(1).setForeground(Color.BLACK);
        dateCos.getComponent(1).setFont(new Font("serif",Font.BOLD,15));


        serPanel.setBounds(130 + 20 + 20,500 -20-50,550 + 30 + 40,300);
        serPanel.setLayout(new GridLayout(3,3));
        serPanel.setBackground(cd);
        serLabel.setBounds(20,500 + 15-50,130,30);
        serLabel.setOpaque(true);
        serLabel.setBackground(cd);
        serLabel.setFont(new Font("serif",Font.BOLD,15));

        for(int i= 0;i<10;i++)
        {
            Services[i] = new JCheckBox();
            Services[i].setBackground(cd);
            Services[i].setFont(new Font("serif",Font.BOLD,15));
            serPanel.add(Services[i]);
        }

        Services[0].setText("Digital X-Ray");
        Services[1].setText("3D Channel ECG");
        Services[2].setText("Pathoogy");
        Services[3].setText("Hormonal Assay");
        Services[4].setText("FNAC");
        Services[5].setText("Serology");
        Services[6].setText("Colour USC");
        Services[7].setText("CT Scan");
        Services[8].setText("MRI");
        Services[9].setText("Endoscopy");

        sexLabel.setBounds(20,450-50,130,30);
        sexLabel.setOpaque(true);
        sexLabel.setBackground(cd);
        sexLabel.setFont(new Font("serif",Font.BOLD,15)); 

        ageLabel.setBounds(20,400-50,130,30);
        ageLabel.setOpaque(true);
        ageLabel.setBackground(cd);
        ageLabel.setFont(new Font("serif",Font.BOLD,15));
        nameLabel.setBounds(20,350-50,130,30);
        nameLabel.setOpaque(true);
        nameLabel.setBackground(cd);
        nameLabel.setFont(new Font("serif",Font.BOLD,15));
        name = new JTextField();
        name.setFont(new Font("serif",Font.BOLD,15));
        name.setBounds(100 + 30,350-50,250,30);
        Age = new JTextField();
        Age.setFont(new Font("serif",Font.BOLD,15));
        Age.setBounds(130,400-50,250,30);
        sexPanel.setLayout(new GridLayout(1,3));
        sexPanel.setBounds(130,450-50,300,30);
        for(int i= 0;i<3;i++)
        {
            Sex[i] = new JCheckBox();
            if(i == 0)
            Sex[0].setText("Male");
            if(i == 1)
            Sex[1].setText("Female");
            if(i == 2)
            Sex[2].setText("Other");
            Sex[i].setBackground(cd);
            Sex[i].setFont(new Font("serif",Font.BOLD,15));
            sexPanel.add(Sex[i]);
        }
        
        info.setBounds(0,200,400,50);
        info.setFont(new Font("serif",Font.BOLD,50));
        info.setBackground(cd);
        info.setOpaque(true);
        title.setBounds(0,0,1870,100);
        title.setFont (new Font("Serif",Font.BOLD,100));
        title.setBackground(cd);
        title.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1870,1080);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(cd);
        this.add(title);
        this.add(info);
        this.add(sexPanel);
        this.add(name);
        this.add(nameLabel);
        this.add(Age);
        this.add(ageLabel);
        this.add(sexLabel);
        this.add(serPanel);
        this.add(serLabel);
        this.add(dateCos);
        this.add(dateLabel);
        this.add(submit);
        this.add(Back);
        this.add(logo);
        // this.add(searchField);
         this.add(Search);
        // this.add(search);
        // this.add(searchTitle);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == submit)
        {
            String Name = "",age = "",sex = "",tests = "",date = "";
            FileWriter outs = null;
            Name =  name.getText();
            age = Age.getText();
            for(int i= 0;i<3;i++)
            {
                if(Sex[i].isSelected() == true)
                {
                    sex = Sex[i].getText();
                    break;
                }
            }
            for(int i= 0;i<10;i++)
            {
                if(Services[i].isSelected() == true)
                {
                    tests += (Services[i].getText() + " , ");
                }
            }
            Date d = dateCos.getDate();
            date = d.toString();
            // File inFile = new File("C:/Users/USER/Desktop/hospital management/Bloodinfo.txt");
             File outFile = new File("C:/Users/USER/Desktop/hospital management/Labinfo.txt");
             try
             {
                 outs = new FileWriter(outFile,true); // passed true for append mode
                 //ins = new FileReader(inFile);
                File Read = new File("C:/Users/USER/Desktop/hospital management/Labinfo.txt");
                Scanner input = new Scanner(Read);
                 outs.write(Name + '\n');
                 outs.write(age + '\n');
                 outs.write(sex + '\n');
                 outs.write(tests + '\n');
                 outs.write(date + "\n");
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
        if(e.getSource() == Back)
        {
            this.dispose();
            Ui frame = new Ui();
        }
        if(e.getSource()== Search)
        {
            this.dispose();
            SearchLabUi frame = new SearchLabUi();
        }
    }
    
}
