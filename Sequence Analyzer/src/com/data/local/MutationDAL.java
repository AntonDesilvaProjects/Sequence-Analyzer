package com.data.local;

import java.io.*;
import java.util.*;

import com.data.*;

//Mutation file data access layer
public class MutationDAL {

	private String filePath;
	private List<ProteinSequence> proteinSequenceList;
	
	public MutationDAL()
	{
		filePath = null;
		proteinSequenceList = null;
	}
	
	public void setFilePath( String path )
	{
		if( path != null)
		{
			filePath = path;
			proteinSequenceList = generateProteinSequences( path );
		}
	}
	public ArrayList<ProteinSequence> generateProteinSequences( String fileLocation)
	{
		String currentLine = "";
		String currentProteinID = "";
		String currentGeneSymbol = "";
		String currentMutation = "";
		String[] tokens ;
		
		FileReader file;
		BufferedReader reader;
		ArrayList<ProteinSequence> sequenceList = new ArrayList<ProteinSequence>();
		try
		{
			file = new FileReader( fileLocation );
			reader = new BufferedReader( file );
			
			while( ( currentLine = reader.readLine() ) != null)
			{
				tokens = currentLine.split("\\s+");
				currentProteinID = tokens[0];
				if( !currentProteinID.equals( "N/A") )
				{
					currentGeneSymbol = tokens[1];
					currentMutation = tokens[2];
					System.out.println( currentProteinID + " " + currentGeneSymbol + " " + currentMutation);
				}
			}
		}
		catch(FileNotFoundException fileNotFound)
		{
			javax.swing.JOptionPane.showMessageDialog(null, "Cannot locate mutations file at " + getFilePath());
		}
		catch(IOException io)
		{
			javax.swing.JOptionPane.showMessageDialog(null, io.getMessage());
		}
		return sequenceList;
	}
	private String getFilePath() {
		return filePath;
	}
	
}
