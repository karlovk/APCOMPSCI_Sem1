public class magpie
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
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
			 return "Say something, please.";
		 }


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		 //statement.indexOf("no") >= 0
		if (findKeyword(statement,"no") >= 0)
		{
			response = "Why you gotta be so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Please tell me about your family.";
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
			response = "Please tell me more about your pet";
		}
		 
		 else if (findKeyword(statement,"robinette") >= 0)
		 {
			 response = "He sounds like a pretty good teacher";
		 }
		 
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = " " + statement.trim().toLowerCase() + " ";
		int psn = phrase.indexOf(goal,startPos);
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
			response = "I don't understand you.";

		return response;
	}
}