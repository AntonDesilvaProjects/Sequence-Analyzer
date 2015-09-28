package com.ui.pfam;

import com.ui.main.ApplicationModule;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class PfamModule extends ApplicationModule {
	private JTextField txtEvalue;
	private JTextField txtEnvelopeStart;
	private JTextField txtEnvelopeEnd;

	/**
	 * Create the panel.
	 */
	public PfamModule() {
		
		JLabel lblProteinSequence = new JLabel("Protein Sequence");
		
		JPanel pnlSearchResults = new JPanel();
		pnlSearchResults.setBorder(new TitledBorder(null, "Search Results", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProteinSequence)
						.addComponent(pnlSearchResults, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(lblProteinSequence)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pnlSearchResults, GroupLayout.PREFERRED_SIZE, 558, Short.MAX_VALUE)
					.addGap(6))
		);
		
		JTextArea txtProteinSequence = new JTextArea();
		scrollPane.setViewportView(txtProteinSequence);
		txtProteinSequence.setBorder(null);
		txtProteinSequence.setWrapStyleWord(true);
		txtProteinSequence.setLineWrap(true);
		
		JLabel lblPossibleMatches = new JLabel("Matches");
		
		JComboBox cmbMatches = new JComboBox();
		cmbMatches.setModel(new DefaultComboBoxModel(new String[] {"KLRSH", "SKIRLLEX", "rt67SHq"}));
		
		JButton btnMutationAnalysis = new JButton("Mutation Analysis");
		
		JLabel lblEvalue = new JLabel("E-Value");
		
		JLabel lblEnvelopeStart = new JLabel("Envelope Start");
		
		JLabel lblEnvelopeEnd = new JLabel("Envelope End");
		
		txtEvalue = new JTextField();
		txtEvalue.setColumns(10);
		
		txtEnvelopeStart = new JTextField();
		txtEnvelopeStart.setColumns(10);
		
		txtEnvelopeEnd = new JTextField();
		txtEnvelopeEnd.setColumns(10);
		
		JLabel lblHmm = new JLabel("HMM");
		
		JLabel lblMatchString = new JLabel("Match String");
		
		JLabel lblPP = new JLabel("PP");
		
		JLabel lblRawData = new JLabel("Raw Data");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JScrollPane scrollPane_4 = new JScrollPane();
		GroupLayout gl_pnlSearchResults = new GroupLayout(pnlSearchResults);
		gl_pnlSearchResults.setHorizontalGroup(
			gl_pnlSearchResults.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlSearchResults.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addComponent(scrollPane_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addComponent(scrollPane_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_pnlSearchResults.createSequentialGroup()
							.addComponent(cmbMatches, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
							.addComponent(btnMutationAnalysis))
						.addComponent(lblPossibleMatches, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_pnlSearchResults.createSequentialGroup()
							.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEvalue)
								.addComponent(txtEvalue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEnvelopeStart)
								.addComponent(txtEnvelopeStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(32)
							.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEnvelopeEnd)
								.addComponent(txtEnvelopeEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(123))
						.addComponent(lblHmm, Alignment.LEADING)
						.addComponent(lblMatchString, Alignment.LEADING)
						.addComponent(lblPP, Alignment.LEADING)
						.addComponent(lblRawData, Alignment.LEADING))
					.addContainerGap())
		);
		gl_pnlSearchResults.setVerticalGroup(
			gl_pnlSearchResults.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSearchResults.createSequentialGroup()
					.addComponent(lblPossibleMatches)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbMatches, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMutationAnalysis))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEvalue)
						.addComponent(lblEnvelopeStart)
						.addComponent(lblEnvelopeEnd))
					.addGap(1)
					.addGroup(gl_pnlSearchResults.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEvalue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEnvelopeStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEnvelopeEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblHmm)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblMatchString)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPP)
					.addGap(8)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRawData)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_4, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextPane rtxtRawData = new JTextPane();
		scrollPane_4.setViewportView(rtxtRawData);
		rtxtRawData.setBorder(null);
		
		JTextPane rtxtPP = new JTextPane();
		scrollPane_3.setViewportView(rtxtPP);
		rtxtPP.setBorder(null);
		
		JTextPane rtxtMatchString = new JTextPane();
		scrollPane_2.setViewportView(rtxtMatchString);
		rtxtMatchString.setBorder(null);
		
		JTextPane rtxtHMM = new JTextPane();
		scrollPane_1.setViewportView(rtxtHMM);
		rtxtHMM.setBorder(null);
		pnlSearchResults.setLayout(gl_pnlSearchResults);
		setLayout(groupLayout);

	}
}
