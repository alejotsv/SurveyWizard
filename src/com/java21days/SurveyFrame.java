package com.java21days;

import javax.swing.*;

public class SurveyFrame extends JFrame {
    public SurveyFrame(){
        super("Survey");
        setSize(290, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLookAndFeel();
        SurveyWizard wiz = new SurveyWizard();
        add(wiz);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc){
            System.err.println("Couldn't use the system look and feel: " + exc);
        }
    }

    public static void main(String[] args) {
        SurveyFrame surv = new SurveyFrame();
    }
}
