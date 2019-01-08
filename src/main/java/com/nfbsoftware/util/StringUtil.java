package com.nfbsoftware.util;

import java.util.ArrayList;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * <p>
 * This glorious Java class, details the best JDK 1.5 has to offer. In future
 * years this small piece of wonder will be looked upon as legendary.
 * </p>
 * <p>
 * Day after day, I am amazed by the beauty of this code. It really doesn't get
 * any better than this, it truly is a masterpiece in every definition of the
 * word. It truly is art in motion...an infinite living piece of our computer
 * science history. WOW, I just really can't get over it, so beautiful, it's
 * just so damn beautiful.
 * </p>
 * <p>
 * Simply amazing...it's like looking at the world through the eyes of a child;
 * much like enjoying the wind and the moon and the stars, with a soul
 * undefiled. There is only one more thing I could possibly say...and that is
 * "You're Welcome"
 * </p>
 *
 * @author Brendan Clemenzi 
 */
public class StringUtil
{
   /**
    * An empty string that is only constructed once for performance.
    */
   public final static String EMPTY_STRING = "";

   /**
    * table to convert a nibble to a hex character
    */
   public static char[] hexChar = {
		'0' , '1' , '2' , '3' ,
		'4' , '5' , '6' , '7' ,
		'8' , '9' , 'A' , 'B' ,
		'C' , 'D' , 'E' , 'F' };

   public static String emptyIfNull(String s)
   {
       return s != null ? s : EMPTY_STRING;
   }

   public static String replaceIfNull(String s, String defaultValue)
   {
       return (!isNullOrEmpty(s)) ? s : defaultValue;
   }

   public static String nullIfEmpty(String s)
   {
       if (s != null)
       {
           // s = s.trim();
           if (s.length() == 0)
           {
               s = null;
           }
       }

       return s;
   }
   
   public static String nullIfEmptyTrim(String s)
   {
       if (s != null)
       {
           s = s.trim();
           if (s.length() == 0)
           {
               s = null;
           }
       }

       return s;
   }

   public static boolean isNullOrEmpty(String s)
   {
       if ((s == null) || (s.length() == 0)) {
		return true;
	}

       return false;
   }

   public static boolean isNullOrEmptyTrim(String s)
   {
       if (s == null) {
		return true;
	}

       s = s.trim();
       if (s.length() == 0) {
		return true;
	}

       return false;
   }

	public static String replaceSubstr(String str, String oldsubstr, String newsubstr)
	{
		int substrPos = 0;
		int startPos = 0;
		StringBuffer strBuf = new StringBuffer();

		while ((substrPos = str.indexOf(oldsubstr, startPos)) > -1)
		{
			strBuf.append(str.substring(startPos, substrPos));
			strBuf.append(newsubstr);
			startPos = substrPos + oldsubstr.length();
		}

		strBuf.append(str.substring(startPos));
		return strBuf.toString();
	}

	public static String[] split(String s, String sToken)
	{
		int iTokenLength=sToken.length();
		if (sToken == null || (iTokenLength) == 0){
			return new String[] {s};
		}

		int iCount=0;
		int iBegin=0;
		int iEnd;

		while((iEnd = s.indexOf(sToken, iBegin)) != -1) {
			iCount++;
			iBegin = iEnd + iTokenLength;
		}
		iCount++;

		// allocate an array to return the tokens,
		// we now know how big it should be
		String[] result = new String[iCount];

		// Scan s again, but this time pick out the tokens
		iCount = 0;
		iBegin = 0;
		while((iEnd = s.indexOf(sToken, iBegin)) != -1) {
			result[iCount] = (s.substring(iBegin, iEnd));
			iCount++;
			iBegin = iEnd + iTokenLength;
		}
		iEnd = s.length();
		result[iCount] = s.substring(iBegin, iEnd);

		return (result);
	}

	public static String replaceJavaLiteral(String s){
		int length = s.length();
		int newLength = length;
		// first check for characters that migh
		// be dangerous and calculate a length
		// of the string that has escapes.
		for (int i=0; i<length; i++){
			char c = s.charAt(i);
			switch(c){
				case '\"':
				case '\'':
				case '\n':
				case '\r':
				case '\t':
				case '\\':{
					newLength += 1;
				} break;
			}
		}
		if (length == newLength){
			// nothing to escape in the string
			return s;
		}
		StringBuffer sb = new StringBuffer(newLength);
		for (int i=0; i<length; i++){
			char c = s.charAt(i);
			switch(c){
				case '\"':{
					sb.append("\\\"");
				} break;
				case '\'':{
					sb.append("\\\'");
				} break;
				case '\n':{
					sb.append("\\n");
				} break;
				case '\r':{
					sb.append("\\r");
				} break;
				case '\t':{
					sb.append("\\t");
				} break;
				case '\\':{
					sb.append("\\\\");
				} break;
				default: {
					sb.append(c);
				}
			}
		}
		return sb.toString();
	}

	public static String OnEmptyUseOther(String value, String other)
	{
	    //Is it empty?
	    if (isNullOrEmptyTrim(value))
	    {
	        return other;
	    }

	    return value.trim();
	}

    public static String stringPaddingBefore(String stringValue, String paddingChar, int paddingLength)
    {
        StringBuffer buffer = new StringBuffer(128);

        for (int i = 0, length = stringValue.length(); i < (paddingLength - length); i++)
        {
            buffer.append(paddingChar);
        }

        buffer.append(stringValue);

        return buffer.toString();
    }

