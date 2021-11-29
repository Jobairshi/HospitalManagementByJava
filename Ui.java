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

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ui extends JFrame implements ActionListener {
    static class  roundButton extends JButton {
        public  roundButton(String label) {
          super(label);
          Dimension size = new Dimension(50,50);
          size.width = size.height = Math.max(size.width,size.height);
          setPreferredSize(size);
      
          setContentAreaFilled(false);
        }
      
        protected void paintComponent(Graphics g) {
          if (getModel().isArmed()) {
            g.setColor(Color.WHITE);
          } else {
            g.setColor(getBackground());
          }
          g.fillOval(0, 0, getSize().width-1,getSize().height-1);
      
          super.paintComponent(g);
        }
      
        protected void paintBorder(Graphics g) {
          g.setColor(getForeground());
          g.drawOval(0, 0, getSize().width-1,     getSize().height-1);
        }
      
        Shape shape;
        public boolean contains(int x, int y) {
          if (shape == null || 
            !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
          }
          return shape.contains(x, y);
        }
    }
    JButton butt1; // reg
    JButton butt2; // mngmetn
    // JButton butt3; // emr
    JButton butt4; // search pait
    JButton butt5;  // pahra
    JButton butt6; // crona
    JButton butt7; // blood
    JButton butt8; // dischare
    JButton butt9; // mabulance
    JLabel label;
    JLabel label1;
    JLabel label2;
   // JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    Ui()
    {
      Color cd = new Color(153,204,255);
      this.setTitle("..");
      ImageIcon hosp = new ImageIcon("C:/Users/USER/Pictures/hosp.png");
        JLabel labelp = new JLabel();
        Color c = new Color(170,25,79);
        Color cs = new Color(68,167,196);
        labelp.setBounds(380,0,360,200);
        labelp.setOpaque(true);
        labelp.setIcon(hosp);
        labelp.setBackground(cd);
        this.add(labelp);
        label = new JLabel("                              .. HOSPITAL");
        label.setBounds(0,20,1870,200);  
        label.setBackground(cd);
        label.setForeground(c);
        label.setOpaque(true);
        label.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,100));
        this.add(label);
        butt1 = new roundButton("");
        ImageIcon clip = new ImageIcon("C:/Users/USER/Pictures/clip2.png");
        label1 = new JLabel("<html>Paitent<br>Registration</html>");
        label1.setOpaque(true);
        label1.setBackground(cd);
        label1.setBounds(120,275 + 100,100,35);
        label1.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        label1.setForeground(Color.BLACK);
        butt1.setBounds(100,200 + 100,100,70);
        butt1.setIcon(clip);
        //butt1.setIcon(defaultIcon);
        butt1.setFocusable(false);
        butt1.setBackground(cs);
        label2 = new JLabel("<html>Clinical<br>Management</html>");
        label2.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt2 = new roundButton("");
        label2.setOpaque(true);
        ImageIcon hos = new ImageIcon("C:/Users/USER/Pictures/hos.png");
        label2.setForeground(Color.BLACK);
        label2.setBackground(cd);
        label2.setBounds(420,275 + 100,100,35);
        butt2.setBounds(400,200 + 100,100,70);
        butt2.setBackground(cs);
        butt2.setIcon(hos);
        butt2.setFocusable(false);

        // label3 = new JLabel("<html>Emergency<br>Ward</html>");
        // label3.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        // butt3 = new roundButton("");
        // label3.setOpaque(true);
        // ImageIcon emer = new ImageIcon("C:/Users/USER/Pictures/emer.png");
        // label3.setForeground(Color.BLACK);
        // label3.setBackground(Color.lightGray);
        // label3.setBounds(720,275 + 100,100,35);
        // butt3.setBounds(700,200 + 100,100,70);
        // butt3.setBackground(cs);
        // butt3.setIcon(emer);
        // butt3.setFocusable(false);

        label4 = new JLabel("<html>Search<br>Paitent</html>");
        label4.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt4 = new roundButton("");
        label4.setOpaque(true);
        ImageIcon ot = new ImageIcon("C:/Users/USER/Pictures/ot.png");
        label4.setForeground(Color.BLACK);
        label4.setBackground(cd);
        label4.setBounds(1020,275 + 100,100,35);
        butt4.setBounds(1000,200 + 100,100,70);
        butt4.setBackground(cs);
        butt4.setIcon(ot);
        butt4.setFocusable(false);

        label5 = new JLabel("Pharmacy");
        label5.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt5 = new roundButton("");
        label5.setOpaque(true);
        ImageIcon bill = new ImageIcon("C:/Users/USER/Pictures/par.png");
        label5.setForeground(Color.BLACK);
        label5.setBackground(cd);
        label5.setBounds(1318,275 + 100,100,35);
        butt5.setBounds(1300,200 + 100,100,70);
        butt5.setBackground(cs);
        butt5.setIcon(bill);
        butt5.setFocusable(false);

        label6 = new JLabel("<html>Lab<br>Management</html>");
        label6.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt6 = new roundButton("");
        label6.setOpaque(true);
        ImageIcon cor = new ImageIcon("C:/Users/USER/Pictures/lab.png");
        label6.setForeground(Color.BLACK);
        label6.setBackground(cd);
        label6.setBounds(1610,275 + 100,100,35);
        butt6.setBounds(1600,200 + 100,100,70);
        butt6.setBackground(cs);
        butt6.setIcon(cor);
        butt6.setFocusable(false);

        label7 = new JLabel("<html>Blood<br>Bank</html>");
        label7.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt7 = new roundButton("");
        label7.setOpaque(true);
        ImageIcon bld = new ImageIcon("C:/Users/USER/Pictures/bld.png");
        label7.setForeground(Color.BLACK);
        label7.setBackground(cd);
        label7.setBounds(120,475 + 100,100,35);
        butt7.setBounds(100,400 + 100,100,70);
        butt7.setBackground(cs);
        butt7.setIcon(bld);
        butt7.setFocusable(false);

        label8 = new JLabel("Discharge");
        label8.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt8 = new roundButton("");
        label8.setOpaque(true);
        ImageIcon dis = new ImageIcon("C:/Users/USER/Pictures/dis.png");
        label8.setForeground(Color.BLACK);
        label8.setBackground(cd);
        label8.setBounds(720,275 + 100,100,35);
        butt8.setBounds(700,200 + 100,100,70);
        butt8.setBackground(cs);
        butt8.setIcon(dis);
        butt8.setFocusable(false);

        label9 = new JLabel("Ambulance");
        label9.setFont (new java.awt.Font("Serif", java.awt.Font.BOLD,15));
        butt9 = new roundButton("");
        label9.setOpaque(true);
        ImageIcon amb = new ImageIcon("C:/Users/USER/Pictures/amb.png");
        label9.setForeground(Color.BLACK);
        label9.setBackground(cd);
        label9.setBounds(420,475 + 100,100,35);
        butt9.setBounds(400,500,100,70);
        butt9.setBackground(cs);
        butt9.setIcon(amb);
        butt9.setFocusable(false);
        this.add(label9);
        this.add(butt9);
        this.add(label8);
        this.add(butt8);
        this.add(label7);
        this.add(butt7);
        this.add(label6);
        this.add(butt6);
        this.add(label5);
        this.add(butt5);
        this.add(label4);
        this.add(butt4);
       // this.add(label3);
      //  this.add(butt3);
        this.add(butt2);
        this.add(label2);
        this.add(label1);
        this.setSize(1870,1080);
        butt1.addActionListener(this);
        butt2.addActionListener(this);
      //  butt3.addActionListener(this);
        butt4.addActionListener(this);
        butt5.addActionListener(this);
        butt6.addActionListener(this);
        butt7.addActionListener(this);
        butt8.addActionListener(this);
        butt9.addActionListener(this);
        butt9.setIconTextGap(-15);
        this.add(butt1);
        this.getContentPane().setBackground(cd);
        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == butt1)
        {
          this.dispose();
          paitent_ui frame = new paitent_ui();
        }
        if(e.getSource() ==  butt4)
        {
          this.dispose();
          searchUI frame = new searchUI();
        }
        if(e.getSource() == butt7)
        {
          this.dispose();
          blood frame = new blood();
        }
        if(e.getSource() == butt8)
        {
          this.dispose();
          discharge frame = new discharge();
        }
        if(e.getSource()== butt9)
        {
          this.dispose();
          AmbulanceUi frame = new AmbulanceUi();
        }
        if(e.getSource() == butt5)
        {
          this.dispose();
          PharmaUi frame = new PharmaUi();
        }
        if(e.getSource() == butt2)
        {
          this.dispose();
          ClinicalUi frame = new ClinicalUi();
        }
        if(e.getSource() == butt6)
        {
          this.dispose();
          LabUi frame = new LabUi();
        }
    }
    
}
