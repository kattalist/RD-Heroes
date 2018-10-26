/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdheroes;

import java.awt.*;
/**
 *
 * @author 073787251
 */
public class Slot {
    public int x, y;
    Slot (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void display(Graphics g, Color c) {
        g.setColor(c);
        g.fillRect(x,y,80,120);
    }
}
