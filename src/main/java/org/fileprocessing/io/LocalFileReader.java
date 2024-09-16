package org.fileprocessing.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class reads files from local storage
 */
public class LocalFileReader implements FileReader {
    @Override
    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
