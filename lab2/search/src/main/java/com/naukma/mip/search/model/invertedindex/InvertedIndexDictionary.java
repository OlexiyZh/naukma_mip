package com.naukma.mip.search.model.invertedindex;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.naukma.mip.search.model.Dictionary;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class InvertedIndexDictionary implements Dictionary {

    @JsonProperty
    private Map<String, Set<DocumentInfo>> indexes = new HashMap<>();

    public void addWord(@NonNull String word, @NonNull String documentName) {
        Set<DocumentInfo> documents;

        if (indexes.containsKey(word)) {
            documents = indexes.get(word);
        } else {
            documents = new HashSet<>();
            indexes.put(word, documents);
        }

        documents.add(new DocumentInfo(documentName));

    }

    @Override
    public List<String> getDocuments(@NonNull String word) {
        return indexes.get(word).stream().map(DocumentInfo::getDocumentName).collect(Collectors.toList());
    }

    @Override
    public Collection<String> getDocuments(WordOperation operation, String... words) {
        // Based on operation use CollectionUtils
        // Intersection or Union


        Arrays.asList("").stream().anyMatch(s -> s.equals(words[0]))

        return null;
    }


}
