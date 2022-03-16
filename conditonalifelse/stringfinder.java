package com.stackroute.basics;
import java.util.*;

public class StringFinder {
    //Create Scanner object as instance variable
    final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
        new StringFinder().getInput();
    }

    public String getInput() {
        
         String searchString = scan.nextLine();
         String firstString = scan.nextLine();
         String secondString = scan.nextLine();

        final int result = new StringFinder().findString(searchString,firstString,secondString);
        displayResult(result);
        return null;
    }

    public void displayResult(int result) {
        if (result==1){
            System.out.println("Found as expected");
        }else if(result== -1){
            System.out.println("Empty string or null");
        }else{

            System.out.println("Not found");
        }
        //displays the result
    }

    public int findString(String searchString, String firstString, String secondString) {
        if (searchString==null || firstString==null || secondString == null){
            return -1;
        }
        if(searchString.isEmpty() || firstString.isEmpty() || secondString.isEmpty()){
            return -1;
        }else if (searchString.contains(firstString) && searchString.contains(secondString)){
            if(searchString.indexOf(firstString) < searchString.indexOf(secondString) ){

                return 1;
            }
            else{
                return 0;
            }
        }
        return 0;
    }

    public void closeScanner() {
    }
}
