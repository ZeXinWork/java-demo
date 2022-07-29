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
    }

    //��ʼ����Ŀ
    private void initImage() {
        ImageIcon icon = new ImageIcon("D:\\java_base\\xiangmu\\image\\animal\\animal5\\2.jpg");
        JLabel jLabel = new JLabel((icon));
        this.add(jLabel);
    }
}
