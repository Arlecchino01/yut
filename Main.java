import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        
SwingUtilities.invokeLater(() -> {
            new MainFrame(); // GUI 생성 시작
        }); 
    }
    
}
    
