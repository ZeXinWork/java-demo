package com.itheima.UI;

import javax.swing.*;

public class gameJFrame extends JFrame {
    public gameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单

        initJMenuBar();
        //设置窗口是否可见
        this.setVisible(true);

    }

    private void initJMenuBar() {
        //菜单头部
        JMenuBar jMenuBar = new JMenuBar();

        //菜单功能名称
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //子菜单
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("关闭登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //添加菜单项
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //菜单头添加菜单功能
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //挂载jMenuBar到JFrame上
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置窗口大小
        this.setSize(603, 680);
        //设置窗口标题
        this.setTitle("拼图游戏单机版V1.0");
        //设置窗口是否固定在最上层
        this.setAlwaysOnTop(true);
        //设置窗口退出方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗口居中方式
        this.setLocationRelativeTo(null);
    }
}
