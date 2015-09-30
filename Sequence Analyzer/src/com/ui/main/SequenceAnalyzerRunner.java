package com.ui.main;

import com.data.local.MutationDAL;
import com.data.local.ProteinSequenceDB_DAL;

public class SequenceAnalyzerRunner {

	public static void main(String[] args) {
	    //frmMain main = new frmMain();
		
		MutationDAL dal = new MutationDAL();
		//java.util.List l = dal.generateProteinSequences("//Users//anton//Desktop//mutations.txt");
		ProteinSequenceDB_DAL dal2 = new ProteinSequenceDB_DAL();
		String s = dal2.createLocalDB("//Users//anton//Desktop//Homo_sapiens.GRCh38.pep.all.rtf");
		javax.swing.JOptionPane.showMessageDialog(null, "Done" );
		
	}

}
