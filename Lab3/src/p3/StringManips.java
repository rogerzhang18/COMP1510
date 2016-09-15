package p3;

import java.util.Scanner;
//***************************************************************
//StringManips.java
//
//Test several methods for manipulating String objects
//***************************************************************
public class StringManips
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        String phrase = new String ("This is a String test.");
        System.out.println ("Please enter a sentence: ");
        phrase=scan.nextLine();
        
        int phraseLength;
        int middleIndex;
        String firstHalf;
        String secondHalf;  // second half of the phrase String
        String switchedPhrase;  //a new phrase with original halves switched
        String middle3;
        
        String city;
        String state;
        
        System.out.print("Please enter your hometown State: ");
        city=scan.nextLine();
        System.out.print("Please enter your hometown City: ");
        state=scan.nextLine();
        
        city=city.toUpperCase ();
        state=state.toLowerCase();
        System.out.println("\n" + city + state + city);
        //number of characters in the phrase String
        //index of the middle character in the String
        //first half of the phrase String
        //compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        //get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        //concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        //print information about the phrase
        middle3= phrase.substring(middleIndex-1,middleIndex+2);
        switchedPhrase=switchedPhrase.replace(" ","*");
        
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
        " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
        phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println();
        
        System.out.println("The middle 3 character are " + middle3);
        
        scan.close();
    }
}