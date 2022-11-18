package com.java21days;

import javax.swing.*;
import java.awt.*;

public class SurveyPanel extends JPanel {
    JLabel question;
    JRadioButton[] response;
    JButton nextButton = new JButton("Next");
    JButton finalButton = new JButton("Finish");

    SurveyPanel(String ques, String[] resp, int def){
        super();
        setSize(160, 110);
        question = new JLabel(ques);
        response = new JRadioButton[resp.length];
        JPanel sub1 = new JPanel();
        ButtonGroup group = new ButtonGroup();
        JLabel quesLabel = new JLabel(ques);
        sub1.add(quesLabel);
        JPanel sub2 = new JPanel();
        for(int i=0; i<resp.length; i++){
            if(def == i){
                response[i] = new JRadioButton(resp[i], true);
            } else{
                response[i] = new JRadioButton(resp[i], false);
            }
            group.add(response[i]);
            sub2.add(response[i]);
        }
        JPanel sub3 = new JPanel();
        nextButton.setEnabled(true);
        sub3.add(nextButton);
        finalButton.setEnabled(false);
        sub3.add(finalButton);
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        add(sub1);
        add(sub2);
        add(sub3);
    }

    void setFinalQuestion(boolean finalQuestion){
        if(finalQuestion){
            nextButton.setEnabled(false);
            finalButton.setEnabled(true);
        }
    }
}
