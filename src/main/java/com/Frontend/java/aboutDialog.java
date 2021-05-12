package com.Frontend.java;

import java.awt.*;

import javax.swing.*;


public class aboutDialog extends JDialog{
	/*
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	public aboutDialog(JFrame owner)
	{
		super(owner, "About JGTD",true);
		
		add(
				new JLabel("<html><h1>V0.0.1</h1><h2>https://gitee.com/Cpointerz/JGTD</h2><ht>By Cpointerz</ht></html>"),
				BorderLayout.CENTER
				);
		
		
		
		var panel = new JPanel();
		add(panel,BorderLayout.SOUTH);
		
		pack();
	}
}
