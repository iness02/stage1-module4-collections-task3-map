package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> repetitionMap = new HashMap<>();
        sentence=sentence.replaceAll("[,.]","");
        String[] sentenceWords = sentence.split(" ");
        int count=0;
        if(!sentence.isEmpty()) {
            for (int i = 0; i < sentenceWords.length; i++) {
                for (int j = 0; j < sentenceWords.length; j++) {
                    if (sentenceWords[i].equalsIgnoreCase(sentenceWords[j])) {
                        count++;
                    }
                }
                repetitionMap.put(sentenceWords[i].toLowerCase(Locale.ROOT), count);
                count = 0;
            }
        }
        return repetitionMap;
    }
}
