package org.example;

import java.util.Arrays;

public class StringRepo {
    private static String[] strings = new String[0];

    public static void clear(){
        strings = new String[0];
    }

    public static String[] getStrings(){
        return strings;
    }

    public static void setStrings(String[] content){
        strings = content;
    }


    public static boolean add(String string){
        String[] temp = Arrays.copyOf(strings, strings.length + 1);
        temp[temp.length-1] = string;
        strings = temp;
        return true;
    }

    public String find(String string){
        for(String s : strings){
            if(s.equalsIgnoreCase(string)){
                return s;
            }
        }
        return null;
    }


}
