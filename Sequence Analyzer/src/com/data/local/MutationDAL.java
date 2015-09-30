package com.data.local;

import java.io.*;
import java.util.*;

import com.data.*;

//Mutation file data access layer
public class MutationDAL {

	private String filePath;
	private List<String> rawMutationData;//Contains data in format: ENSP00000123456 ABC2 K12S
	
	
	public MutationDAL()
	{
		filePath = null;
	}
	
	public void setFilePath( String path )
	{
		if( path != null)
		{
			filePath = path;
			generateProteinSequences( path );
		}
		else
		{
			javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid file path!");
		}
	}
	public void generateProteinSequences( String fileLocation)
	{
		String currentLine = "";
		
		FileReader file;
		BufferedReader reader;
		rawMutationData = new ArrayList<String>();
		
		try
		{
			file = new FileReader( fileLocation );
			reader = new BufferedReader( file );
			
			while( ( currentLine = reader.readLine() ) != null)
			{
				rawMutationData.add(currentLine);
				System.out.println( currentLine ); //Debug
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
	}
	
	private String getFilePath() {
		return filePath;
	}
	
	public List<String> getRawMutation()
	{
		return rawMutationData;
	}
	
}
