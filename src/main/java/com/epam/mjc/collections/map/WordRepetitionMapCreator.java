package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> repetitionMap = new HashMap<>();
        sentence=sentence.replaceAll("[,.]","");
        List<String> sentenceWords = new java.util.ArrayList<>(List.of(sentence.split("\s")));
        int count=0;
        if(!sentence.isEmpty()) {
            for (int i = 0; i < sentenceWords.size(); i++) {
                for (int j = 0; j < sentenceWords.size(); j++) {
                    if (sentenceWords.get(i).equalsIgnoreCase(sentenceWords.get(j))) {
                        count++;
                    }
                }
                repetitionMap.put(sentenceWords.get(i).toLowerCase(Locale.ROOT), count);
                count = 0;
            }
        }
        return repetitionMap;
    }
}
