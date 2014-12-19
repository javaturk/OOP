/*
 * DBFrame1.java
 *
 * Created on 18 Temmuz 2002 Per�embe, 14:57
 */

package org.javaturk.oop.ch03.unicode;

import java.util.*;

public class CharacterBlock {
    private String name;
    private int start;
    private int end;
    private static Hashtable blocks = new Hashtable(66);
    
  /* The blocks given here are as listed in The Unicode Standard,
     Version 2.0. Ranges are given in hexadecimal as in that
     document. It is not difficult to add additional blocks to this
     list as they're defined.
   */
    static {
        
        // General Scripts
        
        makeBlock("Basic Latin", 0x0000, 0x007F);
        makeBlock("Latin-1 Supplement", 0x0080, 0x00FF);
        makeBlock("Latin Extended-A", 0x0100, 0x017F);
        makeBlock("Latin Extended-B", 0x0180, 0x024F);
        makeBlock("IPA Extensions", 0x0250, 0x02AF);
        makeBlock("Spacing Modifier Letters", 0x02B0, 0x02FF);
        makeBlock("Combining Diacritical Marks", 0x0300, 0x036F);
        makeBlock("Greek", 0x0370, 0x03FF);
        makeBlock("Cyrillic", 0x0400, 0x04FF);
        makeBlock("Armenian", 0x0530, 0x058F);
        makeBlock("Hebrew", 0x0590, 0x05FF);
        makeBlock("Arabic", 0x0600, 0x06FF);
        makeBlock("Devanagari", 0x0900, 0x097F);
        makeBlock("Bengali", 0x0980, 0x09FF);
        makeBlock("Gurmukhi", 0x0A00, 0x0A7F);
        makeBlock("Gujarati", 0x0A80, 0x0AFF);
        makeBlock("Oriya", 0x0B00, 0x0B7F);
        makeBlock("Tamil", 0x0B80, 0x0BFF);
        makeBlock("Telugu", 0x0C00, 0x0C7F);
        makeBlock("Kannada", 0x0C80, 0x0CFF);
        makeBlock("Malayalam", 0x0D00, 0x0D7F);
        makeBlock("Thai", 0x0E00, 0x0E7F);
        makeBlock("Lao", 0x0E80, 0x0EFF);
        makeBlock("Tibetan", 0x0F00, 0x0FBF);
        makeBlock("Georgian", 0x10A0, 0x10FF);
        makeBlock("Hangul Jamo", 0x1100, 0x11FF);
        makeBlock("Latin Extended Additional", 0x1E00, 0x1EFF);
        makeBlock("Greek Extended", 0x1F00, 0x1FFF);
        
        // Symbols
        makeBlock("General Punctuation", 0x2000, 0x206F);
        makeBlock("Superscripts and Subscripts", 0x2070, 0x209F);
        makeBlock("Currency Symbols", 0x20A0, 0x20CF);
        makeBlock("Combining Marks for Symbols", 0x20D0, 0x20FF);
        makeBlock("Letterlike Symbols", 0x2100, 0x214F);
        makeBlock("Number Forms", 0x2150, 0x218F);
        makeBlock("Arrows", 0x2190, 0x21FF);
        makeBlock("Mathematical Operators", 0x2200, 0x22FF);
        makeBlock("Miscellaneous Technical", 0x2300, 0x234F);
        makeBlock("Control Pictures", 0x2400, 0x243F);
        makeBlock("Optical Character Recognition", 0x2440, 0x245F);
        makeBlock("Enclosed Alphanumerics", 0x2460, 0x24FF);
        makeBlock("Box Drawing", 0x2500, 0x257F);
        makeBlock("Block Elements", 0x2580, 0x259F);
        makeBlock("Geometric Shapes", 0x25A0, 0x25FF);
        makeBlock("Miscellaneous Symbols", 0x2600, 0x26FF);
        makeBlock("Dingbats", 0x2700, 0x27BF);
        
        // Chinese-Japanese-Korean Phonetics and Symbols
        makeBlock("CJK Symbols and Punctuation", 0x3000, 0x303F);
        makeBlock("Hiragana", 0x3040, 0x309F);
        makeBlock("Katakana", 0x30A0, 0x30FF);
        makeBlock("Bopomofo", 0x3100, 0x312F);
        makeBlock("Hangul Compatibility Jamo", 0x3130, 0x318F);
        makeBlock("Kanbun", 0x3190, 0x319F);
        makeBlock("Enclosed CJK Letters and Months", 0x3200, 0x32FF);
        makeBlock("CJK Compatibility", 0x3300, 0x33FF);
        
        // Chinese-Japanese-Korean Ideographs
        makeBlock("CJK Unified Ideographs", 0x4E00, 0x9FFF);
        
        // Hangul Syllables
        makeBlock("Hangul Syllables", 0xAC00, 0xD7A3);
        
        // Surrogates
        makeBlock("Surrogates", 0xD800, 0xDFFF);
        
        // Private Use
        makeBlock("Private Use", 0xE000, 0xF8FF);
        
        // Compatibility and Specials
        makeBlock("CJK Compatibility Ideographs", 0xF900, 0xFAFF);
        makeBlock("Alphabetic Presentation Forms", 0xFB00, 0xFB4F);
        makeBlock("Arabic Presentation Forms", 0xFB50, 0xFDFF);
        makeBlock("Combining Half Marks", 0xFE20, 0xFE2F);
        makeBlock("CJK Compatibility Forms", 0xFE30, 0xFE4F);
        makeBlock("Small Form Variants", 0xFE50, 0xFE6F);
        makeBlock("More Arabic Presentation Forms", 0xFE70, 0xFEFF);
        makeBlock("Halfwidth and Fullwidth Forms", 0xFF00, 0xFFEF);
        makeBlock("Specials", 0xFEFF, 0xFFFF);        
    }
    
