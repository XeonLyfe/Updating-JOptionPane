package dev.zenphyr.updatingframe;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import javax.swing.*;

/**
 * @author XeonLyfeGPC
 */

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setTitle("Updating List by XeonLyfe");
    }

    private void initComponents() {

        DCButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DCButton.setText("Display Changelog");
        DCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(DCButton)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(DCButton)
                .addContainerGap())
        );

        pack();
    }

    private void DCButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, RawReader.getUpdates());
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (Exception e){
            //ignore
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton DCButton;
}
