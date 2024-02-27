package linearsearch.strings;

import java.util.Arrays;

public class LinearSearchIndex {
    public static void main(String[] args) {

        String name = "basith";
        char target = 'l';
        boolean ans = linearSearchIndex3(name,target);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(ans);
    }

    static int linearSearchIndex(String name, char target){


        if(name.length() == 0)
            return -1;

        for(int index = 0 ; index < name.length(); index ++){
            char element = name.charAt(index);
            if(element == target)
                return index;
        }

        return -1;

    }
    static char linearSearchIndex2(String name, char target){

        for(char ch : name.toCharArray()){

            if(ch == target)
                return ch;
        }

        return ' ';

    }

    static boolean linearSearchIndex3(String name, char target){

        if(name.length() == 0)
            return false;

        for(char ch : name.toCharArray()){

            if(ch == target)
                return true;
        }

        return false;

    }
}
