import javax.swing.*;

/**
 * Created by Akharu on 6/16/2016.
 */
public class Loader {
    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        WindowA windowA = new WindowA();
        windowA.setVisible(true);
    }
}
