import javax.swing.JFrame;

public class TestPalle {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Palle Rimbalzanti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PannelloPalle());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
