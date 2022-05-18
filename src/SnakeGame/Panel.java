package SnakeGame;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class Panel extends JPanel implements ActionListener {
    // X = 72 Tiles;
    // Y = 42 Tiles;
    // 00 =  canto superior esquerdo;
    private static final int GAME_WIDTH = 1152;
    private static final int GAME_HEIGHT = 720;
    private static final int TILE_WIDTH = 16;
    private static final int TILE_HEIGHT = 16;
    private static final int MAX_TILES = ( GAME_WIDTH / TILE_WIDTH ) * ( GAME_HEIGHT / TILE_HEIGHT);
    private static final int DELAY = 75;

    final int[] x = new int[MAX_TILES];
    final int[] y = new int[MAX_TILES];

    private int chunks = 3;
    private int applesEaten;
    private int appleX;
    private int appleY;
    private char direction = 'R';
    private boolean running = false;
    Timer timer;
    Random random;


    public Panel()
    {
        random = new Random();
        this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        this.setBackground(Color.DARK_GRAY);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }

    private void startGame()
    {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }

    private void newApple()
    {
        appleX = random.nextInt(GAME_WIDTH / TILE_WIDTH) * TILE_WIDTH;
        appleY = random.nextInt(GAME_HEIGHT / TILE_HEIGHT) * TILE_WIDTH;
    }

    private void move()
    {
        for(int i = chunks; i > 0; i--)
        {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(direction)
        {
            case 'U':
                y[0] = y[0] - TILE_HEIGHT;
                break;
            case 'D':
                y[0] = y[0] + TILE_HEIGHT;
                break;
            case 'L':
                x[0] = x[0] - TILE_WIDTH;
                break;
            case 'R':
                x[0] = x[0] + TILE_WIDTH;
                break;
        }

    }

    public void draw(Graphics g) {

        if(running) {
            FontMetrics metrics = getFontMetrics(g.getFont());
            for (int i = 0; i < MAX_TILES; i++) {
                g.drawLine(i * TILE_WIDTH, 0, i * TILE_WIDTH, GAME_HEIGHT);
                g.drawLine(0, i * TILE_HEIGHT, GAME_WIDTH, i * TILE_HEIGHT);
            }

            g.setColor(Color.red);
            g.fillOval(appleX, appleY, TILE_WIDTH, TILE_HEIGHT);

            for (int i = 0; i < chunks; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], TILE_WIDTH, TILE_HEIGHT);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], TILE_WIDTH, TILE_HEIGHT);
                }
                g.setFont(new Font("Ink Free", Font.BOLD, 20));
                g.drawString("Apples : " + applesEaten, (GAME_WIDTH - 50) - metrics.stringWidth("Apples : " + applesEaten), 20);
            }
        }
        else
        {
            gameOver(g);
        }
    }

    private void gameOver(Graphics g)
    {
        for (int i = 0; i < MAX_TILES; i++) {
            g.drawLine(i * TILE_WIDTH, 0, i * TILE_WIDTH, GAME_HEIGHT);
            g.drawLine(0, i * TILE_HEIGHT, GAME_WIDTH, i * TILE_HEIGHT);
        }

        g.setColor(Color.red);
        g.fillOval(appleX, appleY, TILE_WIDTH, TILE_HEIGHT);

        for (int i = 0; i < chunks; i++) {
            if (i == 0) {
                g.setColor(Color.green);
                g.fillRect(x[i], y[i], TILE_WIDTH, TILE_HEIGHT);
            } else {
                g.setColor(new Color(45, 180, 0));
                g.fillRect(x[i], y[i], TILE_WIDTH, TILE_HEIGHT);
            }
        }
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over  Score: " + applesEaten, (GAME_WIDTH - metrics.stringWidth("Game Over  Score: " + applesEaten)) / 2, GAME_HEIGHT / 2);
    }
    //Utilizando de interfaces e encapsulamento de processos em métodos para implementar o Facade
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(running)
        {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();

    }

    private void checkCollisions()
    {
        //Checks head if head collides with body
        for(int i = chunks; i > 0; i--)
        {
            if((x[0] == x[i]) && (y[0] == y[i]))
            {
                running = false;
            }

            if(x[0] > GAME_WIDTH)
            {
                running = false;
            }

            if(x[0] < 0)
            {
                running = false;
            }

            if(y[0] < 0 )
            {
                running = false;
            }

            if(y[0] > GAME_HEIGHT)
            {
                running = false;
            }

            if(running == false)
            {
                timer.stop();
            }
        }
    }

    private void checkApple()
    {
        if((x[0] == appleX) && (y[0] == appleY))
        {
            chunks++;
            applesEaten ++;
            newApple();
        }
    }

    public class MyKeyAdapter extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            switch(e.getKeyCode())
            {
                case KeyEvent.VK_A:
                case KeyEvent.VK_LEFT:
                    if(direction != 'R')
                    {
                        direction = 'L';
                    }
                    break;

                case KeyEvent.VK_D:
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L')
                    {
                        direction = 'R';
                    }
                    break;

                case KeyEvent.VK_W:
                case KeyEvent.VK_UP:
                    if(direction != 'D')
                    {
                        direction = 'U';
                    }
                    break;

                case KeyEvent.VK_S:
                case KeyEvent.VK_DOWN:
                    if(direction != 'U')
                    {
                        direction = 'D';
                    }
                    break;
            }
        }
    }

}
