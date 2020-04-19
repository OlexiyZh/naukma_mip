package com.naukma.mip.search.file;

import com.naukma.mip.search.model.Dictionary;

public interface FileProcessor {
    void processFile(Dictionary dictionary, String filePath);
}