    public static String stringPaddingAfter(String stringValue, String paddingChar, int paddingLength)
    {
        StringBuffer buffer = new StringBuffer(128);
        buffer.append(stringValue);

        for (int i = 0, length = stringValue.length(); i < (paddingLength - length); i++)
        {
            buffer.append(paddingChar);
        }

        return buffer.toString();
    }

    public static String[] parseString(String tokenString, String separators)
    {
        // Get the character array from the string for fast index lookups.
        char[] tokenStringChars = tokenString.toCharArray();
        int len = tokenStringChars.length;
        // Guess at the initial capacity of the array to be one third of
        // the total length of the input string.
        ArrayList<String> tokens = new ArrayList<String>((len/3)+1);

        // If there are no separators, then just return the input string.
        if ((separators == null) || (separators.length() == 0))
        {
            // Add entire input string as one token unless it is empty.
            if (tokenString.length() > 0)
            {
                tokens.add(tokenString);
            }
            String[] tokenArray = new String[tokens.size()];
            tokens.toArray(tokenArray);
            return tokenArray;
        }

        // Speed optimization if there is only a single separator.
        if (separators.length() == 1)
        {
            int i1=0, i2;
            char separatorChar = separators.charAt(0);

            // Strip leading separators
            while ((i1 < len) && (tokenStringChars[i1] == separatorChar)) {
				i1++;
			}

            while (i1 < len)
            {
                i2 = tokenString.indexOf(separatorChar, i1);
                if (i2 < 0)
                {
                    tokens.add(tokenString.substring(i1));
                    break;
                }

                tokens.add(tokenString.substring(i1, i2));

                i1 = i2 + 1;

                // Strip consecutive separators
                while ((i1 < len) && (tokenStringChars[i1] == separatorChar)) {
					i1++;
				}
            }
        }
        else // Multiple separators
        {
            int i1=0, i2;

            // Strip leading separators
            while ((i1 < len) &&
                   (separators.indexOf(tokenStringChars[i1]) >= 0)) {
				i1++;
			}

            while (i1 < len)
            {
                i2 = i1;

                while ((i2 < len) &&
                       (separators.indexOf(tokenStringChars[i2]) < 0))
                {
                    i2++;
                }

                tokens.add(tokenString.substring(i1, i2));

                i1 = i2 + 1;

                // Strip consecutive separators
                while ((i1 < len) &&
                       (separators.indexOf(tokenStringChars[i1]) >= 0)) {
					i1++;
				}
            }
        }

        String[] tokenArray = new String[tokens.size()];
        if (tokens.size() > 0) {
			tokens.toArray(tokenArray);
		}

        return tokenArray;
    }

	public static String toHexString( byte[] b )
	{
		StringBuffer sb = new StringBuffer( b.length * 2 );

		for ( int i=0 ; i<b.length ; i++ )
		{
			// look up high nibble char
			sb.append( hexChar [ ( b[ i] & 0xf0 ) >>> 4 ] ) ;

			// look up low nibble char
			sb.append( hexChar [ b[ i] & 0x0f ] ) ;
		}

		return sb.toString();
	}

    public static String stringPreview(String inputString)
    {
        String tmpString = "";

        if(inputString.length() >= 20)
        {
            tmpString = inputString.substring(0, 19);
        }
        else
        {
            tmpString = inputString.substring(0, inputString.length());
        }

        return tmpString;
    }

    public static String replaceIfNullOrError(String s, String defaultValue)
    {
        String tmpString = EMPTY_STRING;

        try
        {
            tmpString = replaceIfNull(s, defaultValue);
        }
        catch(Exception e)
        {
            tmpString = defaultValue;
        }

        return tmpString;
    }

	public static String stripHTML (String html)
	{
		if (html == null || html.isEmpty())
		{
			return "";
		}

		if (html.toLowerCase().contains("<body") && html.toLowerCase().contains("</body>"))
		{
			int beginIndex = html.toLowerCase().indexOf("<body");
			int endIndex = html.toLowerCase().indexOf("</body>");
			endIndex += "</body>".length();
			html = html.substring(beginIndex, endIndex);
		}

		for (String tag : new String[]{"style", "script"})
		{
			int tries = 10;
			while (tries-- > 0 && html.toLowerCase().contains("<" + tag))
			{
				html = removeHTMLBlock(html, tag);
			}
		}

		html = html.replaceAll("&#8226;", "");
		html = html.replaceAll("&bull;", "");

		// OK.  I should have "simple" markup left.
		// Since I do not care about HREFs or IMG sources here,
		// I can be draconian in my clensing
		html = html.replaceAll("</?\\w+[^><]*>", " ");
		html = StringEscapeUtils.unescapeHtml(html);
		return html;
	}

	public static String removeHTMLBlock(String html, String tag)
	{
		if (html.toLowerCase().contains("<" + tag) && html.toLowerCase().contains("</" + tag))
		{
				int beginIndex = html.toLowerCase().indexOf("<" + tag);
				int endIndex = html.toLowerCase().indexOf("</" + tag);
				endIndex += ("</" + tag + ">").length();
				html = html.substring(0, beginIndex) + html.substring(endIndex);
		}

		return html;
	}
}
