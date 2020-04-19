package com.naukma.mip.search.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.naukma.mip.search.model.Dictionary;

public class TxtProcessor implements FileProcessor {

    @Override
    public void processFile(Dictionary dictionary, String filePath) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            Scanner s2 = new Scanner(scanner.nextLine());
            while (s2.hasNext()) {
                String word = s2.next();
                dictionary.addWord(word, filePath);
            }
        }

    }
}
