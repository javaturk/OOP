/*
 * BlockCanvas.java
 */

package org.javaturk.oop.ch03.unicode;

import java.awt.*;

public class BlockCanvas extends Canvas {
    private CharacterBlock block = CharacterBlock.getBlock("Basic Latin");
    
    private int charWidth = 20;
    private int charHeight = 15;
    private int hgap = 5;
    private int vgap = 0;
    
    public BlockCanvas() {
        setFont(new Font("Monospaced", Font.BOLD, 12));
    }
    
    public void setBlock(CharacterBlock block) {
        this.block = block;
        this.repaint();
    }
    
    public CharacterBlock getBlock() {
        return block;
    }
    
    public void paint(Graphics g) {
        char[] charsOnPage = block.getCharactersInBlock();
        int charsPerRow = (getSize().width - 2*hgap)/charWidth;
        if (charsPerRow <= 0) charsPerRow = 1;
        
        for (int i = 0; i < charsOnPage.length; i++) {
            int x = i % charsPerRow;
            int y = i / charsPerRow + 1;
            g.drawChars(charsOnPage, i, 1, hgap + charWidth*x, vgap + charHeight*y);
        }
    }
}

