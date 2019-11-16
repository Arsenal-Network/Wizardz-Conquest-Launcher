package net.arsenalnetwork.frame;

import net.arsenalnetwork.draw.RenderTextTypeBox;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JPanel {

    public MainFrame() {
        setBackground(Color.BLACK);
        add(RenderTextTypeBox.jTextField);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draws the Text Field
        RenderTextTypeBox.renderTextField("Input Email", 100F, 50F, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Checks if the text field has any text.
        RenderTextTypeBox.jTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { changed(); }
            public void removeUpdate(DocumentEvent e) { changed(); }
            public void insertUpdate(DocumentEvent e) { changed(); }

            public void changed() {
                if (RenderTextTypeBox.jTextField.getText().equals("Hello")) {
                    System.out.println("Hello back person!");
                } else if (RenderTextTypeBox.jTextField.getText().isEmpty()) {
                    System.out.println("Text Field is empty!");
                }
            }
        });
    }

}
