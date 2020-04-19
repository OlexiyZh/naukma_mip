package com.naukma.mip.search;

import com.naukma.mip.search.model.Dictionary;

public class UseInvertedIndex {


    private static final DictionaryRepository dictionaryRepository = new DictionaryRepository();

    public static void main(String[] args) {

        Dictionary dictionary = parseDictionary();

        dictionary.getDocuments("repeat").forEach(System.out::println);
    }

    private static Dictionary parseDictionary() {
        return dictionaryRepository.readDictionary();
    }

}
