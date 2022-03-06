package minekream.main;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class Screen {  
    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();   
        JLabel label = new JLabel("JFrame By Example");  
        frame.add(panel);  
        frame.setSize(1200, 900);  
        frame.setTitle("MineKream");
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
} 