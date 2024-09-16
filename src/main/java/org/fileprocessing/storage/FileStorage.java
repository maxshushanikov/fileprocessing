package org.fileprocessing.storage;

import java.util.HashMap;
import java.util.Map;

class FileStorage {

    private final Map<String, String> fileContents = new HashMap<>();

    public void addFile(String filePath, String content) {
        fileContents.put(filePath, content);
    }

    public String getFileContent(String filePath) {
        return fileContents.get(filePath);
    }
}