  /* Originally I inlined this method from the static block where it's invoked.
     However, that produced excessively long lines in the static block that
     wouldn't look good in the printed book. So I split out this common
     invocation here. Since it's final, a good compiler can optimize it away
     anyway.
   */
    private final static void makeBlock(String name, int start, int end) {
        blocks.put(name, new CharacterBlock(name, start, end));
    }
    
    private CharacterBlock(String name, int start, int end) {
        this.name = name;
        if (start < Character.MIN_VALUE || start > Character.MAX_VALUE
        || end < Character.MIN_VALUE || end > Character.MAX_VALUE) {
            throw new IllegalArgumentException("Ranges must fall between 0 and 65,535");
        }
        if (end < start) {
            throw new IllegalArgumentException("End must come after start");
        }
        this.start = start;
        this.end = end;
    }
    
    public static CharacterBlock getBlock(String name) {
        return (CharacterBlock) blocks.get(name);
    }
    
    public static int getNumBlocks() {
        return blocks.size();
    }
    
    public static String[] getBlockNames() {
        CharacterBlock[] cb = new CharacterBlock[blocks.size()];
        Enumeration e = blocks.elements();
        for (int i = 0; e.hasMoreElements(); i++) {
            cb[i] = ((CharacterBlock) e.nextElement());
        }
        // bubble sort based on start
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < cb.length-1; i++) {
                if (cb[i].start > cb[i+1].start) {
                    sorted = false;
                    CharacterBlock temp = cb[i+1];
                    cb[i+1] = cb[i];
                    cb[i] = temp;
                }
            }
        }
        String[] names = new String[blocks.size()];
        for (int i = 0; i < names.length; i++) names[i] = cb[i].name;
        return names;
    }
    
    public char[] getCharactersInBlock() {
        char[] block = new char[end-start+1];
        int j = 0;
        for (int i = start; i <= end; i++) {
            if (Character.isDefined((char) i)) {
                block[j++] = (char) i;
            }
        }
        char[] result = new char[j];
        System.arraycopy(block, 0, result, 0, j);
        return result;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getStart() {
        return this.start;
    }
    
    public int getEnd() {
        return this.end;
    }
}

