import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class Face extends JPanel implements MouseListener {
  String base = System.getProperty("user.dir") +"/faces/dice-six-faces_";
  //  System.out.println("base ="+ base);
  int side = -1;
  boolean keep = false;
  JLabel picLabel;
  public Face() {
    System.out.println(base);
    addMouseListener(this);
    this.setSize(112, 112);
    picLabel = new JLabel(new ImageIcon(constructImage(base + side + this.kept()+".png")));
    add(picLabel);
  }
private String kept(){
  if (keep){
    return "false";
  }
  return "true";

}
  private Image constructImage(String fileName) {
    // get image
    System.out.println(fileName);
    File imageFile = new File(fileName);
    return new ImageIcon(imageFile.toString()).getImage();

  }

  public void switchSide(int num) {
    side = num;
    System.out.println(side);
  }

  public void update() {
    // System.out.println(base + side);
    //g.drawImage(constructImage(base + side + ".png"), x, 0, 112, 112, null);
    picLabel.setIcon(new ImageIcon(constructImage(base + side + this.kept() +".png")));
    System.out.println(base + side + this.kept() +".png");
    
  }
//poop pee hahaha

  // flips keep
  public void switchKeep() {
    keep = !keep;
    this.update();
  }

  // sets keep to input
  public void switchKeep(boolean in) {
    keep = in;
    this.update();
  }

  public int getSide() {
    return side;
  }

  public void mouseDragged(MouseEvent event) {
  }

  public void mouseReleased(MouseEvent event) {
  }

  public void mousePressed(MouseEvent event) {

  }

  public void mouseEntered(MouseEvent event) {
  }

  public void mouseExited(MouseEvent event) {
  }

  public void mouseClicked(MouseEvent event) {
    this.switchKeep();
    if(keep){
      System.out.println("keeping");
    }
    else{
      System.out.println("not keeping");
    }
  }
}
