package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SurveyWizard extends JFrame implements ActionListener {
    int currentCard = 0;
    CardLayout cards = new CardLayout();
    SurveyPanel[] ask = new SurveyPanel[];

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

}
