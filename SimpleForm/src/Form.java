import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/**
 * Created by Akharu on 6/16/2016.
 */
public class Form {

    private JPanel rootPanel;
    private JTextField textField1;
    private JFormattedTextField birthdayField;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel textFieldPanel;
    private JPanel labelPanel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        birthdayField = new JFormattedTextField();
        try {
            MaskFormatter dateMask = new MaskFormatter("##.##.####");
            dateMask.install(birthdayField);
        } catch (ParseException ex) {
        }
    }
}
