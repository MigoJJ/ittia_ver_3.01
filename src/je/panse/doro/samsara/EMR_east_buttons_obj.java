package je.panse.doro.samsara;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import je.panse.doro.samsara.EMR_OBJ_excute.EB_BMI_calculator;
import je.panse.doro.samsara.EMR_OBJ_excute.EMR_HbA1c;
import je.panse.doro.samsara.EMR_OBJ_excute.EMR_Vitalsign_BP;

public class EMR_east_buttons_obj extends JFrame implements ActionListener {

    private ArrayList<JButton> buttons = new ArrayList<>();

    public EMR_east_buttons_obj(String position, String title) {
        setSize(new Dimension(800, 600));
        setLayout(new GridLayout(3, 5));
        setBackground(new Color(240, 240, 240));
        setTitle(title);

        String[] buttonNames = {"BMI", "BP", "HbA1c", "TFT", "LDL", "LFT", "CBC", "eGFR", "LDL", "Lp(a)", "ChestPA", "EKG", "GFS", "CFS", "DEXA"};

        // Create buttons and add to array list
        for (String buttonName : buttonNames) {
            JButton button = new JButton(buttonName);
            button.setFont(new Font("Arial", Font.PLAIN, 16));
            button.addActionListener(this); // Add this as the action listener
            buttons.add(button);
            add(button);
        }

        // Change background color of buttons gradually
        for (int i = 0; i < buttons.size(); i++) {
            Color color = new Color(135, 206, 235); // Create a sky blue color object
            buttons.get(i).setBackground(color);
        }

//        setLocationRelativeTo();
        setLocationRelativeTo(null);
        int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int x = screenWidth - frameWidth;
        int y = 0;
        setLocation(x, y);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String text) {
        new EMR_east_buttons_obj("east", "EMR Object Buttons");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            if (clickedButton.getText().equals("BMI")) {
                EB_BMI_calculator.main(null); // Call the main method of EB_BMI_calculator
            } else if (clickedButton.getText().equals("BP")) {
            	EMR_Vitalsign_BP.main(null); // Call the main method of EB_BMI_calculator
            } else if (clickedButton.getText().equals("HbA1c")) {
            	EMR_HbA1c.main(null); // Call the main method of EB_BMI_calculator
            }
        }
    }
}
