//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Wal-Mart");
		adjectives.add("massive");
		story="I punched Wal-Mart in a massive way.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadAdjectives();
		loadVerbs();
		
		//First read from story.dat (one string) you need a second scanner to chop up the string after that 
		//Once you have a string from the string you will check if it's any of the 3 sybols (#,&,@) else it wasn't a word 
		//concatinate it back onto the story you cannot do has.next & has ore than once it will reak it
		//you HAVE to use a variable 

		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));
			
			while(reader.hasNext())
			{
				nouns.add(reader.next());
			}
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner readers = new Scanner(new File("nouns.dat"));
			
			while(readers.hasNext())
			{
				nouns.add(readers.next());
			}

		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner reading = new Scanner(new File("nouns.dat"));
			
			while(reading.hasNext())
			{
				nouns.add(reading.next());
			}

		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{

		return ""+ verbs;
	}

	public String getRandomNoun()
	{
		return "" + nouns;
	}

	public String getRandomAdjective()
	{
		return "" + adjectives;
	}

	public String toString()
	{
		return ""+ story;
	}
}