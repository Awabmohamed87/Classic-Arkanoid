package com.company;

import javax.swing.*;
import java.awt.*;

public class Block {
    private int health;
    private Image blockShape[];
    protected Image blockColor;
    protected int px,py;
    protected int carriedPwrupIndex = -1;
    Block(){
        blockShape = new Image[10];
        blockShape[0] = new ImageIcon("").getImage();
        blockShape[1] = new ImageIcon("Data\\Blocks\\DarkBlueBlock.png").getImage();
        blockShape[2] = new ImageIcon("Data\\Blocks\\DarkPinkBlock.png").getImage();
        blockShape[3] = new ImageIcon("Data\\Blocks\\OrangeBlock.png").getImage();
        blockShape[4] = new ImageIcon("Data\\Blocks\\GreenBlock.png").getImage();
        blockShape[5] = new ImageIcon("Data\\Blocks\\GrayBlock.png").getImage();
        blockShape[6] = new ImageIcon("Data\\Blocks\\BlueBlock.png").getImage();
        blockShape[7] = new ImageIcon("Data\\Blocks\\BrawnBlock.png").getImage();
        blockShape[8] = new ImageIcon("Data\\Blocks\\PinkBlock.png").getImage();
        blockShape[9] = new ImageIcon("Data\\Blocks\\BeigeBlock.png").getImage();
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setBlockShape(int shape_index) {
            blockColor = blockShape[shape_index];
    }
    public int getBlockWidth(){
        return blockColor.getWidth(null);
    }
    public int getBlockHeight(){
        return blockColor.getHeight(null);
    }
    public void setBlockPosition(int px,int py){
        this.px = px;
        this.py = py;
    }
}
