package com.jeinst.test123;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class code123 {
    public String solution(String input_string){
        String answer = "";
        Map<Character, Boolean> map = new HashMap<>();
        Set<Character> set = new TreeSet<>();
        char[] carr = input_string.toCharArray();
        char current=' ';
        for (char temp:carr){
            if(current!=temp){
                if (map.containsKey(temp)){
                    set.add(temp);
                }
                map.put(temp,true);
                current=temp;
            }
        }
        for (char temp :set){
            answer+=temp;
        }
        if (answer == "") {

            return "N";
        }
        return answer;
    }

}
