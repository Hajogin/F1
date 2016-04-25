package ru.java2e;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Road extends JPanel {

Image img = new ImageIcon ("res/ground.jpg").getImage();

public void paint (Graphics g) {
g = (Graphics2D) g;
    g.drawImage (img, 0, 0, null);





}

}

