package ru.vsu.cs.PoryadinAV.error;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class FrameError extends JFrame {
    private JPanel panelError;
    private JLabel labelErrorMessage;

    public FrameError(String errorMessage) {
        this.setTitle("ERROR");
        this.setContentPane(panelError);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setBounds(850, 250, 300, 300);
        this.setResizable(false);
        this.pack();

        labelErrorMessage.setText(errorMessage);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelError = new JPanel();
        panelError.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), 10, 10));
        panelError.setBackground(new Color(-1));
        panelError.setForeground(new Color(-1));
        panelError.setMinimumSize(new Dimension(200, 300));
        panelError.setPreferredSize(new Dimension(500, 50));
        labelErrorMessage = new JLabel();
        labelErrorMessage.setText("Label");
        panelError.add(labelErrorMessage, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelError;
    }

}