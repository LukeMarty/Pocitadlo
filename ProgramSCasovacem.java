package casovac;

import javax.swing.JFrame;

public class ProgramSCasovacem extends JFrame {
    
    public ProgramSCasovacem() {
        this.setTitle("Pocitadlo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MujPanel panel = new MujPanel();
        this.add(panel);
        
        this.pack();
        this.setResizable(false);
    }
    
    public static void main(String[] args) {
        new ProgramSCasovacem().setVisible(true);
    }
}
