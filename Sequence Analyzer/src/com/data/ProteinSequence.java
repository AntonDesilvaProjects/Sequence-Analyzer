package com.data;

import java.util.ArrayList;
import java.util.List;

import com.data.Pfam.*;

public class ProteinSequence {
	
	private String ID;
	private String sequence;
	private String rawMutation;
	private int mutationPostition;
	private String geneSymbol;
	private List<Match> matchList;
	
	public ProteinSequence()
	{
		matchList = new ArrayList<Match>();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getRawMutation() {
		return rawMutation;
	}

	public void setRawMutation(String rawMutation) {
		this.rawMutation = rawMutation;
	}

	public int getMutationPostition() {
		return mutationPostition;
	}

	public void setMutationPostition(int mutationPostition) {
		this.mutationPostition = mutationPostition;
	}

	public String getGeneSymbol() {
		return geneSymbol;
	}

	public void setGeneSymbol(String geneSymbol) {
		this.geneSymbol = geneSymbol;
	}

	public List<Match> getMatchList() {
		return matchList;
	}

	public void setMatchList(List<Match> matchList) {
		this.matchList = matchList;
	}
	
	
	
	
	
}
