package com.l3.gl.view;

import javax.swing.*;
import java.awt.*;

public class Ui {
    private JFrame frame;

    public Ui() {
        // إعداد النافذة الأساسية
        frame = new JFrame("Gestion de Stock - MyGitApp");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // لجعل النافذة في منتصف الشاشة

        // إنشاء لوحة (Panel) وزر
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JButton btnClick = new JButton("Afficher Message");
        
        // إضافة حدث عند الضغط على الزر (اختياري)
        btnClick.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "مرحباً بك في تطبيق Git الأول!");
        });

        panel.add(btnClick);
        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // تشغيل الواجهة
        SwingUtilities.invokeLater(() -> {
            new Ui().show();
        });
    }
}