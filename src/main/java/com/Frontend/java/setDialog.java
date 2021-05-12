package com.Frontend.java;

import java.awt.*;

import javax.swing.*;


public class setDialog extends JDialog{
	/*
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	public setDialog(JFrame onwer){
		super(onwer, "设置",true);
		
		JPanel setJPanel = new JPanel();
		/*
		 * setversion 单选框 -> 是否选择稳定版
		 */
		JLabel setversion = new JLabel("set version");
		
		
		JRadioButton StableV = new JRadioButton("StabelVersion",true);
		JRadioButton PreV = new JRadioButton("Pre-Version",false);
		
		ButtonGroup VersionGroup = new ButtonGroup();
		VersionGroup.add(StableV);
		VersionGroup.add(PreV);
		
		/*
		 * 添加 是否选择稳定版
		 */
		setJPanel.add(setversion);
		setJPanel.add(StableV);
		setJPanel.add(PreV);
		
		
		var panel = new JPanel();
		panel.add(setJPanel);
		add(panel,BorderLayout.SOUTH);
		
		pack();
	}
}