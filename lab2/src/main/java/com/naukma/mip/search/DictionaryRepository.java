package com.naukma.mip.search;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.naukma.mip.search.model.Dictionary;
import com.naukma.mip.search.model.invertedindex.InvertedIndexDictionary;

import lombok.SneakyThrows;

public class DictionaryRepository {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    public Dictionary readDictionary() {
        return objectMapper.readValue(new File(FileUtils.INVERTED_INDEX_DICTIONARY_PATH), InvertedIndexDictionary.class);
    }

    @SneakyThrows
    public void saveDictionary(Dictionary dictionary) {

        objectMapper.writeValue(new File(FileUtils.INVERTED_INDEX_DICTIONARY_PATH), dictionary);
    }
}
