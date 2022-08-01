package com.itheima.UI;

import javax.swing.*;

public class gameJFrame extends JFrame {
    public gameJFrame() {
        //��ʼ������
        initJFrame();

        //��ʼ���˵�
        initJMenuBar();

        //��ʼ��ͼƬ
        initImage();

        //���ô����Ƿ�ɼ�
        this.setVisible(true);

    }

    //��ʼ��JMenuBar
    private void initJMenuBar() {
        //�˵�ͷ��
        JMenuBar jMenuBar = new JMenuBar();

        //�˵���������
        JMenu functionJMenu = new JMenu("����");
        JMenu aboutJMenu = new JMenu("��������");

        //�Ӳ˵�
        JMenuItem replayItem = new JMenuItem("������Ϸ");
        JMenuItem reLoginItem = new JMenuItem("�رյ�¼");
        JMenuItem closeItem = new JMenuItem("�ر���Ϸ");

        JMenuItem accountItem = new JMenuItem("���ں�");

        //��Ӳ˵���
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //�˵�ͷ��Ӳ˵�����
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //����jMenuBar��JFrame��
        this.setJMenuBar(jMenuBar);
    }

    //��ʼ��JFrame
    private void initJFrame() {
        //���ô��ڴ�С
        this.setSize(603, 680);
        //���ô��ڱ���
        this.setTitle("ƴͼ��Ϸ������V1.0");
        //���ô����Ƿ�̶������ϲ�
        this.setAlwaysOnTop(true);
        //���ô����˳���ʽ
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //���ô��ھ��з�ʽ
        this.setLocationRelativeTo(null);
        //ȡ��Ĭ�ϵĲ��ַ�ʽ
        this.setLayout(null);
    }

    //��ʼ��ͼƬ
    private void initImage() {
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel = new JLabel((new ImageIcon("D:\\java_base\\xiangmu\\image\\animal\\animal5\\" + num + ".jpg")));
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                this.getContentPane().add(jLabel);
                num++;
            }
        }

    }
}
