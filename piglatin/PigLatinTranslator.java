package piglatin;
import java.util.Scanner;

public class PigLatinTranslator 
{
    public static Book translate(Book input) 
    {
        Book translatedBook = new Book();

        // todo Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.
        // loop the lines in the book
        for(int i = 0; i < input.getLineCount(); i++)
        {
            String translation = translate(input.getLine(i));
            translatedBook.appendLine(translation);
        }


        return translatedBook;
    }

    public static String translate(String input) 
    {
        System.out.println("  -> translate('" + input + "')");

        String result = "";

        // translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        Scanner scanLine = new Scanner(input);
        //while there are lines,the code will loop translation till there are no more lines
        //translates each word individually then adds together
        while(scanLine.hasNext()) //if there are more lines in the book then it will continue to translate
        {
            String part = scanLine.next();
            if(result.length() == 0)
            {
                result = translateWord(part);
            }
            else
            {
                result = result + " " + translateWord(part);
            }
        }
        return result; //returns the translated word
    }
        // Add additonal private methods here.
        // For example, 
    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");
        //recognizes the vowels which change the rules of pig latin
        String result = input;
        String vowels = "aeiouyAEIOUY"; // if the word starts with a vowel this is what happens
        if(input.length() >= 1)
        {
            String letterOne = input.substring(0, 1);
            if(letterOne.toUpperCase().equals (letterOne))
            {
                input = input.substring( 0,1).toLowerCase() + input.substring(1); // makes the first letter of the word uppercase
            }

            String end = "";
            if(input.substring(input.length()-1).equals("."))
            {
                input = input.substring(0,input.length()-1);
                end = "."; //adds a period at the end of a sentence
            }

            if(vowels.indexOf(input.substring(0, 1)) >0)
            {
                result = input + "ay";
            }
            else if(input.substring(0,1).equals(" "))
            {
                return " ";
            }
            else
            {
                int vowelOne = 1;
                while((vowelOne < input.length()-1) && (vowels.indexOf(input.substring(vowelOne,vowelOne+1))==-1))
                {
                    vowelOne++;
                }
                result = input.substring(vowelOne) + input.substring(0, vowelOne) +"ay";
            }
            //ay at the end is basic pig latin rule
            
            if(letterOne.toUpperCase().equals(letterOne))
            {
                result = result.substring(0,1).toUpperCase() + result.substring(1);
            }
            result += end;
        }
            //makes the first letter uppercase




        return result;



    }

    
    
    
    //I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
