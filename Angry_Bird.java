import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Angry_Bird extends JPanel implements ActionListener, KeyListener {
    private int birdY = 200;
    private int velocity = 0;
    private int gravity = 2;
    private int obstacleX = 600;
    private int obstacleY = 200;
    private int obstacleWidth = 50;
    private int obstacleHeight = 150;
    private int gap = 200;
    private Timer timer;
    private boolean gameOver = false;
    private int score = 0;

    public Angry_Bird() {
        timer = new Timer(20, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.GREEN);
        g.fillRect(obstacleX, 0, obstacleWidth, obstacleY);
        g.fillRect(obstacleX, obstacleY + gap, obstacleWidth, getHeight() - obstacleY - gap);
        g.setColor(Color.RED);
        g.fillRect(100, birdY, 50, 50);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 10, 30);
    }

    public void actionPerformed(ActionEvent e) {
        birdY += velocity;
        velocity += gravity;

        obstacleX -= 5;
        if (obstacleX + obstacleWidth < 0) {
            obstacleX = getWidth();
            obstacleY = (int) (Math.random() * (getHeight() - gap));
            score++;
        }

        if (birdY > getHeight() || birdY < 0) {
            gameOver = true;
            timer.stop();
        }

        if (obstacleX < 150 && obstacleX + obstacleWidth > 100) {
            if (birdY < obstacleY || birdY > obstacleY + gap) {
                gameOver = true;
                timer.stop();
            }
        }

        repaint();
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) {
            velocity = -20;
        }
        if (gameOver && e.getKeyCode() == KeyEvent.VK_ENTER) {
            restartGame();
        }
    }

    public void keyReleased(KeyEvent e) {}

    private void restartGame() {
        birdY = 200;
        velocity = 0;
        obstacleX = 600;
        obstacleY = 200;
        gameOver = false;
        score = 0;
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird");
        Angry_Bird game = new Angry_Bird();
        frame.add(game);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
