import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class ResetButton extends JPanel implements MouseListener{
  Dice dice;
  JLabel picLabel = new JLabel(new ImageIcon(constructImage()));

  public ResetButton (Dice d){
    addMouseListener(this);
    //Dice.addMouseListener(this);
   dice = d;
   add(picLabel);
  }
private Image constructImage() {
  try{
    String f = new File(".").getCanonicalPath();
    System.out.println(f);
    File imageFile = new File(f + "/images/button_reset.png");
    System.out.println(imageFile.toString());
      return new ImageIcon(imageFile.toString()).getImage();
  }catch(Exception e){
return null;
  // }
  // File imageFile = new File("images" + "/button_reset.png");
  // return new ImageIcon(imageFile.toString()).getImage();
}
}

    public void mouseDragged (MouseEvent event) {
    }
    public void mouseReleased (MouseEvent event) {
    }
    public void mousePressed (MouseEvent event) {

    }
    public void mouseEntered (MouseEvent event) {
    }
    public void mouseExited (MouseEvent event) {
    }
    public void mouseClicked (MouseEvent event) {
      System.out.println("rolling!");
      dice.reset();
      dice.roll();
    }
}
  
