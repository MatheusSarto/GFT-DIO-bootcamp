package SnakeGame;

import javax.swing.*;

 class Frame extends JFrame {
    private static Frame instance;
     private Panel panel;

    private Frame()
    {
        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Snake game :)");
        this.setResizable(false);
        this.setVisible(true);
    }

    public static Frame getInstance()
    {
        if(instance == null)
        {
            instance = new Frame();
        }
        return instance;
    }
}
