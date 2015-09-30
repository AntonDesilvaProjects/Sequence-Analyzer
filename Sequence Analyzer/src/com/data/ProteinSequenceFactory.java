package com.data;

import java.util.List;

//Generates complete ProteinSequence Objects by synthesizing
//data from Mutation and ProteinSequence DB files
public class ProteinSequenceFactory {

	String currentProteinID = "";
	String currentGeneSymbol = "";
	String currentMutation = "";
	ProteinSequence currentPSequence;
	String[] tokens ;
	private List<ProteinSequence> proteinSequenceList;
	
	
	/*tokens = currentLine.split("\\s+");
	currentProteinID = tokens[0];
	if( !currentProteinID.equals( "N/A") )
	{
		currentGeneSymbol = tokens[1];
		currentMutation = tokens[2];
		
		currentPSequence = new ProteinSequence();
		currentPSequence.setID(currentProteinID);
		currentPSequence.setGeneSymbol(currentGeneSymbol);
		currentPSequence.setRawMutation(currentMutation);//Mutations file only gives the 'raw' mutation in form k67l
		
		sequenceList.add( currentPSequence);
		
		System.out.println( currentProteinID + " " + currentGeneSymbol + " " + currentMutation);
		
	}*/
}
