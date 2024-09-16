package org.fileprocessing;

import org.fileprocessing.service.FileProcessor;

/**
 * This is the main application class that orchestrates ....
 */
public class App {

    private final FileProcessor processor;

    /**
     * Constructor to initialize the App with file processor.
     *
     * @param processor The file processor.
     */
    public App(FileProcessor processor) {
        this.processor = processor;
    }

    /**
     * Runs the application by ...
     */
    public void run() {
        this.processor.processFile();
    }

    /**
     * The main method to start the application.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        App app = new App(new FileProcessor());
        app.run();
    }
}