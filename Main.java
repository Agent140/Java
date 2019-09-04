//package GUI;
import GUI.Fenster;
import javax.swing.*;
import java.awt.*;
public class Main
{
   public static void main(String [] args)
   {
       Fenster window = new Fenster("Test",400,800,true);
       //JLabel label = new JLabel("Cool");
       
       
       //label.setBounds(0,0,100,200);
       //window.add(label);
       window.createLb("Test",0,0,0,0);
       //window.createLb("World",0,10,10,20);
       window.Fensteron();
       
   }
}