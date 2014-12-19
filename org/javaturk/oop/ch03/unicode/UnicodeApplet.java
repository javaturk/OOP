/*
 * UnicodeApplet.java
 */

package org.javaturk.oop.ch03.unicode;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class UnicodeApplet extends Applet implements ItemListener {
    List scripts = new List(CharacterBlock.getNumBlocks());
    BlockCanvas theChart = new BlockCanvas();
    
    public void init() {
        setLayout(new BorderLayout());
        String[] names = CharacterBlock.getBlockNames();
        for (int i = 0; i < names.length; i++) {
            scripts.add(names[i]);
        }
        scripts.addItemListener(this);
        scripts.select(0);
        this.add("West", scripts);
        this.add("Center", theChart);
    }
    
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) {
            String selected = scripts.getSelectedItem();
            if (!selected.equals(theChart.getBlock().getName())) {
                theChart.setBlock(CharacterBlock.getBlock(selected));
            }
        }
    }
}
