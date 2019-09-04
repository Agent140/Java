package GUI;

import java.awt.*;
import javax.swing.*;

public class Fenster extends JFrame
{
    private String title;
    private int x;
    private int y;
    private boolean visible;
    JLabel label;
    
    public Fenster(String Fenstertitle,int sizex, int sizey,boolean sichtbar)
    {
        x = sizex;
        y = sizey;
        title = Fenstertitle;
        visible = sichtbar;
        System.out.println("----------create  window propeties-----------\n");
        System.out.println(Fenstertitle +" "+sizex+" "+sizey);
        System.out.println("---------------------------------------------\n");
    }
     public void Fensteron()
    {
        System.out.println("-----------create window----------------------\n");
        System.out.println(x +" "+ y + " "+visible);
        System.out.println("----------------------------------------------\n");
        setTitle(title);
        setLayout(new FlowLayout());
        setSize(x,y);
        setVisible(visible);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void createLb(String nameLb,int xLb, int yLb,int hLb, int wLb)
    {
        label = new JLabel(nameLb);
        label.setBounds(xLb,yLb,hLb,wLb);
        add(label);
    }
}