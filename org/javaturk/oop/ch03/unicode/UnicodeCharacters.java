/*
 * UnicodeCharacters.java
 */

package org.javaturk.oop.ch03.unicode;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UnicodeCharacters extends JFrame implements ItemListener {
    private static final int width = 400;
    private static final int height = 500;
    private List scripts = new List(CharacterBlock.getNumBlocks());
    private BlockCanvas theChart = new BlockCanvas();
    
    public UnicodeCharacters() {
        setSize(width, height);
        setTitle("Unicode Characters");
        
        Container root = getContentPane();
        root.setLayout(new BorderLayout());
        String[] names = CharacterBlock.getBlockNames();
        for (int i = 0; i < names.length; i++) {
            scripts.add(names[i]);
        }
        scripts.addItemListener(this);
        scripts.select(0);
        root.add("West", scripts);
        root.add("Center", theChart);
    }
    
    public static void main(String[] args){
        UnicodeCharacters frame = new UnicodeCharacters();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.show();
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
