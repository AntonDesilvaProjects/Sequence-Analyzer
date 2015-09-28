package com.ui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.ui.pfam.PfamModule;
import com.ui.pdb.*;

public class frmMain extends JFrame {
	
	ApplicationPanel applicationPanel;
	JScrollPane proteinIDScrollPane;
	JScrollPane moduleScrollPane;
	JSplitPane splitPane;
	JPanel statusPanel;
	JLabel statusLabel;
	JProgressBar progressBar;
	ProteinIDListPanel proteinIDListPanel;
	
	public frmMain()
	{
		super();
		initializeComponent();
	}
	private void initializeComponent()
	{
		//Default Window Properties
		this.setTitle("Sequence Analyzer");
		this.setSize( 870, 803);
		this.setJMenuBar(generateMenuBar());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Generate the Status Bar
		statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		this.add(statusPanel, BorderLayout.SOUTH);
		statusPanel.setPreferredSize(new Dimension(this.getWidth(), 16));
		statusPanel.setLayout(new BorderLayout());
		statusLabel = new JLabel("Connected");
		statusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		statusPanel.add(statusLabel, BorderLayout.EAST);
		progressBar = new JProgressBar();
		progressBar.setAlignmentX(RIGHT_ALIGNMENT);
		progressBar.setValue(43);
		statusPanel.add(progressBar, BorderLayout.WEST);
		
		applicationPanel = new ApplicationPanel();
		proteinIDListPanel = new ProteinIDListPanel();
		
		//Initialize the two main component container
		proteinIDScrollPane = new JScrollPane(proteinIDListPanel);
		moduleScrollPane = new JScrollPane(applicationPanel);
		
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, proteinIDScrollPane, moduleScrollPane);	
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(150);
		
		//Provide minimum sizes for the two components in the split pane
		Dimension minimumSize = new Dimension(100, 50);
		proteinIDScrollPane.setMinimumSize(minimumSize);
		moduleScrollPane.setMinimumSize(minimumSize);
		
		this.getContentPane().add(splitPane);
	
		applicationPanel.loadApplictaionModule(new PfamModule());
		
		//Refresh Window
		this.validate();
	}
	private JMenuBar generateMenuBar()
	{
		JMenuBar menu = new JMenuBar();
		
		//File
		JMenu file = new JMenu("File");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		
		file.add(open);
		file.addSeparator();
		file.add(exit);
		
		menu.add(file);
		
		//Edit
		JMenu edit = new JMenu("Edit");
		menu.add(edit);
		
		//View
		JMenu view = new JMenu("View");
		JMenuItem search = new JMenuItem("Analyze sequence");
		
		view.add(search);
		
		menu.add(view);
		
		//Help
		JMenu help = new JMenu("Help");
		
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
		menu.add(help);
		
		return menu;
	}
	public ApplicationPanel getApplicationPanel()
	{
		return applicationPanel;
	}
}
