// Hri...
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;


import java.awt.geom.*;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    /*static class  roundButton extends JButton {
        public  roundButton(String label) {
          super(label);
          Dimension size = getPreferredSize();
          size.width = size.height = Math.max(size.width,size.height);
          setPreferredSize(size);
      
          setContentAreaFilled(false);
        }
      
        protected void paintComponent(Graphics g) {
          if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
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
    }*/
    public static void main(String[] args)
    {
        Ui frame = new Ui();
     /* //   JFrame frame = new JFrame();
      //   JButton button = new roundButton("jesan");
      //   JLabel label = new JLabel();
      //   label.setSize(100,100);
      //   label.setOpaque(true);
      //   label.add(button);
      //   label.setBackground(Color.CYAN);
      //   button.setForeground(Color.CYAN);
      //   button.setFocusable(false);
      //   button.setFont (new java.awt.Font("MV Boli", java.awt.Font.ITALIC, 15));
      //   frame.setSize(500,500);;
      //   button.setBounds(20,20,100,100);
      //  // button.setBorder(new RoundedBorder(10));
      //   button.setBackground(Color.BLACK);
      //   //button.setFont (new java.awt.Font("MV Boli", java.awt.Font.ITALIC, 22));
      //   //frame.add(label);
      //   frame.add(button);
      //   frame.setVisible(true);
      //   frame.setLayout(null);*/
    }
}
