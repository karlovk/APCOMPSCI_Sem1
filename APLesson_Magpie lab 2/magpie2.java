public class magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		
		return "Hello, please talk to me.";
		
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */
		 
		 if (statement.trim().length() == 0)
		 {
			 
			 return "Please, say something.";
		 }


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		 //statement.indexOf("no") >= 0
		if (findKeyword(statement,"no") >= 0)
		{
			
			response = "Why are so negative?";
			
		}

		else if (findKeyword(statement,"brother") >= 0
		
				|| findKeyword(statement,"sister") >= 0
				
				|| findKeyword(statement,"father") >= 0
				
				|| findKeyword(statement,"mother") >= 0)
		{
			
			response = "Tell me something more about your family.";
			
		}

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */

		 else if (findKeyword(statement,"cat") >= 0 
		 
		 || findKeyword(statement,"dog") >= 0 
		 
		 || findKeyword(statement,"fish") >= 0 
		 
		 || findKeyword(statement,"turtle") >= 0)
		{
			
			response = "Tell me something more about your pet";
			
		}
		 
		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			
			response = transformIWantToStatement(statement);
			
		}


		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);


			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				
				response = transformYouMeStatement(statement);
				
			}
			else
			{
				
				response = getRandomResponse();
				
			}
			
		}
		
		return response;
		
	}
/**
* Take a statement with "I want to <something>." and transform it into
* "What would it mean to <something>?"
* @param statement the user statement, assumed to contain "I want to"
* @return the transformed statement
*/
private String transformIWantToStatement(String statement)
{
	statement = statement.trim();
	String lastChar = ".;,'!?&$`~\"";
	
	for (int i = 0; i < lastChar.length() - 1; i++)
	{
		
		if(statement.substring(statement.length()-1,statement.length()).equals(lastChar.substring(i,i + 1)))
		{
			
			statement = statement.substring(0,statement.length()-1);
			
			i = 0;
			
		}	
	}
	
	int psn = findKeyword(statement,"I Want to");
	
	String restOfStatement = statement.substring(psn + 9, statement.length());
	
	if (restOfStatement.trim().equals(""))
	{
		
		return "rare pepe does not approve";
		
	}
	
	return "What would it mean to " + restOfStatement.trim();
  /**
   * trim the statement
   * variable lastChar = last character in statement
   * if lastChar is a period...
   *        remove the last character from statement
   *
   * Set new int psn to the result from...
   *        findKeyword() method @param statement, goal is "I want to "
   * Set new String restOfStatement to the rest of statement after the
   * "I want to ".
   * /
   * return "What would it mean to" + restOfStatement; **/
}

/**
* Take a statement with "you <something> me" and transform it into
* "What makes you think that I <something> you?"
* @param statement the user statement, assumed to contain "you" followed by "me"
* @return the transformed statement
*/
private String transformYouMeStatement(String statement)
{
	statement = statement.trim();
	String lastChar = ".;,'!?&$`~\"";
	
	for (int i = 0; i < lastChar.length() - 1; i++)
	{
		if(statement.substring(statement.length()-1,statement.length()).equals(lastChar.substring(i,i + 1)))
		{
			statement = statement.substring(0,statement.length()-1);
			i = 0;
		}	
	}
	
	int psnOfYou = findKeyword(statement,"you");
	
	int psnOfMe = findKeyword(statement,"me",psnOfYou + 3);
	
	String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe - 1);
	
	if (restOfStatement.trim().equals(""))
	{
		return "Be clear m8 or it is b8";
	}
	
	return "What makes you think that I " + restOfStatement.trim() + " you?";
	
  /**
   * trim the statement
   * Set new String lastChar to the last character in statement
   * if lastChar is a period...
   *        remove the period
   *
   * Set new int psnOfYou to the result of findKeyword
   *        @param statement and "you"
   * Set new int psnOfMe to the result of findKeyword
   *      @param statement, "me", and psnOfYou + 3
   * Set new String restOfStatement to the rest of statement after "You" + 3,
   * and before "me".
   *
   * return "What makes you think that I " + restOfStatement + "you?"
   * */
}
	
	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = " " + statement.trim().toLowerCase() + " ";
		int psn = phrase.indexOf(goal.toLowerCase(),startPos);
		if (psn >= 0)
		{
			int before = psn - 1;
			
			int after = psn + goal.length();
			
			boolean comparesidesbefore = phrase.substring(before,before + 1).compareTo("a") >= 0 && phrase.substring(before,before + 1).compareTo("a") < 26;
			
			boolean comparesidesafter = phrase.substring(after,after + 1).compareTo("a") >= 0 && phrase.substring(after,after + 1).compareTo("a") < 26;

			if (!(comparesidesbefore || comparesidesafter))
			{
				
				return psn - 1;
				
			}
			else
			{
				
				return findKeyword(statement, goal, startPos + 1);
				
			}
		}
		
		/* New String variable phrase = a more searchable version of statement.
		 	-Use a combination of trim() and toLowerCase() modify statement.
			
		   New int variable psn = the location of goal in phrase after
		   startPos
			-->Refinement: Make sure we find goal by itself, and not part
			of another word ("no" vs no in "know"). if you find an occurrence
			of goal, make sure before and after aren't letters.
			As long as psn >= 0...
				Check if psn > 0 - there is no need to check for before at the
				beginning of the word
					set before = the slot in phrase before psn */

				//====>code here

				/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */

				//=====> code here

				/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn
				Otherwise, search for goal in phrase from psn + 1 forward */
		else
			return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		
		else if (whichResponse == 1)
			response = "Hmmm.";
		
		else if (whichResponse == 2)
			response = "Do you really think so?";
		
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
		
	}
}