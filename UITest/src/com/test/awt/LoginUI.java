package com.test.awt;

import javax.swing.*;
import java.awt.*;

public class LoginUI {
    private Frame mainFrame = new Frame("登陆界面");
    private Panel pictureArea = new Panel();
    private ImageIcon picture = new ImageIcon("D://pic.jpg");
    private Panel loginArea = new Panel();
    private Panel accountArea = new Panel();
    private Panel passwordArea = new Panel();
    private Button loginButton = new Button("登录");
    private Label accountLabel = new Label("账号");
    private Label passwordLabel = new Label("密码");
    private TextField accountTF = new TextField(20);
    private TextField passwordTF = new TextField(20);

    private void init(){
        pictureArea.setBounds(200,200,200,200);
        pictureArea.setVisible(true);

        accountArea.setLayout(new BorderLayout());
        accountArea.add(accountLabel,BorderLayout.WEST);
        accountArea.add(accountTF,BorderLayout.CENTER);

        passwordArea.setLayout(new BorderLayout());
        passwordArea.add(passwordLabel,BorderLayout.WEST);
        passwordArea.add(passwordTF,BorderLayout.CENTER);

        loginArea.setLayout(new BorderLayout());
        loginArea.add(accountArea,BorderLayout.NORTH);
        loginArea.add(passwordArea,BorderLayout.CENTER);
        loginArea.add(loginButton,BorderLayout.SOUTH);

        mainFrame.add(new JLabel(picture),BorderLayout.WEST);
        mainFrame.add(loginArea,BorderLayout.CENTER);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        LoginUI loginUI = new LoginUI();
        loginUI.init();
    }
}
