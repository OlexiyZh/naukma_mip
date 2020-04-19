package com.naukma.mip.search.model;

import java.util.Collection;

import com.naukma.mip.search.model.invertedindex.WordOperation;

public interface Dictionary {
    void addWord(String word, String documentName);
    Collection<String> getDocuments(String word);
    Collection<String> getDocuments(WordOperation operation, String... words);
}
