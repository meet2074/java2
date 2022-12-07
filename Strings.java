public class Strings {
    public static void main(String[] args) {

        /*String  name=new String("Happy");
        System.out.println(name);*/

        // other method 

        String a="Meet";
        System.out.println(a);

        // String operations and methods


        int val=a.length(); //This  is about to find the length of the string
        System.out.println(val);

        System.out.println(a.toLowerCase());// It will return a new string which has all the lowercase characters
        System.out.println(a.toUpperCase());// It will return a new string which has all the Uppercase characters

       String nonTrimmedStrings="     MeetGondaliya     ";
       System.out.println(nonTrimmedStrings);

       String trimmedString= nonTrimmedStrings.trim();//This operation will trim unneccessory spaces from a string
       System.out.println(trimmedString);

       System.out.println(a.substring(3));//This operation will reaturn the characters of the string from given index
       System.out.println(a.substring(2));
       System.out.println(a.substring(1));

       System.out.println(trimmedString.substring(1,5));//This will return from given start index to end index, but will not print end index 
       System.out.println(trimmedString.substring(1,6));
       System.out.println(trimmedString.substring(1,7));
       System.out.println(trimmedString.substring(1,8));

       System.out.println(trimmedString.replace('e', 'i'));//This will replace old char to a new character4
       System.out.println(trimmedString.replace("eetG", "EETg"));
       System.out.println(trimmedString.replace("e", "EETg"));

       System.out.println(trimmedString.startsWith("mee"));//This is a boolean expression that will return true if the string strat with the given prefix
       System.out.println(trimmedString.startsWith("Mee"));
       System.out.println(trimmedString.startsWith("eem"));
       System.out.println(trimmedString.endsWith("eem"));

       System.out.println(trimmedString.charAt(2));//This will return the character at given index
       System.out.println(trimmedString.charAt(3));
       System.out.println(trimmedString.charAt(4));
       System.out.println(trimmedString.charAt(5));
        
       System.out.println(trimmedString.indexOf('e'));//This will return  the index of the given character
       System.out.println(trimmedString.indexOf("eet"));//This will return the index of the given string(but it will return the index where the string was strted)
       System.out.println(trimmedString.indexOf("Gond"));   
       System.out.println(trimmedString.indexOf("liy"));

       System.out.println(trimmedString.lastIndexOf('e'));//This will give index of last occurence of a charecter
       System.out.println(trimmedString.lastIndexOf('a'));

       System.out.println(trimmedString.equals("MeetGondaliya"));//Checks if the value of given string is equal to main string
       System.out.println(trimmedString.equals("Meetgondaliya"));

       System.out.println(trimmedString.equalsIgnoreCase("meetgondaliya"));//This will ignore the case of the string whether it is upper case or lower case
       

    }
}
