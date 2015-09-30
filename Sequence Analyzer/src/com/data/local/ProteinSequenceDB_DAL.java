package com.data.local;

import java.util.List;
import com.data.ProteinSequence;
import java.io.*;

//This class provides access to the Protein Sequence DB
public class ProteinSequenceDB_DAL {

	private String filePath;
	private String proteinSequenceDB;
	
	public ProteinSequenceDB_DAL()
	{
		proteinSequenceDB = null;
	}
	
	public void setFilePath( String path )
	{
		if( path != null)
		{
			filePath = path;
			proteinSequenceDB = createLocalDB( filePath );
		}
		else
		{
			javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid file path!");
		}
	}
	
	//This method loads up the protein sequences to the Protein Sequence object. It uses the ID of the object
	//To find the corresponding sequence
	public String createLocalDB(String path)
	{	
		StringBuilder db = new StringBuilder();
		try
		{
			FileReader fileReader = new FileReader( path );
			BufferedReader reader = new BufferedReader( fileReader );
			String currentLine = "";
			while( (currentLine = reader.readLine() ) != null )
			{
				db.append(currentLine);
				System.out.println( currentLine );
			}
			
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		return db.toString();
	}
	
}
