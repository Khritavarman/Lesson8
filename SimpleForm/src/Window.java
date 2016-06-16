import javax.swing.*;

/**
 * Created by Akharu on 6/16/2016.
 */
public class Window extends JFrame {

    public Window() {
        super("Window");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Form form = new Form();
        setContentPane(form.getRootPanel());
    }

}
