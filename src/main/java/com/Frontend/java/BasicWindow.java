package com.Frontend.java;

import javax.swing.*;


//import java.awt.*;

class BasicWindow
{
	/*
	 * 序列化ID 当前版本使用1L
	 */
	
	aboutDialog aboutdialog;
	setDialog setdialog;
	
	public BasicWindow()
	{
		
		JFrame BW = new JFrame("JGTD");
		BW.setVisible(true);        // 设置窗体可见
		BW.setSize(500, 400);        // 设置窗体大小
    	BW.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // 设置窗体关闭方式
    	
    	
    	/*
         * 创建一个菜单栏
         */
        JMenuBar menuBar = new JMenuBar();
        
        /*
         * 创建一级菜单
         */
        JMenu fileMenu = new JMenu("文件");
        JMenu editMenu = new JMenu("编辑");
        JMenu aboutMenu = new JMenu("关于");
        
        /*
         * 添加一级菜单到菜单栏
         */
        menuBar.add(fileMenu); 
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        
        /*
         * 创建 "文件" 一级菜单的子菜单
         */
        JMenuItem newMenuItem = new JMenuItem("新建");
        JMenuItem openMenuItem = new JMenuItem("打开");
        JMenuItem exitMenuItem = new JMenuItem("退出");
        exitMenuItem.addActionListener(event -> System.exit(0));
        
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(exitMenuItem);
        
        /*
         * 创建 "关于" 一级菜单的子菜单
         */
        JMenuItem setMenuItem = new JMenuItem("设置");
        setMenuItem.addActionListener(event ->{
        	if (setdialog ==null)
        	{
        		setdialog = new setDialog(BW);
        	}
        	setdialog.setVisible(true);
        });
        JMenuItem aboutMenuItem = new JMenuItem("关于");
        aboutMenuItem.addActionListener(event ->
        {
        	if (aboutdialog == null)
        	{
        		aboutdialog = new aboutDialog(BW);
        	}
        	aboutdialog.setVisible(true);
        });
        
        aboutMenu.add(setMenuItem);
        aboutMenu.add(aboutMenuItem);
        
        /*
         * 创建 "编辑" 一级菜单的子菜单
         */
        JMenuItem createMenuItem = new JMenuItem("添加");
        JMenuItem deleteMenuItem = new JMenuItem("删除");
        
        editMenu.add(createMenuItem);
        editMenu.add(deleteMenuItem);
        
        /*
         * 添加菜单栏
         */
        
        BW.setJMenuBar(menuBar);
        
        BW.setVisible(true);
	}
}
