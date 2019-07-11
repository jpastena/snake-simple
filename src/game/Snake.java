package game;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        this.initUI();
    }
    
    private void initUI() {
        this.add(new Board());
        this.setResizable(false);
        this.pack();
        this.setTitle("Snake");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new Snake();
            frame.setVisible(true);
        });
    }
}