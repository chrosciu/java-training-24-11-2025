package eu.chrost.day1.s1variables.lectures;

import java.util.Collections;
import java.util.Map;
import java.util.List;

public class VarKeyword {
    public static void main(String[] args) {
        var i = 5;
        System.out.println(i);
        //nie kompiluje sie - zmienna i jest typu int i nie da sie juz tego zmienic
        //i = "Marcin";

        //var j;

        Map.Entry<String, List<String>> entry = null;
        
        
        Map<String, String> myMap = Collections.emptyMap();

        for (var item : myMap.entrySet()) {

        }

        var k = 3;
        var j = 5;
        var b = true;

        //l bedzie typu long ze wzgledu na suffix l
        var l = 5l;
    }
}
