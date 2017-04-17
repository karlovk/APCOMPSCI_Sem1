getResponse()

public String getResponse(String statement)
	{
		String response = "";
		 
		 if (statement.trim().length() == 0)
		 {
			 return "Say something, please.";
		 }


		if (findKeyword(statement,"no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
	}

 How similar is your code to the one provided? 
it is almost the same except for the comments (i deleted them in the text editor but not in the actual java file) and the answer key has one extra method
 Is your code more or less efficient? 
it is more efficient as it compensates for 
if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
and
else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
under one method
 What could you have done differently? 
Not much
 What did you learn from comparing your code to the provided answer? 
Not much

findKeyword()

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
		else
			return -1;

	}

 How similar is your code to the one provided? 
it is very similar, we use the same tactics to find the phrase wanted. I used booleans, but it is basically what the answer key did
 Is your code more or less efficient? 
about the same, slightly less efficient because I looked for letters before the statement when it would have been more efficient to look for symbols
 What could you have done differently? 
I could have not made booleans and compared it in this way
(((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
then the if statement would be true IF the there was a symbol before the statement but not after.
 What did you learn from comparing your code to the provided answer? 
That there is a more efficient way to solve the lab
