package org.fileprocessing.io;

import java.io.IOException;

public interface FileReader {
    String readFile(String filePath) throws IOException;
}
