package strings;

public class string_ex {
    public static void main(String[] args) {
        String message = "Today is a good day";
        System.out.println(message);
        //?? String length
        System.out.println(message.length());
        //?? String 5th character
        System.out.println(message.charAt(4));
        //?? String concat
        System.out.println(message.concat(" to learn Java"));
        //? String start with it si a query return bool(true or false)
        System.out.println(message.startsWith("T"));
        //? String end with it is a query return bool(true or false)
        System.out.println(message.endsWith("y"));
        //? Get char
        char[] character = new char[5];
        message.getChars(0, 4, character, 0);
        System.out.println(character);
        //? Index of
        System.out.println(message.indexOf("a"));//? return first index of a in string this function work with string and char
        //? Last index of
        System.out.println(message.lastIndexOf("a"));//? return last index of a in string this function work with string and char
        //? Replace
        System.out.println(message.replace("a", "A"));//? replace all a with A
        String newMessage = message.replace(" ", "-");
        System.out.println(newMessage);
        //? Substring
        System.out.println(message.substring(2));//? return substring from index 2 to end
        System.out.println(message.substring(2, 6));//? return substring from index 2 to 6
        //? Split
        String[] words = message.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        //? To lower case
        System.out.println(message.toLowerCase());
        //? To upper case 
        System.out.println(message.toUpperCase());
        //? Trim remove spaces from start and end of string
        String message2 = "   Today is a good day   ";
        System.out.println(message2.trim());

    }
}
